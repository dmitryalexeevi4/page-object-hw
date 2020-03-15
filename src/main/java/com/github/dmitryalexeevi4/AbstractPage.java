package com.github.dmitryalexeevi4;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;


abstract class AbstractPage {
    protected final WebDriver webDriver;

    AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    String pageHeader() {
        return webDriver.findElement(By.xpath("//div[@class = 'page-header']/h1")).getText().toLowerCase();
    }

    String pageTitle() {
        return webDriver.getTitle().toLowerCase();
    }

    AbstractPage openNavBarSection(String sectionId) {
        webDriver.findElement(By.xpath("//ul[@class = 'navigation-menu nav']//li[@id = '" + sectionId + "']")).click();
        return this;
    }

    WebElement findElementByClassName(String className) {
        return webDriver.findElement(By.className(className));
    }

    WebElement findElementById(String id) {
        return webDriver.findElement(By.id(id));
    }

}
