package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    // Yeşil tik   : Test de hata yok
    // Sarı çarpi  : Test de hata var
    // Beyaz       : Test  çalıştırılmadı.skip



    @Test
    void EqualOrnek(){
        String s1 = "Merhaba";
        String s2 = "İyi aksamlar";


        //           Gerçek , Beklenen, "hata başlığı"
        Assert.assertEquals(s1,s2,"Karşılaştırma sonucu");
        // Actual : Gerçek
        // Expected : Beklenen
    }



    @Test
    void NotEqualOrnek(){
        String s1 = "Merhaba";
        String s2 = "İyi aksamlar";


        //         Gerçek  , Beklenen, "hata başlığı"
        Assert.assertNotEquals(s1,s2,"Karşılaştırma sonucu");     //   NotEquals  dıye sordugumuz ıcın  TEST GECMIS  oldu
        // Actual : Gerçek
        // Expected : Beklenen
    }



    @Test
    void TrueOrnek(){
        int s1 = 55;
        int s2 = 55;

        Assert.assertTrue(s1==s2, "Karşılaştırma sonucu");
    }




    @Test
    void nullOrnek(){
        String s1 = null;    //  primitiv tipler null olamaz yanı   int s1 = null olamaz   ya Strıng yada INTEGER yazmak gerekır

        Assert.assertNull(s1, "Karşılaştırma sonucu");
    }




    @Test
    void direktFail(){
        int a = 55;

        if (a == 55)
            Assert.fail();
    }




}
