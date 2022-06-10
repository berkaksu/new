package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SoftawareTestAutomationPage  extends BaseTest{

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public By iconObss = By.xpath("//img[@alt='obss-footer-logo']");

    public SoftawareTestAutomationPage checkIcon {

        WebElement element = findElement(iconObss);
        scrollTo(element.getLocation().getX(), element.getLocation().getY());

        Assert.assertTrue(by + " elementi bulunamadı.", isElementPresent(iconObss));

        return this;
    }
}
