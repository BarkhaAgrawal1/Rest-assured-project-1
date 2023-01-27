//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//
//
//
//
//public class Post_vinay {
//    public static void main(String[] args) {
//        // Set the base URI
//        RestAssured.baseURI = "https://reqres.in/api/users";
//
//        // Start a new request
//        RequestSpecification request = RestAssured.given();
//
//        // Set the request body
//        request.body("{"barkha":"30","raj":"22"}");
//
//        // Set the content type
//        request.contentType("application/json");
//
//        // Make the POST request
//        Response response = request.post("/api/users");
//
//        // Methods.Methods.Get the status code
//        int statusCode = response.getStatusCode();
//        System.out.println("Status code: " + statusCode);
//
//        // Methods.Methods.Get the response body
//        String responseBody = response.getBody().asString();
//        System.out.println("Response body: " + responseBody);
//request.then().log().all();
//}
//
//}
