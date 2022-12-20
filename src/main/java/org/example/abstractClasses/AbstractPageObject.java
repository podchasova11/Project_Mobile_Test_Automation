package org.example.abstractClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public abstract class AbstractPageObject {

    private AndroidDriver driver;

    public AbstractPageObject(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)),this);
    }

    protected AndroidDriver getAndroidDriver() { return this.driver; }
}
