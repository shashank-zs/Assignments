package helper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class UserPS2Helper {
    public static void AssertionGetUser(Response response,Object payload){
        JsonPath resJsonpath=response.jsonPath();
        String resName=resJsonpath.getString("name");
        String resEmail=resJsonpath.getString("email");
        String resGender=resJsonpath.getString("gender");
        String resStatus=resJsonpath.getString("status");
        Object obj= JSONValue.parse((String) payload);
        JSONObject jsonObject = (JSONObject) obj;
        Assert.assertEquals((String) jsonObject.get("name"),resName);
        Assert.assertEquals((String) jsonObject.get("email"),resEmail);
        Assert.assertEquals((String) jsonObject.get("gender"),resGender);
        Assert.assertEquals((String) jsonObject.get("status"),resStatus);
    }
}
