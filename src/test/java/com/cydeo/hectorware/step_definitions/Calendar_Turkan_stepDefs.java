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

        calendarPage_turkan.calendarTab.click();
    }

    @Then("the user verifies the calendar module is displayed")
    public void the_user_verifies_the_calendar_module_is_displayed() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Calendar"));

    }

}
