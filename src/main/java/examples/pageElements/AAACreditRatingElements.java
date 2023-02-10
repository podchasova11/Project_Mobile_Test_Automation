package examples.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import examples.abstractClasses.AbstractPageObject;

public class AAACreditRatingElements extends AbstractPageObject {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private MobileElement exit;
    @AndroidFindBy(accessibility = "Glossary\n" +
            "Tab 3 of 4")
    private MobileElement glossary;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"AAA (credit rat...\n" +
            "What is an AAA credit rating?The highest possible credit rating a prospectiv borrower can ...\"]")
    private MobileElement aAACreditRating;
    @AndroidFindBy(accessibility = "credit risk")
    private MobileElement creditRisk;


    public AAACreditRatingElements(AndroidDriver driver) {
        super(driver);
    }

    public void goToGlossary() throws Exception {
        exit.click();
        Thread.sleep(2000);
        glossary.click();
        Thread.sleep(2000);
    }

    public AAACreditRatingElements tapAAACreditRating() {
        aAACreditRating.click();
        return this;
    }


    public AAACreditRatingElements tapCreditRisk() {
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
        creditRisk.click();
        return this;
    }
}





















//    public AAACreditRatingElements goToCreditrisk() throws Exception {
//        exit.click();
//        Thread.sleep(2000);
//        glossary.click();
//        Thread.sleep(2000);
//        aaacreditrat.click();
//        Thread.sleep(2000);
//        creditrisk.click();
//        Thread.sleep(2000);
//        return this;

 //   }


