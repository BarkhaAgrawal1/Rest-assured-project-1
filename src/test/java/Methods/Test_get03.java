package Methods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
 import static io.restassured.matcher.RestAssuredMatchers.*;
 import static org.hamcrest.Matchers.*;

// this is when we import the static restassured from io. rest assured from the rest assured website
//we do not need to save response in a variable and can directly used the BDD approach




public class Test_get03 {
    @Test
    void get_03(){
     when()
             . get("https://reqres.in/api/users?page=2")
        .then().statusCode(200)
              .body("\"total_pages\"",equalTo((2)))
             .log().all()
              .body("data.first_name" ,hasItems("Michael", "Lindsay"));









    }
}
