package Methods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_get02 {

    //for practice
    @Test
    void getTest_02(){
        Response response1 = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response1.getStatusLine());
        System.out.println(response1.getStatusCode());
        System.out.println(response1.getBody().toString());
        System.out.println(response1.getTime());

        int status = response1.getStatusCode();
        Assert.assertEquals(status,200);





    }
}
