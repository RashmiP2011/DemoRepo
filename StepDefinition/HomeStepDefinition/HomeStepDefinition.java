package HomeStepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.qa.pages.CompaniesPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepDefinition extends TestBase {
	LoginPage loginobj;
	HomePage homeobj;
	CompaniesPage companiesobj;
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {

		TestBase.initialization();
	}

	@When("^Title of login page is <\"([^\"]*)\">$")
	public void title_of_login_page_is(String title) {

		loginobj = new LoginPage();
		loginobj.verifyLoginTitle(title);

	}

	@Then("^User login into application$")
	public void user_login_into_application() {

		loginobj.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Then("^Verify login successful on Home page$")
	public void verify_login_successful_on_Home_page() throws Throwable {

		homeobj = new HomePage();
		Thread.sleep(5000);
		homeobj.verifyUser(prop.getProperty("user"));

	}
	
	@Then("^Verfiy all menu options are present on Home page$")
	public void verfiy_all_menu_options_are_present_on_Home_page(DataTable options) throws Throwable {
		
	    List<List<String>> data = options.raw();
	    
	    for (int i = 0;i<=data.size()-1; i++){
	    homeobj.verifyMenuOption(data.get(i).get(0));
	    System.out.print(data.get(i).get(0));
	    
	    }
	    
	}
	
	@Then("^Logout$")
	public void logout() throws Throwable {
		homeobj.logoutUser();

	}
}
