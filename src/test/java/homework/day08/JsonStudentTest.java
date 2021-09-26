package homework.day08;


import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/27 23:45
 */
public class JsonStudentTest {
    public static void main(String[] args) {

        String json = "{\"name\":\"张三\",\"age\":\"18\",\"score\":\"100\"}";

        //json对象转字符串
        Student student = JSONObject.parseObject(json,Student.class);
        System.out.println(student);
        System.out.println(student.getAge());
        System.out.println(student.getName());

        //java对象转json
        String s = JSONObject.toJSONString(student);
        System.out.println(s);

        //Map可直接与json互转
        Map<String,Object> map = JSONObject.parseObject(json,Map.class);
        System.out.println(map.get("name"));

        //json数组转Java对象
        String jsonArrayList ="[{\"name\":\"张三\",\"age\":18},{\"name\":\"张三\",\"age\":18}]";
        List<Users> students = JSONObject.parseArray(jsonArrayList,Users.class);
        System.out.println(students);



    }
}
