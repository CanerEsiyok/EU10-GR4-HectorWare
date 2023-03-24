package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.LogOutPage;
import com.cydeo.hectorware.pages.LoginPage;
import com.cydeo.hectorware.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

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
    @And("user sees setting dropdown")
    public void user_sees_setting_dropdown() {
logOutPage.profileSettingsIcon.isDisplayed();
    }
    @And("user clicks to logout button")
    public void user_clicks_to_logout_button() {
logOutPage.logOutButton.click();
    }
    @Then("user sees the login page")
    public void user_sees_the_login_page() {
      /*  String actualLoginButtonText=loginPage.submitButton.getText();
        String expectedLoginButtonText="Log in";
      Assert.assertEquals(expectedLoginButtonText,actualLoginButtonText);*/
        Assert.assertTrue(Driver.getDriver().getTitle().equals("\n" +
                "\t\tHectorware - QA\t\t"));
    }
}
