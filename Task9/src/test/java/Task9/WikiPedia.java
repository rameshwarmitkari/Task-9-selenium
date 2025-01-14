package Task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikiPedia {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");

		driver.manage().window().maximize();

		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");

		driver.findElement(By.xpath("//i[text()='Search']")).click();

		driver.findElement(By.xpath("//a[@href='#History']")).click();
		System.out.println(driver.getTitle());
		
	//	driver.close();

	}

}
