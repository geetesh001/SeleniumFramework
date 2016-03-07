package OR;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory_Homepage {
	
	//driver.findElement(By.xpath("//*[text()='Sign In']")).click();
	
	@FindBy(xpath="//*[text()='Sign In']")
	private WebElement login_Button;
	
	@FindBy(id="srchword")
	private WebElement search_box;
	
	@FindBy(className="newsrchbtn")
	private WebElement search_button;
	
	@FindBy(id="find")
	private WebElement noOfBooks;
	
	@FindBy(xpath="//a[text()='geetesh']")
	private WebElement name;
	
	public Pagefactory_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void click_login_button()
	{
		login_Button.click();
	}
	
	public void enter_Search_Text(String text)
	{
		search_box.sendKeys(text);
	}
	
	public void click_search_Button()
	{
		search_button.click();
	}
	
	public String get_NumberOfBooks_Found()
	{
		return noOfBooks.getText();
	}
	
	public String isLogin()
	{
		return name.getText();
	}
}
