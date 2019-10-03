import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkdemo {
// chrome opens & clicks Create page
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:/Seleniumnew/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create a Page")).click();

	}

}
