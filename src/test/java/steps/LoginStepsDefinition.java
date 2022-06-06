package steps;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepsDefinition extends TestBase {
	DatabasePage databasePage;
	LoginPage loginPage;
	@Before //Make sure you import as cucumber:
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}

	@Given("^User is on the TechFios login page$")
	public void user_is_on_techfios_login_page() {
		
		driver.get("https://techfios.com/billing/?ng=login/ ");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		
		loginPage.insertUserName(username);
	}
	
	@When ("^User enters \"([^\"]*)\"$")
	
	public void user_enters(String data) {
		if(data.equalsIgnoreCase("username")) {
			loginPage.insertUserName("demo@techfios.com");
		}else if (data.equalsIgnoreCase("password")) {
			loginPage.insertPassword("abc123");
		}else {
			System.out.println("invalid dtata");
		}
		
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.insertPassword(password);
	}
	
	@When("^User clicks signin button$")
	public void user_clicks_signin_button() {
		loginPage.clikSigninButton();
	}
	
	@Then("^User should land on the dashboard page$")
	public void user_should_land_on_dashboard_page() throws IOException, InterruptedException {
		loginPage.user_should_land_on_dashboard();
		screenshotTake();
		
	}
	@When("^User enters \"([^\"]*)\" from Techfios database$")// this step working for user name and password feature file
	public void user_enters_from_Techfios_database(String data) throws SQLException {
		if(data.equalsIgnoreCase("username")) {
			System.out.println("Username from DB: " + databasePage.getDataFromDb("username"));
			loginPage.insertUserName(databasePage.getDataFromDb("username"));
		}else if (data.equalsIgnoreCase("password")) {
			System.out.println("Password from DB: " + databasePage.getDataFromDb("password"));
			loginPage.insertPassword(databasePage.getDataFromDb("password"));
		}else {
			System.out.println("invalid dtata");
		}
	}
	
	@After
	public void tearDownMethod() {
		driver.close();
		driver.quit();
	}

}
