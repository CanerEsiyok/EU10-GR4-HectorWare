package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.LogOutPage;
import com.cydeo.hectorware.pages.LoginPage;
import io.cucumber.java.en.*;

public class LogOut_stepDefs {
    LoginPage loginPage=new LoginPage();
    LogOutPage logOutPage=new LogOutPage();
    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
loginPage.login("Employee1","Employee123");
    }
    @When("user clicks on the profile settings icon")
    public void user_clicks_on_the_profile_settings_icon() {
        logOutPage.profileSettingsIcon.click();

    }
    @When("user sees setting dropdown")
    public void user_sees_setting_dropdown() {

    }
    @When("user clicks to logout button")
    public void user_clicks_to_logout_button() {

    }
    @Then("user sees the login page")
    public void user_sees_the_login_page() {

    }
}
