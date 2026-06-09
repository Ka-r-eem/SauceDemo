package DataProviders;

import org.testng.annotations.DataProvider;
import utils.ExcelReader;

public class LoginDataProvider {

    @DataProvider(name = "excelLoginData")
    public Object[][] getLoginData() {

        String path = "src/test/resources/testData/sauceDemoData.xlsx";

        return ExcelReader.getExcelData(path, "login_usernames");
    }
}