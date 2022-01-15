package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Pages.LoginPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private static WebDriver driver;
    private static LoginPage loginPage;
    private static Waits waits;

    public LoginTask(WebDriver driver) {

        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        waits = new Waits(this.driver);
    }

    private void loginValidation() {

        try {
            Assertions.assertTrue(loginPage.getLoginBtn().isDisplayed());
            Report.extentTest.log(Status.PASS, "PAGINA LOGIN ACESSADA COM SUCESSO", Screenshot.capture(driver));
        } catch (Exception e) {

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL ACESSAR A PAGINA LOGIN" + e.getMessage(), Screenshot.capture(driver));
        }

    }


    public void realizarLogin() {

        loginValidation();
        waits.loadElement(loginPage.getLoginBtn());
        loginPage.getUsernameField().sendKeys("standard_user");
        loginPage.getPasswordField().sendKeys("secret_sauce");
        loginPage.getLoginBtn().click();

    }
}
