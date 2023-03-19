package com.cydeo.hectorware.step_definitions;

import com.cydeo.hectorware.pages.DashboardPage;
import com.cydeo.hectorware.pages.LoginPage;
import com.cydeo.hectorware.pages.TalkModulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalkModule_stepDef {
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    TalkModulePage talkModulePage=new TalkModulePage();
    @Given("user is on the dashboard")
    public void user_is_on_the_dashboard() {
        loginPage.login("Employee1","Employee123");
    }
    @When("user clicks the talk icon on the top left of the page")
    public void user_clicks_the_talk_icon_on_the_top_left_of_the_page() {
        dashboardPage.talkModuleButton.click();
    }
    @Then("user verifies the conversations are listed on the left side of the page")
    public void user_verifies_the_conversations_are_listed_on_the_left_side_of_the_page() {
        Assert.assertTrue(talkModulePage.conversationList.isDisplayed());

    }
    @When("user clicks the Create a new group conversation button under the Talk sign")
    public void user_click_the_button_under_the_talk_sign() {
        talkModulePage.createGroupConvo.click();
    }
    @When("in the pop up screen, user writes {string} that you want to give to the conversation")
    public void in_the_pop_up_screen_user_writes_that_you_want_to_give_to_the_conversation_name_can_not_contain_more_than_characters(String string) {
       talkModulePage.conversationName.sendKeys(string);
    }
    @When("user clicks Add  participants button to add participants")
    public void user_clicks_add_participants_button_to_add_participants() {
        talkModulePage.addParticipants.click();
    }
    @When("user chooses Employee10,Employee100,Employee101 and click Create conversation")
    public void user_chooses_employee10_employee100_employee101_and_click() {
        talkModulePage.parpicipant1.click();
        talkModulePage.parpicipant2.click();
        talkModulePage.parpicipant3.click();
        talkModulePage.createConvo.click();
    }
    @Then("user verifies the conversation is listed")
    public void user_verifies_the_conversation_is_listed() {
        Assert.assertTrue(talkModulePage.convoVerification.getText().equals("You created the conversation"));
    }
}
