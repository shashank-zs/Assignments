package BookCartPS1;

import com.utils.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.utils.Generic.postApiCall;
import static com.utils.DataPath.*;

public class PostBookCart {
    @DataProvider(name = "PositiveDataProvider")
    public Object[][] DataProviderPositiveBookCart() throws IOException {
        return ExcelReader.getData(PATH_FOR_BOOKCART_EXCEL,SHEETNAME_FOR_POST_POSITIVE_BOOKCART);
    }
    @Test(dataProvider = "PositiveDataProvider")
    public void BookCartPositiveTestCases(Object testCase,Object url,Object expectedStatus){
        System.out.println(testCase);
        System.out.println(url);
        postApiCall(url,expectedStatus);
    }
    @DataProvider(name = "NegativeDataProvider")
    public Object[][] DataProviderNegativeBookCart() throws IOException {
        return ExcelReader.getData(PATH_FOR_BOOKCART_EXCEL,SHEETNAME_FOR_POST_NEGATIVE_BOOKCART);
    }
    @Test(dataProvider = "NegativeDataProvider")
    public void BookCartNegativeTestCases(Object testCase,Object url,Object expectedStatus){
        System.out.println(testCase);
        System.out.println(url);
        postApiCall(url,expectedStatus);
    }
}
