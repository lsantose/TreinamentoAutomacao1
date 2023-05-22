package google;
import WebBrowserSetup.WebBrowserSetup;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class GoogleTest {
GooglePage objGooglePage;
WebBrowserSetup objWebBrowserSetup;

    @Test
    public void realizarPesquisaGoogle() {
        WebDriver driver = WebBrowserSetup.getInstance().getDriver();
        GooglePage GooglePage = PageFactory.initElements(driver, GooglePage.class);
        objGooglePage = new GooglePage(driver);

        objGooglePage.inserirPesquisaGoogle("nttdata");
        objGooglePage.entrarLinkNttDataPagina();
        objGooglePage.cookieNttHome();
        objGooglePage.menuNttHome();
        objGooglePage.menuLinkJob();
        objGooglePage.inserirOportunidadeNtt("Arquiteto");
        objGooglePage.resultadoPesquisaOportunidadeNtt();
    }

    @AfterTest
    public void encerrarBrowser(){
        objWebBrowserSetup.encerrarBrowser();
    }
}
