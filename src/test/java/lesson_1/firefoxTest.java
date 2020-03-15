package lesson_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.*;


public class firefoxTest {
    WebDriver driver;
    private static Logger logger = LogManager.getLogger(firefoxTest.class);

    @Test()
//    public boolean success(){
//        logger.entry(driver.get("https://www.otus.r/"));
//        logger.error("Error!");
//        return logger.error("Error!");
//    }
    public void firefoxOtus() {
        logger.info("Thy page is good");
        logger.error("Thy page's maden mistakes");
        logger.warn("Thy page's been warned");
        logger.fatal("Thy page is delusing in a deepest way");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.otus.r/");
        public boolean success(){
            logger.entry(driver.get("https://www.otus.r/"));
        }
        if (!*.success()) {
            logger.error("Thy page's maden mistakes");
        }
    }



    @After()
        public void tearDown(){
        driver.close();
        driver.quit();
    }


        }

