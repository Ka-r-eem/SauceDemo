package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }
    protected void type (By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }
    protected void click (By locator) {
        driver.findElement(locator).click();
    }
    protected void waitForVisible (By locator) {
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }
    protected void waitForClickable (By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


}