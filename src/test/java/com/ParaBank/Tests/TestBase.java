package com.ParaBank.Tests;

import com.ParaBank.Pages.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TestBase extends BasePage {


    @BeforeMethod
   public void setup (){

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }


    /*
  @AfterMethod
  public void tearDown(){
       Driver.closeDriver();
    }

     */
}
