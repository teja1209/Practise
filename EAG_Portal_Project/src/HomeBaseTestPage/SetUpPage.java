package HomeBaseTestPage;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SetUpPage
{
WebDriver driver;
@Before
public void before()
{
	JFrame frame = new JFrame();
    String message = "message";
    String text = JOptionPane.showInputDialog(frame, message);
   if(text!=null)
   {
	 System.out.println(text);  
   }
   else if(text==null)
   {
	   
   }
	
	if(text.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Raghavendra.Damaraju\\Desktop\\Selenium softies\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();   

	}
	else if(text.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghavendra.Damaraju\\Desktop\\Selenium softies\\chromedriver.exe");
         driver = new ChromeDriver();   
	}
	else
	{
		System.out.println("no value entered or entered value is not exist");
	}
}
	
}
