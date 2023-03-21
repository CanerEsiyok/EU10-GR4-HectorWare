package com.cydeo.hectorware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage_Turkan extends DashboardPage {


    @FindBy(xpath="//a[@aria-label='Calendar']")
    public WebElement calendarTab;


}
