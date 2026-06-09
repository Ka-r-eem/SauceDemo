package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products_page extends BasePage{

    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By tshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By onesie = By.id("add-to-cart-sauce-labs-onesie");
    By redshirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public Products_page(WebDriver driver) {
        super(driver);
    }

    public void addItemToCart()
    {
        driver.findElement(backpack).click();
        driver.findElement(bikeLight).click();

    }
    public void goToCartPage()
    {
        driver.findElement(By.className("shopping_cart_link")).click();
    }
}
