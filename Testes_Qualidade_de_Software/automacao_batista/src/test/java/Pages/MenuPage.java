package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    private WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMenuTitle(){
        return this.driver.findElement(By.xpath("//div[@class='col s3']/h4"));
    }

    public WebElement getFormLink(){
        return this.driver.findElement(By.xpath("//div[@class='col s3']/ul/li/a[@class='collapsible-header ']"));
    }

    public WebElement getFormCreateUser(){
        return this.driver.findElement(By.xpath("//div[@class='col s3']/ul/li/div[@class='collapsible-body']/ul/li/a[@href='/users/new']"));
    }

}
