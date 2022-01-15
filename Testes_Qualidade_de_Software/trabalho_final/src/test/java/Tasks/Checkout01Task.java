package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FakerGeneration;
import Pages.Checkout01Page;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class Checkout01Task {

    private static WebDriver driver;
    private static Checkout01Page checkout01Page;
    private static Waits waits;
    private FakerGeneration fakerGeneration;

    public Checkout01Task(WebDriver driver) {

        this.driver = driver;
        checkout01Page = new Checkout01Page(this.driver);
        waits = new Waits(this.driver);
        fakerGeneration = new FakerGeneration(this.driver);
    }

    private void continueBtnValidation() {

        try {
            Assertions.assertTrue(checkout01Page.getContinueBtn().isDisplayed());
            Report.extentTest.log(Status.PASS, "PAGINA DO CHECKOUT ACESSADA COM SUCESSO", Screenshot.capture(driver));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ACESSAR A PAGINA DO CHECKOUT" + e.getMessage(), Screenshot.capture(driver));
        }

    }

    public void preencherDados() {

        continueBtnValidation();
        waits.loadElement(checkout01Page.getContinueBtn());
        checkout01Page.getFirstNameField().sendKeys(fakerGeneration.getFirstName());
        checkout01Page.getLastNameField().sendKeys(fakerGeneration.getLastName());
        checkout01Page.getZipCodeField().sendKeys(fakerGeneration.getZipCode());
        checkout01Page.getContinueBtn().click();

    }
}
