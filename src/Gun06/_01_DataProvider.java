package Gun06;         //  09.08.2022  ---  Ders Kaydı


/*
     * Aşağıdaki ikili ile Dataprovider ın  içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılır, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     * Dataprovider bir testi birden fazla DATA ile çok çalıştırmak için kullanılır.
     * XML filer     file gruplama, paralel ve farklı testleri koordine edip birarada çalıştırmak için kullanılır.
 */

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {       //  DataProvider  :  Veri Sağlayıcı   demek


    @Test ( dataProvider = "getData")
    void  UsernameTest ( String username )
    {
        System.out.println(" Username = " + username);
    }


                        //   @DataProvider   burada   for each   gıbı calısıyor , tek tek alıp gonderıyor
    @DataProvider       //  getData()    bunun   @Test ( dataProvider = "getData")   burdakı ıle aynı olması gerek kı baglantı saglansın
    public Object[]  getData()        //  DataProvider   Object[]  olmak zorunda , Object oldugu ıcınde  Strıng e  ınt e donusebılıyor
    {
        Object[] data = { "Sinem", "Esma", "Cigdem", "Ozlem", "Nurten" };

        return data;
    }



                           /****************************************/


    @Test ( dataProvider  ="userlar" )            // DataProviderın ismi burda metod adı yerine kullanıldı.
    void UsernameTest2 ( String username )
    {
       System.out.println(" Username =" + username);
     }


    @DataProvider ( name = "userlar" )    //  DataProvider a isim verdim.
    public Object[]  getData2()            //  DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.
    {

        Object[] data = {"Muhittin","Mustafa","Hasan","İhsan"};

        return data;
    }


    
}
