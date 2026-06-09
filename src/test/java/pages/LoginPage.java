package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {
    By username = By.id("user-name");
    By password = By.id("password");
    By login = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String pass){
            driver.findElement(username).sendKeys(user);
            driver.findElement(password).sendKeys(pass);
            driver.findElement(login).click();



    }
   public boolean isLoginSuccessful(){
            return driver.getCurrentUrl().contains("inventory");
        }

}
