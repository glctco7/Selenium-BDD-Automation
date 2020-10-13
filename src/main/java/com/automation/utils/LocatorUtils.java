package com.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.automation.utils.DriverUtils.getDriver;

public class LocatorUtils {
    /**
     * @param StringText :  Printed Summer Dress
     * @return
     */
    public static WebElement getDynamicLocator(String StringText) {
        return getDriver().findElement(By.xpath("(//*[contains(text(),'" + StringText + "')])[1]"));
    }
}
