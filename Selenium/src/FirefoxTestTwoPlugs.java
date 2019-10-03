
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTestTwoPlugs {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver",
			"C:\\Seleniumnew\\geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();

	driver.get("https://www.facebook.com/");
	
	}

}
