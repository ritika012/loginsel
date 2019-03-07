package loginsel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TRG8\\eclipse-workspace\\loginsel\\exefile1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


        // And now use this to visit Google
        driver.get("http://localhost:8080");
        driver.manage().window().maximize();
        driver.findElement(By.id("j_username")).sendKeys("Ritika");
        
        driver.findElement(By.name("j_password")).sendKeys("ritzzz123");
        
        driver.findElement(By.name("Submit")).click();
        boolean flag=driver.findElement(By.id("jenkins-name-icon")).isEnabled();
        
       Assert.assertEquals(flag,true,"wrong page...");
       try {
    	   Thread.sleep(5000);
       } catch(InterruptedException e)
       {
    	   e.printStackTrace();
       }
       
       
       driver.findElement(By.cssSelector("#header > div.login > span > a:nth-child(2) > b")).click();
       try {
    	   Thread.sleep(5000);
       } catch(InterruptedException e)
       {
    	   e.printStackTrace();
       }
       
       
       driver.close();
	}

}
