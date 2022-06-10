package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage  extends BaseTest {


    public By searchBox = By.id("search-box");
    public By listClick = By.xpath("//article[@class='search-post']");

    public SearchPage enterSearchKey() {
        WebElement element = driver.findElement(searchBox);
        element.sendKeys("automation");
        element.click();
        return  this;
    }

    public SoftawareTestAutomationPage clickFirstItem() {
        driver.findElements(listClick).get(0).click();
        return  new SoftawareTestAutomationPage();
    }

}
