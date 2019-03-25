import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AboutUsPage {
    public static void aboutUsPageNav(WebDriver driver) throws InterruptedException {
        driver.findElement(By.cssSelector("#menu-item-506255 > a")).click();
        driver.findElement(By.cssSelector("#menu-item-507208 > a")).click();

        WebElement challengeExpand = driver.findElement(By.cssSelector("#section1HeaderId > h5"));
        Actions actions = new Actions(driver);
        actions.moveToElement(challengeExpand);
        challengeExpand.click();
        Thread.sleep(1000);

        WebElement challengeDependability = driver.findElement(By.cssSelector("#section2HeaderId > h5"));
        actions.moveToElement(challengeDependability);
        challengeDependability.click();


        driver.findElement(By.cssSelector("#main > section:nth-child(6) > div > div > div:nth-child(1) > div > div.card-footer.text-center > a")).click();
    }
}
