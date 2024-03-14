package homeworks;

import org.testng.annotations.Test;
import utilities.ParameterBrowserTestBase;
//Go to URL: http://crossbrowsertesting.github.io/
//Click to To-Do App
//Checking Box to do-4 and Checking Box to do-5
//If both clicks worked, then the following List should be have length 2.
//Assert that this is correct
//Assert that the to do we added is present in the list
//Archiving old todos
//If our archive link worked, then the following list should have length 4.
//Assert that this is true as well
//Doing Cross Browser Testing.
public class H36_CrossBrowserTest extends ParameterBrowserTestBase {
    @Test
    public void test1(){driver.get("https://www.amazon.com./");}

    @Test
    public void test2(){driver.get("https://www.n11.com/");}

    @Test
    public void test3(){driver.get("https://www.trendyol.com/");}

    @Test
    public void test4(){driver.get("https://www.amazon.com./");}

    //bu test methodlari class seviyesinde calistirildiginda hepsi chrome browser da calisir,
    //cunku extends edilen ParametersBrowserClass da default olarak chrome browser secilidir
    //farkli browserlarda islem yapmak icin xml dosyasinda browserin parametre olarak belirtilmesi gerekir
}
