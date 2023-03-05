package Gun05;

 /*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimesini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız

  */


import Utils.GenelWebDriver;
import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionality extends ParametreliWebDriver {


    @Parameters("arananKelime")               //  XML deki adı     arananKelime ve txtSearch  aynı ısımde olabılır sıkıntı degıl
    @Test
    void  SearchFunction(String txtSearch)    //  Metod daki adı
    {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(txtSearch);


        WebElement searchBtn = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchBtn.click();


        List<WebElement> captions = driver.findElements
                (By.cssSelector("[class='product-thumb'] [class='caption'] a"));    //   h4 > a   yada bu sekılde olabılır locator

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(txtSearch));
        }
    }


}