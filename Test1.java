package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("http://newtours.demoaut.com/");
			WebElement registration = driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
			registration.click();

			WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
			firstName.click();
			firstName.sendKeys("Milan");

			WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
			lastName.click();
			lastName.sendKeys("Peric");

			WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
			phone.click();
			phone.sendKeys("068224545");

			WebElement eMail = driver.findElement(By.xpath("//input[@id='userName']"));
			eMail.click();
			eMail.sendKeys("mile123456789@gmal.com");

			WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
			address.click();
			address.sendKeys("Milana Jovanoviæa 14");

			WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
			city.click();
			city.sendKeys("Negotin");

			WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
			state.click();
			state.sendKeys("Srbija");
			
			WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
			postalCode.click();
			postalCode.sendKeys("17258");
			
			Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
			country.selectByVisibleText("SERBIA");

			WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
			userName.click();
			userName.sendKeys("Milan");

			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.click();
			password.sendKeys("123456789");

			WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
			confirmPassword.sendKeys("123456789");

			WebElement submit = driver.findElement(By.xpath("//input[@name='register']"));
			submit.click();

		} catch (Exception ex) {

		} finally {
			driver.quit();;
		}

	}

}
