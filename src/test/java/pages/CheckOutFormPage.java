package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutFormPage extends BasePage{
    By firstname = By.id("first-name");
    By lastname = By.id("last-name");
    By code  = By.id("postal-code");
    By ctnBtn = By.id("continue");

    public CheckOutFormPage(WebDriver driver) {
        super(driver);
    }


    public void checkoutFormFill(String _firstname, String _lastname, String _code){
        type(firstname, _firstname);
        type(lastname, _lastname);
        type(code, _code);
        click(ctnBtn);

    }


}
