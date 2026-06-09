import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.ScreenshotUtil;

public class BaseTest {

    protected WebDriver driver;
    Constants constants;
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;
    protected CheckOutFormPage checkoutPage;
    protected OrderReviewPage orderReviewPage;
    protected CompletedOrderPage completedOrderPage;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.get(Constants.domainUrl);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckOutFormPage(driver);
        orderReviewPage = new OrderReviewPage(driver);
        completedOrderPage = new CompletedOrderPage(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        // لو التست فشل
        if (result.getStatus() == ITestResult.FAILURE) {

            String testName = result.getName();
            System.out.println("Test " + testName + " failed.");
            System.out.println("Screenshots are:");

            ScreenshotUtil.takeScreenshot(driver, testName);
        }

        // قفل المتصفح
        if (driver != null) {
            driver.quit();
        }
    }
}