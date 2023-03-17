package helper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

public class BookCartHelper {
    public  static void getBookStoreAssertions(Response response, Object bookId){
        JsonPath jsonpath = response.jsonPath();
        Integer responseBookID= jsonpath.getInt("[0].book.bookId");

        if (bookId!=null && responseBookID !=null){
            Assert.assertEquals(bookId,String.valueOf(responseBookID) );
        }
    }
}
