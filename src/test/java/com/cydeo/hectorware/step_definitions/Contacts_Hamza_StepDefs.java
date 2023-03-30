package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.ContactsPage_Hamza;
import com.cydeo.hectorware.pages.DashboardPage;
import com.cydeo.hectorware.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Contacts_Hamza_StepDefs {
    LoginPage login = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ContactsPage_Hamza contactsPage = new ContactsPage_Hamza();

    @Given("user is on the {string} page")
    public void userIsOnThePage(String module) {
        login.login("Employee1", "Employee123");
        dashboardPage.getModule(module).click();

    }

    @When("user clicks on the new contact button")
    public void user_clicks_on_the_new_contact_button() {
        contactsPage.newContactButton.click();
    }

    @When("user enters the username {string}")
    public void user_enters_the_username(String string) {
        contactsPage.contactFullNameInput.clear();
        contactsPage.contactFullNameInput.sendKeys(string);

    }

    @When("user enters the phone number {string}")
    public void user_enters_the_phone_number(String string) {
        contactsPage.phoneInput.sendKeys(string);
    }

    @When("user enters email address {string}")
    public void user_enters_email_address(String string) {
        contactsPage.emailInput.sendKeys(string);
    }

    @When("user enters the post office box {string}")
    public void user_enters_the_post_office_box(String string) {
        contactsPage.postOfficeBoxInput.sendKeys(string);
    }

    @When("user enters adress {string}")
    public void user_enters_adress(String string) {
        contactsPage.addressBoxInput.sendKeys(string);
    }

    @When("user enters extended address {string}")
    public void user_enters_extended_address(String string) {
        contactsPage.extendedAddressBoxInput.sendKeys(string);
    }

    @When("user enters postal code {string}")
    public void user_enters_postal_code(String string) {
        contactsPage.postalCodeInput.sendKeys(string);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        contactsPage.cityInput.sendKeys(string);
    }

    @When("user enters state or province {string}")
    public void user_enters_state_or_province(String string) {
        contactsPage.stateInput.sendKeys(string);
    }

    @When("user enters country {string}")
    public void user_enters_country(String string) {
        contactsPage.countryInput.sendKeys(string);
    }

    @Then("user sees {string} under all contacts")
    public void user_sees_under_all_contacts(String string) {
        List<String> allContacts = new ArrayList<>();
        for (WebElement eachContact : contactsPage.allContacts) {
            allContacts.add(eachContact.getText());
        }
        Assert.assertTrue(allContacts.contains(string));
    }

    @When("user clicks on {string} from list")
    public void userClicksOnFromList(String string) {
        for (WebElement contact : contactsPage.allContacts) {
            if (contact.getText().equals(string)) {
                contact.click();
            }
        }
    }

    @When("user clicks on three dot icon")
    public void user_clicks_on_three_dot_icon() {
        contactsPage.threeDotsIcon.click();
    }
    @When("user clicks on delete button")
    public void user_clicks_on_delete_button() {
        contactsPage.deleteButton.click();
    }

    @Then("verify no contact selected text is displayed")
    public void verifyNoContactSelectedTextIsDisplayed() {
        Assert.assertTrue(contactsPage.noContact.isDisplayed());
    }
}
