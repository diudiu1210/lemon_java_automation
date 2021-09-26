package homework.day07;

import java.util.ArrayList;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/25 17:19
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<Teacher> arrayList = new ArrayList<Teacher>();

        //实例化老师对象
        Teacher t1 = new Teacher("张三",25);
        Teacher t2 = new Teacher("李四",35);
        Teacher t3 = new Teacher("王五",19);
        Teacher t4 = new Teacher("赵六",29);

        //将老师对象加入数组集合
        arrayList.add(t1);
        arrayList.add(t2);
        arrayList.add(t3);
        arrayList.add(t4);

        //for循环遍历将老师对象打印
        for (Teacher teacher:arrayList){
            System.out.println(teacher);
        }

        //求出老师平均年龄
        int countNumber = 0;
        int totalAge = 0;
        for (Teacher teacher:arrayList){
            totalAge += teacher.getAge();
            countNumber++;
        }
        System.out.println("平均年龄为：" + totalAge/countNumber);


        String s = "abc,123,中国,||||";
        String[] arr = s.split(",");

        for(String s1:arr){
            System.out.println(s1 + ":" + s1.length());
        }


        String ranString = "adghjkkklopptq";
        String nullString = "";
        char[] chars = ranString.toCharArray();
       for (int i = chars.length-1; i>=0;i--){

           nullString += chars[i];
       }
       System.out.println(nullString);
    }


}
