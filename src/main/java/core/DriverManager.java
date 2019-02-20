package core;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager(){

    }
    public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

    private static void setDriver()  {
        try {
            DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
            capability.setBrowserName("internet explorer");
            capability.setPlatform(Platform.WIN10);
            driver = new RemoteWebDriver(new URL("http://localhost:4444//wd/hub"), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
