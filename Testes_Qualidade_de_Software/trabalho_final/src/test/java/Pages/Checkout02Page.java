package Pages;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout02Page {
    private WebDriver driver;
    private Waits waits;

    public Checkout02Page(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getItemTitle() {
        return this.driver.findElement(By.id("item_4_title_link"));
    }

    public WebElement getFinishBtn() {
        return waits.visibilityOfElement(By.id("finish"));
    }

}
