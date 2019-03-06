package tests;

import core.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class BaseTest {
    public static WebDriver driver;
    private static Logger log = Logger.getLogger(BaseTest.class.getName());

    @Before
    public void setup() {
        driver = DriverManager.get();
        log.info("Driver was initialized!");
        /*driver.get("https://www.onliner.by/");
        driver.manage().window().maximize();*/
    }

    @After
    public void teardown() {
        DriverManager.quit();
      //  driver.quit();
    }
}
