package Pages;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
    private WebDriver driver;
    private Waits waits;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getBackHomeBtn() {
        return waits.visibilityOfElement(By.id("back-to-products"));
    }

    public WebElement getMenuBtn() {
        return this.driver.findElement(By.id("react-burger-menu-btn"));
    }

    public WebElement getLogoutBtn() {
        return waits.visibilityOfElement(By.id("logout_sidebar_link"));
    }
}
