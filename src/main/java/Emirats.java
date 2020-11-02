import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Emirats {

    WebDriver driver ;
    String url = "https://www.emirates.com/us/english/";

    @Test
    public void setUp(){
        String chromeDriverPath="BrowserDriver/windows/chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver","BrowserDriver/windows/chromedriver.exe");
        // WebDriverManager.chromedriver();
        // WebDriverManager.firefoxdriver();
        // WebDriverManager.iedriver();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Click on login
        WebElement login = driver.findElement(By.className("account-username"));
        login.click();
        // register button
       driver.findElement(By.xpath("//main[@id='maincontent']/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/section[1]/a[1]")).click();


        //pass the first name and the last name
        driver.findElement(By.cssSelector("#txtFirstName")).sendKeys("ALA");
        driver.findElement(By.cssSelector("#txtFamilyName")).sendKeys("Kramou");
        //pass Tittle
        driver.findElement(By.name("ctl00$MainContent$ctl01$txtTitle")).sendKeys("Mr");
        driver.findElement(By.name("ctl00$MainContent$ctl01$txtTitle")).isSelected();
        //pass information
        driver.findElement(By.name("ctl00$MainContent$ctl01$JoinNowResponsiveDOB$day")).sendKeys("18");
        driver.findElement(By.name("ctl00$MainContent$ctl01$JoinNowResponsiveDOB$month")).sendKeys("May");
        driver.findElement(By.name("ctl00$MainContent$ctl01$JoinNowResponsiveDOB$year")).sendKeys("1990");
        // phone number
        driver.findElement(By.cssSelector("#txtTelephoneNumber")).sendKeys("1555653241");
        // language
        driver.findElement(By.name("ctl00$MainContent$ctl01$txtPreferredLanguage")).sendKeys("English");
        driver.findElement(By.name("ctl00$MainContent$ctl01$txtPreferredLanguage")).isSelected();
        driver.findElement(By.cssSelector("#txtEmailAddress")).sendKeys("kramoun@gmai.com");
        driver.findElement(By.cssSelector("#txtSetNewPassword")).sendKeys("1234");
        driver.findElement(By.name("ctl00$MainContent$ctl01$btnjoin")).click();


    }



}
