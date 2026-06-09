package DataProviders;

import org.testng.annotations.DataProvider;
import utils.ExcelReader;

public class CheckOutDataProvider {

    @DataProvider(name = "excelLoginData")
    public Object[][] getCheckoutData() {

        String path = "src/test/resources/testData/sauceDemoData.xlsx";

        return ExcelReader.getExcelData(path, "formfill");
    }
}