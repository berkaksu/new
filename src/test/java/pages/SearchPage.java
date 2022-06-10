package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage  extends BaseTest {
    public BasePage(WebDriver driver) {
        super(driver);
    }

    public By searchBox = By.id("search-box");
    public By searchBox = By.xpath("//article[@class='search-post']//a[contains(text(),'Yazılım Testi ve Otomasyonu')]");

    public SearchPage enterSearchKey() {
        WebElement element = findElement(serachBox);
        element.sendKeys("automation");
        element.click();
        return  this;
    }

    public SoftawareTestAutomationPage clickFirstItem() {
        findElements(byElement).get(0).click()
        return  new SoftawareTestAutomationPage;
    }

}
