package hooks;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    protected static WebDriver driver ;

    public static WebDriver getDriver() {
        return driver;
    }
    @Before
    public void setup()
    {
        driver = new DriverFactory().initializeDriver();
    }
    @After
    public void runAfterScenario()
    {
        driver.quit();
    }
}
