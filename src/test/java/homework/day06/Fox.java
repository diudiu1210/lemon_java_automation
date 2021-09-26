package homework.day06;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/20 21:45
 */
public class Fox extends Animal{

    public Fox(String name, int age) {
        super(name, age);
    }

    @Override
    public void say(){System.out.println("狐狸说啥呢");}

    public void eat(){System.out.println("狐狸吃人的");}
}
