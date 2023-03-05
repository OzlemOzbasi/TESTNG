package Gun05;         //  08.08.2022  ---  Ders Kaydı

import org.testng.annotations.Test;

public class _01_Groups {

    @Test ( groups = "SmokeTest", priority = 3) //  istersek priority ile sıralama da ekleyebılırız ama Smoke ların hepsıne vermek gerekır vermek ısteyınce
    void Test1() { System.out.println("Test 1 SmokeTest");  }

    @Test ( groups = "Regression")
    void Test3() { System.out.println("Test 3 Regression");  }

    @Test ( groups = "Regression")
    void Test5() { System.out.println("Test 5 Regression");  }

    @Test ( groups = "Regression")
    void Test2() { System.out.println("Test 2 Regression");  }

    @Test ( groups = "SmokeTest" , priority = 2)  //  istersek priority ile sıralama da ekleyebılırız, hangı bolumu sıralayacaksak , Smoke , Regression
    void Test4() { System.out.println("Test 4 SmokeTest");  }

    @Test ( groups = "SmokeTest" , priority = 1)                      //  istersek priority ile sıralama da ekleyebılırız
    void Test6() { System.out.println("Test 6 SmokeTest");  }

    @Test
    void Test7() { System.out.println("Test 7");  }



}
