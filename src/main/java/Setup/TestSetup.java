package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestSetup {
    private static WebDriver driver;

    public static void Setup() {
        System.setProperty("use your driver here","");
        driver = new OperaDriver();
        driver.get("https://www.amazon.com");
    }
}
