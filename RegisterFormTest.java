package selenijum;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFormTest extends configSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		popuni register formu i klik na submit dugme

		WebDriver web = new ChromeDriver();
		try {
			web.get(url);
			WebElement registerButton = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
			registerButton.click();
			WebElement inputName = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
			inputName.click();
			inputName.sendKeys("Pera");
			
			WebElement inputLastName = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
			inputLastName.click();
			inputLastName.sendKeys("Peric");
			
			WebElement inputPhone = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
			inputPhone.click();
			inputPhone.sendKeys("+38162394009");
			
			WebElement inputUsername = web.findElement(By.xpath("//*[@id=\"userName\"]"));
			inputUsername.click();
			inputUsername.sendKeys("Peki");
			
			WebElement inputAdress = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
			inputAdress.click();
			inputAdress.sendKeys("Kralja Milana 23/3");
			
			WebElement inputCity = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
			inputCity.click();
			inputCity.sendKeys("Belgrade");
			
			WebElement inputState = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
			inputState.click();
			inputState.sendKeys("Serbia");
			
			WebElement inputPostalCode = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"));
			inputPostalCode.click();
			inputPostalCode.sendKeys("11000");
			
			Select country = new Select(web.findElement((By.xpath("//select[@name='country']"))));
            country.selectByVisibleText("SERBIA");
			
			WebElement inputUsername1 = web.findElement(By.xpath("//*[@id=\"email\"]"));
			inputUsername1.click();
			inputUsername1.sendKeys("Peki");
			
			WebElement inputPassword = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
			inputPassword.click();
			inputPassword.sendKeys("11hsahd000");
			
			WebElement inputConfirmPassword = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
			inputConfirmPassword.click();
			inputConfirmPassword.sendKeys("11hsahd000");
			
			WebElement submitButton = web.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
			inputPassword.click();
			
			
			
			
			web.close();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		} finally {
			web.quit();
		}
	}

}
