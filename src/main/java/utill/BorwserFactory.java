package utill;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BorwserFactory {

	static WebDriver driver;
	static String browser = null;
	static String url = null; 
	
	public static void readConifg() {
		System.out.println("Before Class");
		Properties prop = new Properties();
		
		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\conifg.porperties");
			prop.load(input);
			browser = proppProperty("browser");
			System.out.println("Used browser:  + browser");
			prop.getProperty("url");
			System.out.println("Used environmnet: + url");
	
	} catch(IOException e) {
		e.printStackTrace();
	}
	}
	
	public static String proppProperty(String string) {
		
		return null;
	}

	public static WebDriver init() {
		readConifg();
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		
		
		} else if (browser.equalsIgnoreCase("firefox"))
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		return driver;
   }
//	driver.get(url); 
//	
//
//}
	public static void tearDown() {
		driver.close();
		driver.quit();
}
}


