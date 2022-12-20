package abstracts;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class AbstractTest {
    private static AndroidDriver androidDriver;

    @BeforeAll
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("platformVersion","13");
        dc.setCapability("deviceName","emulator-5556");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        dc.setCapability("app","C:\\Users\\Mila\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\xml\\Crypto Academy by Investmate_1.0.0_Apkpure.apk");
        //dc.setCapability(MobileCapabilityType.BROWSER_NAME, "WebView");

        androidDriver = new AndroidDriver(new URL("Http://127.0.0.1:4723/wd/hub"), dc);
        WebDriverWait wait = new WebDriverWait(androidDriver,30);
    }

    @AfterAll
    public static void close() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }
    public static AndroidDriver getAndroidDriver() { return androidDriver;}
}
