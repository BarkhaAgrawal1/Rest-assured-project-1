package Methods;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Response.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Test_patch01 {
    @Test
    public void test_patch(){

        JSONObject obj1 = new JSONObject();
        obj1.put("name","ravi");
        obj1.put("class","qa");

       given()
                .header("Content-Type","application/JSON")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .patch("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .log().all();



    }
}
