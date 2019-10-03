//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


//Opening Till Facebook through FireFox
public class Demosele {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.facebook.com/");
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Oct");
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("10");
	new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("1985");
		
		//driver.close();
		
	}
}
	