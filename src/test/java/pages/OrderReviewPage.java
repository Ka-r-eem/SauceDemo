package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderReviewPage {

    private WebDriver driver;

    public OrderReviewPage(WebDriver driver) {
        this.driver = driver;
    }

    By finish = By.id("finish");
    By pageTitle = By.className("title");

    public void finishOrder() {


        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(finish)
        );

        driver.findElement(finish).click();

        wait.until(
                ExpectedConditions.urlContains("checkout-complete")
        );


    }
}