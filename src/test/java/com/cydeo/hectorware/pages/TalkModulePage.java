package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
