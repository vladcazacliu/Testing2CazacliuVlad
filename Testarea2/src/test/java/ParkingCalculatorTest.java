import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParkingCalculatorTest {

    static WebDriver driver;
    private static final org.apache.log4j.Logger logger = Logger.getLogger(String.valueOf(ParkingCalculatorTest.class));

    @BeforeMethod
    public void before() {
        String driverExecutablePath = "D:\\Install\\geckodriver-v0.31.0-win32\\geckodriver.exe";

        System.setProperty("webdriver.gecko.driver", driverExecutablePath);
        driver = new FirefoxDriver();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        DOMConfigurator.configure("log4j.xml");
        logger.info("Open");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.shino.de/parkcalc/");
    }


    @DataProvider(name = "fillForm")
    public Object[][] fill(){

        return new Object[][]{
                {"Economy Parking", "3/12/2022", "10:00", "AM", "2/20/2022", "12:00", "PM"},
                {"Short-Term Parking", "6/6/2022", "11:00", "AM", "5/6/2022", "11:00", "PM"},
                {"Long-Term Garage Parking", "5/19/2022", "9:00", "AM", "5/19/2022", "10:00", "PM"},
                {"Valet Parking", "2/2/2022", "10:00", "PM", "2/2/2022", "10:00", "AM"}


        };
    }

    @Test(dataProvider = "fillForm")
    public void test(String parkLot, String Data, String time, String AM_PM, String data, String TIME, String AM_PM2) {

        WebElement parkingLot = driver.findElement(By.xpath("//select[@name='ParkingLot']"));
        parkingLot.sendKeys(parkLot);
        WebElement date1 = driver.findElement(By.xpath("//input[@name='StartingDate']"));
        date1.clear();
        date1.sendKeys(Data);
        WebElement time1 = driver.findElement(By.xpath("//input[@name='StartingTime']"));
        time1.clear();
        time1.sendKeys(time);
        WebElement radio1 = driver.findElement(By.xpath("//input[@name='StartingTimeAMPM'][@value='"+ AM_PM +"']"));
        radio1.click();
        WebElement date2 = driver.findElement(By.xpath("//input[@name='LeavingDate']"));
        date2.clear();
        date2.sendKeys(data);
        WebElement time2 = driver.findElement(By.xpath("//input[@name='LeavingTime']"));
        time2.clear();
        time2.sendKeys(TIME);
        WebElement radio2 = driver.findElement(By.xpath("//input[@name='LeavingTimeAMPM'][@value='"+ AM_PM2 +"']"));
        radio2.click();

        WebElement button = driver.findElement(By.xpath("//input[@name='Submit']"));
        button.click();
    }

    @AfterMethod
    public void after() {

    }
}
