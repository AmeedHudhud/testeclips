package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class test1 {

    @Test
    public void test(){
        System.out.print("test");
//        Assert.assertEquals(false,false);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
        Dimension size=new Dimension(414,896);
//        driver.manage().window().setSize(size);
//        String x = driver.getPageSource();
//        System.out.println("URL is : " + x);
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();

         driver.findElement(By.tagName("Return"));
//        System.out.println(z);
    }


}
