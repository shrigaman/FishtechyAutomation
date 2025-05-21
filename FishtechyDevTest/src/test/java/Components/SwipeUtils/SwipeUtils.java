package Components.SwipeUtils;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Collections;

public class SwipeUtils {
	public static void swipeDown(AppiumDriver driver) {
//		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//		Sequence swipe = new Sequence(finger, 1);
//
//		swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 500, 1500)); // Start
//																													// position
//		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//		swipe.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), 500, 500)); // End
//																														// position
//		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//
//		driver.perform(Collections.singletonList(swipe));
		
		
		 // Get screen dimensions
        Dimension screenSize = driver.manage().window().getSize();
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();

        int startX = screenWidth / 2;       // Horizontal center
        int startY = screenHeight / 2;      // Vertical center
        int endY = screenHeight / 10;       // Near the top (10% from top edge)
//Test
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), startX, endY));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(swipe));
	}
}
