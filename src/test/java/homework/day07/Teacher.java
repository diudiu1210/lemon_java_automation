package homework.day07;

import java.util.Date;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/25 17:21
 */
public class Teacher {

    private String name;
    private int age;

    public Teacher(){}

    public  Teacher(String name,int age){
        this.name= name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    //重写toString方法


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
