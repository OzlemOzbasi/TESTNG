package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class _04_Enable {


    @Test
    void test1(){
        System.out.println("test 1");
    }


    @Test  ( enabled = false)    //  sımdılık bu test calısmasın demıs olduk , test yapısını bozmadık
    void test2(){
        System.out.println("test 2");
    }


    @Test
    void test3(){
        System.out.println("test 3");
    }




    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeClass
    void BaslangicIslemleri() {


        System.out.println("Driver start ....");

        Logger logger = Logger.getLogger("");   // bu ve alttakı satır konsolda cıkan kırmızılıkların bazılarını kaldırıyor
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");  // consola yazılan gereksiz KIRMIZI bilgileri sessize aldı, gızledı
        //   System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();    //  ekran sayfasını  max  yapıyor
        driver.manage().deleteAllCookies();

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));    // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));    // bütün webElement için geçerli

    }



    @AfterClass
    void BitisIslemleri(){
        System.out.println("Driver stop ....");

        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

        driver.quit();
    }



}
