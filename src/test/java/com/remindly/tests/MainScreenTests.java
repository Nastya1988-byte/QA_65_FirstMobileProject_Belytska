package com.remindly.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase {

    @Test
    public void precondition(){
        app.getMainScreen().tapAtMoreOptions();
        app.getMainScreen().tapAtLicenses();
        Assert.assertTrue(app.getMainScreen()
                .isTextPresent().contains("NOTICES FOR LIBRARIES:"));
    }
    @AfterMethod
    public void returnMain(){
        app.getMainScreen().tapAtNavigate();
    }
}
