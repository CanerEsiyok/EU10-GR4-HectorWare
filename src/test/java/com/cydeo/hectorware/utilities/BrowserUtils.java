package com.cydeo.hectorware.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    public static void sleep(int second){
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if(driver.getCurrentUrl().contains(expectedInUrl))
                break;
        }
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle(String expectedTitle){
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public static void verifyURLEndsWith(String expectedEnd){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(expectedEnd));
    }

    public static List<String> dropdownOptionsAsString(WebElement dropdown){
        Select select=new Select(dropdown);
        List<String>result=new ArrayList<>();
        for (WebElement option : select.getOptions()) {
            result.add(option.getText());
        }
        return result;
    }




}

