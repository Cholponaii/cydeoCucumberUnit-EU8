package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types apple " +
            "and clicks enter")
    public void user_types_and_clicks_enter2(String SearchKeyword) {
        googleSearchPage.searchBox.sendKeys(SearchKeyword+Keys.ENTER);
    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String SearchKeyword) {
        googleSearchPage.searchBox.sendKeys(SearchKeyword+Keys.ENTER);
    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle = string+" - Google Издөө";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion eccepts first arg as expected,second as actual
        Assert.assertEquals("Title is not expected",expectedTitle,actualTitle);


    }


    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title(String word) {

        String expectedTitle = "apple - Google Издөө";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion eccepts first arg as expected,second as actual
        Assert.assertEquals("Title is not expected",expectedTitle,actualTitle);
        //Assert.assertTrue(actualTitle.equals(expectedTitle));// it doesn't matter which arg is first
    }

        @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle ="Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.closeDriver();
    }
}
