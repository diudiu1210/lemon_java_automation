package homework;

import javax.naming.Name;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/4/18 16:16
 */
public class Student {

    private String name;
    private int age = 15;
    private int scorce;

  //无参构造
  public Student(){}

  //有参构造
  public Student(String name,int age,int scorce){
      this.age = age;
      this.name = name;
      this.scorce = scorce;
      if (this.age <= 15){System.out.println("无效年龄");}
  }

  //设置姓名
  public void setName(String name){ this.name = name; }
  public String getName(){return name;}

  //设置年龄
  public void setAge(int age){this.age=age;}
  public int getAge(){return age;}

  //设置分数
  public  int getScorce(){return scorce;}

  //打印学生detail信息
  public void show(){
      System.out.println(this.name);
      System.out.println(this.age);
      System.out.println(this.scorce);
    }

}
