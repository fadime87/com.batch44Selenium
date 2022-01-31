package uygulamalarim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.navigate().to("http://a.testaddressbook.com");

        //  b. Sign in butonuna basin
        WebElement SingInLinki= driver.findElement(By.id("sign-in"));
        SingInLinki.click();

        //  c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextbox=driver.findElement(By.id("session_email"));
        WebElement passwordtextbox= driver.findElement(By.id("password textbox"));
        WebElement  signinbutton= driver.findElement(By.id("commit"));

        //  d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //      i. Username : testtechproed@gmail.com
        //      ii. Password : Test1234!

        emailTextbox.sendKeys("testtechproed@gmail.com");
        passwordtextbox.sendKeys("Test1234!");
        Thread.sleep(3000);
        signinbutton.click();
        //  e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).


    }
}
