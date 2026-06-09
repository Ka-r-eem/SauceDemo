package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // Locators
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("[data-test='error']");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Actions
    public void login(String username, String password) {
        type(usernameField, username);
        type(passwordField, password);
        click(loginButton);
    }

    // Validations (NO Assertions here - only checks)
    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().contains("inventory");
    }

    public boolean isErrorDisplayed(By errorMessage) {
        return isErrorDisplayed(this.errorMessage);
    }
}