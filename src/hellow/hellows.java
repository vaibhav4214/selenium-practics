package hellow;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hellows {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","C:\\BrowserDriver\\geckodriver.exe");

//
//			ChromeDriver chromedriver=new ChromeDriver();
//			chromedriver.get("http://www.facebook.com");
			FirefoxDriver fdriver =new FirefoxDriver();
			fdriver.get("http://www.facebook.com");
			fdriver.manage().window().maximize();
			fdriver.findElement(By.id("email")).sendKeys("yadav@2345");
			System.out.println(fdriver.findElement(By.id("email")).getTagName());
			System.out.println(fdriver.findElement(By.id("email")).getText());
			System.out.println(fdriver.findElement(By.id("email")).getAttribute("type"));
			

			fdriver.findElement(By.id("pass")).sendKeys("yadav@2345");
			
			fdriver.findElement(By.name("login")).click();
//			fdriver.findElement(By.id("email")).sendKeys("yadav@2345");
//			fdriver.navigate().refresh();		//refresh page
//			fdriver.navigate().to("http://www.google.com");
			
//			fdriver.navigate().back();	
//			fdriver.navigate().forward()	;		System.out.println(fdriver.getTitle()); //return current web page title

//			System.out.println(fdriver.getCurrentUrl()); get current url from browser
//			fdriver.close()	;
//			fdriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[4]/div/a")).click();

			
			System.out.println("Hellow");
			

	}

}
