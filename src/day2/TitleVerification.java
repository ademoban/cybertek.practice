package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class TitleVerification {

    public static void main(String [] args)throws Exception{


        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",

                        "http://practice.cybertekschool.com/dropdown",
                        "http://practice.cybertekschool.com/login");

        System.setProperty("webdriver.chrome.driver","C:\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        List <String> titles=new ArrayList<>();

        for(String url: urls){
            driver.get(url);
            titles.add(driver.getTitle());
        }

        String expectedTitle="Practice1";

        for(String title:titles){
            if(title.equals(expectedTitle)){
                System.out.println("passed");
            }else{
                System.out.println("Failed");
                System.out.println("Expected title: "+expectedTitle);
                System.out.println("Actual Title: "+title);
            }
        }
driver.close();


    }
}
