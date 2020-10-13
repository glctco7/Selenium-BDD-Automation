package com.automation.Tests;

import com.automation.pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.utils.DriverUtils.initDriver;
import static com.automation.utils.DriverUtils.tearDown;

public class AddToCartProductTest {
    @BeforeClass
    public void beforeClassFunc() {
        initDriver();
    }

    @Test
    public void addProductToCartAndSignIn() {
        HomePage homePage = new HomePage();
        homePage.selectItemFromHOmePage("");
    }

    @AfterClass
    public void afterClassFunc() {
        tearDown();
    }
}
