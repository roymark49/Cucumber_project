package pages;
	import org.junit.Assert;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;



	public class LoginPage {

		WebDriver driver;
		//constructor
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}

		@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
		WebElement USER_NAME_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
		WebElement PASSWORD_ELEMENT;
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
		WebElement SIGNIN_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
		WebElement DASHBOARD_HEADER_ELEMENT;
		

		public void insertUserName(String userName) {
			USER_NAME_ELEMENT.sendKeys(userName);
		}

		public void insertPassword(String password) {
			PASSWORD_ELEMENT.sendKeys(password);
		}

		public void clikSigninButton() {
			SIGNIN_ELEMENT.click();
		}
		public void user_should_land_on_dashboard() {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard");
		}


	}

