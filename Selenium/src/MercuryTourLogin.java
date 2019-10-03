import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTourLogin {
//Chrome Opens and Navigate to Url and close
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Seleniumnew/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.close();

	}

}
