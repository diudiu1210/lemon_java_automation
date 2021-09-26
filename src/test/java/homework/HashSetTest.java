package homework;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/4/22 22:32
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> string = new HashSet<String>();
        string.add("张三");
        string.add("李四");
        string.add("王五");
        string.add("张");
        string.add("赵六");

        System.out.println(string.isEmpty());
        System.out.println(string.size());
        System.out.println(string.contains("王五"));
        System.out.println(string.remove("张三"));

        Iterator<String> iterable = string.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
      Object[] obj = string.toArray();
        for (Object i : string.toArray()){
            System.out.println(i);
        }
    }
}
