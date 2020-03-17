package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Utils extends BasePage {

    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }
    //wait for click on element method
    public static void clickOnElement(By by) {

        driver.findElement(by).click();

    }
}
