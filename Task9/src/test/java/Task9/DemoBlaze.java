package Task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlaze {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");

		driver.manage().window().maximize();
		String expstr = "STORE";
		String str = driver.getTitle();

		if (str.equals(expstr)) {
			System.out.println("Page landed on the correct website");
		} else {
			System.out.println("Page not landed on the correct websitr");
		}
	}
}
