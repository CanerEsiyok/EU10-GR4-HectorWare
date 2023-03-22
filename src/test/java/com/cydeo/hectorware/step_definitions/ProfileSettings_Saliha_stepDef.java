package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.LoginPage;
import com.cydeo.hectorware.pages.ProfileSettingsPage_Saliha;
import com.cydeo.hectorware.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class ProfileSettings_Saliha_stepDef {

    LoginPage loginPage=new LoginPage();
    ProfileSettingsPage_Saliha profileSettingsPageSaliha= new ProfileSettingsPage_Saliha();

    @Given("the user is on the dashboard page")
    public void the_user_is_on_the_dashboard_page() {
        loginPage.login("Employee300","Employee123");

    }
    @When("user clicks on the profile module")
    public void user_clicks_on_the_profile_module() {
        profileSettingsPageSaliha.profileButton.click();

    }
    @When("user clicks on the settings module")
    public void user_clicks_on_the_settings_module()  {
        profileSettingsPageSaliha.settingsButton.click();

    }

    @When("user should see the full name{string}")
    public void userShouldSeeTheFullName(String arg0) {
        String actualName="Employee300";
        Boolean expectedName=profileSettingsPageSaliha.name.isDisplayed();
        Assert.assertTrue(actualName,expectedName);

    }



    @When("user enters phone number {int}")
    public void userEntersPhoneNumber(int phone) {
        profileSettingsPageSaliha.phoneNumber.sendKeys(phone+"");
    }
    @When("user enters website {string}")
    public void user_enters_website(String webSite) {
        profileSettingsPageSaliha.webSite.sendKeys(webSite);

    }
    @When("user selects language type {string}")
    public void user_selects_language_type(String string) {
        Select select=new Select(profileSettingsPageSaliha.languageDropdown);
        select.selectByVisibleText(string);

    }
    @When("user enters email {string}")
    public void user_enters_email(String email) {
        profileSettingsPageSaliha.email.sendKeys(email);
    }
    @When("user enters address {string}")
    public void user_enters_address(String address) {
        profileSettingsPageSaliha.address.sendKeys(address);
    }
    @When("user enters twitter account {string}")
    public void user_enters_twitter_account(String twitter) {
       profileSettingsPageSaliha.twitter.sendKeys(twitter);
    }
    @When("user selects Locale type {string}")
    public void user_selects_locale_type(String local){
        Select select= new Select(profileSettingsPageSaliha.localDropDown);
        select.selectByVisibleText(local);




    }



}
