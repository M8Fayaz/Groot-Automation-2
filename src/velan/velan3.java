package velan;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class velan3 {
	
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException, IOException {
		  
		  String fileLocation = "E:\\eclips work files\\GrootWebApplication\\test-data\\student-data.xlsx";
		  XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		  XSSFSheet sheet=wbook.getSheetAt(0);
		  
		  XSSFRow row=sheet.getRow(1);
		  
		  
		  XSSFCell cell=row.getCell(0);
		  String applyingfor=cell.getStringCellValue();
		  System.out.println(applyingfor);
		  
		  XSSFCell cell1=row.getCell(1);
		  String firstname=cell1.getStringCellValue();
		  
		  
		  XSSFCell cell2=row.getCell(2);
		  String lastname=cell2.getStringCellValue();
		  
		  
		  XSSFCell cell3=row.getCell(3);
		  String Cast=cell3.getStringCellValue();
		  
		  XSSFCell cell4=row.getCell(4);
		  String PreviousSchoolName=cell4.getStringCellValue();
		  
		  XSSFCell cell5=row.getCell(5);
		  double PassedOutYear=cell5.getNumericCellValue();
		  
		  XSSFCell cell6=row.getCell(6);
		  String AggregatrGrade=cell6.getStringCellValue();
		  
		  XSSFCell cell7=row.getCell(7);
		  String Fathername=cell7.getStringCellValue();
		  
		  XSSFCell cell8=row.getCell(8);
		  String FatehrOccupation=cell8.getStringCellValue();
		  
		  XSSFCell cell9=row.getCell(9);
		  double Fmi=cell9.getNumericCellValue();
		  
		  XSSFCell cell10=row.getCell(10);
		  double FatherMobileNumber=cell10.getNumericCellValue();
		  
		  XSSFCell cell11=row.getCell(11);
		  String Mothername=cell11.getStringCellValue();
		  
		  XSSFCell cell12=row.getCell(12);
		  String MotherOccupation=cell12.getStringCellValue();
		  
		  XSSFCell cell13=row.getCell(13);
		  double MotherMonthlyIncome=cell13.getNumericCellValue();
		  
		  XSSFCell cell14=row.getCell(14);
		  double MotherMobileNumber=cell14.getNumericCellValue();
		  
		  XSSFCell cell15=row.getCell(15);
		  String reAddress=cell15.getStringCellValue();
		  
		  XSSFCell cell16=row.getCell(16);
		  String perAddress=cell16.getStringCellValue();
		  
		  XSSFCell cell17=row.getCell(17);
		  double Phonenum=cell17.getNumericCellValue();
		  
		  XSSFCell cell18=row.getCell(18);
		  String Email=cell18.getStringCellValue();
		  
		  XSSFCell cell19=row.getCell(19);
		  double whatsappno=cell19.getNumericCellValue();
		  
		  
		  
		  
		  

		  

		  
		 
		  
		  driver.findElement(By.cssSelector("#mat-input-0")).sendKeys("jainulfayazdeen@m8itsolutions.com");
		  driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		  driver.findElement(By.xpath("(//span)[12]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("(//span)[8]")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("(//span)[9]")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("(//button)[4]")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("(//div)[81]")).click();
		  Thread.sleep(3000L);
		  //driver.findElement(By.xpath("(//span)[344]")).click();
		  driver.findElement(By.xpath(applyingfor)).click();
		  
		  
		  driver.findElement(By.xpath("(//input)[1]")).sendKeys(firstname);
		  Thread.sleep(3000L);
		  
		  driver.findElement(By.xpath("(//input)[2]")).sendKeys(lastname);
		  Thread.sleep(3000L);
		  driver.findElement(By.xpath("(//button)[4]")).click();
		  driver.findElement(By.xpath("(//div)[424]")).click();
		  driver.findElement(By.xpath("(//div)[118]")).click();
		  driver.findElement(By.xpath("//div[@role='listbox']//mat-option[@value='male']")).click();
		  driver.findElement(By.xpath("(//div)[130]")).click();
		  driver.findElement(By.xpath("//div[@role='listbox']//mat-option[@value='O+']")).click();
		  driver.findElement(By.xpath("(//div)[142]")).click();
		  driver.findElement(By.xpath("//div[@role='listbox']//mat-option[@value='Others']")).click();
		  driver.findElement(By.xpath("(//div)[154]")).click();
		  driver.findElement(By.xpath("//div[@role='listbox']//mat-option[@value='OC']")).click();
		  driver.findElement(By.xpath("(//input)[4]")).sendKeys(Cast);
		  driver.findElement(By.xpath("(//input)[6]")).sendKeys(PreviousSchoolName);
		  Thread.sleep(2000L);
		  String a = String.valueOf(PassedOutYear);
//		  System.out.println(a);
		  driver.findElement(By.xpath("(//input)[7]")).sendKeys(a);
		  driver.findElement(By.xpath("(//input)[8]")).sendKeys(AggregatrGrade);
		  //Thread.sleep(3000L);
		  driver.findElement(By.xpath("(//button)[5]")).click();
		  //Thread.sleep(3000);
		  driver.findElement(By.xpath("(//input)[9]")).sendKeys(Fathername);
		  driver.findElement(By.xpath("(//input)[10]")).sendKeys(FatehrOccupation);
		  Thread.sleep(2000L);
		  String b= String.valueOf(Fmi).replace(".0","");
		  //driver.findElement(By.xpath("(//input)[11]")).click();
//		  System.out.println(b.replace(".", ""));
		  driver.findElement(By.xpath("(//input)[11]")).sendKeys(b);
		  Thread.sleep(3000L);
		  String c=String.valueOf(FatherMobileNumber);
		  driver.findElement(By.xpath("(//input)[12]")).sendKeys(c);
		  driver.findElement(By.xpath("(//input)[13]")).sendKeys(Mothername);
		  driver.findElement(By.xpath("(//input)[14]")).sendKeys(MotherOccupation);
		  Thread.sleep(2000);
		  String d=String.valueOf(MotherMonthlyIncome).replace(".0","");
		  driver.findElement(By.xpath("(//input)[15]")).sendKeys(d);
		  String e=String.valueOf(MotherMobileNumber);
		  driver.findElement(By.xpath("(//input)[16]")).sendKeys(e);
		  driver.findElement(By.xpath("(//input)[17]")).sendKeys(reAddress);
		  driver.findElement(By.xpath("(//input)[18]")).sendKeys(perAddress);
		  String f=String.valueOf(Phonenum);
		  driver.findElement(By.xpath("(//input)[19]")).sendKeys(f);
		  driver.findElement(By.xpath("(//input)[20]")).sendKeys(Email);
		  String g=String.valueOf(whatsappno);
		  driver.findElement(By.xpath("(//input)[21]")).sendKeys(g);
		  //driver.findElement(By.xpath("(//span)[222]")).click();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  	
		  
		  
		  
		  
		  
	  }
	  @BeforeSuite
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","E:\\eclips\\chrome driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://admin1.grootems.com/login?token=TUNOUzAwMDIzNDIz");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }

	  @AfterSuite
	  public void afterClass() {
		  driver.quit();
	  }

	}
