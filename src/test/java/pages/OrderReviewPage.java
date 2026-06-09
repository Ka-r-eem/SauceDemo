package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderReviewPage extends BasePage {


    By finish = By.id("finish");
    By pageTitle = By.className("title");

    public OrderReviewPage(WebDriver driver) {
        super(driver);
    }

    public void finishOrder() {


        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        waitForClickable(finish);

       click(finish);

        waitForVisible(pageTitle);


    }
}