package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppManager {

    AppiumDriver driver;
    DesiredCapabilities capabilities;

    MainScreenHelper mainScreen;
    ReminderHelper reminderHelper;

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "9");
        capabilities.setCapability("appium:automationName", "Appium");
        capabilities.setCapability("appium:deviceName", "Pix3");
        capabilities.setCapability("appium:appPackage", "com.blanyal.remindly");
        capabilities.setCapability("appium:appActivity", "com.blanyal.remindme.MainActivity");
        capabilities.setCapability("app", "C:\\Users\\belit\\Downloads\\Remindly.apk");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mainScreen = new MainScreenHelper(driver);
        reminderHelper = new ReminderHelper(driver);
    }
    public void stop(){
        driver.quit();
    }

    public MainScreenHelper getMainScreen() {
        return mainScreen;
    }

    public ReminderHelper getReminderHelper() {
        return reminderHelper;
    }
}

