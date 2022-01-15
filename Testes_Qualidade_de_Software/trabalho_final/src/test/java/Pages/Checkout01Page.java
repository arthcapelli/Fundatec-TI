package Pages;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout01Page {
    private WebDriver driver;
    private Waits waits;

    public Checkout01Page(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getFirstNameField() {
        return this.driver.findElement(By.id("first-name"));
    }

    public WebElement getLastNameField() {
        return this.driver.findElement(By.id("last-name"));
    }

    public WebElement getZipCodeField() {
        return this.driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueBtn() {
        return waits.visibilityOfElement(By.id("continue"));
    }
}
