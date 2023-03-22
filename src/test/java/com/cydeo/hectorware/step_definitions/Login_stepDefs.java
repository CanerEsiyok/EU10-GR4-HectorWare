package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.LoginPage;
import com.cydeo.hectorware.utilities.ConfigurationReader;
import com.cydeo.hectorware.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login_stepDefs {

    LoginPage loginPage=new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters {string} username")
    public void user_enters_username(String username) {
    loginPage.inputUsername.sendKeys(username);
    }
    @When("user enters {string} password")
    public void user_enters_password(String password) {
    loginPage.inputPassword.sendKeys(password);
    }
    @When("user clicks to signIn button")
    public void user_clicks_to_sign_in_button() {
    loginPage.submitButton.click();
    }
    @Then("user sees the dashboard")
    public void user_sees_the_dashboard() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Files - Hectorware - QA"));
    }

    @Then("user can not see the dashboard")
    public void userCanNotSeeTheDashboard() {

        Assert.assertTrue(!Driver.getDriver().getTitle().equals("Files - Hectorware - QA"));
    }

    @When("user don't enter any username")
    public void userDonTEnterAnyUsername() {
        loginPage.inputUsername.sendKeys("");
    }

    @And("user don't enter any password")
    public void userDonTEnterAnyPassword() {
        loginPage.inputPassword.sendKeys("");
    }
}
