package com.ParaBank.Tests;

import com.ParaBank.Pages.LogInPage;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Login extends TestBase {
    @Test (priority = 1 )
    public void logInTest () {

        LogInPage logInPage = new LogInPage();
        logInPage.logIn();

        Assert.assertEquals("ParaBank | Accounts Overview", Driver.getDriver().getTitle(), "Title failed");
    }




}
