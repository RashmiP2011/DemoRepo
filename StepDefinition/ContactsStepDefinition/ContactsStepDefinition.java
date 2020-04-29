package ContactsStepDefinition;

import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;

public class ContactsStepDefinition extends TestBase {
	LoginPage loginobj;
	HomePage homeobj;
	ContactsPage contactsobj;
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

	@Then("^Navigate to Contacts page$")
	public void navigate_to_Contacts_page() {

		homeobj.selectMenu("Contacts");
	}

	@Then("^Click on add new contact$")
	public void click_on_add_new_contact() throws Throwable {

		contactsobj = new ContactsPage();
		Thread.sleep(3000);
		contactsobj.clickNewContact();

	}

	@Then("^Enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and save$")
	public void enter_and_save(String firstName, String lastName, String eMail) throws Throwable {

		Thread.sleep(3000);
		contactsobj.enterNewContactDetails(firstName, lastName, eMail);
		Thread.sleep(2000);
	}

	@Then("^Identify the Contact with \"([^\"]*)\" , \"([^\"]*)\" and delete the record$")
	public void identify_the_Contact_with_and_delete_the_record(String firstName, String lastName) throws Throwable {
		Thread.sleep(3000);
		contactsobj = new ContactsPage();
		contactsobj.deleteContact(firstName, lastName);

	}

	@Then("^Logout$")
	public void logout() throws Throwable {
		homeobj.logoutUser();

	}

}
