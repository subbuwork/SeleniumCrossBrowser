package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class CrossBrowserTesting {

    WebDriver webDriver;
    Browser driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(String browser){
        driver = new Browser();
        webDriver = driver.getDriver(browser);

    }

    @AfterClass
    public void teardown(){
        webDriver.quit();
    }

    @Test
    public void test_cross_browser(){
        webDriver.get("http://www.store.demoqa.com");

    }
}
