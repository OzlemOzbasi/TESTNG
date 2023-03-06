package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParametreliWebDriver {     //  firefox driver  ını ekledık  if li kısımda

    public  WebDriver driver;     //  2 drıver ı aynı anda kullanabılmek ıcın buradakı static i kaldırdık , cunku statıc sen 1 tanesın demek
    public static WebDriverWait wait;


    @Parameters("browser")
    @BeforeClass
    public void BaslangicIslemleri(String browser) {


        System.out.println("Driver start ....");

        Logger logger = Logger.getLogger("");   // bu ve alttakı satır konsolda cıkan kırmızılıkların bazılarını kaldırıyor
        logger.setLevel(Level.SEVERE);



        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
       //   System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else

        if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
       //   System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }




        driver.manage().window().maximize();    //  ekran sayfasını  max  yapıyor
        driver.manage().deleteAllCookies();

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));    // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));    // bütün webElement için geçerli

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        LoginTest();     //  asagıdakı  LoginTest();   metodunu cagırdık her defasında tekrar tekrar Logın metodu yazmamak ıcın

    }



    void LoginTest() {

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("deniz@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("@123");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Login']"));
        loginBtn.click();
    }



    @AfterClass
    public void BitisIslemleri(){
        System.out.println("Driver stop ....");

        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

        driver.quit();
    }





}
