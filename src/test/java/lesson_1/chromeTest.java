package lesson_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.*;


public class chromeTest {
        WebDriver driver;

        @Test()
        public void chromeOtus()
        {

                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.get("https://www.otus.ru/");



        }
       @AfterClass
       public void tearDown() {
               driver.close();
                driver.quit();
                }


}