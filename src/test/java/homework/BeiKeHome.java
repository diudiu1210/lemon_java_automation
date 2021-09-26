package homework;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Automation engineer
 * @Description The God of automation
 * @Date 2021/5/3 12:50
 */
public class BeiKeHome {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //打开测试的app，初始化所需能力
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        //deviceName
        desiredCapabilities.setCapability("deviceName","127.0.0.1:5555");

        //platformName
        desiredCapabilities.setCapability("platformName","android");

        //appPackge
        desiredCapabilities.setCapability("appPackge","com.lianjia.beike");

        //appActivity
        desiredCapabilities.setCapability("appActivity",
                "com.lianjia.activity.MainActivity");

        //与appium服务建立连接,将能力传给appium
        //传入appium通讯地址
        AndroidDriver androidDriver = new AndroidDriver(
                new URL("http://localhost:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(5000);
        androidDriver.findElementById("\t\n" +
                "android:id/content");
        androidDriver.findElementByXPath(
                "//android.widget.LinearLayout[@content-desc=\"searchbox\"]" +
                        "/android.widget.ViewFlipper/android.widget.TextView").click();
        Thread.sleep(1000);
        androidDriver.findElementById("com.homelink.android.newhouse:id/jo").sendKeys("bibi");
        androidDriver.findElementByClassName("android.view.ViewGroup").click();
    }
}
