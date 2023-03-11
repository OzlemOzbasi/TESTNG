package Gun08;            //   11.08.2022  ---  Ders Kaydı

/*
    Senaryo ;
    1- Siteye gidiniz..
    2- "ipod" ürününü aratınız. "ipod" u   XML den  gönderiniz
    3- Çıkan elamanlardan random bir elemanı  Add Wish  butonuna tıklayınız.
    4- Daha sonra  WishList e  tıklatınız
    5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */

import Gun07._03_PlaceOrderElements;
import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_WishList extends GenelWebDriver {


    @Parameters ( "itemName")
    @Test
    void addToWishList (String aranacakUrun)
    {
     Gun07._03_PlaceOrderElements  poe = new _03_PlaceOrderElements(driver); //  daha ınce Gun 7 de buldugumuz searchBox ı kullanmak ıcın yazdık
     poe.searchBox.sendKeys(aranacakUrun);
     poe.searchButton.click();


     _02_WishListElements  wle = new _02_WishListElements(driver);

     int rndNumber = Tools.RandomGenerator( wle.searchResults.size() );    //  Utils dekı  Tools dan random metodunu kullandı
     String rndUrunAd = wle.searchResults.get(rndNumber).getText();      //   Random ıle gelen urunun adını yazdırdık
     wle.wishBtnList.get(rndNumber).click();

     wle.btnWish.click();


     boolean  bulundu = false ;                //  boolean basşangıcta bırseye esıtlememız gerekıyor yoksa boolean calısmıyor
        for ( WebElement e : wle.tableNames )
        {
            if ( e.getText().equals(rndUrunAd) )
           {
             bulundu = true;          //  bulunan  urun karsılastırılan ıle dogru ıse break yap ve cık
              break;
            }

        }

        System.out.println("bulundu = " + bulundu);
        Assert.assertTrue(bulundu);


    }


}
