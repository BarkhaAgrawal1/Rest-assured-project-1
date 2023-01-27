package Methods;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;

public class Test_Delete01 {
    @Test
    public void test_delete(){
        JSONObject obj1 = new JSONObject();
        obj1.put("name","Barkha");
        obj1.put("class","HR");

        when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204).log().all();





    }
}
