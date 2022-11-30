package WebElements;

import CommonPages.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class TestPage extends Utils {


  private By _SportMenu = By.xpath("//*[@id=\"page-container\"]/div[2]/ul/li[4]/span/a");

  private By _FootballSubMenu = By.xpath("//*[@id=\"page-container\"]/div[2]/div[2]/div/ul[1]/li[2]/a");
  private By _Firstartical = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/h2/a");
  private By _Viewgallery = By.id("i-7ebc8e1a56e98d82");
  private By _ForwardPicture = By.className("nextButton-3SUcS");
  private By _PreviousPicture = By.className("previousButton-1MRE_");
  private By _Closegallery = By.className("closeButton-3n9vO");

  Actions actions = new Actions(driver);
  WebElement targetElements = driver.findElement(By.className("linkItem-2NXrW shareIcon-8A2dW"));


  private By _openshareDialog = By.className("linkItem-2NXrW shareIcon-8A2dW");
  private By _opensFacebookDialog = By.xpath("//*[@id=\"js-article-text\"]/div[3]/div[2]/div/div[2]/ul/li[1]");
 private By _aceeptfacebookcookies = By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]");


    public void doTest(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      clickOnElement(_SportMenu);
      clickOnElement(_FootballSubMenu);
      clickOnElement(_Firstartical);
      clickOnElement(_Viewgallery);
      clickOnElement(_ForwardPicture);
      clickOnElement(_PreviousPicture);
      clickOnElement(_Closegallery);
      actions.moveToElement(targetElements).perform();
      clickOnElement(_openshareDialog);
      clickOnElement(_opensFacebookDialog);
      clickOnElement(_aceeptfacebookcookies);

  }
}
