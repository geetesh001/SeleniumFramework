package OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pagefactory_Loginpage {
	
	/*driver.findElement(By.xpath("//input[contains(@name,'logid')]")).sendKeys("geetesh.mahanta@rediff.com");
	driver.findElement(By.xpath("//input[starts-with(@name,'pswd')]")).sendKeys("Geetesh");
	driver.findElement(By.xpath("//input[@value='Login']")).click();*/
	
	@FindBy(xpath="//input[contains(@name,'logid')]")
	private WebElement userName;
	
	@FindBy(xpath="//input[starts-with(@name,'pswd')]")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login_Button;
	
	public Pagefactory_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enter_UserName(String uname)
	{
		userName.sendKeys(uname);
	}

	public void enter_password(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void click_login_Button()
	{
		login_Button.click();
	}
}
