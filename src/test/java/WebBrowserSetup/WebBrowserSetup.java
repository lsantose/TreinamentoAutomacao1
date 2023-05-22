package WebBrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebBrowserSetup {
    public WebDriver driver;
    private static WebBrowserSetup webBrowserSetup = null;

    public static WebBrowserSetup getInstance() {
        if (webBrowserSetup == null) {
            webBrowserSetup = new WebBrowserSetup();
        }
        return webBrowserSetup;
    }

    private WebBrowserSetup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.get("https://www.google.com.br");
        this.driver.manage() .window().maximize();
    }
    public WebDriver getDriver(){
        return this.driver;
    }


    public void encerrarBrowser() {
        driver.quit();
    }
}