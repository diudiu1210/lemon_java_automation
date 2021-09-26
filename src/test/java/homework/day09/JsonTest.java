package homework.day09;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/31 17:29
 */
public class JsonTest {
    public static void main(String[] args) {

        String jsonStr1 = "[{\"value\":0,\"expression\":\"$.code\"}," +
                "{\"value\":\"OK\",\"expression\":\"$.msg\"}]";

        String jsonStr2 = "[{\"value\":\"OK\",\"expression\":\"OK\"}," +
                "{\"value\":\"OK\",\"expression\":\"OK\"}]";

        //将两个字符串转成json对象
        List<BackData> list1 = JSONObject.parseArray(jsonStr1,BackData.class);
        System.out.println(list1);
        List<BackData> list2 = JSONObject.parseArray(jsonStr2,BackData.class);
        System.out.println(list2);
        System.out.println(isCorrect(list1));
        System.out.println(isCorrect(list2));
    }

    public static String isCorrect (List<BackData> list){
        for(int i=0;i<list.size();i++){
            if (list.get(i).getValue().equals(list.get(i).getExpression())){
                return "pass";
            }else return "false";
        }
        return null;
    }
}
