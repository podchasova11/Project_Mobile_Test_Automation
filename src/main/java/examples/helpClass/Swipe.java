package examples.helpClass;

import examples.abstractClasses.AbstractPageObject;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import examples.myEnum.Side;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class Swipe extends AbstractPageObject {
    private PointOption pointOptionStart;
    private PointOption pointOptionStartZone;
    private PointOption pointOptionEnd;
    final int ANIMATION_TIME = 1000;
    final int PRESS_TIME = 1000;
    final int edgeBorder = 250;

    public Swipe(AndroidDriver driver) {
        super(driver);
    }

    public void swipeScreen(Side side) {
        System.out.println("swipeScreen(): side: '" + side + "'");
        Dimension dims = getAndroidDriver().manage().window().getSize();
        pointOptionStart = PointOption.point(dims.width / 2, (int) (dims.height / 1.15));
        pointOptionStartZone = PointOption.point(dims.width - edgeBorder, (int) (dims.height / 3.3));
        switch (side) {
            case UP:
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - (int) (dims.height / 1.2));
                try {
                    new TouchAction(getAndroidDriver())
                            .press(pointOptionStart)
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                            .moveTo(pointOptionEnd)
                            .release().perform();
                } catch (Exception e) {
                    System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
                    return;
                }
                break;
            case UP_FAST:
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - (int) (dims.height / 1.2));
                try {
                    new TouchAction(getAndroidDriver())
                            .press(pointOptionStart)
                            .moveTo(pointOptionEnd)
                            .release().perform();
                } catch (Exception e) {
                    System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
                    return;
                }
                break;
            case UP_SHORT:
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - dims.height / 2);
                try {
                    new TouchAction(getAndroidDriver())
                            .press(pointOptionStart)
                            .moveTo(pointOptionEnd)
                            .release().perform();
                } catch (Exception e) {
                    System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
                    return;
                }
                break;
            case LEFT:
                pointOptionEnd = PointOption.point(edgeBorder, (int) (dims.height / 3.3));
                try {
                    new TouchAction(getAndroidDriver())
                            .press(pointOptionStartZone)
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                            .moveTo(pointOptionEnd)
                            .release().perform();
                } catch (Exception e) {
                    System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
                    return;
                }
            default:
                throw new IllegalArgumentException("swipeScreen(): side: '" + side + "' NOT supported");
        }
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }

    }
}
