package org.keyf.registrationform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(css = "[id ='userName']")
    public WebElement userNameField;

    @FindBy(css = "[id ='userEmail']")
    public WebElement userEmail;

    @FindBy(css = "[id ='currentAddress']")
    public WebElement currentAddress;

    @FindBy(css = "[id ='permanentAddress']")
    public WebElement permanentAddress;

    @FindBy(css = "[id ='submit']")
    public WebElement submitButton;

    @FindBy(css = "[id ='name']")
    public WebElement nameResult;

    @FindBy(css = "[id ='email']")
    public WebElement emailResult;

    @FindBy(css = "[id = 'output'] [id = 'currentAddress']")
    public WebElement currentAddressResult;

    @FindBy(css = "[id = 'output'] [id = 'permanentAddress']")
    public WebElement permanentAddressResult;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
