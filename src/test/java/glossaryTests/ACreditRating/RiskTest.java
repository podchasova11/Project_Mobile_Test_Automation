package glossaryTests.ACreditRating;

import examples.pageElements.ACreditRatingElements;
import examples.utils.MyUtils;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static abstractSetting.AbstractTest.getAndroidDriver;

public class RiskTest {
    static Logger logger = LoggerFactory.getLogger(RiskTest.class);

    @Epic("Glossary")
    @Feature("A(credit rating)")
    @DisplayName("Test№4")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void riskTest() throws IOException {
        try {

            ACreditRatingElements tapElement = new ACreditRatingElements (getAndroidDriver());
            tapElement.goToGlossary();
            Thread.sleep(3000);
            tapElement.tapACreditRating();
            Thread.sleep(3000);
            tapElement.tapRisk();
            Thread.sleep(3000);
            getAndroidDriver().context("WEBVIEW_chrome");

        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- examples.glossaryTests (A Credit Rating) RiskTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("examples.glossaryTests (A Credit Rating) RiskTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("What is risk?"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/risk-definition"));
        logger.info("(A Credit Rating) RiskTest- passed");
    }
}

