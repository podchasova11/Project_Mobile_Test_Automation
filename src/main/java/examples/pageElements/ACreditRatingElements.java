package examples.pageElements;

import examples.abstractClasses.AbstractPageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class ACreditRatingElements extends AbstractPageObject {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private MobileElement exit;
    @AndroidFindBy(accessibility = "Glossary\n" +
            "Tab 3 of 4")
    private MobileElement glossary;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"A (credit ratin...\n" +
            "What is an A credit rating?A solid credit rating given to a prospective borrowr. Sometimes...\"]")
    private MobileElement aCreditRatin;
    @AndroidFindBy(accessibility = "credit rating")
    private MobileElement creditRating;
    @AndroidFindBy(accessibility = "debt")
    private MobileElement debt;
    @AndroidFindBy(accessibility = "bonds")
    private MobileElement bonds;
    @AndroidFindBy(accessibility = "risk")
    private MobileElement risk;
    @AndroidFindBy(accessibility = "yields")
    private MobileElement yields;



    public ACreditRatingElements(AndroidDriver driver) {
        super(driver);
    }

    public void goToGlossary() throws Exception {
        exit.click();
        Thread.sleep(2000);
        glossary.click();
        Thread.sleep(2000);
    }

    public ACreditRatingElements  tapACreditRating() {
        aCreditRatin.click();
        return this;
    }


    public ACreditRatingElements tapCreditRating() {
        creditRating.click();
        return this;
    }
    public ACreditRatingElements tapDebt() {
        debt.click();
        return this;
    }
    public ACreditRatingElements tapBonds() {
        bonds.click();
        return this;
    }


    public ACreditRatingElements tapRisk() {

        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        risk.click();
        return this;
    }

    public ACreditRatingElements tapYields() {

        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        yields.click();
        return this;
    }

}
