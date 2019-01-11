package logintest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void test(){
		
		System.out.println("test");
			
			/*FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());*/
			//System.out.println(driver.getPageSource());
			
		
		               /* WebElement link_Home = driver.findElement(By.id("u_0_q"));
		               
		        		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        	
		        		driver.findElement(By.id("email")) .sendKeys("username");

		        		driver.findElement(By.id("pass")) .sendKeys("password");
		        		
		                 
		                Actions builder = new Actions(driver);
		                Action mouseOverHome = builder.tick()
		                        .moveToElement(link_Home).click()
		                        .build();
		                 
		                     
		                mouseOverHome.perform();    
		                System.out.println("clicked on login button successfully");*/
		                
		               
		               // driver.close();
			
		
	}

}

