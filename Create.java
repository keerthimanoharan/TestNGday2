package Testing;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Create extends Common {
	@Test(dataProvider="fetchdata")
	
		public void createLead(String cname,String fname, String lname){
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			driver.findElement(By.name("submitButton")).click();
		}
//		@DataProvider
//		public String[][] fetchdata() throws IOException{
//		return ReadXcelfile.xceldata();
	
@BeforeClass
public void callFile() {
	filename="SampletestNG";
}}

