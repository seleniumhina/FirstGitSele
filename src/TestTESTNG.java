import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTESTNG {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hinai\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://macroplanfrontend.estonetech.in/login");


	}

}
