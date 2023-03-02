package Gun03;      //  03.08.2022  ---  Ders Kaydı

 /*   İnterviewlarda sorulan bir konu :
   Testlere öncelikleri nasıl verirsin ?

   priority, dependecy;   Nasıl kullanırsın ?

   1- priority = 1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : Bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
      Bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise otomatik onları
      önce çağırıp sonra kendisi çalışır.
      Fakat 2 veya daha fazla  var ise bağımlı olduğu metod o zaman çalışamaz.

 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {       //  Dependency  : BAĞIMLILIK


    @Test
    void startCar()
    {
        System.out.println("Car started");
    }


    @Test ( dependsOnMethods = { "startCar"} )  // bu testin çalışması, startCar ın hatasız çalışmasına bağımlı
    void driveCar()
    {
        System.out.println("Car drive");
        Assert.fail();     //  bu metodu hata verdir demiş olduk   // buraya SKIP ( konsolun sol tarafındakı) durumunu görebilmek için kondu
    }


    @Test ( dependsOnMethods = { "startCar" , "driveCar"} )  // bu testin çalışması için verilen 2 testin hatasız bitmesi lazım
    void parkCar()
    {
        System.out.println("Car parked");
    }


    @Test ( dependsOnMethods = { "parkCar"} , alwaysRun = true )  // alwaysRun = true  --- bağımlılıkları var ama hata çıkarsa da yine çalıştır demıs oluyoruz
    void stopCar()
    {
        System.out.println("Car stop");
    }


}
