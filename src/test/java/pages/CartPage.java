package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    By checkout =By.id("checkout");
    By remove = By.id("remove-sauce-labs-backpack");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void checkOut() {
        driver.findElement(checkout).click();
    }
    public void remove() {
        driver.findElement(remove).click();
    }
}
