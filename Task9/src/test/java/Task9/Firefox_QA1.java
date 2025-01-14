package Task9;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox_QA1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com/");

		System.out.println(driver.getCurrentUrl()); //print current page url
		driver.navigate().refresh();

		Thread.sleep(2000);
		driver.close();

	}

}
