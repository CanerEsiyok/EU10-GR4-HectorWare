package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.LoginPage;


import com.cydeo.hectorware.pages.LogOutPage;
import com.cydeo.hectorware.utilities.ConfigurationReader;
import com.cydeo.hectorware.utilities.Driver;
import io.cucumber.java.en.*;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class LogOut_StepDefs {
    LoginPage loginPage = new LoginPage();
    LogOutPage logoutPage = new LogOutPage();

    @Given("User has already logged in")
    public void user_has_already_logged_in() {
        loginPage.login("Employee1", "Employee123");
    }

    @When("User hoverover on the profile icon")
    public void user_hoverover_on_the_profile_icon() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(logoutPage.profileSettingsIcon);
    }

    @And("User clicks on the profile icon")
    public void userClicksOnTheProfileIcon() {
        //logoutPage.profi.click();
    }

    @And("User sees profile options dropdown list")
    public void user_sees_profile_options_dropdown_list() {
      //  logoutPage.settingsMenu.isDisplayed();
    }

    @Then("User clicks on the logout button")
    public void user_clicks_on_the_logout_button() {
        logoutPage.logOutButton.click();
        Assert.assertTrue(loginPage.submitButton.getText().equals("Log in"));
    }


    @Then("User sees login page without anyone signing in")
    public void user_sees_login_page_without_anyone_signing_in() {

    }


}
