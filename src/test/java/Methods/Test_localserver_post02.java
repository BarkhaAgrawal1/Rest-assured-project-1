package Methods;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Test_localserver_post02 {
    @Test
    public void Test_post(){

        JSONObject obj = new JSONObject();
        obj.put("name","Barkha");
        obj.put("class","english");
        baseURI = "http://localhost:3000/";
        given()
                .header("Content-Type","application/JSON")
                .contentType(ContentType.JSON)
                .when()
                .body(obj.toJSONString())
                .post("/users")
                .then()
                .statusCode(201).log().all();





    }







}
