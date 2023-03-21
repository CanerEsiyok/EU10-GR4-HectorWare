package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.CalendarPage;
import com.cydeo.hectorware.pages.LoginPage;
import com.cydeo.hectorware.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calendar_stepDefs {

    LoginPage loginPage = new LoginPage();
    CalendarPage calendarPage = new CalendarPage();

    @Given("user is logged in the application")
    public void user_is_logged_in_the_application() {
        loginPage.login("Employee1","Employee123");
    }
    @When("User clicks on the calendar module.")
    public void user_clicks_on_the_calendar_module() {
    calendarPage.calendarModule.click();
    }
    @When("User clicks on the outlook dropdown.")
    public void user_clicks_on_the_outlook_dropdown() {
    calendarPage.outlookDropdown.click();
    }
    @When("User clicks on the Day option.")
    public void user_clicks_on_the_day_option() {
    calendarPage.dayOption.click();
    }
    @Then("User should be able to see the date on the date button and on the right side of the page with daily outlook on the calendar page.")
    public void user_should_be_able_to_see_the_date_on_the_date_button_and_on_the_right_side_of_the_page_with_daily_outlook_on_the_calendar_page() {

        String actualResult = calendarPage.dayButton.getText();
        Assert.assertEquals(ConfigurationReader.getProperty("expectedCurrentDate"),actualResult);



    }
}
