package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicNavigation {
    public static void main(String[] args)throws Exception{

        System.setProperty("webdriver.chrome.driver","C:\\selenium dependencies\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\selenium dependencies\\drivers\\geckodriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


           driver.get("http://www.amazon.com");

           Thread.sleep(3000);


        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        System.out.println("Title: "+driver.getTitle());
        System.out.println("URL: "+driver.getCurrentUrl());

        driver.navigate().refresh();
        String pagesource= driver.getPageSource();
        System.out.println(pagesource);

driver.close();






    }
}
