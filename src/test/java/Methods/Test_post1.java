package Methods;

import io.restassured.http.ContentType;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;


public class Test_post1 {
@Test
    public void Test_post(){

        JSONObject request = new JSONObject();
        request.put("name","Barkha");
        request.put("job","QA");

        System.out.println(request.toJSONString());

        given().
                header("Content-Type","application/JSON")
                .contentType(ContentType.JSON).accept(JSON)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201).log().all();


    }

}
