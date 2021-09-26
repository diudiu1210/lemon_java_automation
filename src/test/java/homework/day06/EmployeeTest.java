package homework.day06;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/20 22:09
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Coder();
        employee1.work();
        employee1.sleep();

        Employee employee2 = new Tester();
        employee2.work();
        employee2.sleep();

        Employee employee3 = new Manager();
        employee3.work();
        employee3.sleep();

        callMethod(employee1);
        callMethod(employee2);
        callMethod(employee3);

    }

    public static void callMethod(Employee employee){
        employee.work();
        employee.sleep();


    }
}
