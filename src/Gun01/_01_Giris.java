package Gun01;     //  01.08.2022  ---  Ders Kaydı

import org.testng.annotations.Test;

public class _01_Giris {

    //  Eğer test metodlarına sıralama verilmezse metod ısımlerının alfabetik sırasına göre çalışır.
    //  Büyük harf var ise önce büyük harf baslar
    //  Yeşil tik hatalı assertion yok demektir.


   @Test (priority = 1)      // annotation  lar ---  dipnot , acıklama
    void webSitesiniAc(){
        System.out.println("Driver tanımlandı ve web sitesi acıldı.");
    }


    @Test (priority = 2)
    void loginTestIsleminiYap(){
        System.out.println("Login test işlemleri yapıldı.");
    }


    @Test (priority = 3)
    void driverKapat(){
        System.out.println("Driver kapatıldı ve çıkıldı.");
    }

}

  //  Konsolda  sıralama ıcın sag tarafa bakmak gerekıyor kontrol ıcın dogru mu dıye , sol taraf guvenılır degıl