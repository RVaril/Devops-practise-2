import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//Opening Chrome works till entering password
public class FacebookLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("tai.alli@hotmail.com");
	driver.findElement(By.name("pass")).sendKeys("brickstone911");
	driver.findElement(By.id("u_0_a")).click();
	

}
}
