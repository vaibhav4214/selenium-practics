package hellow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class hellows {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","C:\\BrowserDriver\\geckodriver.exe");

//
//			ChromeDriver chromedriver=new ChromeDriver();
//			chromedriver.get("http://www.facebook.com");
			FirefoxDriver fdriver =new FirefoxDriver();
//			fdriver.get("http://www.facebook.com");
//			fdriver.manage().window().maximize();
//			fdriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("yadav@2345");
//			
//						// fdriver.findElement(By.className("email")).sendKeys("yadav@2345");
//
//
//			System.out.println(fdriver.findElement(By.id("email")).getTagName());
//			System.out.println(fdriver.findElement(By.id("email")).getText());
//			System.out.println(fdriver.findElement(By.id("email")).getAttribute("type"));
//			
//
//			// fdriver.findElement(By.id("pass")).sendKeys("yadav@2345");
//			fdriver.findElement(By.cssSelector("#pass")).sendKeys("yadav@2345");
//
//			// fdriver.findElement(By.cssSelector("input.inputtext ")).sendKeys("yadav@2345");
//			
//			fdriver.findElement(By.name("login")).click();
//			// fdriver.manage().timeouts().getImplicitWaitTimeout(Duration.ofSeconds(30));
//			fdriver.findElement(By.cssSelector("email")).sendKeys("yadav@123");
//
////			fdriver.findElement(By.id("email")).sendKeys("yadav@2345");
////			fdriver.navigate().refresh();		//refresh page
////			fdriver.navigate().to("http://www.google.com");
//			
////			fdriver.navigate().back();	
////			fdriver.navigate().forward()	;	
//	//		System.out.println(fdriver.getTitle()); //return current web page title
//
////			System.out.println(fdriver.getCurrentUrl()); get current url from browser
////			fdriver.close()	;
////			fdriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[4]/div/a")).click();
//			System.out.println("Hellow");
//		// relative xpath	//*[@id="email"]
//	// Absolute xpath
//		// html#facebook body.fbIndex.UIPage_LoggedOut._-kb._605a.b_c3pyn-ahh.gecko.win.x1.Locale_en_GB.cores-gte4._19_u div#u_0_1_zF._li div#globalContainer.uiContextualLayerParent div#content.fb_content.clearfix div div._8esj._95k9._8esf._8opv._8f3m._8ilg._8icx._8op_._95ka div._8esk div._8esn div._8iep._8icy._9ahz._9ah- div._6luv._52jv form#u_0_2_X6._9vtf div div._6lux input#email.inputtext._55r1._6luy

				fdriver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
				Select s=new Select(fdriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/p/select")));
//				s.selectByIndex(3);
//				s.selectByValue("AND");
				s.selectByVisibleText("Aruba");
	}

}
