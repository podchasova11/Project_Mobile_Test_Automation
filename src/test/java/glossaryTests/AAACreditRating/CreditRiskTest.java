package glossaryTests.AAACreditRating;

import abstractSetting.AbstractTest;
import io.qameta.allure.*;
import examples.pageElements.AAACreditRatingElements;
import examples.utils.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;



public class CreditRiskTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CreditRiskTest.class);

    @Epic("Glossary")
    @Feature("AAA(credit rating)")
    @DisplayName("Test№1")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void creditRiskTest() throws IOException {
        try {
            AAACreditRatingElements tapElement = new AAACreditRatingElements(getAndroidDriver());
            tapElement.goToGlossary();
            Thread.sleep(3000);
            tapElement.tapAAACreditRating();
            Thread.sleep(3000);
            tapElement.tapCreditRisk();
            Thread.sleep(3000);
            getAndroidDriver().context("WEBVIEW_chrome");

        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.glossaryTests (AAA Credit Rating) CreditRiskTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("org.example.glossaryTests (AAA Credit Rating) CreditRiskTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("Credit Risk | Definition and Meaning | Capital.com"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/credit-risk-definition"));
        logger.info("(AAA Credit Rating) CreditRiskTest- passed");
    }
}
