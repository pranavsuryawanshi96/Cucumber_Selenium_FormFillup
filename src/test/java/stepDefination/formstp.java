package stepDefination;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.form;

public class formstp {
	WebDriver driver;
	form formfillupForm;

	@Given("the user opens the browser and navigates to the URL")
	public void the_user_opens_the_browser_and_navigates_to_the_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		formfillupForm = new form(driver);
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/simple-form?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}

	@When("the user enters the first name as {string}")
	public void the_user_enters_the_first_name_as(String string) {
           formfillupForm.enterFirstName(string);
	}

	@When("the user enters the last name as {string}")
	public void the_user_enters_the_last_name_as(String string) {
           formfillupForm.enterLastName(string);
	}

	@When("the user enters the email as {string}")
	public void the_user_enters_the_email_as(String string) {
         formfillupForm.enterEmail(string);
	}

	@When("the user enters the contact number as {string}")
	public void the_user_enters_the_contact_number_as(String string) {
         formfillupForm.enterContact(string);
	}

	@When("the user clicks on the Submit button")
	public void the_user_clicks_on_the_submit_button() {
         formfillupForm.clickOnSubmit();
	}

	@Then("the form should be submitted successfully")
	public void the_form_should_be_submitted_successfully() {
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 driver.quit();
	}
}
