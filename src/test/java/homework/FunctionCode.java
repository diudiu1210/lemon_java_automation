package homework;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/7/16 23:17
 */
public class FunctionCode {
    public static void main(String[] args) {
        int[] arrTest = {60,50,30,20,10,70,80,90};
        studentFitter(arrTest);
    }

    public static void studentFitter(int[] arrTest){
        int sum = 0;
        for (int i = 0;i<arrTest.length;i++){
            if (arrTest[i]>=60){ sum++;}
        }
        System.out.println("及格人数为："+ sum);
    }


}
