package com.ParaBank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferFundsPage extends  BasePage {

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[3]/a")
    public WebElement TransferFundsElement;

    @FindBy(id = "amount")
    public WebElement AmountElement;

    @FindBy(id = "fromAccountId")
    public WebElement FromAccountElement;

    @FindBy(id = "toAccountId")
    public WebElement ToAccountElement;

    public void transferMoney (String amount){
        TransferFundsElement.click();
        AmountElement.sendKeys(amount);

    }
}


