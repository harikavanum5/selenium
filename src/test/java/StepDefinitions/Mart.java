package StepDefinitions;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Mart {

	WebDriver driver;
	@Given("Open the Browser Open the Browser")
	public void open_the_browser_open_the_browser() throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.indiamart.com");
	driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
	System.out.println("the Screenshot is taken");
//	
	}

	@When("Enter the url {string}")
	public void enter_the_url(String string) {
	   System.out.println("open the browser");
	}

	@When("page navigate to home page")
	public void page_navigate_to_home_page() {
	    
	}

	@Then("click  Eletronics & Electrical")
	public void click_eletronics_electrical() throws InterruptedException, IOException {
	
		
		
		
		
		
		
	  
		driver.findElement(By.xpath("//span[normalize-space()='Electronics & Electrical']")).click();
		TakesScreenshot tsa = (TakesScreenshot)driver;
		File sourcea = tsa.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcea, new File("./Screenshots/Task1.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Solar Panels']")).click();
		TakesScreenshot tsb = (TakesScreenshot)driver;
		File sourceb = tsb.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceb, new File("./Screenshots/Task2.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Solar Lighting']")).click();
		TakesScreenshot tsc = (TakesScreenshot)driver;
		File sourcec = tsc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcec, new File("./Screenshots/Task3.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Electronics & Electrical']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[5]/a[1]")).click();
		
		TakesScreenshot tsd = (TakesScreenshot)driver;
		File sourced = tsd.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourced, new File("./Screenshots/Task4.png"));
		System.out.println("the Screenshot is taken");
		
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Electronics & Electrical']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
		TakesScreenshot tse = (TakesScreenshot)driver;
		File sourcee = tse.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcee, new File("./Screenshots/Task5.png"));
		System.out.println("the Screenshot is taken");
		
		driver.navigate().back();
		Thread.sleep(3000);
	

		driver.findElement(By.xpath("//span[normalize-space()='Drugs & Pharma']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Nutritional Supplements']")).click();
		TakesScreenshot tsf = (TakesScreenshot)driver;
		File sourcef = tsf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcef, new File("./Screenshots/Task6.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Drugs & Pharma']")).click();
		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Weight Gain Nutrition']")).click();
		TakesScreenshot tsg = (TakesScreenshot)driver;
		File sourceg = tsg.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceg, new File("./Screenshots/Task7.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Drugs & Pharma']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[4]")).click();
		TakesScreenshot tsh = (TakesScreenshot)driver;
		File sourceh = tsh.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceh, new File("./Screenshots/Task8.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[normalize-space()='Drugs & Pharma']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Multivitamin Tablet']")).click();
		TakesScreenshot tsi = (TakesScreenshot)driver;
		File sourcei = tsi.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcei, new File("./Screenshots/Task9.png"));
		System.out.println("the Screenshot is taken");
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		////////
		driver.findElement(By.xpath("//span[normalize-space()='Industrial Machinery']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Flat Knitting Machines']")).click();
		TakesScreenshot tsj = (TakesScreenshot)driver;
		File sourcej = tsj.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcej, new File("./Screenshots/Task10.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[normalize-space()='Industrial Machinery']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Industrial Sewing Machine']")).click();
		TakesScreenshot tsk = (TakesScreenshot)driver;
		File sourcek = tsk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcek, new File("./Screenshots/Task11.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[normalize-space()='Industrial Machinery']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Embroidery Machine']")).click();
		TakesScreenshot tsl = (TakesScreenshot)driver;
		File sourcel = tsl.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcel, new File("./Screenshots/Task12.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[normalize-space()='Industrial Machinery']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Home Sewing Machine']")).click();
		TakesScreenshot tsm = (TakesScreenshot)driver;
		File sourcem = tsm.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcem, new File("./Screenshots/Task13.png"));
		System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(3000);
		
		//////
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Industrial Supplies']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Automotive Oils']")).click();
		TakesScreenshot tsn = (TakesScreenshot)driver;
		File sourcen = tsn.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcen, new File("./Screenshots/Task14.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[normalize-space()='Industrial Supplies']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Lubricating Oil']")).click();
		TakesScreenshot tso = (TakesScreenshot)driver;
		File sourceo = tso.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceo, new File("./Screenshots/Task15.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[normalize-space()='Industrial Supplies']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Grease']")).click();
		TakesScreenshot tsp = (TakesScreenshot)driver;
		File sourcep = tsp.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcep, new File("./Screenshots/Task16.png"));
		System.out.println("the Screenshot is taken");
		
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Industrial Supplies']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Compressor Oil']")).click();
		TakesScreenshot tsq = (TakesScreenshot)driver;
		File sourceq = tsq.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceq, new File("./Screenshots/Task17.png"));
		System.out.println("the Screenshot is taken");
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		//////
		
		driver.findElement(By.xpath("//span[normalize-space()='Food & Agriculture']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Green Cardamom']")).click();
		TakesScreenshot tsr = (TakesScreenshot)driver;
		File sourcer = tsr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcer, new File("./Screenshots/Task18.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Food & Agriculture']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Black Pepper']")).click();
		TakesScreenshot tss = (TakesScreenshot)driver;
		File sources = tss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sources, new File("./Screenshots/Task19.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Food & Agriculture']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://dir.indiamart.com/impcat/cardamom.html']")).click();
		TakesScreenshot tst = (TakesScreenshot)driver;
		File sourcet = tst.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcet, new File("./Screenshots/Task20.png"));
		System.out.println("the Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//span[normalize-space()='Food & Agriculture']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Cumin Seeds']")).click();
		TakesScreenshot tsu = (TakesScreenshot)driver;
		File sourceu = tsu.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceu, new File("./Screenshots/Task21.png"));
		System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Food & Agriculture']")).click();
		Thread.sleep(3000);
		
//		
//		
//		
//		
//		
//		
//		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Turmeric']")).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath("//span[normalize-space()='Food & Agriculture']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[normalize-space()='Dry Red Chilli']]")).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath("//span[normalize-space()='Food & Agriculture']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[normalize-space()='Tamarind']]")).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath("//span[normalize-space()='Food & Agriculture']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[normalize-space()='Turmeric Powder']")).click();
//		driver.navigate().back();
//		driver.findElement(By.xpath("//span[normalize-space()='Food & Agriculture']")).click();
//		Thread.sleep(3000);
//		//
//		driver.findElement(By.xpath("//span[normalize-space()='Building & Construction']")).click();
//		
//		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Plywoods']")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		
//driver.findElement(By.xpath("//span[normalize-space()='Building & Construction']")).click();
//		
//		driver.findElement(By.xpath("//a[normalize-space()='Laminate Sheets']")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		
//driver.findElement(By.xpath("//span[normalize-space()='Building & Construction']")).click();
//		
//		driver.findElement(By.xpath("//a[normalize-space()='Wood Boards']")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//driver.findElement(By.xpath("//span[normalize-space()='Building & Construction']")).click();
//		
//		driver.findElement(By.xpath("//a[normalize-space()='Wall Panels']")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//driver.findElement(By.xpath("//span[normalize-space()='Building & Construction']")).click();
//		
//		driver.findElement(By.xpath("//div[@class='col-md-2']//a[normalize-space()='Hardwood']")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		

	}
	}



