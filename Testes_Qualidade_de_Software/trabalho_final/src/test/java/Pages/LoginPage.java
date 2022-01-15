package Pages;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private Waits waits;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getUsernameField() {
        return this.driver.findElement(By.id("user-name"));
    }

    public WebElement getPasswordField() {
        return this.driver.findElement(By.id("password"));
    }

    public WebElement getLoginBtn() {
        return waits.visibilityOfElement(By.id("login-button"));
    }
}
