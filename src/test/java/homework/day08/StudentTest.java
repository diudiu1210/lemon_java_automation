package homework.day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/28 20:42
 */
public class StudentTest {
    public static void main(String[] args) {
        HashMap<String,Object> studentA = new HashMap<>();
        studentA.put("name","张三");
        studentA.put("age",18);
        studentA.put("gender","男");

        HashMap<String,Object> studentB = new HashMap<>();
        studentB.put("name","李四");
        studentB.put("age",25);
        studentB.put("gender","男");

        ArrayList<HashMap> arrayList = new ArrayList<>();
        arrayList.add(studentA);
        arrayList.add(studentB);


        for (HashMap elenment:arrayList){
            Set<String> sets = elenment.keySet();
            for (String s:sets){
                System.out.println(elenment.get(s));
            }
        }





    }
}
