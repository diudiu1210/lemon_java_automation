package homework;

import org.testng.reporters.jq.Main;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/4/22 20:23
 */
public class Teacher {
    private String name;
    private int age;
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
}
