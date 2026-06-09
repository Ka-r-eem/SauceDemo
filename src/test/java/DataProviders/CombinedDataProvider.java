package DataProviders;

import org.testng.annotations.DataProvider;
import utils.ExcelReader;

import java.util.Random;

public class CombinedDataProvider {

    @DataProvider(name = "fullFlowData")
    public static Object[][] fullFlowData() {

        String path = "src/test/resources/testData/sauceDemoData.xlsx";

        Object[][] loginData = ExcelReader.getExcelData(path, "login_usernames");
        Object[][] checkoutData = ExcelReader.getExcelData(path, "formfill");
        Random random = new Random();

        int loginIndex = random.nextInt(loginData.length);
        int checkoutIndex = random.nextInt(checkoutData.length);

        return new Object[][] {
                {
                        loginData[loginIndex][0],
                        loginData[loginIndex][1],

                        checkoutData[checkoutIndex][0],
                        checkoutData[checkoutIndex][1],
                        checkoutData[checkoutIndex][2]
                }
        };

    }
}