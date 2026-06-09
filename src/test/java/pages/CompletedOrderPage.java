package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletedOrderPage {
    private WebDriver driver;

    public CompletedOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    By backToHome = By.id("back-to-products");

    public void backToHomePage() {
        System.out.println("Current URL Before Click: "
                + driver.getCurrentUrl());
        driver.findElement(backToHome).click();
    }
   public boolean isNavigatedToHome(){
        return driver.getCurrentUrl().contains("inventory");
    }

}
