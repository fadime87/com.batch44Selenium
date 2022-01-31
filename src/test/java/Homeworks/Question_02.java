package Homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_02 {
    public static void main(String[] args) {


        //        1-driver olusturalim

        //        2-java class'imiza chromedriver.exe'yi tanitalim
              System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //        3-driver'in tum ekrani kaplamasini saglayalim
             driver.manage().window().fullscreen();
        //        4-https://github.com/ adresine gidelim
            driver.navigate().to("https://github.com/");
        //        5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
          driver.navigate().to("https://www.hepsiburada.com/ ");
        //        6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
        System.out.println(driver.getTitle()+ " "+ driver.getCurrentUrl());
        String actualtitle = driver.getTitle();
        String expectedtitle ="burada";
        if(actualtitle.contains(expectedtitle)) {
            System.out.println("title testi PASS");
        }else{
            System.out.println("title testi FAILED");
        }
        String actualURL = driver.getCurrentUrl();
        String expectedURL ="burada";
        if(actualURL.contains(expectedURL)) {
            System.out.println("URL testi PASS");
        }else{
            System.out.println("URL testi FAILED");
        }


        //  7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim

         driver.navigate().back();
        driver.navigate().refresh();
        //        8-Son adim olarak butun sayfalarimizi kapatmis olalim
         driver.quit();

    }
}
