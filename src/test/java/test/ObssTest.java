package test;

import org.junit.Before;
import org.junit.Test;
import pages.BasePage;
import pages.BaseTest;

public class ObssTest extends BaseTest {
    BasePage basePage ;

        @Test
        public void iconTest(){
        basePage
                .clickCookie()
                .checkMainPage()
                .clickSearch()
                .enterSearchKey()
                .clickFirstItem()
                .checkIcon();
        }
}
