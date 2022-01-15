package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Pages.LoginPage;
import Pages.ProductsPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ProductsTask {
    private static WebDriver driver;
    private static ProductsPage productsPage;
    private static Waits waits;

    public ProductsTask(WebDriver driver) {

        this.driver = driver;
        productsPage = new ProductsPage(this.driver);
        waits = new Waits(this.driver);
    }

    private void imgValidation() {

        try {
            Assertions.assertTrue(productsPage.getBackpackImg().isDisplayed());
            Report.extentTest.log(Status.PASS, "PAGINA PRODUTOS ACESSADA COM SUCESSO", Screenshot.capture(driver));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ACESSAR A PAGINA DE PRODUTOS" + e.getMessage(), Screenshot.capture(driver));
        }

    }


    public void adicionarAoCarrinho() {

        imgValidation();
        waits.loadElement(productsPage.getBackpackImg());
        productsPage.getAddBtn().click();
        productsPage.getCartBtn().click();

    }
}
