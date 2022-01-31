package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question_03 {

    public static void main(String[] args) {

          System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //1.  https://id.heroku.com/login sayfasina gidin
        driver.get("http://id.heroku.com/login");
        //2.  Bir mail adersi giriniz
       WebElement mailadres= driver.findElement(By.xpath("//input[@id='email']"));
   mailadres.sendKeys("fadimevurmazilhan@gmail.com");
        //3.  Biz password giriniz
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("12345");
        //4.  Login butonuna tiklayiniz
        WebElement loginin= driver.findElement(By.xpath("//button[@name='commit']"));
        loginin.click();

        //5.  "There was a problem with your login." texti gorunur ise
        //6.  "kayit yapilamadi" yazdiriniz
        //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        WebElement error= driver.findElement(By.xpath("//div[@class='alert alert-danger']"));

if(error.isDisplayed()) {
    System.out.println("Kayit yapilmadi");
}  else{
    System.out.println("kayit yapildi");
}
        //9.  Tum sayfalari kapatiniz

        // driver.quit();






    }
}
