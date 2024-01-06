package com.Techlisric.Tests;

import com.ParaBank.Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TestBase extends BasePage {


    @BeforeMethod
   public void setup (){

        String url = ConfigurationReader.getProperty("url2");
        Driver.getDriver().get(url);
    }


    /*
  @AfterMethod
  public void tearDown(){
       Driver.closeDriver();
    }

     */
}
