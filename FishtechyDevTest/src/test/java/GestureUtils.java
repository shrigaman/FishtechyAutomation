import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Arrays;

public class GestureUtils {

	public static void zoomIn(AppiumDriver driver, int centerX, int centerY) {
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");

		Sequence zoomInFinger1 = new Sequence(finger1, 0);
		zoomInFinger1
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, centerY));
		zoomInFinger1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		zoomInFinger1.addAction(finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(),
				centerX - 200, centerY - 200));
		zoomInFinger1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		Sequence zoomInFinger2 = new Sequence(finger2, 0);
		zoomInFinger2
				.addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, centerY));
		zoomInFinger2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		zoomInFinger2.addAction(finger2.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(),
				centerX + 200, centerY + 200));
		zoomInFinger2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(zoomInFinger1, zoomInFinger2));
	}

	public static void zoomOut(AppiumDriver driver, int centerX, int centerY) {
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");

		Sequence zoomOutFinger1 = new Sequence(finger1, 0);
		zoomOutFinger1.addAction(
				finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX - 200, centerY - 200));
		zoomOutFinger1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		zoomOutFinger1.addAction(
				finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), centerX, centerY));
		zoomOutFinger1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		Sequence zoomOutFinger2 = new Sequence(finger2, 0);
		zoomOutFinger2.addAction(
				finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX + 200, centerY + 200));
		zoomOutFinger2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		zoomOutFinger2.addAction(
				finger2.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), centerX, centerY));
		zoomOutFinger2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(zoomOutFinger1, zoomOutFinger2));
	}
}
