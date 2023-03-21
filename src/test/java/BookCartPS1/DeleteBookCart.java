package BookCartPS1;

import com.utils.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.utils.Generic.deleteApiCall;
import static com.utils.Generic.postApiCall;
import static com.utils.DataPath.*;

public class DeleteBookCart {
    @DataProvider(name = "PositiveDeleteDataProvider")
    public  static Object[][] DataProviderPositiveDelete() throws IOException {
        return ExcelReader.getData(PATH_FOR_BOOKCART_EXCEL,SHEETNAME_FOR_DELETE_POSITIVE_BOOKCART);
    }
    @Test(dataProvider = "PositiveDeleteDataProvider")
    public void positiveDeleteBookCart(Object testCase,Object url,Object expectedStatus,Object requestType){
        System.out.println(testCase);
        System.out.println(url);
        if (requestType.equals("POST")){
            postApiCall(url,expectedStatus);
        }
        else{
            deleteApiCall(url,expectedStatus);
        }

    }
    @DataProvider(name = "NegativeDeleteDataProvider")
    public  static Object[][] DataProviderNegativeDelete() throws IOException {
        return ExcelReader.getData(PATH_FOR_BOOKCART_EXCEL,SHEETNAME_FOR_DELETE_NEGATIVE_BOOKCART);
    }
    @Test(dataProvider = "NegativeDeleteDataProvider")
    public void negativeDeleteBookCart(Object testCase,Object url,Object expectedStatus){
        System.out.println(testCase);
        System.out.println(url);
        deleteApiCall(url,expectedStatus);
    }
}
