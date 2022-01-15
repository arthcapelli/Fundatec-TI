package Pages;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    private Waits waits;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getItemTitle() {
        return waits.visibilityOfElement(By.id("item_4_title_link"));
    }

    public WebElement getCheckoutBtn() {
        return this.driver.findElement(By.id("checkout"));
    }

}
