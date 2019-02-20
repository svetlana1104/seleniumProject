package tests;

import org.junit.Test;
import pageObjects.CommonPage;

import java.util.logging.Logger;

public class ParallelTest2 extends BaseTest {
    private static Logger log = Logger.getLogger(ParallelTest2.class.getName());

    @Test
    public void webDriverTest3(){
        driver.get("https://www.onliner.by/");
        driver.manage().window().maximize();
        CommonPage homePage = new CommonPage();
        homePage.inputTextIntoSearchField();
       // homePage.clickOnCloseButton();
        log.info("webDriverTest3 passed...");
    }

    @Test
    public void webDriverTest4(){
        driver.get("https://www.onliner.by/");
        driver.manage().window().maximize();
        CommonPage homePage = new CommonPage();
        homePage.inputTextIntoSearchField();
      //  homePage.clickOnCloseButton();
        log.info("webDriverTest4 passed...");
    }
}
