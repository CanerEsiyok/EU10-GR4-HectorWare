package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkModulePage {
    public TalkModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@class='app-navigation__list']")
    public WebElement conversationList;
    @FindBy(xpath = "//button[@aria-label=\"Create a new group conversation\"]")
    public WebElement createGroupConvo;
    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement conversationName;
    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipants;
    @FindBy(xpath = "((//div[@class='participants-search-results scrollable']/div/ul)[1]/li/following-sibling::li)[1]")
    public WebElement parpicipant1;
    @FindBy(xpath = "((//div[@class='participants-search-results scrollable']/div/ul)[1]/li/following-sibling::li)[2]")
    public WebElement parpicipant2;
    @FindBy(xpath = "((//div[@class='participants-search-results scrollable']/div/ul)[1]/li/following-sibling::li)[3]")
    public WebElement parpicipant3;
    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConvo;
    @FindBy(xpath = "//div[.='You created the conversation']")
    public WebElement convoVerification;
    @FindBy(xpath = "//ul[@class='conversations']/li[1]")
    public WebElement conversation;
    @FindBy(xpath = "//main[@id='app-content-vue']/div/div/div/div/div/button")
    public WebElement threeDots;
    @FindBy(xpath = "//span[contains(text(),'Rename conversation')]")
    public WebElement renameConvoButton;
    @FindBy(xpath = "//input[@class='app-sidebar-header__maintitle-input']")
    public WebElement nameHolder;
    @FindBy(xpath = "(//span[contains(text(),'ChangedConversation')])[1]")
    public WebElement verifyNameChange;
    public WebElement conversationThreeDots(String convoName){
       return Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'"+convoName+"')])[1]/../../../following-sibling::div//button"));
    }

    @FindBy(xpath = "//span[text()='Delete conversation']")
    public WebElement deleteConversationButton;
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement yesButton;

    public List<WebElement> verifyTitleIsNotListed(){
        return Driver.getDriver().findElements(By.xpath("//ul[@class='conversations']/li//span[@class='acli__content__line-one__title']"));
    }
}
