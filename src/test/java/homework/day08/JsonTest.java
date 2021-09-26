package homework.day08;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/29 18:51
 */
public class JsonTest {
    public static void main(String[] args) {
        String s = "{\"name\":\"中国\",\"provinces\":[{\"name\":\"广东\",\"capital\":\"广州\"},{\"name\":\"湖南\",\"capital\":\"长沙\"}]}";
        Nation nation = JSONObject.parseObject(s,Nation.class);
        System.out.println(nation);

    }
    }

