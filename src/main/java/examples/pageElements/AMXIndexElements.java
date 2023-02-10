package examples.pageElements;

import examples.abstractClasses.AbstractPageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AMXIndexElements extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private MobileElement exit;
    @AndroidFindBy(accessibility = "Glossary\n" +
            "Tab 3 of 4")
    private MobileElement glossary;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"AMX index (Midc...\n" +
            "What is the ?The  is an index of medium-szed companies traded on the Amsterdam Stock Excha...\"]")
    private MobileElement aMXIndex;
    @AndroidFindBy(accessibility = "financial adviser")
    private MobileElement financialAdviser;
    @AndroidFindBy(accessibility = "here")
    private MobileElement here;

    public AMXIndexElements(AndroidDriver driver) {
        super(driver);
    }

    public void goToGlossary() throws Exception {
        exit.click();
        Thread.sleep(2000);
        glossary.click();
        Thread.sleep(2000);
    }

    public AMXIndexElements tapAMXIndex() {
        aMXIndex.click();
        return this;
    }


    public AMXIndexElements tapFinancialAdviser() {
        financialAdviser.click();
        return this;
    }

    public AMXIndexElements tapHere() {
        here.click();
        return this;
    }
}