package homework.day08;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/28 18:43
 */
public class Users {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
