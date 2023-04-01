package com.cydeo.hectorware.pages;

import com.cydeo.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage_Turkan extends DashboardPage {


    @FindBy(xpath="//a[@aria-label='Calendar']")
    public WebElement calendarTab;

    @FindBy(xpath="//button[@aria-label='Actions']")
    public WebElement gridTab;

    @FindBy(xpath="//span[.='Day']")
    public WebElement dayOption;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement weekOption;

    @FindBy(xpath="//span[.='Month']")
    public WebElement monthOption;

    public WebElement selectHour (int hour) {

        String xpath = "//table//td[.='" +hour+"']/following-sibling::td[1]";
       return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy (xpath="//input[@placeholder='Event title']")
    public WebElement eventTitle;











}
