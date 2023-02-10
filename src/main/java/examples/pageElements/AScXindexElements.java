package examples.pageElements;

import examples.abstractClasses.AbstractPageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class AScXindexElements extends AbstractPageObject  {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private MobileElement exit;
    @AndroidFindBy(accessibility = "Glossary\n" +
            "Tab 3 of 4")
    private MobileElement glossary;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"AAA (credit rat...\n" +
            "What is an AAA credit rating?The highest possible credit rating a prospectiv borrower can ...\"]")
    private MobileElement aScXindex;
    @AndroidFindBy(accessibility = "credit risk")
    private MobileElement capitalisation;


    public AScXindexElements(AndroidDriver driver) {
        super(driver);
    }

    public void goToGlossary() throws Exception {
        exit.click();
        Thread.sleep(2000);
        glossary.click();
        Thread.sleep(2000);
    }

    public AScXindexElements tapAScXindex() {
        aScXindex.click();
        return this;
    }

    public AScXindexElements tapCapitalisation() {
        capitalisation.click();
        return this;
    }


}

