package Test;

import Framework.BaseTest;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraCase extends BaseTest {

    private WebDriver driver = this.getDriver();
    private LoginTask loginTask = new LoginTask(driver);
    private ProductsTask productsTask = new ProductsTask(driver);
    private CartTask cartTask = new CartTask(driver);
    private Checkout01Task checkout01Task = new Checkout01Task(driver);
    private Checkout02Task checkout02Task = new Checkout02Task(driver);
    private LogoutTask logoutTask = new LogoutTask(driver);

    @Test
    public void realizarCompra() {

        try {
            Report.startReport("Realizar Login de Usuário");
            loginTask.realizarLogin();
            Report.startReport("Adicionando produto ao carrinho");
            productsTask.adicionarAoCarrinho();
            Report.startReport("Realizar Checkout");
            cartTask.realizarCheckout();
            Report.startReport("Realizar Preenchimento de dados");
            checkout01Task.preencherDados();
            Report.startReport("Realizar Finalização da compra");
            checkout02Task.finalizarCompra();
            Report.startReport("Realizar Logout");
            logoutTask.realizarLogout();

        } catch (Exception e) {
            Report.extentTest.log(Status.FAIL, e.getMessage(), Screenshot.base64(driver));
        }


    }
}
