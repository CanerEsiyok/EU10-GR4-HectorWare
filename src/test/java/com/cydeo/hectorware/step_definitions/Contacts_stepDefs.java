package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.ContactsPage;
import com.cydeo.hectorware.pages.DashboardPage;
import com.cydeo.hectorware.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
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

        contactsPage.contactFullNameInput.clear();
        contactsPage.contactFullNameInput.sendKeys(newUser);

    }


    @When("the user enters the phone number {string}")
    public void the_user_enters_the_phone_number(String phoneNumber) {

        contactsPage.phoneInput.sendKeys(phoneNumber);

    }


    @When("the user enters email address {string}")
    public void the_user_enters_email_address(String emailAddress) {

        contactsPage.emailInput.sendKeys(emailAddress);

    }


    @When("the user enters the post office box {string}")
    public void the_user_enters_the_post_office_box(String postOfficeBox) {

        contactsPage.postOfficeBoxInput.sendKeys(postOfficeBox);

    }


    @When("the user enters address {string}")
    public void the_user_enters_address(String address) {

        contactsPage.addressBoxInput.sendKeys(address);


    }


    @When("the user enters extended address {string}")
    public void the_user_enters_extended_address(String extendedAddress) {

        contactsPage.extendedAddressBoxInput.sendKeys(extendedAddress);

    }


    @When("the user enters postal code {string}")
    public void the_user_enters_postal_code(String extendedAddress) {

        contactsPage.extendedAddressBoxInput.sendKeys(extendedAddress);

    }


    @When("the user enters city {string}")
    public void the_user_enters_city(String postalCode) {

        contactsPage.postalCodeInput.sendKeys(postalCode);

    }


    @When("the user enters state or province {string}")
    public void the_user_enters_state_or_province(String city) {

        contactsPage.cityInput.sendKeys(city);

    }


    @When("the user enters country {string}")
    public void the_user_enters_country(String country) {

        contactsPage.countryInput.sendKeys(country);

    }


    @Then("the {string} contact should be created under the list of contacts")
    public void the_contact_should_be_created_under_the_list_of_contacts(String newContactName) {

        List<String> allContacts = new ArrayList<>();

        for (WebElement eachContact : contactsPage.allContacts) {
            allContacts.add(eachContact.getText());
        }

        Assert.assertTrue(allContacts.contains(newContactName));



    }


}
