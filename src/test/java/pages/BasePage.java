package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage  extends BaseTest{


    public By serachIcon = By.id("search-icon-div");
    public By logo = By.id("nav-logo");
    public By clickCookie = By.id("cookieAcceptance");

    public BasePage checkMainPage(){
        WebElement element = driver.findElement(logo);
        Assert.assertTrue(logo + " elementi bulunamadı.", isElementPresent(logo));
        return this;
    }


    public SearchPage clickSearch() {
        WebElement element =driver.findElement(serachIcon);
        if (!isElementPresent(serachIcon)) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element);
            actions.perform();
        }
        element.click();
        return new SearchPage();
    }

    public BasePage clickCookie() {
        WebElement element =driver.findElement(clickCookie);
        element.click();
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
