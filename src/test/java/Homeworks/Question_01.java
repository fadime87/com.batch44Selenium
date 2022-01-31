package Homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_01 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1.https://www.youtube.com sayfasına gidin

        driver.get("https://www.youtube.com");

        //2.Title i consolda yazdirin
        System.out.println(driver.getTitle());

        //3.Title “YouTube” a eşitse “correct title” yazdirin değilse “incorrect title yzdirin”

        String actualTitle = driver.getTitle();
        String arananKelime = "YouTube";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("correct title");
        } else {
            System.out.println("incorrect title");


            //4.Sayfayi kapatin
            driver.close();
            //5.Tum sayfalari kapatin
            driver.quit();
            //6.Consola “Test completed” yazdirin

            System.out.println("test completed");
        }
    }
}