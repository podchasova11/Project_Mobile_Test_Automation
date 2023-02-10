package glossaryTests.AEXIndex;

import examples.pageElements.ACreditRatingElements;
import examples.pageElements.AEXIndexElements;
import examples.utils.MyUtils;
import glossaryTests.ACreditRating.CreditRatingTest;
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

public class EuronextTest {
    static Logger logger = LoggerFactory.getLogger(EuronextTest.class);

    @Epic("Glossary")
    @Feature("AEX index")
    @DisplayName("Test№1")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void euronextTest() throws IOException {
        try {

            AEXIndexElements tapElement = new AEXIndexElements(getAndroidDriver());
            tapElement.goToGlossary();
            Thread.sleep(3000);
            tapElement.tapAEXIndex();
            Thread.sleep(3000);
            tapElement.tapEuronext();
            Thread.sleep(3000);
            getAndroidDriver().context("WEBVIEW_chrome");

        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- examples.glossaryTests (A Credit Rating) EuronextTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("examples.glossaryTests (A Credit Rating) EuronextTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("What is Euronext?"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/euronext-definition"));
        logger.info("(A Credit Rating) EuronextTest- passed");
    }
}
