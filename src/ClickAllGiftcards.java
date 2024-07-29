import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllGiftcards {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hinai\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://loyalty.giftcard.doboz.co/");
		//driver.findElement(By.id("email")).Sendkeys;
		//driver.findElement(By.id("email")).sendKeys
		driver.findElement(By.id("email")).sendKeys("gaurav@doboz.in");

		driver.findElement(By.id("password")).sendKeys("123123123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div/div/div/div[2]/div/div/form/div[4]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Gift Cards")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/nav/div[2]/ul/li[2]/div/ul/li[1]/a/div/span")).click();

	}

}
