package Java.NoBrokerTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {
	  public static void main(String[] args) throws InterruptedException {
		     System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		 driver.manage().window().maximize();
		 
		 driver.get("https://www.nobroker.in/");
		 driver.findElement(By.xpath("//div[@class='nb__31B79']//div[@class='nb__3PfOV']//div[@class='nb__19hcF'][contains(text(),'Log in')]")).click();
		 driver.findElement(By.xpath("//div[@class='intl-tel-input allow-dropdown separate-dial-code iti-sdc-3']//input[@placeholder='Enter Mobile Number']")).click();
		 driver.findElement(By.xpath("//div[@class='intl-tel-input allow-dropdown separate-dial-code iti-sdc-3']//input[@placeholder='Enter Mobile Number']")).sendKeys("8309860962");
		 driver.findElement(By.xpath("//div[@class='login-signup-form-group step3 show ']//label[@for='login-signup-form-login-radio-password']")).click();
		 driver.findElement(By.xpath("//div[@controlid='login-signup-form__password-input']//input[@id='login-signup-form__password-input']")).sendKeys("vand343");
		 driver.findElement(By.xpath("//div[@class='login-signup-form-submit-button step3 whatsAppOpen ']//button[@class='btn btn-primary']")).click();
		 
	  }
}
