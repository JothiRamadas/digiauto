package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public LoginPage(WebDriver driver)
{
    PageFactory.initElements(driver,this);
}
@FindBy(xpath = "/html/body/div[2]/a/img")
WebElement signUpHeader;

@FindBy(xpath = "//*[@id=\"content\"]/ul/li[21]/a")
WebElement formauthClk;

@FindBy(id = "username")
WebElement usernameTxt;

@FindBy(id = "password")
    WebElement passwordTxt;
@FindBy(xpath = "//*[@id=\"login\"]/button/i")
WebElement loginClk;

@FindBy(xpath = "//*[@id=\"content\"]/div/a/i")
WebElement logoutclk;

public void validateSignUpHeader()
{
    Assert.assertTrue(signUpHeader.isDisplayed());
}

public void formauthentication()
{
    formauthClk.click();
}

public void username(String usernameVal)
{
    usernameTxt.sendKeys(usernameVal);
}
public void password(String passwordVal)
{
    passwordTxt.sendKeys(passwordVal);
}
public void login()
{
    loginClk.click();
}
public void logout()
{
    logoutclk.click();
}


}
