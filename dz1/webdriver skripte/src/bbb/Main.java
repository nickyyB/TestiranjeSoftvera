package bbb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Main {

	public static void main(String[] args){
		
		//JMBG SADRZI SPECIJALAN ZNAK
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\korisnik\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/projekat2/projekat_ankete/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Promena lozinke")).click();
	    driver.findElement(By.linkText("Povratak na početnu stranu")).click();
	    driver.findElement(By.linkText("Registracija")).click();
	    driver.findElement(By.name("korisnicko_ime")).click();
	    driver.findElement(By.name("korisnicko_ime")).sendKeys("Ana12345");
	    driver.findElement(By.name("korisnicko_ime")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)")).click();
	    driver.findElement(By.name("sifra")).click();
	    driver.findElement(By.name("sifra")).sendKeys("ana123");
	    driver.findElement(By.name("potvrda_sifra")).click();
	    driver.findElement(By.name("potvrda_sifra")).sendKeys("ana123");
	    driver.findElement(By.name("ime")).click();
	    driver.findElement(By.name("ime")).sendKeys("Ana");
	    driver.findElement(By.name("prezime")).sendKeys("Simic");
	    driver.findElement(By.name("datum_rodjenja")).sendKeys("07-07-1998");
	    driver.findElement(By.name("mesto_rodjenja")).click();
	    driver.findElement(By.name("mesto_rodjenja")).sendKeys("Novi Sad");
	    driver.findElement(By.name("jmbg")).click();
	    driver.findElement(By.name("jmbg")).sendKeys("0707*98710065");
	    driver.findElement(By.name("kon_telefon")).click();
	    driver.findElement(By.name("kon_telefon")).sendKeys("0641111111");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("ana@gmail.com");
	    driver.findElement(By.name("tip")).click();
	        {
	          WebElement dropdown = driver.findElement(By.name("tip"));
	          dropdown.findElement(By.xpath("//option[. = 'Ispitanik']")).click();
	        }
	    driver.findElement(By.name("tip")).click();
	    driver.findElement(By.name("reg")).click();
	        
	    String poruka = driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    driver.close();
	    if(poruka.equals("-Pogrešan unos JMBG-a(mora sadržati tačno 13 cifara)!\n ")){
       	 System.out.println(poruka);
       }
       else {
       	System.out.println("Nije prosao test");
       }
	    
	}
}
