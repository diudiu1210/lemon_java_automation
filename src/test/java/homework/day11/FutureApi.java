package homework.day11;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/8/23 14:55
 */
public class FutureApi {
    String token;
    int member_id;

    @Test(priority = 1)
    public void testRegister() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("mobile_phone", "13112341235");
        map.put("pwd", "12345678");
        map.put("type", 1);
        Response res =
                given().//前置条件，包括请求头、请求参数、请求体、cookie
                        body(map).
                        contentType("application/json;Charset=utf-8").
                        header("X-Lemonban-Media-Type", "lemonban.v2").
                when().//执行的操作（get、post请求）
                        post("http://api.lemonban.com/futureloan/member/register").
                then().
                        extract().response();//执行的断言操作
    }


    @Test(priority = 2)
    public void testLogin (){

        HashMap<String,Object> map = new HashMap<>();
        map.put("mobile_phone","13112341235");
        map.put("pwd","12345678");
        String jsonStr = "{ \"mobile_phone\":13112341238,\"pwd\":\"12345678\" }";

        Response res =
                given().//前置条件，包括请求头、请求参数、请求体、cookie
                        body(jsonStr).
                        contentType("application/json;Charset=utf-8").
                        header("X-Lemonban-Media-Type","lemonban.v2").
                when().//执行的操作（get、post请求）
                        post("http://api.lemonban.com/futureloan/member/login").
                then().log().all().extract().response();
        this.token = res.path("data.token_info.token");
        this.member_id = res.path("data.id");
        System.out.println(token);
        System.out.println(member_id);

    }

    @Test(priority = 3,dependsOnMethods = "testLogin")
    public void testCharge (){

        HashMap<String,Object> map = new HashMap<>();
        map.put("member_id",member_id);
        map.put("amount",1000);

        Response res = given().//前置条件，包括请求头、请求参数、请求体、cookie
                body(map).
                contentType("application/json;Charset=utf-8").
                header("X-Lemonban-Media-Type","lemonban.v2").
                header("Authorization","Bearer"+" "+token).
                when().//执行的操作（get、post请求）
                post("http://api.lemonban.com/futureloan/member/recharge").
                then().log().all().extract().response();

    }

    @Test(priority = 4,dependsOnMethods = "testLogin")
    public void testWithdraw (){

        HashMap<String,Object> map = new HashMap<>();
        map.put("member_id",member_id);
        map.put("amount",1000);

        Response res = given().//前置条件，包括请求头、请求参数、请求体、cookie
                body(map).
                contentType("application/json;Charset=utf-8").
                header("X-Lemonban-Media-Type","lemonban.v2").
                header("Authorization","Bearer"+" "+token).
                when().//执行的操作（get、post请求）
                post("http://api.lemonban.com/futureloan/member/withdraw").
                then().log().all().extract().response();

    }


}
