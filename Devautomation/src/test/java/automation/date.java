package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class date {
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aysha Areej\\Downloads\\Compressed\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev.iscuw.org/portal/users/sign_in");
	WebElement username=driver.findElement(By.id("user_username"));
	WebElement password=driver.findElement(By.id("user_password"));
	WebElement login=driver.findElement(By.name("commit"));
	username.sendKeys("director@iscuw.org");
	password.sendKeys("LLCopexA123&*");
	login.click();
	WebElement programs=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[2]/ul/li[5]/a/img"));
	programs.click();
	driver.get("https://dev.iscuw.org/portal/weeks/new");
	WebElement date=driver.findElement(By.id("week_week_ending"));
	String dateval="2021-09-13";
	
	SelectDatebyJS(driver,date, dateval);
	driver.navigate().to("https://dev.iscuw.org/portal/applications");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/img")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/a")).click();
	
	driver.get("https://dev.iscuw.org/portal/users/sign_in");
	WebElement username1=driver.findElement(By.id("user_username"));
	WebElement password1=driver.findElement(By.id("user_password"));
	WebElement admin=driver.findElement(By.name("commit"));
	username1.sendKeys("admin@iscuw.org");
	password1.sendKeys("LLCopexA123&*");
	admin.click();
	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[1]/ul/li[2]/a/span")).click();
	driver.navigate().to("https://dev.iscuw.org/admin/projects");
	driver.findElement(By.xpath("/html/body/div[1]/nav/a[11]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/main/header/div/a")).click();
	driver.findElement(By.xpath("//*[@id=\"project_project_name\"]")).sendKeys("Project E");
	driver.findElement(By.xpath("//*[@id=\"project_active\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"new_project\"]/div[3]/input")).submit();
	
	driver.findElement(By.xpath("/html/body/div[1]/nav/a[12]")).click();
	
	driver.findElement(By.xpath("/html/body/div[1]/main/header/div/a")).click();
	Select dropdown = new Select(driver.findElement(By.id("project_assignment_project_id")));  
	dropdown.selectByVisibleText("Project E"); 
	Select dropdown1 = new Select(driver.findElement(By.id("project_assignment_user_id")));  
	dropdown1.selectByVisibleText("director@iscuw.org (#104)"); 
	driver.findElement(By.xpath("//*[@id=\"project_assignment_role\"]")).sendKeys("Director");
	driver.findElement(By.xpath("//*[@id=\"project_assignment_from\"]")).sendKeys("2021-09-13");
    driver.findElement(By.xpath("//*[@id=\"project_assignment_until\"]")).sendKeys("2021-09-17");
    driver.findElement(By.xpath("//*[@id=\"project_assignment_max_regular_day\"]")).sendKeys("6");
    driver.findElement(By.xpath("//*[@id=\"project_assignment_max_ot_day\"]")).sendKeys("2");
    driver.findElement(By.xpath("//*[@id=\"new_project_assignment\"]/div[8]/input")).submit();
    driver.findElement(By.xpath("/html/body/div[1]/nav/a[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/div/ul/li[2]/a")).click();
    
    
    driver.get("https://dev.iscuw.org/portal/users/sign_in");
	WebElement username2=driver.findElement(By.id("user_username"));
	WebElement password2=driver.findElement(By.id("user_password"));
	WebElement login1=driver.findElement(By.name("commit"));
	username2.sendKeys("director@iscuw.org");
	password2.sendKeys("LLCopexA123&*");
	login1.click();
	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[2]/ul/li[5]/a")).click();
	driver.get("https://dev.iscuw.org/portal/weeks/new");
	WebElement date1=driver.findElement(By.id("week_week_ending"));
	String dateval1="2021-09-13";
	date1.click();
	SelectDatebyJS1(driver,date1, dateval1);
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")).click();
	 //driver.findElement(By.xpath("//*[@id=\"week_week_roles_attributes_1_time_records_attributes_0_hours_regular\"]")).sendKeys("6");
	 //driver.findElement(By.xpath("//*[@id=\"week_week_roles_attributes_1_time_records_attributes_0_hours_ot\"]")).sendKeys("2");
	//driver.findElement(By.xpath("//*[@id=\"week_week_roles_attributes_1_time_records_attributes_1_hours_regular\"]")).sendKeys("8");
	//driver.findElement(By.xpath("//*[@id=\"week_week_roles_attributes_1_time_records_attributes_1_hours_ot\"]")).sendKeys("3");
	//driver.findElement(By.xpath("//*[@id=\"new_week\"]/div/input[2]")).click();
	//driver.findElement(By.xpath("//*[@id=\"new_week\"]/div/input[3]")).submit();
	driver.get("https://dev.iscuw.org/portal/weeks");
	
	WebElement date2=driver.findElement(By.id("q_week_ending_eq"));
	String dateval2="2021-09-13";
	date2.click();
	SelectDatebyJS2(driver,date2, dateval2);
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")).click();
	
	//For Approving
	//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/table/tbody/tr[35]/td[13]/form/input[1]")).submit();
	
	
	
	
	
	
	
	 
	


	
	}
	public static void SelectDatebyJS(WebDriver driver, WebElement element,String dateval) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
		}
	
	public static void SelectDatebyJS1(WebDriver driver, WebElement element,String dateval1) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval1+"');",element);}
	

	public static void SelectDatebyJS2(WebDriver driver, WebElement element,String dateval2) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval2+"');",element);}
	
	}
