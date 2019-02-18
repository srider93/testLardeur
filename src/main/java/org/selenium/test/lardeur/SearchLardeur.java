package org.selenium.test.lardeur;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchLardeur extends GenericPage{

	WebDriverWait wait;
	@FindBy(how = How.XPATH, using ="//a[@href='#npcs']")
	WebElement pnj_tab;
	
	
	
	@FindBy(how = How.XPATH, using ="//td[@class='icon-boss-padded']/a")
	WebElement obj_lardeurTeteMort;
	

	
	public SearchLardeur(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public LardeurTeteDeMort goToLardeurPage() {
		
		pnj_tab.click();
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", obj_lardeurTeteMort ); 
		obj_lardeurTeteMort.click();
		return PageFactory.initElements(driver, LardeurTeteDeMort.class);
	}

}
