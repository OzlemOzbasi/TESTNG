package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {


    @Test( dataProvider = "getData")
    void  UsernameTest ( String username , String password)
    {
        System.out.println(" Username = " + username + ", Password = " + password);
    }



    @DataProvider
    public Object[][]  getData()
    {
        Object[][] data = {
                {"Sinem", "7849"},
                {"Esma", "12345"},
                {"Çiğdem", "cıtlık"},
                {"Ozlem", "ozoz"},
                {"Nurten" , "nrtn"}
                };

        return data;
    }
}
