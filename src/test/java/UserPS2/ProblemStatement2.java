package UserPS2;

import com.qa.utils.ExcelReader;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

import static com.qa.utils.DataPath.*;
import static com.qa.utils.Generic.*;
import static helper.UserPS2Helper.AssertionGetUser;

public class ProblemStatement2 {
    @DataProvider(name = "dataProvider")
    public Object[][] userProblemStatement2() throws IOException {
        return ExcelReader.getData(PATH_FOR_USER, SHEETNAME_FOR_PS2);
    }

    @Test(dataProvider = "dataProvider")
    public void positiveUserPS2(Object testCase, Object postPayload,Object putPayload,Object postExpStatus,Object deleteExpStatus,Object expectedStatus){
        Map token =tokenMap();
        Response postResponse =postApiCall(token,BASE_URL_USER_PS2, postPayload,postExpStatus);
        JsonPath jsonPath=postResponse.jsonPath();
        String responseId=jsonPath.getString("id");
        String urlWithId = BASE_URL_USER_PS2 +"/"+responseId;
        Response getResponse = getApiCall(token,urlWithId,expectedStatus);
        AssertionGetUser(getResponse,postPayload);
        putApiCall(token,urlWithId,putPayload,expectedStatus);
        Response getResponseAfterUpdate=getApiCall(token,urlWithId,expectedStatus);
        AssertionGetUser(getResponseAfterUpdate,putPayload);
        deleteApiCall(token,urlWithId,deleteExpStatus);
    }

    @Test(dataProvider = "dataProvider")
    public void negativeUserPS2(Object testCase, Object postPayload,Object putPayload,Object postExpStatus,Object deleteExpStatus,Object expectedStatus) {
        Map token = tokenMap();
        Response postResponse = postApiCall(token, BASE_URL_USER_PS2, postPayload, postExpStatus);
        JsonPath jsonPath = postResponse.jsonPath();
        String responseId = jsonPath.getString("id");
        String urlWithId = BASE_URL_USER_PS2 + "/" + responseId;
        Response getResponse = getApiCall(token, urlWithId, expectedStatus);
        AssertionGetUser(getResponse, postPayload);
        deleteApiCall(token,urlWithId,deleteExpStatus);
        getApiCall(token,urlWithId,EXPECTED_STATUS_404);
    }
}
