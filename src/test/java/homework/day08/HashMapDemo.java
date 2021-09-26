package homework.day08;

import org.testng.mustache.Value;

import java.security.Key;
import java.util.HashMap;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/28 19:04
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("id","1");
        hashMap.put("mobile_phone","13100121012");
        hashMap.put("pwd","1234");
        System.out.println(isKey(hashMap,"mobile_phone"));
        System.out.println(relaceValue(hashMap,"pwd","88888"));

    }

    public static Object isKey(HashMap hashMap,String  key)
    { if (hashMap.containsKey(key)){return hashMap.get(key);}else
    {return "没有";}
    }

    public static Object relaceValue(HashMap hashMap,String key,String value){
        hashMap.put(key, value);
        return hashMap.get(key);
    }
}
