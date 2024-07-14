package com.selenium_framework;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;

public class RegUserTest extends BasePage {
    public RegUserTest(WebDriver driver) {
        super(driver);
    }

    @BeforeClass
    public void setUp() {
        DriverFactory.getDriver();
    }

    @Test
    public void testRegUserPage(){
        url=UtilitiesPage.getPropertyFileValue("registerUserUrl");
        driver.get(UtilitiesPage.getPropertyFileValue(url));
    }
    
    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
