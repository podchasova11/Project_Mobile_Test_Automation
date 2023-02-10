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

public class AvaxTokenPriceLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(AvaxTokenPriceLinkTest.class);

    @Test
    @DisplayName("Tect№16: Articles - AVAX price prediction")
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    void avaxTokenPriceLinkTest() throws IOException {
        try {
            AvaxPricePredictionElements tapElement = new AvaxPricePredictionElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(2000);
            tapElement.tapAvaxPricePrediction();
            Thread.sleep(2000);
            tapElement.tapAvaxTokenPrice();
            getAndroidDriver().context("WEBVIEW_chrome");
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (AVAX price prediction) AvaxTokenPriceLinkTest- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
            logger.error("org.example.articlesTests (AVAX price prediction) AvaxTokenPriceLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("AVAX/USD Chart | Live AVAX to US Dollar Price"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/avax-to-us-dollar-chart"));
        logger.info("(AVAX price prediction) AvaxTokenPriceLinkTest- passed");
    }
}
