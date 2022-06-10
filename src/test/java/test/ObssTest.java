package test;

import org.junit.Before;
import org.junit.Test;

public class ObssTest extends BaseTest{
    @Before
    public void before() throws InterruptedException {
        BasePage basePage =new BasePage(driver);
    }

        @Test
        public void iconTest(){
        basePage
                .checkMainPage()
                .clickSearch()
                .enterSearchKey()
                .clickFirstItem()
                .checkIcon();
        }
}
