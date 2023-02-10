package examples.pageElements;

import examples.abstractClasses.AbstractPageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class AEXIndexElements extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private MobileElement exit;
    @AndroidFindBy(accessibility = "Glossary\n" +
            "Tab 3 of 4")
    private MobileElement glossary;
    @AndroidFindBy(xpath = "AEX index\n" +
            "What is the ?The Amsterdam Exchange index, or AEX for short, is an index of socks that are...")
    private MobileElement aEXIndex;
    @AndroidFindBy(accessibility = "Euronext")
    private MobileElement euronext;


    public AEXIndexElements(AndroidDriver driver) {
        super(driver);
    }

    public void goToGlossary() throws Exception {
        exit.click();
        Thread.sleep(2000);
        glossary.click();
        Thread.sleep(2000);
    }

    public AEXIndexElements tapAEXIndex() {
        aEXIndex.click();
        return this;
    }


    public AEXIndexElements tapEuronext() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        euronext.click();
        return this;
    }
}
