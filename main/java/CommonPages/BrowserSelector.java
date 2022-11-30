package CommonPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage{
    String browserName = "chrome";

    public void openSelectedBrowser(){
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (browserName.equals("edge")){
            WebDriverManager.firefoxdriver().setup();
            driver = new EdgeDriver();
        }else {
            System.out.println("Browser not matched");
        }
        driver.manage().window().maximize();
        //Page loading timeout
        driver.manage().timeouts().pageLoadTimeout(6000, TimeUnit.SECONDS);
        //Applying implicitly wait to driver object
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //open URL
        driver.get("https://www.dailymail.co.uk/home/index.html ");
        driver.findElement(By.xpath("//*[@id=\"home\"]/div[4]/div/div/div/div[3]/div/button[2]")).click();


    }
}
