package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage extends AbstractPage {

    //@FindBy(how = How.XPATH, using = "//input[@class='fast-search__input']")
    private static By INPUT_FIELD = By.xpath("//input[@class='fast-search__input']");

    //@FindBy(how = How.XPATH, using = "//*[@class='search__close']")
    private static By CLOSE_BUTTON = By.xpath("//*[@class='search__close']");

    public void inputTextIntoSearchField(){
        waitForExpectedElement(INPUT_FIELD).sendKeys("Samsung");
    }

    public void clickOnCloseButton(){
        switchToFrame();
        waitForExpectedElement(CLOSE_BUTTON).click();
    }
}
