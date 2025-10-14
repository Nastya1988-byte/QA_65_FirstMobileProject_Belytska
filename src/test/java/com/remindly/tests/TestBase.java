package com.remindly.tests;

import com.remindly.fw.AppManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class TestBase {
    protected AppManager app = new AppManager();
    @BeforeMethod
    public void setUpp() throws MalformedURLException {
        app.init();
        app.getMainScreen();
    }
    @AfterMethod(enabled = false)
    public void ternDown(){
        app.stop();
    }
}
