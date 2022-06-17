package eee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Main {
	public static void main(String[] args) {
		//SORTIRANJE ANKETA PO DATUMU KRAJA 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\korisnik\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/projekat2/projekat_ankete/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("Marija");
	    driver.findElement(By.name("sifra")).sendKeys("sifra123");
	    driver.findElement(By.name("logovanje")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(3)")).click();
	    String s1=driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(3)")).getText(); // "2019-09-07"
	    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3)")).click();
	    String s2=driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3)")).getText(); //"2019-09-10";
	    driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(3)")).click();
	    String s3=driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(3)")).getText(); //"2020-12-31"
	    
	    System.out.println("Pre sortiranja");
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s3);
	    
	    driver.findElement(By.id("menu")).click();
	    driver.findElement(By.cssSelector("td:nth-child(3) a:nth-child(3) > img")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(3)")).click();
	    String s4=driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(3)")).getText(); //"2020-12-31"
	    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3)")).click();
	    String s5=driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3)")).getText(); //"2019-09-10"
	    driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(3)")).click();
	    String s6=driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(3)")).getText(); //"2019-09-07"
	    driver.findElement(By.id("menu")).click();
	    driver.findElement(By.cssSelector("a:nth-child(3) > b")).click();
	    
	    System.out.println("Posle sortiranja");
	    System.out.println(s4);
	    System.out.println(s5);
	    System.out.println(s6);
	}
}
