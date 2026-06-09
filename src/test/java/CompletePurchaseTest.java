
import DataProviders.CombinedDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CompletePurchaseTest extends BaseTest{

    @Test(dataProvider = "fullFlowData", dataProviderClass = CombinedDataProvider.class)
    public void completePurchaseFlow(
            String username,
            String password,
            String firstName,
            String lastName,
            String zip
    ) {

        // Pages initialization (مهم جدًا لو مش في BaseTest)
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckOutFormPage checkoutPage = new CheckOutFormPage(driver);
        OrderReviewPage orderReviewPage = new OrderReviewPage(driver);
        CompletedOrderPage completedOrderPage = new CompletedOrderPage(driver);

        // 🔐 LOGIN
        loginPage.login(username, password);
        Assert.assertTrue(loginPage.isLoginSuccessful());

        // 🛒 ADD TO CART + GO
        productsPage.addItemToCart();
        productsPage.goToCartPage();

        // 🛒 CART
        cartPage.checkOut();

        // 🧾 CHECKOUT
        checkoutPage.checkoutFormFill(firstName, lastName, zip);

        // 🧾 FINISH ORDER
        orderReviewPage.finishOrder();

        // 🏠 BACK HOME
        completedOrderPage.backToHomePage();

        Assert.assertTrue(completedOrderPage.isNavigatedToHome());
    }
}