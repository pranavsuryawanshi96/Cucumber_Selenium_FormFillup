package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class form {
	WebDriver driver;

	public form(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstName")
	WebElement firstName;
	@FindBy(id = "lastName")
	WebElement lastName;
	@FindBy(css = "[type=\"email\"]")
	WebElement email;
	@FindBy(css = "[id=\"number\"]")
	WebElement number;
	@FindBy(css = "[value=\"submit\"]")
	WebElement click;

	public void enterFirstName(String str) {
		firstName.sendKeys(str);

	}

	public void enterLastName(String str) {
		lastName.sendKeys(str);

	}

	public void enterEmail(String str) {
		email.sendKeys(str);
	}

	public void enterContact(String str) {
		number.sendKeys(str);
 
	}

	public void clickOnSubmit() {
		click.click();

	}

}
