package com.cydeo.hectorware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends DashboardPage{


    @FindBy (xpath = "//a[@href='/index.php/apps/calendar/']")
    public WebElement calendarModule;

    @FindBy (xpath= "//button[starts-with(@class,'icon action-item__menutoggle')]")
    public WebElement outlookDropdown;

    @FindBy (xpath = "//div//div//div//div//div//ul//button[@class='action-button focusable']")
    public WebElement dayOption;

    @FindBy (xpath = "//button[@class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement dayButton;

    @FindBy (xpath = "//a[@class='fc-col-header-cell-cushion ']")
    public WebElement dateOnThePage;
}
