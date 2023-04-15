package ropo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC
{
	public static void main(String[] args) 
	{
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
	}

}
