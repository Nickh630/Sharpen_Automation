import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeePricingPage {

    public static void waitForPricingTitle(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#hero-banner > div.container.translate-z > div > div > h1")));
    }

    public static String getPricingTitleText(WebDriver driver){
        return driver.findElement(By.cssSelector("#hero-banner > div.container.translate-z > div > div > h1")).getText();
    }

}
