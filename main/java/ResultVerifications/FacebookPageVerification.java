package ResultVerifications;

import CommonPages.Utils;
import org.testng.Assert;

public class FacebookPageVerification extends Utils {

    public void FacebookPageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Facebook – log in or sign up",title);

    }
}
