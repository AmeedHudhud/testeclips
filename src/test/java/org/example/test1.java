package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

    @Test
    public void print(){
        System.out.print("test");
//        Assert.assertEquals(false,false);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    }
}
