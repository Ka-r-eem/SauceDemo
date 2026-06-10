
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

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckOutFormPage checkoutPage = new CheckOutFormPage(driver);
        OrderReviewPage orderReviewPage = new OrderReviewPage(driver);
        CompletedOrderPage completedOrderPage = new CompletedOrderPage(driver);

        //Login
        loginPage.login(username, password);
        Assert.assertTrue(loginPage.isLoginSuccessful());

        //Add to cart
        productsPage.addItemToCart();
        productsPage.goToCartPage();

        // CheckOut
        cartPage.checkOut();

        //Fill Form
        checkoutPage.checkoutFormFill(firstName, lastName, zip);

        //Finish Order
        orderReviewPage.finishOrder();

        //Back To Home
        completedOrderPage.backToHomePage();

        Assert.assertTrue(completedOrderPage.isNavigatedToHome());
    }
}