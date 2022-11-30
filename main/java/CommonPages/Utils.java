package CommonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utils extends BasePage {
    public static void clickOnElement(By by){driver.findElement(by).click();}

    public static String dateStamp() throws ParseException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"weather-wrapper\"]/strong"));
        String sDate = element.getText();
        SimpleDateFormat format = new SimpleDateFormat("mm.dd.yyyy.hh.");
        Date date = format.parse(sDate);
        return format.format(new Date());



    }


}
