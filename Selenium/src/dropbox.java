import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class dropbox {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver",
						"C:/Seleniumnew/chromedriver.exe");
				        //"C:\\Seleniumnew\\geckodriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Oct");
			new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("10");
		new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("1985");
			
			
	}

}
