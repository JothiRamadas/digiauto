package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonFunction {

    public static WebDriver driver;

public void openBrowser()
{
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();

}

public void closeBrowser()
{
    driver.close();
}

    public void wait(int waitTime)
    {
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);

    }
}
