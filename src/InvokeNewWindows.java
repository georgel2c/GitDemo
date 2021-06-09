import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeNewWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Trabajo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Invoking new tab or window and switching between themselves
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> tabs = driver.getWindowHandles();
		
		Iterator<String> it = tabs.iterator();
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID).get("https://rahulshettyacademy.com/#/index");
		String courseName = driver.findElements(By.cssSelector("a[href*= 'https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentID);
		WebElement fieldName = driver.findElement(By.xpath("//div[@class = 'form-group']//input[@name = 'name']"));
		fieldName.sendKeys(courseName);
		
		//Getting Screenshot of an specific WebElement
		File imageFile = fieldName.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(imageFile, new File("NameField.png"));
		
		//Getting Height and Width of a WebElement
		int height = fieldName.getRect().getDimension().getHeight();
		int width = fieldName.getRect().getDimension().getWidth();
		System.out.println("The field Name height is " + height + " and the width is " + width);
		System.out.println("GitDemo code changes 1");
		System.out.println("GitDemo code changes 2");
		System.out.println("GitDemo code changes 3");
		
		//Continue from here
		System.out.println("GitDemo code changes 4");
		System.out.println("GitDemo code changes 5");
		System.out.println("GitDemo code changes 6");
		

		//GIT changes
		System.out.println("GitDemo code changes 7");
		System.out.println("GitDemo code changes 8");
		System.out.println("GitDemo code changes 9");
	}
	
	public void getData()
	{
		System.out.println("Testing branching in GIT");
	}

}
