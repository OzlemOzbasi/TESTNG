package Gun04;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _02_Intro {


    @Test
    void Test1(){ System.out.println("Test 1"); }


    @Test
    void Test2(){ System.out.println("Test 2"); }




    //  Bir kac tane Before test yada After test  oldugu zaman hangı sırada calısır;
    //  Aynı annotation dan olursa  Class  isminin alfabetik sırasına göre çalışır
    //  Asagıdakı orneklerde oldugu gıbı

    @BeforeTest
    void cTest(){ System.out.println("Before  2 Test"); }


    @BeforeTest
    void aTest(){ System.out.println("a test"); }
}


/*     KONSOL :


a test
Before  2 Test
Test 1
Test 2


 */
