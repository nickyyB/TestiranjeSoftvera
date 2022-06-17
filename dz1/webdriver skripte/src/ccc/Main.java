package ccc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Main {

	public static void main(String[] args) {
		// LOGOVANJE SA PRAZNIM KORISNICKIM IMENOM
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\korisnik\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/projekat2/projekat_ankete/");
		driver.manage().window().maximize();
		driver.findElement(By.name("sifra")).click();
		driver.findElement(By.name("sifra")).sendKeys("sifra123");
		driver.findElement(By.name("logovanje")).click();
		String poruka = driver.findElement(By.cssSelector("font > b")).getText();
		if(poruka!=null){
			System.out.println(poruka);
		}
		else{
			System.out.println("Pao test");
		}
		driver.close();
	}

}
