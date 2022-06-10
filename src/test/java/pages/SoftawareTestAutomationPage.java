package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SoftawareTestAutomationPage  extends BaseTest{


    public By iconObss = By.xpath("//img[@alt='obss-footer-logo']");

    public SoftawareTestAutomationPage checkIcon(){

        WebElement element = driver.findElement(iconObss);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        Assert.assertTrue(iconObss + " elementi bulunamadı.", isElementPresent(iconObss));
        return this;
    }
    public boolean isElementPresent(By by) {
        try {
            WebElement el = driver.findElement(by);
            return el.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
