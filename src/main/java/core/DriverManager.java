package core;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

 /*   private static WebDriver driver;

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
            DesiredCapabilities capability = DesiredCapabilities.chrome();
            capability.setBrowserName("chrome");
            capability.setPlatform(Platform.WIN10);
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }*/
   private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();

    public static WebDriver get() {
        WebDriver currentDriver = threadDriver.get();
        if (currentDriver==null){
            System.setProperty("webdriver.chrome.driver", "D://MyStudy/Projects/seleniumProject/drivers/chromedriver.exe");
                currentDriver = new ChromeDriver();
            threadDriver.set(currentDriver);
        }
        return threadDriver.get();
    }

    public static void quit(){
        WebDriver currentDriver = threadDriver.get();
        if (currentDriver!=null){
            currentDriver.quit();
            threadDriver.set(null);
        }
    }
}
