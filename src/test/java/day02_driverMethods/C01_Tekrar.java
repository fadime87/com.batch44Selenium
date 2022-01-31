package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    // normalde slenium'un kendi ide si de var fakat biz daha kullanisi oldugu icin intelliJ kullaniyiruz
    // intelliJ'de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeye eklememiz lazim
    // biz en ilkel haliyle projemize kutuphaneleri jar dosyalari olarak yukledik
    // bu ekledigimiz dosyalarla artik driver'in ayarlarini yapabiliriz

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.amazon.com");

        Thread.sleep(5000);

        driver.close();


    }
}
