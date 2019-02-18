package org.selenium.test.lardeur;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLardeur {

	 WebDriver driver;
	 WebDriverWait wait;
	 private String BROWSER=System.getProperty("browser");

	
	
	 
	   @Before
		public void setup() throws Exception{
			//Check if parameter passed is 'firefox'
			if(BROWSER.equalsIgnoreCase("firefox")){
			//create firefox instance
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Desktop\\SUT\\geckodriver.exe");
				driver = new FirefoxDriver();
				wait = new WebDriverWait(driver, 10);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://fr.wowhead.com/");
				driver.manage().window().maximize();
			}
			//Check if parameter passed as 'chrome'
			else if(BROWSER.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver","C:\\Users\\formation\\Desktop\\SUT\\chromedriver.exe");
				//create chrome instance
				driver = new ChromeDriver();
				wait = new WebDriverWait(driver, 10);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://fr.wowhead.com/");
				driver.manage().window().maximize();
			}

			else{
				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	 
	 
	 

	 
    @Test
    public void premierTestWow() {
    	
    	HomePage home = new HomePage(driver);
    	SearchLardeur searchLardeur = home.search("Lardeur");
    	LardeurTeteDeMort lardeurTeteDeMort = searchLardeur.goToLardeurPage();
    	Assert.assertEquals(5, lardeurTeteDeMort.objRare_td.size());
    	StatChahuteur chahuteur = lardeurTeteDeMort.goToChahuteurStat();
    	Assert.assertEquals("Chahuteurs de cadavre", chahuteur.nom_chahuteur.getText());
    	Assert.assertEquals("+8 Endurance", chahuteur.stat_chahuteur_endurance.getText());
    	Assert.assertEquals("Augmente votre score de hâte de +4.", chahuteur.stat_chahuteur_augscore.getText());
    	Assert.assertEquals("+3 Versatilité", chahuteur.stat_chahuteur_versatility.getText());
    	driver.navigate().back();
    	StatChausse chausse = lardeurTeteDeMort.goToChausseStat();
    	Assert.assertEquals("Chausses de Lardeur", chausse.nom_chausse.getText());
    	Assert.assertEquals("+10 Endurance", chausse.stat_chausse_endurance.getText());
    	Assert.assertEquals("Augmente votre score de coup critique de +6.", chausse.stat_chausse_augscore.getText());
    	Assert.assertEquals("+3 Versatilité", chausse.stat_chausse_versatility.getText());
    	
    
    	
    	
    }
	
	
	
}
