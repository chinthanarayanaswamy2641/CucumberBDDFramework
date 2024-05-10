package AAA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("varun");
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("kumar");
		
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Gattu");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text' and @jsname='YPqjbf']")).sendKeys("Sai Ram");
		driver.switchTo().defaultContent();
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.name("mytext4")).sendKeys("Jai Shree Ram");
	}
	
}
