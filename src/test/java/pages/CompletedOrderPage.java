package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletedOrderPage extends BasePage{


    public static final By backToHome = By.id("back-to-products");

    public CompletedOrderPage(WebDriver driver) {
        super(driver);
    }

    public void backToHomePage() {
        System.out.println("Current URL Before Click: "
                + driver.getCurrentUrl());
       click(backToHome);
    }
   public boolean isNavigatedToHome(){
        return driver.getCurrentUrl().contains("inventory");
    }

}
