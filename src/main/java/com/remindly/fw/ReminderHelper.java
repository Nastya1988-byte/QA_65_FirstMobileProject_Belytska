package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReminderHelper extends BaseHelper {
    public ReminderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void enterReminderTitle(String title) {
        type(By.id("reminder_title"), title);
    }

    public void tapSaveReminder() {
        tap(By.id("save_reminder"));
    }

    public void tapDataField() {
        tap(By.id("com.blanyal.remindly:id/date"));
    }

    public void swipeToMonth(String period, int number, String month) {
        pause(1000);
        if (!getSelectedMonth().equals(month)) {
            for (int i = 0; i < number; i++) {
                if (period.equals("feature")) {
                    swipe(0.6, 1.3);
                } else if (period.equals("past")) {
                    swipe(0.5, 0.9);
                }
            }

        }
    }

    public String getSelectedMonth() {
        return driver.findElement(By.id("date_picker_month")).getText();
    }

    public void selectDate(int index) {
        List<WebElement> days = driver.findElements(By.className("android.view.View"));
        days.get(index).click();


    }

    public void tapYear() {
        tap(By.id("date_picker_year"));
    }

    public void swipeYear(String period, String year) {
        pause(1000);
        if (!getSelectedYear().equals(year)){
            if (period.equals("feature")){
                swipeUntilNeededYear(year, 0.6, 0.5);
            }else if (period.equals("past")){
                swipeUntilNeededYear(year, 0.5, 0.6);

            }

        }

    }



    public String getSelectedYear() {
        return driver.findElement(By.id("date_picker_year")).getText();

    }
    public String getYear(){
        return driver.findElement(By.id("month_text_view")).getText();
    }
}
