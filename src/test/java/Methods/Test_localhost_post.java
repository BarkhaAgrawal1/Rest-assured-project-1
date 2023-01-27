package Methods;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;


public class Test_localhost_post {
    @Test
    public void Test_post(){

        JSONObject obj = new JSONObject();
        obj.put("id",24);
        obj.put("name","kajal");
        obj.put("class","science");

        baseURI = "http://localhost:3000/";

        given()
                .header("Content-Type","application/JSON")
                .contentType("ContentType.JSONObject")
                .body(obj.toJSONString())
                .when()
                .post("/users")
                .then()
                .statusCode(201).log().all();


    }

}


