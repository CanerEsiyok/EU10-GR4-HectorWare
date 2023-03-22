package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.CalendarPage_Turkan;
import com.cydeo.hectorware.pages.DashboardPage;
import com.cydeo.hectorware.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calendar_Turkan_stepDefs {

    DashboardPage dashboardPage= new DashboardPage();
    CalendarPage_Turkan calendarPage_turkan = new CalendarPage_Turkan();


    @When("the user clicks on the calendar tab")
    public void the_user_clicks_on_the_calendar_tab() {

        dashboardPage.getModule("calendar").click();

    }

    @Then("the user verifies the calendar module is displayed")
    public void the_user_verifies_the_calendar_module_is_displayed() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Calendar"));

    }

    @Then("the user clicks on the grid tab")
    public void the_user_clicks_on_the_grid_tab() {
        calendarPage_turkan.gridTab.click();

    }

    @Then("the user selects day option")
    public void the_user_selects_day_option() {
        calendarPage_turkan.dayOption.click();
    }

    @Then("daily calender page is displayed")
    public void daily_calender_page_is_displayed() {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "timeGridDay";

        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    @Then("the user selects week option")
    public void the_user_selects_week_option() {
        calendarPage_turkan.weekOption.click();
    }

    @Then("weekly calender page is displayed")
    public void weekly_calender_page_is_displayed() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "timeGridWeek";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @Then("the user selects month option")
    public void the_user_selects_month_option() {
        calendarPage_turkan.monthOption.click();


    }


    @Then("monthly calender page is displayed")
    public void monthly_calender_page_is_displayed() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl= "dayGridMonth";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }



}
