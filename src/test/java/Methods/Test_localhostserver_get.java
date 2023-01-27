package Methods;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_localhostserver_get {

    @Test
    public void Test_get(){

        baseURI = "http://localhost:3000/";

        given()
                .get("/users")
                .then()
                .statusCode(200).log().all();


    }

}
