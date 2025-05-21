import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetup {
	public static AndroidDriver initializeDriver() throws MalformedURLException {
		// Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:platformVersion", "12");
		caps.setCapability("appium:deviceName", "TECNO TECNO LF7");
		caps.setCapability("appium:automationName", "uiautomator2");
		
		//dev
		//caps.setCapability("appium:appPackage", "io.futrix.flytechy.stg");
		//caps.setCapability("appium:appActivity", "io.futrix.flytechy.MainActivity");
		
		//stage
//		caps.setCapability("appium:appPackage", "io.futrix.flytechy.stg");
//		caps.setCapability("appium:appActivity", "io.futrix.flytechy.MainActivity");
		
		//prod env
		caps.setCapability("appium:appPackage", "io.futrix.flytechy");
		caps.setCapability("appium:appActivity", "io.futrix.flytechy.MainActivity");
		
		
		// Initialize Driver
		URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver = new AndroidDriver(url, caps);
		System.out.println("Application Started");

		return driver;
	}
}
