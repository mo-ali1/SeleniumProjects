package com.ParaBank.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LogInPage extends BasePage {


    @FindBy (xpath = "//*[@name='username']")
    private WebElement userNameElement;

    @FindBy (xpath = "//*[@name='password']")
    private WebElement passWordElement;

    public void logIn (){


        String username = ConfigurationReader.getProperty("userNameWord");
        String password = ConfigurationReader.getProperty("passWordWord");

        userNameElement.sendKeys(username);
        passWordElement.sendKeys(password, Keys.ENTER);
    }
}
