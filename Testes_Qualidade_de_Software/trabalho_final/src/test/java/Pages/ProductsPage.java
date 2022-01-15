package Pages;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    private WebDriver driver;
    private Waits waits;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getBackpackImg() {
        return waits.visibilityOfElement(By.id("item_4_img_link"));
    }

    public WebElement getAddBtn() {
        return this.driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getCartBtn() {
        return this.driver.findElement(By.id("shopping_cart_container"));
    }
}
