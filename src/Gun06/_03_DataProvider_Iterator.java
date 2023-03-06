package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {


    @Test ( dataProvider = "getData" )
    void UsernameTest (String username)
    {
        System.out.println("Username= " + username);
    }

    @DataProvider
    public Iterator<Object> getData()
    {
        List <Object>  data = new ArrayList<>();
        data.add("Sinem");
        data.add("Esma");
        data.add("Cigdem");
        data.add("Nurten");

        return data.iterator();
    }


    /*********************************************/



    @Test ( dataProvider = "getData2" )
    void UsernameTest2(String username, String password)
    {
        System.out.println("Username= "+ username+", Password= "+ password);
    }

    @DataProvider
    public Iterator <Object[]> getData2()
    {
        List <Object[]>  data = new ArrayList<>();
        data.add(new Object[]{"Sinem", "7849"} );
        data.add(new Object[]{"Esma", "12345"} );
        data.add(new Object[]{"Cigdem", "citlik"} );
        data.add(new Object[]{"Nurten" , "nrtn"} );

        return data.iterator();
    }


}
