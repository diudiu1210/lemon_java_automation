package homework;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/4/20 21:39
 */
public class StringTest {
   /* 1.将如下字符串进行拆分

    TOM:20|Jack:22|Rose:24
    打印成如下形式：
    姓名：tom，年龄：20岁
    姓名：Jack，年龄：22岁
    姓名：Rose，年龄：24岁

2.编写一个类,提供一个函数实现字符串反转功能，比如传入字符串“abcdefg”返回字符串“gfedcba”。
}
    */
   public static void main(String[] args) {
       String smallTom = "TOM:20|Jack:22|Rose:24";
       String[] arr = smallTom.split("\\|");
       //TOM:20|Jack:22|Rose:24
       String[] tom = arr[0].split(":");
       System.out.println("姓名："+tom[0].toLowerCase()+" "+"年龄："+tom[1]);
       System.out.println(reversal("ASDFG"));

   }

   //2.编写一个类,提供一个函数实现字符串反转功能，比如传入字符串“abcdefg”返回字符串“gfedcba”。
    public static String reversal(String string){
       String result = "";
        char[] arr = string.toCharArray();
       for(int i=arr.length-1;i>=0;i--){
           result +=arr[i];
       }
       return result;
    }

}