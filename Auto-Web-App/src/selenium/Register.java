package selenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.NoAlertPresentException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Register {
	  
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VIGNESHWARAN R\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
			driver.get("https://www.shine.com/registration/");
			
			//name
			WebElement name= driver.findElement(By.id("id_name"));
			name.sendKeys("vignesh");
			
			//email
			WebElement email= driver.findElement(By.id("id_email"));
			email.sendKeys("vickychella31@gmail.com");
			
			//mobile
			WebElement mobile= driver.findElement(By.id("id_cell_phone"));
			mobile.sendKeys("9344420714");
			
			
			//password
			WebElement password= driver.findElement(By.id("id_password"));
			password.sendKeys("Ravi312k1@");
			
			//button
			WebElement register= driver.findElement(By.cssSelector("#registerButton"));
			Thread.sleep(20000);
			register.click();
			Thread.sleep(20000);
	  }
	}