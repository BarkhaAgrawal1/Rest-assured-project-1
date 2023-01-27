package Methods;

import Utils.Readxl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Post_datadriven {
    @Test(dataProvider="postddt")
    public void Post(String name, String salry) {

        JSONObject obj = new JSONObject();
        obj.put("name", name);
        obj.put("salary", salry);



        Response res = given()

                .header("Content-Type", "applications/JSON")
                .body(obj.toJSONString())

                .contentType(ContentType.JSON)
                .when()
                .post("https://reqres.in/api/users")

                .then().extract().response();

        System.out.println(res.prettyPrint());
        System.out.println(res.getStatusCode());
        System.out.println(res.getBody().asString());
        Assert.assertEquals(res.getStatusCode(), 201);

    }


    @DataProvider(name = "postddt")
    String[][] getdata() throws IOException {
        String path = "C:\\Users\\deepa\\Documents\\Barkha new intellij\\RestAssuredproject1\\src\\test\\Resources\\Testdemorestassured.xlsx";
        int rownum= Readxl.getRowCount(path, "Sheet1");
        int colcount=Readxl.getCellCount(path, "Sheet1", 1);
        String postddt[][]=new String[rownum][colcount]; //6,2
        //0 is for header..column is 0
        for(int i=1;i<=rownum;i++) {
            for(int j=0;j<colcount;j++ ) {
                postddt[i-1][j]=Readxl.getCellData(path, "Sheet1", i, j);//1  0
            }
        }
        return postddt;

    }

}




