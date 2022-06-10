package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage  extends BaseTest{

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public By serachIcon = By.id("search-icon-div");
    public By logo = By.id("nav-logo");

    public BasePage checkMainPage(){
        WebElement element = findElement(logo);
        Assert.assertTrue(by + " elementi bulunamadı.", isElementPresent(element));
        return this;
    }

    public SearchPage clickSearch() {
        WebElement element = findElement(serachIcon);
        if (!isElementDisplayed(serachIcon)) {
            scrollTo(element.getLocation().getX(), element.getLocation().getY());
        }
        element.click();
        return new SearchPage;
    }

}
