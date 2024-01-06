package com.ParaBank.Tests;

import com.ParaBank.Pages.LogInPage;
import com.ParaBank.Pages.TransferFundsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TransferFundsTest extends TestBase {

    @Test (priority = 1)
    public void logInTest (){
        LogInPage logInPage = new LogInPage();
        logInPage.logIn();
    }
    @Test (priority = 2)
    public void transferFundsTest () {
        TransferFundsPage transferFundsPage = new TransferFundsPage();
        transferFundsPage.transferMoney("99");
    }

}
