package homework;

import java.util.ArrayList;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/4/22 20:16
 */
public class ArrayListDemo {
    public void ArrayListDemo(String a){
        System.out.println("这是一个有参构造");
    }
    public void ArrayListDemo() {
        System.out.println("这是一个无参构造");
    }

    public static void main(String[] args) {
        Teacher t1 =new Teacher("张三",25);
        Teacher t2 =new Teacher("李四",35);
        Teacher t3 =new Teacher("老王",19);
        Teacher t4 =new Teacher("赵六",29);

        ArrayList<Teacher> arr = new ArrayList<Teacher>();
        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
        arr.add(t4);
        arr.remove("t1");

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).getName());
            System.out.println(arr.get(i).getAge());
        }
        for (Teacher teacher : arr){
            System.out.println(teacher.getName());
            System.out.println(teacher.getAge());
        }


        int count =0;
        int times = 0;
        for (Teacher teacher : arr){
            count = count + teacher.getAge();
            times++;
        }
        float avg =  count/times;
        System.out.println(avg);
    }
}
