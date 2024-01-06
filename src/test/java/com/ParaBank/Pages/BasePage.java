package com.ParaBank.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class BasePage {

    public BasePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

}
