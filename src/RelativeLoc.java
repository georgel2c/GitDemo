import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Trabajo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement namebox = driver.findElement(By.xpath("//input[@name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(namebox)).getText());
		
		WebElement labelBirth = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(withTagName("input").below(labelBirth)).sendKeys("22/11/1985");
		
		WebElement labelIceCream = driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		driver.findElement(withTagName("input").toLeftOf(labelIceCream)).click();
		
		WebElement statusRb = driver.findElement(By.cssSelector("input#inlineRadio1"));
		System.out.println(driver.findElement(withTagName("label").toRightOf(statusRb)).getText());
	}

}
