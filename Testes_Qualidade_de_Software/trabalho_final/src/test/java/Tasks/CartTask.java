package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Pages.CartPage;
import Pages.ProductsPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CartTask {
    private static WebDriver driver;
    private static CartPage cartPage;
    private static Waits waits;

    public CartTask(WebDriver driver) {

        this.driver = driver;
        cartPage = new CartPage(this.driver);
        waits = new Waits(this.driver);
    }

    private void titleValidation() {

        try {
            Assertions.assertTrue(cartPage.getItemTitle().isDisplayed());
            Report.extentTest.log(Status.PASS, "PAGINA DO CARRINHO ACESSADA COM SUCESSO", Screenshot.capture(driver));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ACESSAR A PAGINA DO CARRINHO" + e.getMessage(), Screenshot.capture(driver));
        }

    }

    public void realizarCheckout() {

        titleValidation();
        waits.loadElement(cartPage.getItemTitle());
        cartPage.getCheckoutBtn().click();

    }
}
