package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Pages.Checkout02Page;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class Checkout02Task {
    private static WebDriver driver;
    private static Checkout02Page checkout02Page;
    private static Waits waits;

    public Checkout02Task(WebDriver driver) {

        this.driver = driver;
        checkout02Page = new Checkout02Page(this.driver);
        waits = new Waits(this.driver);
    }

    private void finishBtnValidation() {

        try {
            Assertions.assertTrue(checkout02Page.getFinishBtn().isDisplayed());
            Report.extentTest.log(Status.PASS, "SEGUNDA PAGINA DO CHECKOUT ACESSADA COM SUCESSO", Screenshot.capture(driver));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ACESSAR A SEGUNDA PAGINA DO CHECKOUT" + e.getMessage(), Screenshot.capture(driver));
        }

    }

    public void finalizarCompra() {

        finishBtnValidation();
        waits.loadElement(checkout02Page.getFinishBtn());
        checkout02Page.getFinishBtn().click();

    }
}
