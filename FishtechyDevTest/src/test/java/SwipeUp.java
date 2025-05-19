import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Collections;

public class SwipeUp {
	public static void swipeup(AppiumDriver driver) {

	    // Get screen dimensions
	    Dimension screenSize = driver.manage().window().getSize();
	    int screenWidth = screenSize.getWidth();
	    int screenHeight = screenSize.getHeight();

	    int startX = screenWidth / 2;         // Horizontal center
	    int startY = screenHeight * 4 / 5;    // Near the bottom (80% of screen)
	    int endY = screenHeight / 5;          // Move to near the top (20% of screen)

	    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	    Sequence swipe = new Sequence(finger, 1);

	    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
	    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    swipe.addAction(finger.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), startX, endY));
	    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	    driver.perform(Collections.singletonList(swipe));

	}
}
