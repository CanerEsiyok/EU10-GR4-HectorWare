package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.FilePage;
import com.cydeo.hectorware.pages.LoginPage;
import com.cydeo.hectorware.utilities.BrowserUtils;
import com.cydeo.hectorware.utilities.ConfigurationReader;
import com.cydeo.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class File_stepDefs {
    FilePage filePage = new FilePage();


    @Given("the user is on the file page")
    public void the_user_is_on_the_page() throws InterruptedException {

        new LoginPage().login("Employee1", "Employee123");


    }

    @Then("User clicks on plus sign")
    public void user_clicks_on_plus_sign() {
        BrowserUtils.sleep(1);
        filePage.plusSign.click();
        BrowserUtils.sleep(1);


    }

    @When("User creates a new folder named {string} if it does not exist")
    public void user_creates_a_new_folder_named_if_it_does_not_exist(String string) {
        if (!filePage.checkIfTheFolderExist(string)) {
            filePage.plusSign.click();
            BrowserUtils.sleep(1);
            filePage.newFolder.click();
            BrowserUtils.sleep(1);
            filePage.createAFolderInput.sendKeys(string);
            BrowserUtils.sleep(1);
            filePage.createAFolderInputSubmit.click();


        }
    }

    @Then("User clicks on folder {string}")
    public void user_clicks_on_folder(String string) {
        BrowserUtils.sleep(1);
        filePage.enterTheFolder(string);
        BrowserUtils.sleep(1);


    }

    @Then("User clicks on {string}")
    public void user_clicks_on(String string) {
        BrowserUtils.sleep(1);
        filePage.findAndClick(string);
        BrowserUtils.sleep(1);
    }

    @Then("Send the files to {string}")
    public void send_the_files_to(String string, List<String> liste) throws AWTException {
        BrowserUtils.sleep(1);
        BrowserUtils.sleep(1);

        for (String elmnt : liste) {
            System.out.println(elmnt);
            filePage.findAndSendKeys(string, elmnt);
            BrowserUtils.sleep(1);
            System.out.println("gonderdi");
        }
        BrowserUtils.sleep(3);

    }

    @Then("User select files with robot")
    public void user_select_files_with_robot() throws AWTException {
        Robot robot = new Robot();
        BrowserUtils.sleep(3);
        robot.setAutoDelay(100);
        // Type the file path character by character
        robot.keyPress(KeyEvent.VK_D);
        BrowserUtils.sleep(3);
        robot.keyPress(KeyEvent.VK_SHIFT);
        BrowserUtils.sleep(3);
        robot.keyPress(KeyEvent.VK_PERIOD);
        BrowserUtils.sleep(3);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);

        robot.keyPress(KeyEvent.getExtendedKeyCodeForChar('ß'));
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_BACK_SLASH);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);
        // Simulate a key press of the Enter key to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    @When("User selects the file named {string}")
    public void user_selects_the_file_named(String string) {
        filePage.selectIfTheFileExist(string);
    }

    @Then("Verify the file named {string} is not in the folder")
    public void verify_the_file_named_is_not_in_the_folder(String string) {
        filePage.refreshLists("file");
        Assert.assertFalse(filePage.checkIfTheFileExist(string));


    }

    @Then("Verify the file named {string} is in the folder")
    public void verify_the_file_named_is_in_the_folder(String string) {
        filePage.refreshLists("file");
        Assert.assertTrue(filePage.checkIfTheFileExist(string));
    }

    @Then("Verify the files is in the folder")
    public void verify_the_files_is_in_the_folder(List<String> liste) {
        filePage.refreshLists("file");

        for (String element : liste) {
            Assert.assertTrue(("file not found: "+element),filePage.checkIfTheFileExist(element));
        }

    }


    @Then("User drags the file named {string} to {string}")
    public void user_drags_the_file_named_to(String string, String string2) {
        filePage.dragDrop(string, string2);

    }


    @When("User right clicks on {string}")
    public void user_right_clicks_on(String string) {

        filePage.rightClickIfTheFileOrFOlderExist(string);

    }
}
