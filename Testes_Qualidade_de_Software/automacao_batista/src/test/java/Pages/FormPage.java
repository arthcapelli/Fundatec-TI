package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    private WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNameInput(){
        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_name']"));
    }

    public WebElement getLastNameInput(){
        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_lastname']"));
    }

    public WebElement getEmailInput(){
        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_email']"));
    }

    public WebElement getAddressInput(){
        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_address']"));
    }

    public WebElement getUniversityInput(){
        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_university']"));
    }

    public WebElement getProfileInput(){
        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_profile']"));
    }

    public WebElement getGenderInput(){
        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_gender']"));
    }

    public WebElement getAgeInput(){
        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_age']"));
    }

    public WebElement getCreateNewUserButton(){
        return this.driver.findElement(By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s12 center']/div/input"));
    }
}
