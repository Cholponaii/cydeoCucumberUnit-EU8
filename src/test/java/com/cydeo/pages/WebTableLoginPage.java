package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;


    /**
     * This method will log in using credentials
     * from configuraion.properties
     */

    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("webTableUsername"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("webTablePassword"));
        loginButton.click();
    }



}
