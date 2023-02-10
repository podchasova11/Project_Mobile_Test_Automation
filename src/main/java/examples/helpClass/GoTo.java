package examples.helpClass;

import examples.abstractClasses.AbstractPageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GoTo extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private static MobileElement exit;
    @AndroidFindBy(accessibility = "Articles\n" +
            "Tab 2 of 4")
    private static MobileElement articles;
    @AndroidFindBy(accessibility = "Glossary\n" +
            "Tab 3 of 4")
    private static MobileElement glossary;

//    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"credit risk\"]")
//    private static MobileElement creditrisk;
//
//    @AndroidFindBy(accessibility = "AAA (credit rat...\n" +
//            "What is an AAA credit rating?The highest possible credit rating a prospectiv borrower can ...")
//    private static MobileElement aaacreditrat;




    public GoTo(AndroidDriver driver) {
        super(driver);
    }

//    public static void setAaacreditrat(MobileElement aaacreditrat) {
//        GoTo.aaacreditrat = aaacreditrat;
//    }

    public void goToArticles() throws Exception {
        exit.click();
        Thread.sleep(2000);
        articles.click();
        Thread.sleep(2000);
    }

    public void goToGlossary() throws Exception {
        exit.click();
        Thread.sleep(2000);
        glossary.click();
        Thread.sleep(2000);
    }

//   public void GoToAaacreditrat() throws Exception {
//        exit.click();
//        Thread.sleep(2000);
//        glossary.click();
//        Thread.sleep(2000);
//        aaacreditrat.click();
//        Thread.sleep(2000);
//
//    }
//
//    public void goToCreditrisk() throws Exception {
//        exit.click();
//        Thread.sleep(2000);
//        glossary.click();
//        Thread.sleep(2000);
//        aaacreditrat.click();
//        Thread.sleep(2000);
//        creditrisk.click();
//        Thread.sleep(2000);
//
//    }
}