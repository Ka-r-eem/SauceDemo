package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutFormPage extends BasePage{
    By firstname = By.id("first-name");
    By lastname = By.id("last-name");
    By code  = By.id("postal-code");

    public CheckOutFormPage(WebDriver driver) {
        super(driver);
    }


    public void checkoutFormFill(String _firstname, String _lastname, String _code){
        driver.findElement(firstname).sendKeys(_firstname);
        driver.findElement(lastname).sendKeys(_lastname);
        driver.findElement(code).sendKeys( _code);
        driver.findElement(By.id("continue")).click();

    }


}
