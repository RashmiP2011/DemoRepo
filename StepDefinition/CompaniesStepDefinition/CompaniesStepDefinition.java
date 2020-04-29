package CompaniesStepDefinition;
import com.qa.pages.CompaniesPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;

public class CompaniesStepDefinition extends TestBase {
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

	@Then("^Verify login successful$")
	public void user_is_on_home_page() throws Throwable {

		homeobj = new HomePage();
		Thread.sleep(5000);
		homeobj.verifyUser(prop.getProperty("user"));

	}

	@Then("^Navigate to Companies page$")
	public void navigate_to_Companies_page() throws Throwable {

		homeobj.selectMenu("Companies");
	}


	@Then("^Click on add new Company$")
	public void click_on_add_new_Company() throws Throwable {

		companiesobj = new CompaniesPage();
		Thread.sleep(3000);
		companiesobj.clickNewCompany();

	}
	

	@Then("^Enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and save$")
	public void enter_and_save(String compnayName, String website, String description) throws Throwable {

		Thread.sleep(3000);
		companiesobj.enterNewCompanyDetails(compnayName, website, description);
		Thread.sleep(2000);
	}

	
	@Then("^Identify the Company with \"([^\"]*)\" and delete the record$")
	public void identify_the_Company_with_and_delete_the_record(String companyName) throws Throwable {
		companiesobj = new CompaniesPage();
		Thread.sleep(2000);
		companiesobj.deleteCompaany(companyName);
		
	}
	
	
	@Then("^Logout$")
	public void logout() throws Throwable {
		homeobj.logoutUser();

	}

}
