package testScript;

import generic.Base_Class;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import OR.Pagefactory_Homepage;
import OR.Pagefactory_Loginpage;



public class Scenario_Login extends Base_Class{
	
	@Test
	public void doLogin()
	{

		Pagefactory_Loginpage login = new Pagefactory_Loginpage(driver);
		Pagefactory_Homepage home = new Pagefactory_Homepage(driver);
		
		home.click_login_button();
		login.enter_UserName("geetesh.mahanta@rediff.com");
		login.enter_password("Geetesh10");
		login.click_login_Button();
		
		SoftAssert srt = new SoftAssert();
		srt.assertTrue(home.isLogin()=="geetesh", "Log in failed");
	}

}
