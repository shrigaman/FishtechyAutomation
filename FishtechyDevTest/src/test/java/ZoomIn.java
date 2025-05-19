import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.interactions.PointerInput;

public class ZoomIn {

    public static void zoomIn(AndroidDriver driver, int startX, int startY, int distance) {
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");

        // Move fingers apart (zoom in) with a more pronounced arc
        Sequence zoomIn1 = new Sequence(finger1, 1);
        zoomIn1.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        zoomIn1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        zoomIn1.addAction(finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(),
                startX - distance, startY - (distance / 2))); // Add an arc

        zoomIn1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        Sequence zoomIn2 = new Sequence(finger2, 1);
        zoomIn2.addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        zoomIn2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        zoomIn2.addAction(finger2.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(),
                startX + distance, startY + (distance / 2))); // Add an arc
        zoomIn2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(zoomIn1, zoomIn2));
    }

}



























//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.interactions.Sequence;
//import java.time.Duration;
//import java.util.Arrays;
//import org.openqa.selenium.interactions.PointerInput;
//
//public class ZoomIn {
//
//	public static void zoomIn(AndroidDriver driver) {
//		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
//		PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
//
//		// Start at center
//		int centerX = 500;
//		int centerY = 1000;
//
//		// Move fingers apart (zoom in)
//		Sequence zoomIn1 = new Sequence(finger1, 1);
//		zoomIn1.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, centerY));
//		zoomIn1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//		zoomIn1.addAction(finger1.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(),
//				centerX - 200, centerY - 200));
//		zoomIn1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//
//		Sequence zoomIn2 = new Sequence(finger2, 1);
//		zoomIn2.addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, centerY));
//		zoomIn2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//		zoomIn2.addAction(finger2.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(),
//				centerX + 200, centerY + 200));
//		zoomIn2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//
//		driver.perform(Arrays.asList(zoomIn1, zoomIn2));
//	}
//}
