package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    By checkout =By.id("checkout");

    By remove = By.id("remove-sauce-labs-backpack");

    public void checkOut() {
        driver.findElement(checkout).click();
    }
    public void remove() {
        driver.findElement(remove).click();
    }
}
