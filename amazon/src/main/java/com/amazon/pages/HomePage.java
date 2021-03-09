package com.amazon.pages;

import com.reports.ExtentManager;
import com.reports.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HomePage {

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    private WebElement logo;

    public void setLogo() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(logo.isDisplayed());
        ExtentTestManager.log("Logo is displayed");

        softAssert.assertAll();
    }
}
