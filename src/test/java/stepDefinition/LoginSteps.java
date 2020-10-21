package stepDefinition;

import functionLibrary.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps extends CommonFunction
{

LoginPage loginPage=new LoginPage(driver);

@Given(": I am on homepage")
    public void i_am_on_homepage()
    {
        driver.get("http://the-internet.herokuapp.com/");
    }
    @When(": Click formauthentication")
    public void click_formauthentication()
    {
    loginPage.formauthentication();
    }


   @When(": Enter username {string}")
    public void enter_username(String string)
    {
        wait(80);
        loginPage.username(string);
    }
    @When(": Enter password {string}")
    public void enter_password(String string)
    {
        wait(80);
        loginPage.password(string);
    }
    @When(": Click on login")
    public void click_on_login()
    {
        //wait(250);
        loginPage.login();
wait(250);
    }

    @When(": Click on logout")
    public void click_on_logout()
    {
loginPage.logout();
    }
    @Then(": User should be able to see {string}")
    public void user_should_be_able_to_see(String string)
    {
        wait(120);
    }


}
