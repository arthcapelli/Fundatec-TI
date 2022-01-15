package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Pages.Checkout02Page;
import Pages.LoginPage;
import Pages.LogoutPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LogoutTask {
    private static WebDriver driver;
    private static LogoutPage logoutPage;
    private static Waits waits;
    private static LoginPage loginPage;

    public LogoutTask(WebDriver driver) {

        this.driver = driver;
        logoutPage = new LogoutPage(this.driver);
        waits = new Waits(this.driver);
    }

    private void backBtnValidation() {

        try {
            Assertions.assertTrue(logoutPage.getBackHomeBtn().isDisplayed());
            Report.extentTest.log(Status.PASS, "PAGINA FINAL DA COMPRA ACESSADA COM SUCESSO", Screenshot.capture(driver));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ACESSAR A PAGINA FINAL DA COMPRA" + e.getMessage(), Screenshot.capture(driver));
        }

    }

    private void logoutValidation() {

        try {
            Assertions.assertTrue(loginPage.getLoginBtn().isDisplayed());
            Report.extentTest.log(Status.PASS, "LOGOUT REALIZADO COM SUCESSO", Screenshot.capture(driver));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL REALIZAR O LOGOUT" + e.getMessage(), Screenshot.capture(driver));
        }

    }

    public void realizarLogout() {

        backBtnValidation();
        waits.loadElement(logoutPage.getBackHomeBtn());
        logoutPage.getMenuBtn().click();
        waits.loadElement(logoutPage.getLogoutBtn());
        logoutPage.getLogoutBtn().click();
        logoutValidation();
    }
}
