package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.BrowserUtils;
import com.cydeo.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class FilePage {
    public FilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='with-icon']/li/a")
    public List<WebElement> leftMenu;
    @FindBy(xpath = "//tbody[@id='fileList']/tr[@data-type='file']")
    public List<WebElement> fileList;
    @FindBy(xpath = "//tbody[@id='fileList']/tr[@data-type='file']//span[@class='innernametext']")
    public List<WebElement> fileListNames;
    @FindBy(xpath = "//tbody[@id='fileList']/tr[@data-type='dir']//span[@class='innernametext']")
    public List<WebElement> folderListNames;
    @FindBy(xpath = "//tbody[@id='fileList']/tr")
    public List<WebElement> fileFolderList;


    @FindBy(xpath = "//tbody[@id='fileList']/tr[@data-type='file']//span[@class='extension']")
    public List<WebElement> fileListExtensions;

    public void refreshLists(String list) {
        switch (list) {
            case "folder":
                folderListNames = Driver.getDriver().findElements(By.xpath("//tbody[@id='fileList']/tr[@data-type='dir']//span[@class='innernametext']"));
                break;
            case "file":
                fileListNames = Driver.getDriver().findElements(By.xpath("//tbody[@id='fileList']/tr[@data-type='file']//span[@class='innernametext']"));
                break;
            case "file folder":
                fileFolderList = Driver.getDriver().findElements(By.xpath("//tbody[@id='fileList']/tr"));
                break;

        }
    }

    @FindBy(xpath = "(//ul[@class='with-icon']/li/a)[1]")
    public WebElement allFilesButton;
    @FindBy(xpath = "//div[@class='crumb svg crumbhome']")
    public WebElement homeButton;
    @FindBy(xpath = "//a[@class='menu-option option-movecopy']")
    public WebElement moveOrCopyCon;
    @FindBy(xpath = "(//ul[@class='with-icon']/li/a)[2]")
    public WebElement recentButton;
    @FindBy(xpath = "(//ul[@class='with-icon']/li/a)[3]")
    public WebElement favoritesButton;
    @FindBy(xpath = "(//ul[@class='with-icon']/li/a)[4]")
    public WebElement sharedButton;
    @FindBy(xpath = "(//ul[@class='with-icon']/li/a)[5]")
    public WebElement tagsButton;
    @FindBy(xpath = "(//ul[@class='with-icon']/li/a)[6]")
    public WebElement deletedFilesButton;
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusSign;
    @FindBy(xpath = "//label[@data-action='upload']")
    public WebElement uploadAFile;
    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolder;
    @FindBy(xpath = "(//span[@class='displayname'])[3]")
    public WebElement NewTextDocument;
    @FindBy(xpath = "//form[@class='filenameform']/input[@type='text']")
    public WebElement createAFolderInput;
    @FindBy(xpath = "//form[@class='filenameform']/input[@type='submit']")
    public WebElement createAFolderInputSubmit;
    @FindBy(xpath = "(//a[@class='actions-selected'])[1]")
    public WebElement actions;
    @FindBy(xpath = "(//div[@class='filesSelectMenu popovermenu bubble menu-center']//ul//li)[1]")
    public WebElement moveOrCopy;
    @FindBy(xpath = "(//div[@class='filesSelectMenu popovermenu bubble menu-center']//ul//li)[1]")
    public WebElement download;
    @FindBy(xpath = "(//div[@class='filesSelectMenu popovermenu bubble menu-center']//ul//li)[1]")
    public WebElement selectFileRange;
    @FindBy(xpath = "//a[@data-action='delete']")
    public WebElement delete;
    @FindBy(xpath = "//a[@class='menu-option option-delete']")
    public WebElement deleteCon;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveToButton;

    @FindBy(xpath = "//button[contains(text(),'Copy to')]")
    public WebElement copyToButton;
    @FindBy(xpath = "//tr[@data-entryname='move folder']")
    public WebElement moveFolder;
    @FindBy(xpath = "//tr[@data-entryname='copy folder']")
    public WebElement copyFolder;


    WebElement myElement;
    List<WebElement> myElements;


    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


    public void findAndSendKeys(String element, String keys) {
        switch (element) {
            case "Input New Folder":
                createAFolderInput.sendKeys(keys);
                break;
            case "upload file":
                uploadAFile.sendKeys(keys);
                break;


        }


    }

    public boolean checkIfTheFolderExist(String folder) {
        BrowserUtils.sleep(2);
        refreshLists("folder");

        for (WebElement element : folderListNames) {
            if (element.getText().equalsIgnoreCase(folder)) {
                return true;
            }


        }
        return false;


    }

    public boolean checkIfTheFileExist(String file) {
        BrowserUtils.sleep(2);
        refreshLists("file folder");
        for (int i = 0; i < fileFolderList.size(); i++) {
            if (fileFolderList.get(i).getAttribute("data-file").equals(file)) {

                System.out.println("buldu");
                return true;


            }
        }
        return false;
    }

    public void selectIfTheFileExist(String file) {


        BrowserUtils.sleep(2);
        for (int i = 0; i < fileFolderList.size(); i++) {
            if (fileFolderList.get(i).getAttribute("data-file").equals(file)) {

                System.out.println("buldu");
                WebElement foundElement = fileFolderList.get(i).findElement(By.xpath("./child::td/label"));
                foundElement.click();
                BrowserUtils.sleep(2);
                // }


            }
            refreshLists(file);

        }

    }

    public void enterTheFolder(String folder) {
        BrowserUtils.sleep(2);
        refreshLists("folder");
        for (WebElement element : folderListNames) {

            if (element.getText().equalsIgnoreCase(folder)) {
                element.click();
            }

        }
    }

    public void rightClickIfTheFileOrFOlderExist(String element) {
        BrowserUtils.sleep(2);

        Actions actions = new Actions(Driver.getDriver());


        for (int i = 0; i < fileFolderList.size(); i++) {
            if (fileFolderList.get(i).getAttribute("data-file").equals(element)) {


                // WebElement foundElement = fileFolderList.get(i).findElement(By.xpath("./child::td/label"));
                actions.contextClick(fileFolderList.get(i)).perform();
                BrowserUtils.sleep(2);
                // }


            }

            refreshLists("file folder");
        }
    }


    public void findAndClick(String element) {


        switch (element) {
            case "Copy To":
                copyToButton.click();
                break;
            case "move folder":
                moveFolder.click();
                break;
            case "copy folder":
                copyFolder.click();
                break;
            case "Move To":
                moveToButton.click();
                break;


            case "delete":
                delete.click();
                break;
            case "deleteCon":
                deleteCon.click();
                break;
            case "selectFileRange":
                selectFileRange.click();
                break;
            case "download":
                download.click();
                break;
            case "upload file":
                uploadAFile.click();
                break;
            case "Move or copy":
                moveOrCopy.click();
                break;
            case "Move or copy Context":
                moveOrCopyCon.click();
                break;
            case "Actions":
                actions.click();
                break;
            case "plus sign":
                plusSign.click();
                break;
            case "New Folder":
                newFolder.click();
                break;
            case "New Folder Input":
                createAFolderInput.click();
                break;
            case "New Folder Input Submit":
                createAFolderInputSubmit.click();
                break;
            case "Home":
                homeButton.click();
                break;


            case "New text document":
                NewTextDocument.click();
                break;
            case "All Files":
                allFilesButton.click();
                break;
            case "Recent":
                recentButton.click();
                break;
            case "Favorites":
                favoritesButton.click();
                break;
            case "Shares":
                sharedButton.click();
                break;
            case "Tags":
                tagsButton.click();
                break;
            case "Deleted files":
                deletedFilesButton.click();
                break;


        }


    }

    public void dragDrop(String file, String dest) {

        BrowserUtils.sleep(2);
        refreshLists("file folder");
        refreshLists("folder");

        for (int i = 0; i < fileFolderList.size(); i++) {
            if (fileFolderList.get(i).getAttribute("data-file").equals(file)) {
                System.out.println("dosyayi buldu");
                Actions act = new Actions(Driver.getDriver());

                //Dragged and dropped.

                System.out.println(fileFolderList.get(i).findElement(By.xpath("./child::td[@class='filename ui-draggable ui-draggable-handle']")).getText());


                act.clickAndHold(fileFolderList.get(i).findElement(By.xpath("./child::td[@class='filename ui-draggable ui-draggable-handle']")))
                        .pause(2000)
                        .moveToElement(Driver.getDriver().findElement(By.xpath("//tbody[@id='fileList']/tr[@data-file='move folder']")))
                        .pause(2000)
                        .release()
                        .perform();


            }
        }
    }


}


