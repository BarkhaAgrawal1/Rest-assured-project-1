package Methods;

import  io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

// this is the method when we are not importing static method of rest assured
// and not creating json body

public class Test_get01 {
@Test
    void get_01(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getBody().toString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeaders());
        System.out.println(response.getTime());

        int a = response.getStatusCode();
    Assert .assertEquals(a ,200);






    }







}
