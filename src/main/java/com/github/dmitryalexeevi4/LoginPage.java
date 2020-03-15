package com.github.dmitryalexeevi4;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

class LoginPage extends AbstractPage {
    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "otpCode")
    private WebElement otpCodeField;

    @FindBy(xpath = "//div[@class='secondary-links']/a[1]")
    private WebElement languageButton;


    LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    LoginPage languageSwitcher() {
        languageButton.click();
        return this;
    }

    LoginPage fieldsInsert(String username, String password) {
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    LoginPage codeInsert(String code) {
        otpCodeField.clear();
        otpCodeField.sendKeys(code);
        return this;
    }

    LoginPage loginButtonClick(String buttonId) {
        findElementById(buttonId).click();
        return this;
    }
}
