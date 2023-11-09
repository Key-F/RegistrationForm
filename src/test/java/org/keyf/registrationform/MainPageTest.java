package org.keyf.registrationform;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");

        mainPage = new MainPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void registrationTestOK() {
        String fullName = "Ivan Ivanov";
        String email = "testEmail@gnail.com";
        String currentAddress = "qwe";
        String permanentAddress = "qwezxc";

        mainPage.userNameField.sendKeys(fullName);
        mainPage.userEmail.sendKeys(email);
        mainPage.currentAddress.sendKeys(currentAddress);
        mainPage.permanentAddress.sendKeys(permanentAddress);

        mainPage.submitButton.click();

        assertTrue(mainPage.nameResult.getText().contains(fullName), "Некорректное имя пользователя");
        assertTrue(mainPage.emailResult.getText().contains(email), "Некорректный email");
        assertTrue(mainPage.currentAddressResult.getText().contains(currentAddress), "Некорректный текущий адрес");
        assertTrue(mainPage.permanentAddressResult.getText().contains(permanentAddress), "Некорректный постоянный адрес");
    }

}
