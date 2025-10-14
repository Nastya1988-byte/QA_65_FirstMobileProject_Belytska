package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Collection;

public class MainScreenHelper extends BaseHelper{
    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

//    public boolean isNoReminderPresent() {
//        return isElementPresent(By.xpath("//android.widget.TextView[@text=Remindly]"));
//    }

    public void confirm() {
        tap(By.id("android:id/button1"));
    }

    public void tapAtReminder() {
        tap(By.id("add_reminder"));
    }


    public String isReminderTitlePresent() {
        return driver.findElement(By.id("recycle_title")).getText();
    }

    public void tapAtMoreOptions() {
        tap(By.className("android.widget.ImageView"));
    }

    public void tapAtLicenses() {
        tap(By.id("com.blanyal.remindly:id/title"));
    }

    public String isTextPresent() {
        return driver.findElement(By.id("com.blanyal.remindly:id/licenses_text_view")).getText();
    }

    public void tapAtNavigate() {
        tap(By.className("android.widget.ImageButton"));
    }
}
