package BookCartPS1;

import com.qa.utils.excelReader;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.qa.utils.Generic.postApiCall;
import static com.qa.utils.dataPath.*;

public class PostBookCart {
    @DataProvider(name = "PositiveDataProvider")
    public Object[][] DataProviderPositiveBookCart() throws IOException {
        return excelReader.getData(PATH_FOR_BOOKCART_EXCEL,SHEETNAME_FOR_POST_POSITIVE_BOOKCART);
    }
    @Test(dataProvider = "PositiveDataProvider")
    public void BookCartPositiveTestCases(Object testCase,Object url,Object expectedStatus){
        System.out.println(testCase);
        System.out.println(url);
        postApiCall(url,expectedStatus);
    }
    @DataProvider(name = "NegativeDataProvider")
    public Object[][] DataProviderNegativeBookCart() throws IOException {
        return excelReader.getData(PATH_FOR_BOOKCART_EXCEL,SHEETNAME_FOR_POST_NEGATIVE_BOOKCART);
    }
    @Test(dataProvider = "NegativeDataProvider")
    public void BookCartNegativeTestCases(Object testCase,Object url,Object expectedStatus){
        System.out.println(testCase);
        System.out.println(url);
        postApiCall(url,expectedStatus);
    }
}
