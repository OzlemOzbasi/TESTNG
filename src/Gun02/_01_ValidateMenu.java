package Gun02;          //  02.08.2022  ---  Ders Kaydı

 /*
        Senaryo :
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız. (menuValidation)
     */

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends GenelWebDriver {


    @Test
    void menuValidation(){

        List<String> menuExpectedList = new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");


        By menuBulma = By.cssSelector("ul[class='nav navbar-nav']>li");
        List<WebElement> menuActualList = driver.findElements(menuBulma);


        Tools.compareToList(menuExpectedList, menuActualList);    // Utils  içindeki Tools class ındakı  compareToList  metodunu cagırdık




    }



}
