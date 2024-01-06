package com.Techlisric.Tests;

import com.beust.ah.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.Driver;

public class MainTest extends TestBase {

    @Test
    public void mainTest () {

        Driver.getDriver().findElement(By.name("firstname")).sendKeys("Adam");

        Driver.getDriver().findElement(By.name("lastname")).sendKeys("Richman");

        //Driver.getDriver().findElement(By.className("");

        Select select = new Select(Driver.getDriver().findElement(By.id("rer")));
        select.selectByIndex(1);

        Alert alert = Driver.getDriver().switchTo().alert();

        //wait.until(ExpectedConditions.)




    }
}
