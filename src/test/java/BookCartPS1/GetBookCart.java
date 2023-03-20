package BookCartPS1;

import com.qa.utils.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.qa.utils.Generic.getApiCall;
import static com.qa.utils.DataPath.*;

public class GetBookCart {
    @DataProvider(name = "PositiveDataProvider")
    public static Object[][] DataProviderPositiveGetBookCart() throws IOException {
        return ExcelReader.getData(PATH_FOR_BOOKCART_EXCEL,SHEETNAME_FOR_GET_POSITIVE_BOOKCART);
    }
    @Test(dataProvider = "PositiveDataProvider")
    public void getPositiveBookCart(Object testCase,Object url,Object expectedStatus){
        System.out.println(testCase);
        System.out.println(url);
        getApiCall(url,expectedStatus);
    }
    @DataProvider(name = "NegativeDataProvider")
    public static Object[][] DataProviderNegativeGetBookCart() throws IOException {
        return ExcelReader.getData(PATH_FOR_BOOKCART_EXCEL,SHEETNAME_FOR_GET_NEGATIVE_BOOKCART);
    }
    @Test(dataProvider = "NegativeDataProvider")
    public void getNegativeBookCart(Object testCase,Object url,Object expectedStatus){
        System.out.println(testCase);
        System.out.println(url);
        getApiCall(url,expectedStatus);
    }
}
