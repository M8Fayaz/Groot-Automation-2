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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Velan4 {WebDriver driver;
XSSFWorkbook wbook;
XSSFSheet sheet;
XSSFRow row;


String applyingfor;
String firstname;
String lastname;
String Cast;
String PreviousSchoolName;
double PassedOutYear;
String AggregatrGrade;
String Fathername;
String FatehrOccupation;
double Fmi;
double FatherMobileNumber;
String Mothername;
String MotherOccupation;
double MotherMonthlyIncome;
double MotherMobileNumber;
String reAddress;
String perAddress;
double Phonenum;
String Email;
double whatsappno;





@Test(priority=0)
public void ExcelDatas() throws InterruptedException {
  
  
  


  
  XSSFCell cell=row.getCell(0);
  applyingfor=cell.getStringCellValue();
  
  
  XSSFCell cell1=row.getCell(1);
  firstname=cell1.getStringCellValue();
  
  
  XSSFCell cell2=row.getCell(2);
  lastname=cell2.getStringCellValue();
  
  
  XSSFCell cell3=row.getCell(3);
  Cast=cell3.getStringCellValue();
  
  XSSFCell cell4=row.getCell(4);
  PreviousSchoolName=cell4.getStringCellValue();
  
  XSSFCell cell5=row.getCell(5);
  PassedOutYear=cell5.getNumericCellValue();
  
  XSSFCell cell6=row.getCell(6);
  AggregatrGrade=cell6.getStringCellValue();
  
  XSSFCell cell7=row.getCell(7);
  Fathername=cell7.getStringCellValue();
  
  XSSFCell cell8=row.getCell(8);
  FatehrOccupation=cell8.getStringCellValue();
  
  XSSFCell cell9=row.getCell(9);
  Fmi=cell9.getNumericCellValue();
  
  XSSFCell cell10=row.getCell(10);
  FatherMobileNumber=cell10.getNumericCellValue();
  
  XSSFCell cell11=row.getCell(11);
  Mothername=cell11.getStringCellValue();
  
  XSSFCell cell12=row.getCell(12);
  MotherOccupation=cell12.getStringCellValue();
  
  XSSFCell cell13=row.getCell(13);
  MotherMonthlyIncome=cell13.getNumericCellValue();
  
  XSSFCell cell14=row.getCell(14);
  MotherMobileNumber=cell14.getNumericCellValue();
  
  XSSFCell cell15=row.getCell(15);
  reAddress=cell15.getStringCellValue();
  
  XSSFCell cell16=row.getCell(16);
  perAddress=cell16.getStringCellValue();
  
  XSSFCell cell17=row.getCell(17);
  Phonenum=cell17.getNumericCellValue();
  
  XSSFCell cell18=row.getCell(18);
  Email=cell18.getStringCellValue();
  
  XSSFCell cell19=row.getCell(19);
  whatsappno=cell19.getNumericCellValue();
}
  
  
  
  
  

  

  
 @Test(priority=1)
 public void Login() throws InterruptedException {
 
  
  driver.findElement(By.cssSelector("#mat-input-0")).sendKeys("jainulfayazdeen@m8itsolutions.com");
  driver.findElement(By.cssSelector("#password")).sendKeys("123456");
  driver.findElement(By.xpath("(//span)[12]")).click();
  Thread.sleep(5000);
 }
 
 @Test(priority=2)
 public void AdmissionManageMent() throws InterruptedException {
	 
  driver.findElement(By.xpath("(//span)[8]")).click();
  Thread.sleep(2000L);
 }
 
 @Test(priority=3)
 public void AdmissionEnq() throws InterruptedException {
	 
  driver.findElement(By.xpath("(//span)[9]")).click();
  Thread.sleep(2000L);
 }
 
 @Test(priority=4)
 public void CreatAdmission() throws InterruptedException {
	 
  driver.findElement(By.xpath("(//button)[4]")).click();
  Thread.sleep(2000L);
 }
 
 @Test(priority=5)
 public void StdInfo() throws InterruptedException {
  driver.findElement(By.xpath("(//div)[81]")).click();
  Thread.sleep(3000L);
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
//  System.out.println(a);
  driver.findElement(By.xpath("(//input)[7]")).sendKeys(a);
  driver.findElement(By.xpath("(//input)[8]")).sendKeys(AggregatrGrade);
  //Thread.sleep(3000L);
  String IMGfilepath="E:\\eclips work files\\GrootWebApplication\\student image\\istockphoto-1131873200-612x612.jpg";
  driver.findElement(By.xpath("(//input)[5]")).sendKeys(IMGfilepath);
  
  Thread.sleep(3000);
  driver.findElement(By.xpath("(//button)[5]")).click();
 }
 
 @Test(priority=6)
 public void FamilyDetails() throws InterruptedException {
  //Thread.sleep(3000);
  driver.findElement(By.xpath("(//input)[9]")).sendKeys(Fathername);
  driver.findElement(By.xpath("(//input)[10]")).sendKeys(FatehrOccupation);
  Thread.sleep(2000L);
  String b= String.valueOf(Fmi).replace(".0","");
  //driver.findElement(By.xpath("(//input)[11]")).click();
//  System.out.println(b.replace(".", ""));
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
  driver.findElement(By.xpath("(//button)[7]")).click();
  
 }
  
  
  
  
  @Test(priority=7)
  public void Sibilings() throws InterruptedException {
	  
	  driver.findElement(By.xpath("(//span)[227]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input)[22]")).sendKeys("karan");
	  driver.findElement(By.xpath("(//div)[326]")).click();
	  driver.findElement(By.xpath("//div[@role='listbox']//mat-option[@value='Male']")).click();
	  driver.findElement(By.xpath("(//button)[10]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//div)[481]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//input)[24]")).sendKeys("PRE KG");
	  driver.findElement(By.xpath("(//button)[12]")).click();
  }
  
  @Test(priority=8)
  public void Declaration() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//label[@class='mat-checkbox-layout']")).click();
	  
	  //driver.findElement(By.xpath("(//span)[242]")).click();
	  //driver.findElement(By.xpath("(//button)[12]")).click();
  }
  
  
  
  
  
  
  
  	
  
  
  
  
  

@BeforeSuite
public void beforeClass() throws IOException {
  System.setProperty("webdriver.chrome.driver","E:\\eclips\\chrome driver\\chromedriver.exe");
  driver = new ChromeDriver();
  String fileLocation = "E:\\eclips work files\\GrootWebApplication\\test-data\\student-data.xlsx";
  wbook = new XSSFWorkbook(fileLocation);
  sheet=wbook.getSheetAt(0);
  row=sheet.getRow(1);
  
  
  
  driver.manage().window().maximize();
  driver.get("http://admin1.grootems.com/login?token=TUNOUzAwMDIzNDIz");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
}

@AfterSuite
public void afterClass() {
  driver.quit();
}

}