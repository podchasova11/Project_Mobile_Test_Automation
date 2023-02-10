package articlesTests.avaxPricePrediction;

import abstractSetting.AbstractTest;
import io.qameta.allure.Link;
import examples.pageElements.AvaxPricePredictionElements;
import examples.utils.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class PosLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(PosLinkTest.class);

    @Test
    @DisplayName("Tect№11: Articles - AVAX price prediction")
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    void posLinkTest() throws IOException {
        try {
            AvaxPricePredictionElements tapElement = new AvaxPricePredictionElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapAvaxPricePrediction();
            Thread.sleep(3000);
            tapElement.tapPos();
            getAndroidDriver().context("WEBVIEW_chrome");
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (AVAX price prediction) PosLinkTest- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
            logger.error("org.example.articlesTests (AVAX price prediction) PosLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("What Is Proof of Stake (PoS) | Definition and Meaning | Capital.com"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/proof-of-stake-definition"));
        logger.info("(AVAX price prediction) PosLinkTest- passed");
    }
}
