package Boishaky_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class Boishaky_Base {

	public static WebDriver driver;
	public static Properties prop;
	
	public Boishaky_Base() {
		try {
			FileInputStream boisFile = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Boishaky_Config//Boishaky_Config.properties"));
			
			prop = new Properties();
			prop.load(boisFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("please,look the code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void BoisBrowser() {
		
	String allBrowser =	prop.getProperty("BoisBrowser1");
		
		if(allBrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//Boishaky//Boishaky_ChromeDriver//chromedriver.exe"));
			   ChromeOptions opp = new ChromeOptions();
			   opp.addArguments("--remote-allow-origins=*"); 
			   driver = new ChromeDriver();
			   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Boishaky_Utility.pageLoadTimeout));
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Boishaky_Utility.implicitlyWait));
			   driver.manage().window().maximize();	
			
			
			
			
		}
		else if(allBrowser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Boishaky//Boishaky_EdgeDriver//msedgedriver.exe"));
			   EdgeOptions opp1 = new EdgeOptions();
			   opp1.addArguments("--remote-allow-origins=*"); 
			   driver = new EdgeDriver();
			   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Boishaky_Utility.pageLoadTimeout));
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Boishaky_Utility.implicitlyWait));
			   driver.manage().window().maximize();	
		
			
			
		}
	
	
		
	}
	
	public static void BoisLaunchURL(String URL) {
			
		driver.get(prop.getProperty("BoisURL"));
		
		
	}
	
	
}
	
	


	
	

