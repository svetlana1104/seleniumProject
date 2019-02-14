package pageObjects;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class AbstractPage {

    @FindBy(how = How.XPATH, using = "/*[@class='modal-iframe']")
    private static By FRAME_XPATH;

    private WebDriver driver;
    private WebDriverWait waiter;

    public AbstractPage (){
        this.driver = DriverManager.getDriver();
        waiter = new WebDriverWait(driver,30);
    }

    public void waitVisibility(By elementBy) {
        waiter.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void inputText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    public List<WebElement> waitForExpectedElements(By by) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElements(by);
    }

    public WebElement waitForExpectedElement(By by) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void switchToFrame(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(FRAME_XPATH));
    }
}
