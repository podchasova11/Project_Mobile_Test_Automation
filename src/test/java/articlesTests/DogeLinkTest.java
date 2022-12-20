package articlesTests;

import abstracts.AbstractTest;
import io.appium.java_client.TouchAction;
import org.junit.jupiter.api.Test;
import io.appium.java_client.touch.offset.PointOption;
import org.example.pageElements.ArticlesElements;

public class DogeLinkTest extends AbstractTest {
    @Test
    void dogeLinkTest() throws Exception{
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
        tapElement.tapShibaInuPrice();
        Thread.sleep(5000);
        touchAction
                .press(PointOption.point(620,2000))
                .moveTo(PointOption.point(620,720))
                .release()
                .perform();
        tapElement.tapDoge();
    }
}
