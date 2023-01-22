package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass<TakesScreenshot> {
		
		public static final int x = 0;
		public static final JavascriptExecutor JavascriptExecutor = null;
		protected static WebDriver driver;
		
		//1.url
		public static void enterAppInUrl(String url) {
		
			driver.get(url);
		}
		//2.Maximize Window
		public static void maximizeWindow() {
		driver.manage().window().maximize();
		}
		//3.insertvalue in textbox
		public void elementSendKeys(WebElement element,String data) {
		element.sendKeys(data);
		}
		
		//4.click button
		public void elementClick(WebElement element) {
		element.click();
		}
		//5.click ok in alertbox
		public void clickOk() {
		Alert a1= driver.switchTo().alert();
		a1.accept();
		}
		//6.click cancel in alertbox
		public void clickCancel() {
		Alert a1= driver.switchTo().alert();
		a1.dismiss();
		}
		//7.get the text from webpage
		public String elementText(WebElement element) {
		String text = element.getText();
		return text;
		}
		//8.Get the Inserted value from textbox
		public String elementGetAttribute(WebElement element) {
		String text = element.getText();
		return text;
		}
		//9.close all Windows
		public void quiteWindow() {
		driver.quit();
		}
		//10.close Current Window
		public static void closeWindow() {
		driver.close();
		}
		//11.get the title
		public String getAppInTitle() {
		String title = driver.getTitle();
		return title;
		}
		//12.get the entered url
		public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
		//13.select dropdown option by text
		
		public void dropDownByText(WebElement element,String data) {
		Select s=new Select(element);
		s.selectByVisibleText(data);
		}
		//14.select dropdown option by attribute
		public void dropDownByValue(WebElement element,String data) {
		Select s=new Select(element);
		s.selectByValue(data);
		}
		//15.select dropdown option by index
		public void dropDownIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
		}
		//16.Insert value in textbox using js
		public void elementSendKeysJs(WebElement element,String data) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].setAttribute('value','"+data+"')", element);
		}
		//17.click button by js
		public void cliclJs(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("argument[0].click()", element);
	}
		//18.launch the ChromeBrowser
		public static void getChromeDriver() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
		
		//19.Switch to childWindow
		public void childWindow(String childWindoowId) {
		driver.switchTo().window(childWindoowId);
		}
		//20.switch to frame by index
		public void frameIndex(int index) {
		driver.switchTo().frame(index);
		}
		//21.switch to frame by frameId
		public void frameId(String id) {
		driver.switchTo().frame(id);
		}
		//22.Find Locator by Id
		public WebElement findElementById(String attibutevalue) {
		WebElement element = driver.findElement(By.id(attibutevalue));
		return element;
		}
		//23.Find Locator by name
		public WebElement findElementByName(String attibutevalue) {
			WebElement element = driver.findElement(By.name(attibutevalue));
			return element;
			}
		//24.Find locator by classname
		public WebElement findElementByClassName(String attibutevalue) {
			WebElement element = driver.findElement(By.className(attibutevalue));
			return element;
			}
		//25.Find locator by xpath 
		public WebElement findElementByXpath(String XpathExp) {
			WebElement element = driver.findElement(By.xpath(XpathExp));
			return element;
			}
		//26.Get All options dropdown as text
		public void selectAllOptions(WebElement element) {
			Select select=new Select(element);
			select.getOptions();
			}
		///27.Get All options dropdown as attributevalue
		public WebElement selectAllOptionsAttributeValue(WebElement element) {
			Select select=new Select(element);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			return element;
			}
		//28.Get the First Selected option text in dropdown
		public WebElement getFirstSelectedOption(WebElement element) {
	       Select select=new Select(element);
	       WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
		}
		//29.verify in dropdown is multiselected option
		public void multiSelectedOptions(WebElement element) {
			Select select=new Select(element);
			boolean multiple = select.isMultiple();
		}
		//30.ImplicitWait
		public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		}		
		
		//31.ExplicitWait for Vivibility of
		public void explicitWait(long seconds) {
			WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		}
		//32.FluentWait
		//public void fluentWait(long time ,Timeunit unit,int withTimeout) {
		//Wait w=new FluentWait(driver).withTimeout(100,TimeUnit.SECONDS).
		//}
		//33.Verify is Displayed
		public boolean isDisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			return displayed;
		}
		//34.Verify is Enabled	
		public boolean isEnabled(WebElement element) {
			boolean enabled = element.isEnabled();
			return enabled;
			}
		//35.verify is Selected
		public boolean isSelected(WebElement element) {
			boolean selected = element.isSelected();
			return selected;
			}
		//36.Deselect by Index
		public void deselectByIndrx(WebElement element, int index) {
			Select s=new Select(element);
			s.deselectByIndex(index);
			}
		//37.DeselectByAttribute
		public void deselectByAttribute(WebElement element, String value) {
			Select s=new Select(element);
			s.deselectByValue(value);
			}
		//38.Deselect By Text
		public void deselectByText(WebElement element,String  text) {
			Select s=new Select(element);
			s.deselectByVisibleText(text);
			}
		//39.DeselectAll
		public void deselectAll(WebElement element) {
			Select s=new Select(element);
			s.deselectAll();
			}
		//40.Get the ParentWindow
		public String parWindoeGent() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
			}
		//41.Get the all Windows
		public Set<String> allWindow(WebElement element) {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
			}
		//42.clear textbox
		public void clearTextBox(WebElement element) {
			element.clear();
			}
		public void TakesScreenshot(WebElement elemen) {
			//TakesScreenshot screenshot=(TakesScreenshot)driver;
			//File file =screenshot.getScreenshotAs(OutputType.FILE);
			

		}
		//public void takescreeshotElement(WebElement element, ) {
			//element.getScreenshotAs(target)

		//}
		
		public WebElement singleOptionMouseover(WebElement element) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
			return element;
			}			
	

public static void updatecellData(String sheetName,int rowNum,int cellNum, String oldData,String newData) throws IOException {
		
		File file=new File("C:\\Users\\anand\\eclipse-workspace\\FrameWork1stDay\\ExcelDatas\\Worksheet.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			workbook.write(fileOutputStream);
			
		}
			
		}
	
		public static void writeCellData(String sheetName,int rowNum,int cellNum, String Data) throws IOException {
			File file=new File("C:\\Users\\anand\\eclipse-workspace\\FrameWork1stDay\\ExcelDatas\\Worksheet.xlsx");
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.createCell(cellNum);
			cell.setCellValue(Data);
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			workbook.write(fileOutputStream);
			
		}
		public String getDataFromcell(String sheetName,int rowNum,int cellNum) throws IOException {

			String res=null;
			
			File file=new File("C:\\Users\\anand\\eclipse-workspace\\FrameWork1stDay\\ExcelDatas\\Worksheet.xlsx");
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			CellType type = cell.getCellType();
			switch (type) {
			case STRING:
				res = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MMM/yy");
					res= dateFormat.format(dateCellValue);
					
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long check = Math.round(numericCellValue);
					if (check==numericCellValue) {
						res = String.valueOf(check);
						
					}else{
						
						res = String.valueOf(numericCellValue);
					}
				}
				break;
			default:
				break;
			}
			return res;			
		}		
	}

