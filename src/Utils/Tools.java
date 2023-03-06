package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {


    public static void compareToList( List<String> menuExpectedList, List<WebElement> menuActualList ){

        for (int i = 0; i < menuExpectedList.size(); i++) {

            Assert.assertEquals(menuExpectedList.get(i), menuActualList.get(i).getText()," Karşılaştırma sonucu");
        }
    }


    public static void successMessageValidation()    {

        WebElement YeşilYazıDogrulama = GenelWebDriver.driver.findElement
                (By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(YeşilYazıDogrulama.getText().toLowerCase().contains("success"));
    }



    public static void Bekle(int saniye)
    {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }




    public static double WebElementToDouble ( WebElement e )     //  String i    double a  cevırme metodu , dıger classlarda kullanmak ıcın
    {                                                           //  web sıtelerınde  gozuken fıyatlar ıcın kullandık dıger class larda
        String result = e.getText();
        result = result.replaceAll ("[^\\d]","");

        return Double.parseDouble(result);
    }


}
