import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CompletePurchaseTest extends BaseTest {


    @Test
    public void completePurchaseFlow() {

        LoginPage loginPage =
                new LoginPage(driver);

        Products_page productsPage =
                new Products_page(driver);

        CartPage cartPage =
                new CartPage(driver);

        CheckOutFormPage checkoutPage =
                new CheckOutFormPage(driver);

        OrderReviewPage orderReviewPage =
                new OrderReviewPage(driver);

        CompletedOrderPage completedOrderPage =
                new CompletedOrderPage(driver);

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );
        Assert.assertTrue(
                loginPage.isLoginSuccessful()
        );
        productsPage.addItemToCart();
        productsPage.goToCartPage();
        cartPage.checkOut();
        checkoutPage.checkoutFormFill("kareem", "amin", "00000");
        orderReviewPage.finishOrder();
        completedOrderPage.backToHomePage();
        Assert.assertTrue(completedOrderPage.isNavigatedToHome());
        System.out.println("We are in Product Pade Nowwww");


    }
}
