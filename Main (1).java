
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://WWW.Google.Com");
		
		driver.get("http://www.ebay.in");
		
		driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
		driver.findElement(By.linkText("Start Selling")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	

	}

}
