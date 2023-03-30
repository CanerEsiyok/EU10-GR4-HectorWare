package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.ContactsPage;
import com.cydeo.hectorware.pages.DashboardPage;
import com.cydeo.hectorware.pages.LoginPage;
import com.cydeo.hectorware.utilities.BrowserUtils;
import com.cydeo.hectorware.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Contacts_stepDefs {

    ContactsPage contactsPage = new ContactsPage();

    @Given("the user is on the {string} page")
    public void the_user_is_on_the_page(String contactsModule) {

        new LoginPage().login("Employee1", "Employee123");
        new DashboardPage().getModule(contactsModule).click();

    }


    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String button) {

        contactsPage.getContactsModule(button).click();

    }


    @When("the user enters the username {string}")
    public void the_user_enters_the_username(String newUser) {

        if (!contactsPage.contactFullNameInput.getText().isBlank()) {
            contactsPage.contactFullNameInput.clear();
        }
        contactsPage.contactFullNameInput.sendKeys(newUser);

    }


    @When("the user enters the phone number {string}")
    public void the_user_enters_the_phone_number(String phoneNumber) {

        if (!contactsPage.phoneInput.getText().isBlank()) {
            contactsPage.phoneInput.clear();
        }
        contactsPage.phoneInput.sendKeys(phoneNumber);

    }


    @When("the user enters email address {string}")
    public void the_user_enters_email_address(String emailAddress) {

        if (!contactsPage.emailInput.getText().isBlank()) {
            contactsPage.emailInput.clear();
        }
        contactsPage.emailInput.sendKeys(emailAddress);

    }


    @When("the user enters the post office box {string}")
    public void the_user_enters_the_post_office_box(String postOfficeBox) {

        if (!contactsPage.postOfficeBoxInput.getText().isBlank()) {
            contactsPage.postOfficeBoxInput.clear();
        }
        contactsPage.postOfficeBoxInput.sendKeys(postOfficeBox);

    }


    @When("the user enters address {string}")
    public void the_user_enters_address(String address) {

        if (!contactsPage.addressBoxInput.getText().isBlank()) {
            contactsPage.addressBoxInput.clear();
        }
        contactsPage.addressBoxInput.sendKeys(address);


    }


    @When("the user enters extended address {string}")
    public void the_user_enters_extended_address(String extendedAddress) {

        if (!contactsPage.extendedAddressBoxInput.getText().isBlank()) {
            contactsPage.extendedAddressBoxInput.clear();
        }
        contactsPage.extendedAddressBoxInput.sendKeys(extendedAddress);

    }


    @When("the user enters postal code {string}")
    public void the_user_enters_postal_code(String postalCode) {

        if (!contactsPage.postalCodeInput.getText().isBlank()) {
            contactsPage.postalCodeInput.clear();
        }
        contactsPage.postalCodeInput.sendKeys(postalCode);

    }


    @When("the user enters city {string}")
    public void the_user_enters_city(String city) {

        if (!contactsPage.cityInput.getText().isBlank()) {
            contactsPage.cityInput.clear();
        }
        contactsPage.cityInput.sendKeys(city);

    }


    @When("the user enters state or province {string}")
    public void the_user_enters_state_or_province(String stateOrProvince) {

        if (!contactsPage.stateInput.getText().isBlank()) {
            contactsPage.stateInput.clear();
        }
        contactsPage.stateInput.sendKeys(stateOrProvince);

    }


    @When("the user enters country {string}")
    public void the_user_enters_country(String country) {

        if (!contactsPage.countryInput.getText().isBlank()) {
            contactsPage.countryInput.clear();
        }
        contactsPage.countryInput.sendKeys(country);

    }


    @Then("the {string} contact should be created under the list of contacts")
    public void the_contact_should_be_created_under_the_list_of_contacts(String newContactName) {

        contactsPage.getContactsModule("All contacts").click();

        List<String> allContacts = BrowserUtils.returnWebElementsText(contactsPage.allContacts);

        Assert.assertTrue(allContacts.contains(newContactName));



    }


    @When("the user clicks on {string} in the contacts list")
    public void theUserClicksOnInTheContactsList(String newUsername) {

        for (WebElement eachContact : contactsPage.allContacts) {

            if (eachContact.getText().equals(newUsername)) {
                eachContact.click();
            }

        }

    }


    @And("the user clicks on the three dots on the right side of the page and clicks delete option")
    public void theUserClicksOnTheThreeDotsOnTheRightSideOfThePageAndClicksDeleteOption() {

        contactsPage.threeDots.click();
        try {
            contactsPage.deleteButton.click();
        } catch (ElementNotInteractableException e) {

            BrowserUtils.waitForTheVisibilityOfElement(contactsPage.deleteButton);
            contactsPage.deleteButton.click();

        }


    }

    @Then("the {string} contact should NOT be available on the contacts list")
    public void theContactShouldNOTBeAvailableOnTheContactsList(String contactsName) {

        List<String> allContacts = BrowserUtils.returnWebElementsText(contactsPage.allContacts);
        Assert.assertFalse(allContacts.contains(contactsName));

    }
}
