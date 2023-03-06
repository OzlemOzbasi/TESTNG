package Gun06;


import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
    * Bir önceki task da yapılan testi  PARAMETERDRIVER  ile yapınız
    * sonrasında   farklı tarayıcılar   ile çalıştırınız.
    * sonrasında   paralel   çalıştırınız.

 */

public class _05_Task_2 extends ParametreliWebDriver {      //  Bunun  XML i  ıcın   XML de 02 yı actık

    // 04_Task olanı aynen aldık sadece   extends ParametreliWebDriver  olarak degıstırdık  ve  02 XML i  ekledık

    @Test( dataProvider =  "getData" )
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
