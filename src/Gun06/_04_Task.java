package Gun06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/**
      * Daha önceki derslerde yaptığımız   Search   fonksiyonunu
      * mac, ipod ve samsung için   Dataprovider   ile yapınız.

 */

public class _04_Task extends GenelWebDriver {

                                             //  ilk kısım ıcın Gun05 tekı 03 search kısmını aldık aynen ve dataProvider ekledık
    @Test ( dataProvider =  "getData" )
    void  SearchFunction(String txtSearch)
    {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.clear();             //  bu satırı ekledık oncekını temızlesın dıye
        searchInput.sendKeys(txtSearch);


        WebElement searchBtn = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchBtn.click();


        List<WebElement> captions = driver.findElements
                (By.cssSelector("[class='product-thumb'] [class='caption'] a"));    //   h4 > a   yada bu sekılde olabılır locator

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(txtSearch));
        }
    }



    @DataProvider
    public Object[]  getData()
    {
        Object[] data = { "mac" , "ipod" , "samsung"};

      return data;
    }


}
