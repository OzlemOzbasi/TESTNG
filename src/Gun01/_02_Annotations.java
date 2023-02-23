package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {

    /*
         @BeforeClass     -->  //  Her class çalışıyorken önce burası çalışır
           @BeforeMethod  -->  //  Her metoddan(test metod) önce çalışır
              @Test       -->      Testlerin çalıştığı metodlar
              @Test       -->      Testlerin çalıştığı metodlar
           @AfterMethod   -->  //  Her metoddan(test metod) sonra çalışır
         @AfterClass      -->  //  Her class çalışıyorken sonra burası çalışır

     */

    //   @BeforeClass ,  @BeforeMethod  ... bunların yazılma sırası onemlı degıl karısıktaz yazılabılır


    @BeforeClass
    void beforeClass(){  System.out.println("Her class dan ÖNCE çalışacak : Before Class");  }

    @BeforeMethod
    void beforeMethod(){  System.out.println("Her test method dan ÖNCE çalışacak : Before Method");  }


    @Test
    void test1(){  System.out.println("Test 1 çalıştı");  }

    @Test
    void test2(){   System.out.println("Test 2 çalıştı");  }



    @AfterMethod
    void afterMethod(){  System.out.println("Her test method dan SONRA çalışacak : After Method");  }

    @AfterClass
    void afterClass(){ System.out.println("Her class dan SONRA çalışacak : After Class");   }





}



/*
         KONSOL :


Her class dan ÖNCE çalışacak : Before Class
Her test method dan ÖNCE çalışacak : Before Method
Test 1 çalıştı
Her test method dan SONRA çalışacak : After Method
Her test method dan ÖNCE çalışacak : Before Method
Test 2 çalıştı
Her test method dan SONRA çalışacak : After Method
Her class dan SONRA çalışacak : After Class


 */