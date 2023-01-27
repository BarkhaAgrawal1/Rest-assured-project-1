package Methods;

import io.restassured.http.ContentType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_put01 {
    @Test
    public void test_put(){
        JSONObject obj = new JSONObject();
        obj.put("name","Barkha");
        obj.put("class","QA");

        given()
                .header("Content-type","application/JSON")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .put("https://reqres.in/api/users/2")
                .then()
                .statusCode(200).log().all();



    }
}
