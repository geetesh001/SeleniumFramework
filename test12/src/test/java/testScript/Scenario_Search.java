package testScript;

import generic.Base_Class;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import OR.Pagefactory_Homepage;

public class Scenario_Search extends Base_Class{

	@Test
	public void doSearch()
	{
		Pagefactory_Homepage obj = new Pagefactory_Homepage(driver);
		obj.enter_Search_Text("gandhi");
		obj.click_search_Button();
		String num = obj.get_NumberOfBooks_Found();
		SoftAssert srt = new SoftAssert();
		srt.assertTrue(Integer.valueOf(num)==458, "Book count mismatch");
	}
	
}
