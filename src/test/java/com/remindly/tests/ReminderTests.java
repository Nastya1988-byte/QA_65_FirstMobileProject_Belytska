package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase{
    @BeforeMethod
    public void  precondition(){
        app.getMainScreen().tapAtReminder();
    }
    @Test
    public void addReminderTitleTest(){
        app.getReminderHelper().enterReminderTitle("Holiday");
        app.getReminderHelper().tapSaveReminder();
        Assert.assertTrue(app.getMainScreen()
                .isReminderTitlePresent().contains("Holiday"));
    }
}
