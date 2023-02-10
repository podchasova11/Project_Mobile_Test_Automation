package abstractSetting;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTest {
    private static AndroidDriver androidDriver;

    @BeforeAll
    public static void setUp() throws MalformedURLException {

        //Set DesiredCapabilities to send to Appium server * Установить желаемые возможности(наше окружение) для отправки на  сервер Аппиум
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("platformVersion","12");
        dc.setCapability("deviceName","Pixel_6_API_31");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        dc.setCapability("app","C:\\Users\\Mila\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\xml\\Crypto Academy by Investmate_1.0.0_Apkpure.apk");
        //dc.setCapability(MobileCapabilityType.BROWSER_NAME, "WebView");
        //dc.setCapability("chromedriverDisableBuildCheck", "true");
        dc.setCapability("isHeadless", "true");


        //Set up the Appium server URL to connect to * Настройте адрес сервера для подключения Аппиум
        androidDriver = new AndroidDriver(new URL("Http://127.0.0.1:4723/wd/hub"), dc);

        WebDriverWait wait = new WebDriverWait(androidDriver,30);

    }
    @AfterEach
    public void closeWeb() {
        List<String> windowHandles = new ArrayList<>(getAndroidDriver().getWindowHandles());
        androidDriver.manage().deleteAllCookies();
        if (windowHandles.size() > 1 && androidDriver != null) {
            for (int i = 0; i < windowHandles.size(); i++) {
                androidDriver.switchTo().window(windowHandles.get(i)).close();
            }
        } else if (androidDriver != null) {
            androidDriver.close();
        }
    }

    @AfterAll
    public static void quite() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }

    public static AndroidDriver getAndroidDriver() {
        return androidDriver;
    }
}
