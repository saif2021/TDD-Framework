package com.amazontest;

import com.amazon.pages.HomePage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test
    public void logoValidation() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setLogo();

    }
}
