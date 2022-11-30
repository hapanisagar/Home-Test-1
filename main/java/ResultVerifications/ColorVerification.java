package ResultVerifications;

import CommonPages.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class ColorVerification extends Utils {
   public void verifyColor(){

      WebElement E = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[2]/ul/li[4]/span/a"));
      String backColor =  E.getCssValue("background-color");
      System.out.println(backColor);
      String navigationHexBackColor = Color.fromString(backColor).asHex();
      System.out.println(navigationHexBackColor);

      WebElement E2 = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[2]/div[2]/div"));
      String backColor2 =  E.getCssValue("background-color");
      String subNavigationHexBackcolor = Color.fromString(backColor2).asHex();
      System.out.println(subNavigationHexBackcolor);

      if(navigationHexBackColor.equals(subNavigationHexBackcolor))
         System.out.println("Navigation color Matched");
      else System.out.println("Navigation color not Matched");

   }
}
