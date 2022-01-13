package Tasks;


import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FakerGeneration;
import Pages.FormularioPage;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ScreenCapture;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FormTask {

    private WebDriver driver;
    private FormularioPage formularioPage;
    private Waits waits;
    private FakerGeneration fakerGeneration;

    public FormTask(WebDriver driver){

        this.driver = driver;
        formularioPage= new FormularioPage(this.driver);
        waits = new Waits(this.driver);
        fakerGeneration = new FakerGeneration(this.driver);
    }

    public void preencherForm() {

        formularioPage.getNomeTextField().sendKeys(fakerGeneration.getFirstName());
        formularioPage.getUltimoNomeTextField().sendKeys(fakerGeneration.getLastName());
        formularioPage.getEmailTextField().sendKeys(fakerGeneration.getEmail());
        formularioPage.getEnderecoTextField().sendKeys(fakerGeneration.getAddress());
        formularioPage.getUniversityTextField().sendKeys(fakerGeneration.getUniversity());
        waits.loadElement(formularioPage.getProfissaoTextField());
        formularioPage.getProfissaoTextField().sendKeys(fakerGeneration.getProfession());
        formularioPage.getGeneroTextField().sendKeys(fakerGeneration.getGenre());
        formularioPage.getIdadeTextField().sendKeys(fakerGeneration.getAge());
        formularioPage.getEnviarButton().click();
        validarCriacaoUsuario();
    }

    private void validarCriacaoUsuario(){

        try{
            String text = formularioPage.getMensagemTitle().getText();
            Assertions.assertEquals("Usuário Criado com sucesso",text);
            Report.extentTest.log(Status.PASS, "USUARIO CADASTRADO COM SUCESSO", Screenshot.capture(driver));
        }catch (Exception e){

            Report.extentTest.log(Status.FAIL, "NAO FOI POSSIVEL CADASTRAR O USUARIO", Screenshot.capture(driver));
        }


    }



}
