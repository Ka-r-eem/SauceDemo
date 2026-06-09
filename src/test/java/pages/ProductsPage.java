package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By tshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By onesie = By.id("add-to-cart-sauce-labs-onesie");
    By redshirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By cartIcn = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void addItemToCart() {
        click(backpack);
        click(bikeLight);
    }

    public void goToCartPage() {
        click(cartIcn);
    }
}
