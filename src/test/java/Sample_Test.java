import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;

public class Sample_Test {
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrmoedriver","/usr/local/bin/chromedriver");
    WebDriver driver = new ChromeDriver();

        driver.get("https://sharpencx.com/");

        AboutUsPage aboutUsPage = new AboutUsPage();
        aboutUsPage.aboutUsPageNav(driver);

        SeePricingPage seePricingPage = new SeePricingPage();
        seePricingPage.waitForPricingTitle(driver);

        assertEquals("Simple pricing. Exponential value.", seePricingPage.getPricingTitleText(driver));

        driver.quit();
    }
}
