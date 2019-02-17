package tests;

import org.junit.Test;
import pageObjects.CommonPage;

import java.util.logging.Logger;

public class ParallelTest1 extends BaseTest{
    private static Logger log = Logger.getLogger(ParallelTest1.class.getName());

    @Test
    public void webDriverTest1(){
        CommonPage homePage = new CommonPage();
        homePage.inputTextIntoSearchField();
     //   homePage.clickOnCloseButton();
        log.info("webDriverTest1 passed...");
    }

    @Test
    public void webDriverTest2(){
        CommonPage homePage = new CommonPage();
        homePage.inputTextIntoSearchField();
      //  homePage.clickOnCloseButton();
        log.info("webDriverTest2 passed...");
    }

}
