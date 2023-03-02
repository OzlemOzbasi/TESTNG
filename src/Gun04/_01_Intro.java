package Gun04;      //  04.08.2022  ---  Ders Kaydı

import org.testng.annotations.*;

public class _01_Intro {

     /*
     @BeforeSuit
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
               @Test
               @Test
             @AfterMethod
           @AfterClass
        @AfterGroup
     @AfterTest
   @AfterSuit
    */


    @BeforeSuite
    void bSuit() {
        System.out.println("Before Suit");
    }


    @BeforeTest
    void bTest() {
        System.out.println("Before Test");
    }


    @BeforeGroups
    void bGroups() {
        System.out.println("Before Groups");
    }


    @BeforeClass
    void bClass() {
        System.out.println("Before Class");
    }


    @BeforeMethod
    void bMethod() {
        System.out.println("Before Method");
    }


    @Test
    void TestIntro1_1() {
        System.out.println("TestIntro1_1");
    }


    @Test
    void TestIntro1_2() {
        System.out.println("TestIntro1_2");
    }


    @AfterMethod
    void aMethod() {
        System.out.println("After Method");
    }


    @AfterClass
    void aClass() {
        System.out.println("After Class");
    }


    @AfterGroups
    void aGroups() {
        System.out.println("After Groups");
    }


    @AfterTest
    void aTest() {
        System.out.println("After Test");
    }


    @AfterSuite
    void aSuit() {
        System.out.println("After Suit");
    }


}

/*             KONSOL :

Before Suit
Before Test

Before Class

Before Method
TestIntro1_1     ----- TEST METODLARI
After Method

Before Method
TestIntro1_2     ---- TEST METODLARI
After Method

After Class

After Test
After Suit

 */