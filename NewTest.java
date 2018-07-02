package com.Cloud;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.sql.Timestamp;
import org.openqa.selenium.Keys;
import java.sql.Time;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import bsh.BshClassManager.Listener;

import java.io.File;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;

import org.testng.ITestListener;

import org.testng.ITestResult;
import java.io.BufferedWriter;

import java.io.FileWriter;


import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.testng.IInvokedMethod;

import org.testng.IResultMap;

import org.testng.ISuiteResult;
import org.testng.ITestClass;


import org.testng.Reporter;
import org.testng.collections.Lists;
import org.testng.internal.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class NewTest  {
 
	Properties prop = new Properties();
	WebDriver driver = new FirefoxDriver();
	static Date date = new Date();


	public void ReadFile() {
		File file = new File("D:/SeleniumTest/Selie/configs/Configuration.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	
	
	
	@Test(priority = 1)
	public void Product_valueset_Creation() {
		// TODO Auto-generated method stub
		try {
//			
			ReadFile();		
			
			TimeUnit.SECONDS.sleep(15);
			driver.get(prop.getProperty("url"));
			driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.id("btnActive")).click();
			TimeUnit.SECONDS.sleep(15);
			if(driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
				System.out.println("Login Successfull");//home button exists
			 
			//waiting
			 TimeUnit.SECONDS.sleep(25);
			 
			 //clicking the menu
			 driver.findElement(By.id("pt1:_UIScmil1u::icon")).click();
			 System.out.println("Menu clicked");
			 
			//waiting
			 TimeUnit.SECONDS.sleep(3);
			 
			 //selecting setup and maintenance
			 driver.findElement(By.linkText("Setup and Maintenance...")).click();
			 System.out.println("Navigated to Setup and Maintenance");
			 
			 //waiting
			 TimeUnit.SECONDS.sleep(5);
			 
			 //clicking setup value
			 driver.findElement(By.xpath(".//*[@id='pt1:r1:0:r0:0:r1:0:AP1:soc2::drop']")).click();
			 
			 //waiting
			 TimeUnit.SECONDS.sleep(2);
			 
			 //clicking Product Management
			 driver.findElement(By.xpath(".//*[@id='pt1:r1:0:r0:0:r1:0:AP1:soc2::pop']/li[14]")).click();
			 TimeUnit.SECONDS.sleep(6);
			 System.out.println("Navigated to Product Management");
			 
			 //waiting
			 TimeUnit.SECONDS.sleep(3);
			 
			 //entering search field
			 driver.findElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content")).sendKeys("Manage product and child value");
			 
			 //click search icon
			 driver.findElement(By.xpath(".//*[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3']/a")).click();
			 
			 //waiting
			 TimeUnit.SECONDS.sleep(10);
			 
			 //clicking search result
			 driver.findElement(By.xpath(".//*[@id='pt1:r1:0:r0:0:r1:0:AP1:AT1:_ATp:t1:2:cl4']")).click();
			 
			 //waiting
			 TimeUnit.SECONDS.sleep(10);
			 
			 //clicking + to add row
			 driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:AT1:_ATp:create::icon']")).click();
			 System.out.println("Adding new row");
			 
			//waiting
			 TimeUnit.SECONDS.sleep(7);
			 
			 //creating new value set
//			 driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:it11::content")).sendKeys("Color_value_set");
//			 driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:it6::content")).sendKeys("Color value sets");
		
			    SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyhhmmss");  
			    Date date = new Date();  
			    String dx=formatter.format(date).toString();
			    String d=dx;
			 driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:it11::content")).sendKeys(prop.getProperty("Value_Set_Code")+dx);
			 driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:it6::content")).sendKeys(prop.getProperty("Value_set_code_Description")+dx);
			 System.out.println("Appending date and timestamp");
			 
			 //waiting
			 TimeUnit.SECONDS.sleep(3);
			 
			WebElement dropdown = driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:userModuleNameId::lovIconId']"));
			dropdown.click();
			
			TimeUnit.SECONDS.sleep(3);
			
			driver.findElement(By.linkText("Search...")).click();
			TimeUnit.SECONDS.sleep(2);
			
//			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:userModuleNameId::_afrLovInternalQueryId:value00::content']")).sendKeys("Items");
			
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:userModuleNameId::_afrLovInternalQueryId:value00::content']")).sendKeys(prop.getProperty("Module"));
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:userModuleNameId::_afrLovInternalQueryId::search']")).click();
			
			 
			
			
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:userModuleNameId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]")).click();
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:userModuleNameId::lovDialogId::ok']")).click();
			TimeUnit.SECONDS.sleep(3);
			
			//validation type
			Select dropdown_validation = new Select(driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:soc3::content")));
			dropdown_validation.selectByVisibleText("Independent");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("Validation type : Independent");
			
			//Value data type
			Select dropdown_data_type= new Select(driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:soc2::content")));
			dropdown_data_type.selectByVisibleText("Character");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("Validation data type : Character");
			
			//Definiton -  Value subtype
			Select dropdown_subtype= new Select(driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:soc4::content")));
			dropdown_subtype.selectByVisibleText("Text");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("Value subtype : Text");
			
			//max length
//			driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:it7::content")).sendKeys("30");
			driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:it7::content")).sendKeys(prop.getProperty("Max_length"));
			TimeUnit.SECONDS.sleep(5);
			
			
			//clicking on save
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:APsv']")).click();
			TimeUnit.SECONDS.sleep(8);
			
			//clicking manage values
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:manvals']")).click();
			TimeUnit.SECONDS.sleep(7);
			
			//adding
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:AT1:_ATp:create::icon']")).click();
			TimeUnit.SECONDS.sleep(8);
			
			//adding a new value
			driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:AT1:_ATp:ATt1:0:ot5::content")).sendKeys(prop.getProperty("Value"));
			driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:AT1:_ATp:ATt1:0:ot7::content")).sendKeys(prop.getProperty("Value_desc"));
			TimeUnit.SECONDS.sleep(8);
			
			//Save
			
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:APsv']")).click();
			TimeUnit.SECONDS.sleep(10);
			
			//save and close
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:2:pt1:AP1:APscl']")).click();
			TimeUnit.SECONDS.sleep(10);
			
			//Save and close
			driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pt1:AP2:APscl']")).click();
			TimeUnit.SECONDS.sleep(10);
		
			//checking if valueset is created or not
			driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:qryId1:value00::content")).sendKeys(prop.getProperty("Value_Set_Code")+d);
			driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:AP1:qryId1::search")).click();
			TimeUnit.SECONDS.sleep(10);
			System.out.println("Test case for value set creation and value set values successfull");
//			//home
//			driver.findElement(By.id("pt1:_UIShome::icon")).click();
//			TimeUnit.SECONDS.sleep(4);
		
			
			/*WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
			home.click();
			*/
			//signout
			
			driver.findElement(By.id("pt1:_UIScmil1u::icon")).click();
			TimeUnit.SECONDS.sleep(8);
			driver.findElement(By.id("pt1:_UISlg1")).click();
			TimeUnit.SECONDS.sleep(8);
			driver.findElement(By.id("Confirm")).click();
			TimeUnit.SECONDS.sleep(8);
			
			
			//Testcase passed
			System.out.println("Testcase for valueset creation and valueset values: Passed");
			Reporter.log("Testcase for valueset creation and valueset values: Passed");
			driver.close();
			
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				System.out.println("Testcase for valueset creation and valueset values: Failed");
				e1.printStackTrace();
				
				
			}
		
		

	}
	 
	 
	 // ////@Test(priority = 2)
		public void ImportMaps()
		{
			try
			{
				

			Date date = new Date();
			long time = date.getTime();
			Timestamp ts = new Timestamp(time);
			//System.out.println("Current time stamp: "+ ts);
			
			WebDriver driver = new FirefoxDriver();

			ReadFile();
			TimeUnit.SECONDS.sleep(15);
			driver.get(prop.getProperty("url"));
			driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.id("btnActive")).click();
			TimeUnit.SECONDS.sleep(15);
			if (driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
				System.out.println("Login Successfull");// home button exists

			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("pt1:_UISmmLink::icon")).click();// click on Navigator
									//Waiting
			TimeUnit.SECONDS.sleep(10);
			
			//PIM
			driver.findElement(By.id(prop.getProperty("pim"))).click();
			System.out.println("Open Product Information Management");
			
			//Waiting
				TimeUnit.SECONDS.sleep(30);
				
			//Click on Tasks
			driver.findElement(By.id(prop.getProperty("taskbar"))).click();
	        System.out.println("Open Tasks");
			
	        //Waiting
					TimeUnit.SECONDS.sleep(20);

			//Click on Manage Import Maps
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl17']")).click();		
			System.out.println("Open Manage Import Maps");
			
			//Waiting
			TimeUnit.SECONDS.sleep(20);
			
			//Click on add button
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:AT1:_ATp:create::icon']")).click();
			System.out.println("Click add import map");
			
			//Waiting
					TimeUnit.SECONDS.sleep(10);
					
			//Enter import Map
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:it1::content']")).sendKeys(prop.getProperty("ImportMap") + ts);		
			System.out.println("Import Map "+ prop.getProperty("ImportMap"));
			
			//Waiting
			TimeUnit.SECONDS.sleep(15);
					
					//click anywhere to enable upload button 
							driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:it2::content']")).sendKeys(prop.getProperty("mapsdescription") + ts);
							System.out.println("Import Map Description");
					
						    //Waiting
							TimeUnit.SECONDS.sleep(10);
			
			//click anywhere to enable upload button 
					driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:it2::content']")).click();
					System.out.println("Enable Upload Button");
			
				    //Waiting
					TimeUnit.SECONDS.sleep(5);
			
					//Upload file
			WebElement uploadElement = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:if1::content']"));
					uploadElement.sendKeys(prop.getProperty("Upload"));
			System.out.println("Upload file "+ prop.getProperty("Upload"));
					
			//Waiting
			TimeUnit.SECONDS.sleep(40);
			
			//Save 
            driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ctb2::popEl']")).click();
System.out.println("Click on save");
           
           //Waiting
           TimeUnit.SECONDS.sleep(5);
           
           //Save and close
            driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:menu1::popup-container']/div")).click();
           
           
           //Waiting
           TimeUnit.SECONDS.sleep(15);
           
           
//Warning
driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:AT1:d1::ok']")).click();
System.out.println("Click ok on warning message");

//Waiting
           TimeUnit.SECONDS.sleep(10);
           



//Check for the import map created
driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:qryId1:value00::content']")).clear();


			//Waiting
			TimeUnit.SECONDS.sleep(5);
			
			//Enter import map created
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:qryId1:value00::content']")).sendKeys(prop.getProperty("ImportMap") + ts);
			
			//Waiting
					TimeUnit.SECONDS.sleep(10);
					
			//Click on search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:qryId1::search']")).click();		
					
					
			//Waiting
			TimeUnit.SECONDS.sleep(20);
			
			//Import Maps Created
			System.out.println("Import Maps created");
			
			//Home
			driver.findElement(By.id("_FOpt1:_UIShome::icon")).click();
			
			//Waiting
					TimeUnit.SECONDS.sleep(20);
					
			//Begin signout
			driver.findElement(By.xpath(".//*[@id='pt1:_UIScmil1u::icon']")).click();
			
			//Waiting
			        TimeUnit.SECONDS.sleep(10);
			        
			//Click on signout
			driver.findElement(By.xpath(".//*[@id='pt1:_UISlg1']")).click();        
			System.out.println("Click on sign out");

			//Waiting
			        TimeUnit.SECONDS.sleep(15);
			
			//Click Confirm
			driver.findElement(By.xpath(".//*[@id='Confirm']")).click();        
			System.out.println("Signed out");
			System.out.println("Import Maps TestCase is Successful");
			
			Reporter.log("Import Maps TestCase is Successful");
			driver.close();
			}
			catch (InterruptedException e1) {
				
				System.out.println("Import Maps testcase failed");
				
				e1.printStackTrace();
		}
		}

	 
	     
	     
	     
	     
	     
		//////@Test(priority = 3)
	     public void Item_AG_PageCreate() {
	    		

	    			try {
	    				WebDriver driver = new FirefoxDriver();

	    				ReadFile();
	    				
	    				String ItemIn = prop.getProperty("Item_Class_Name");
	    				String attrName=prop.getProperty("create_page");
	    				DateFormat dateformat = new SimpleDateFormat("ddMMMyyhhmmss");
	    				Date date = new Date();
	    				String ConvDate = dateformat.format(date).toString();
	    				String ItemName = ItemIn.concat(ConvDate);
	    				String pageAttrName=attrName.concat(ConvDate);
	    				
	    				TimeUnit.SECONDS.sleep(15);
	    				driver.get(prop.getProperty("url"));
	    				driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
	    				driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	    				driver.findElement(By.id("btnActive")).click();
	    				TimeUnit.SECONDS.sleep(15);
	    				if (driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
	    					System.out.println("Login Successfull");// home button exists

	    				TimeUnit.SECONDS.sleep(10);

	    				
	    				// dropdown menu
	    				WebElement dropdown = driver.findElement(By.id(prop.getProperty("userdropdown")));
	    						dropdown.click();
	    						System.out.println("Settings and Actions dropdown Located!");
	    				TimeUnit.SECONDS.sleep(15);
	    				
	    				// link text Setup and Maintenance...
	    				driver.findElement(By.xpath(".//*[@id='pt1:_UIScmi4']")).click();
	    				System.out.println("Setup and Maintenance...");
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				// to go in Product management page
	    				driver.findElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:soc2")).click();
	    				System.out.println("Product management search page");
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				// Clicking on Product management Text
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:r0:0:r1:0:AP1:soc2::pop']/li[14]")).click();
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				// Searching for Manage Item Classes
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content']"))
	    						.sendKeys(prop.getProperty("Manage_Item_Classes"));
	    				System.out.println("Searching for Manage Item Classes");
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				// Click Search
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3']")).click();
	    				System.out.println("Click Search");
	    				TimeUnit.SECONDS.sleep(20);
	    				// clicking on search results
	    				
	    				driver.findElement(By.linkText("Manage Item Classes")).click();
	    				System.out.println("clicking on search results");
	    				TimeUnit.SECONDS.sleep(10);

	    				// adding New Item Class (plus button)
	    				driver.findElement(By
	    						.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:applicationsTreeTable2:_ATTp:ATTtb::oc']/table/tbody/tr/td[1]"))
	    						.click();
	    				System.out.println("Adding New Item Class (locating Plus button)");
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				System.out.println("");
	    				// Naming Item Class
	    				driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:applicationsTreeTable2:it4::content"))
	    						.sendKeys(ItemName);
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				// Giving description
	    				driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:applicationsTreeTable2:it3::content"))
	    						.sendKeys(prop.getProperty("Item_class_Des"));
	    				TimeUnit.SECONDS.sleep(20);

	    				System.out.println("Display Name and Description located");
	    				driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:applicationsTreeTable2:cb1"))
	    						.click();
	    				System.out.println("Item Class 'Save and Add Details'");
	    				TimeUnit.SECONDS.sleep(25);

	    				// Attribute and group Creation
	    				driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:sdi9::disAcr")).click();
	    				System.out.println("Locating on Pages and Attribute Groups");
	    				TimeUnit.SECONDS.sleep(20);

	    				
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r421:1:eCatCxAT:_ATp:selADD']")).click();
	    				System.out.println("Attribute Group Plus button click");
	    				TimeUnit.SECONDS.sleep(20);
	    				
	    				driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r421:1:eCatCxAT:eCatNotCxQRY:value00::content"))
	    						.sendKeys(prop.getProperty("create_Attribute_GroupName"));
	    				TimeUnit.SECONDS.sleep(20);

	    				driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r421:1:eCatCxAT:eCatNotCxQRY:value10::content"))
	    						.sendKeys(prop.getProperty("create_Attribute_GroupName"));
	    				TimeUnit.SECONDS.sleep(20);
	    				
	    				// search button
	    				driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r421:1:eCatCxAT:eCatNotCxQRY::search")).click();
	    				System.out.println("Click Search Attribute Group");
	    				TimeUnit.SECONDS.sleep(20);

	    				driver.findElement(By
	    						.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r421:1:eCatCxAT:eCatNotCxT::db']/table/tbody/tr/td[1]"))
	    						.click();
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r421:1:eCatCxAT:eCatCxApplyB"))
	    						.click();
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				// apply ok
	    				driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r421:1:eCatCxAT:eCatCxOkB")).click();
	    				System.out.println("Attribute Group Added in the Attribute tab");
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				//Save Attribute Group
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:cb1']/a/span")).click();
	    				TimeUnit.SECONDS.sleep(10);

	    				// Page Click
	    				driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:np1:cni2")).click();
	    				System.out.println("Locating to the Page tab");
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				// + Button
	    				driver.findElement(By
	    						.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgAT:_ATp:create::icon']"))
	    						.click();
	    				System.out.println("Click on plus button of page");
	    				TimeUnit.SECONDS.sleep(10);

	    				// dispaly Name
	    				driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgAT:eCatPgCrIT0::content"))
	    						.sendKeys(pageAttrName);
	    				TimeUnit.SECONDS.sleep(10);

	    				// Description Page
	    				driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgAT:eCatPgCrIT3::content"))
	    						.sendKeys(prop.getProperty("create_page_description"));
	    				TimeUnit.SECONDS.sleep(10);

	    				// Data Level
	    				/*driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgAT:eCatPgCrLOV0::lovIconId"))
	    						.click();
	    				TimeUnit.SECONDS.sleep(10);*/
	    				
	    				WebElement dataLevelDropDown = driver.findElement(By.id(prop.getProperty("dataLevelDropDown")));
	    				dataLevelDropDown.click();
	    				TimeUnit.SECONDS.sleep(10);

	    				// Select Item
	    				driver.findElement(By
	    						.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgAT:eCatPgCrLOV0::dropdownPopup::dropDownContent::db']/table/tbody/tr[1]/td"))
	    						.click();
	    				TimeUnit.SECONDS.sleep(20);

	    				// ok button for pages
	    				driver.findElement(
	    						By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgAT:eCatPgBsv']"))
	    						.submit();
	    				System.out.println("Ok button to add the Page");
	    				TimeUnit.SECONDS.sleep(20);

	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:cb1']/a/span")).click();
	    				TimeUnit.SECONDS.sleep(10);

	    				
	    				// Plus button for page
	    				driver.findElement(By
	    						.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgCxAT:_ATp:selADD::icon']"))
	    						.click();
	    				System.out.println("Adding page specific Attribute Group");
	    				TimeUnit.SECONDS.sleep(20);

	    				// Name-PAge
	    				driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgCxAT:eCatPgNCxQRY:value00::content"))
	    						.sendKeys(prop.getProperty("create_pageGroup_attribute"));
	    				TimeUnit.SECONDS.sleep(20);

	    				driver.findElement(
	    						By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgCxAT:eCatPgNCxQRY::search"))
	    						.click();
	    				TimeUnit.SECONDS.sleep(10);
	    				driver.findElement(By
	    						.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgCxAT:eCatPgNCxT::db']/table/tbody/tr/td[1]"))
	    						.click();
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				// Apply
	    				driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgCxAT:eCatPgCxBap"))
	    						.click();
	    				System.out.println("Apply button for page attribute add");
	    				
	    				// ok button of page attribute group
	    				TimeUnit.SECONDS.sleep(10);
	    				driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:r21:1:eCatPgCxAT:eCatPgCxBok")).click();
	    				TimeUnit.SECONDS.sleep(10);

	    				
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:cb1']/a")).click();
	    				TimeUnit.SECONDS.sleep(10);
	    				System.out.println("Click Save button of Item Class");

	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:pgt1:ap1:ctb1']/a/span")).click();
	    				TimeUnit.SECONDS.sleep(10);
	    				System.out.println("Save & Close button of Item Class");
	    				
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:q1:value00::content']")).sendKeys(ItemName);
	    				TimeUnit.SECONDS.sleep(10);
	    				System.out.println("Searching for the Item Class that was just created,\n Item Class Name :" +prop.getProperty("Item_Class_Name"));
	    				
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:q1:value10::content']")).sendKeys(prop.getProperty("Item_class_Des"));
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:q1::search']")).click();
	    				TimeUnit.SECONDS.sleep(10);
	    				System.out.println("Clicking On Search Button");
	    				
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:applicationsTreeTable2:AT2:_ATp:table1::db']/table/tbody/tr/td[1]")).click();
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:applicationsTreeTable2:cb3']")).click();
	    				System.out.println("Item Class searched! ");
	    				TimeUnit.SECONDS.sleep(20);
	    				
	    				WebElement donebtn = driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:ipt1:ap1:ctb1"));
	    				donebtn.click();
	    				TimeUnit.SECONDS.sleep(10);
	    				System.out.println("Located and clicked Done Button");
	    				
	    				WebElement homeicon = driver.findElement(By.xpath(prop.getProperty("homeicon")));
	    				homeicon.click();
	    				TimeUnit.SECONDS.sleep(20);
	    				System.out.println("Redirecting To HomePage");

	    				WebElement logout = driver.findElement(By.id(prop.getProperty("userdropdown")));
	    				logout.click();
	    				System.out.println("Settings and Actions dropdown...");
	    				TimeUnit.SECONDS.sleep(10);
	    				
	    				driver.findElement(By.linkText("Sign Out")).click();
	    				TimeUnit.SECONDS.sleep(10);
	    				System.out.println("Located Sign Out");
	    				
	    				driver.findElement(By.id("Confirm")).click();
	    				TimeUnit.SECONDS.sleep(10);
	    				System.out.println("Sign Out Complete");
	    				System.out.println("Item Class Creation/Adding specific attribute/specific page attribute \n testcase is successful...");
	    				Reporter.log("Item Class Creation/Adding specific attribute/specific page attribute \n testcase is successful...");
	    				driver.close();
	    				
	    			} catch (InterruptedException e1) {
	    				e1.printStackTrace();
	    			}
	    		}
	 
		//////@Test(priority = 4)
		public void ImportFormat()
		{
			try
			{
			
				Date date = new Date();
				long time = date.getTime();
				Timestamp ts = new Timestamp(time);
				//System.out.println("Current time stamp: "+ ts);
				
				WebDriver driver = new FirefoxDriver();

				ReadFile();
				TimeUnit.SECONDS.sleep(15);
				driver.get(prop.getProperty("url"));
				driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
				driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
				driver.findElement(By.id("btnActive")).click();
				TimeUnit.SECONDS.sleep(15);
				if (driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
					System.out.println("Login Successfull");// home button exists

				TimeUnit.SECONDS.sleep(10);
				driver.findElement(By.id("pt1:_UISmmLink::icon")).click();// click on Navigator
										//Waiting
				TimeUnit.SECONDS.sleep(10);
				
				
				//PIM
				driver.findElement(By.id(prop.getProperty("pim"))).click();
				System.out.println("Open Product Information Management");
				
				//Waiting
					TimeUnit.SECONDS.sleep(30);
					
		    //Click on Tasks
			driver.findElement(By.id(prop.getProperty("taskbar"))).click();
	        System.out.println("Open Tasks"); 
			
				//Waiting
					TimeUnit.SECONDS.sleep(20);	

			//Click on Manage Item Batches
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl14']")).click();		
			System.out.println("Open Manage Item Batches");
			
			//Waiting
			TimeUnit.SECONDS.sleep(20);
			
			//Click on add button to create Item Batch
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:r1:0:SearchResultsTable:_ATp:create::icon']")).click();
			System.out.println("Add button clicked");
			
			//Waiting
					TimeUnit.SECONDS.sleep(15);
			
			//Insert name
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:it2::content']")).sendKeys(prop.getProperty("ItemBatchName") + ts);		
			System.out.println("Enter Name "+ prop.getProperty("ItemBatchName"));
			
					
			//Waiting
			TimeUnit.SECONDS.sleep(5);
			
			//Click Dropdown button
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:ctb1::popEl']")).click();
			
			//Waiting
					TimeUnit.SECONDS.sleep(5);
			
					//Save and add items
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:m2']/td[2]")).click();
			System.out.println("Save and add items");
			
			//Waiting
			TimeUnit.SECONDS.sleep(5);
			
			//Click on Upload from Spreadsheet
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:cmi3']/td[2]")).click();
			System.out.println("Upload from Spreadsheet");
			
			//Waiting
					TimeUnit.SECONDS.sleep(5);
					
			//Select Import Entity
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r2:0:soc1::content']")).sendKeys(prop.getProperty("ImportEntity"));		
			System.out.println("Import Entity "+ prop.getProperty("ImportEntity"));
			
			//Waiting
			TimeUnit.SECONDS.sleep(5);
			
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r2:0:batchNumber']/td[1]/label")).click();
			
			//Waiting
					TimeUnit.SECONDS.sleep(5);
					
			//Select class
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r2:0:soc2::content']")).sendKeys(prop.getProperty("Class"));
			System.out.println("Class "+ prop.getProperty("Class"));
			
			//Waiting
			TimeUnit.SECONDS.sleep(5);
	          driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r2:0:batchNumber']/td[1]/label")).click();
			
		
			//Waiting
					TimeUnit.SECONDS.sleep(5);
					
					driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r2:0:soc3::content']")).clear();
					
					//Waiting
					TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r2:0:soc3::content']")).sendKeys(prop.getProperty("ImportFormat"));
			System.out.println("Import Format is "+ prop.getProperty("ImportFormat"));
		
			//Waiting
					TimeUnit.SECONDS.sleep(5);
					
			          driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r2:0:batchNumber']/td[1]/label")).click();
				
			        //Waiting
						TimeUnit.SECONDS.sleep(5);
						
			//Click Download
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:cb4']")).click();
			
			//Waiting
					TimeUnit.SECONDS.sleep(10);
			
					//Click done
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:d4::ok']")).click();
			System.out.println("Import Format created");
			
			//Waiting
					TimeUnit.SECONDS.sleep(20);
					
					//Click Manage Item Batches
					driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MainAreaTab2::ti']/div")).click();
					
					//Waiting
					TimeUnit.SECONDS.sleep(10);
					
					//Enter Import Format Name
					driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:r1:0:q1:value10::content']")).sendKeys(prop.getProperty("ItemBatchName")+ts);
					
					//Waiting
					TimeUnit.SECONDS.sleep(10);
					
					//Click search
					driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:r1:0:q1::search']")).click();
					
					//Waiting
					TimeUnit.SECONDS.sleep(10);
					
					//Home
					driver.findElement(By.id("_FOpt1:_UIShome::icon")).click();
					
					 
					//Waiting
					TimeUnit.SECONDS.sleep(10);
					
					//Warning
					driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAyes']")).click();
			       
					//Waiting
					TimeUnit.SECONDS.sleep(10);
					
					//Begin signout
			        driver.findElement(By.xpath(".//*[@id='pt1:_UIScmil1u::icon']")).click();

			        //Waiting
			        TimeUnit.SECONDS.sleep(10);
			        
			        //Click on signout
			        driver.findElement(By.xpath(".//*[@id='pt1:_UISlg1']")).click();        
			        System.out.println("Click on sign out");

			        //Waiting
			        TimeUnit.SECONDS.sleep(15);

			        //Click Confirm
			        driver.findElement(By.xpath(".//*[@id='Confirm']")).click();        
			        System.out.println("Signed out");
			        System.out.println("Import Formats TestCase is Successful");
			        Reporter.log("Import Formats TestCase is Successful");
					driver.close();
			}
			catch (Exception e1) {
				
				System.out.println("Import Formats testcase failed");
				e1.printStackTrace();
		}
		}

		
		//////@Test(priority = 5)
	    public void DisplayFormats()
	    {
	    	try
			{
				
				
				
			WebDriver driver=new FirefoxDriver();

			ReadFile();
			TimeUnit.SECONDS.sleep(15);
			driver.get(prop.getProperty("url"));
			driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.id("btnActive")).click();
			TimeUnit.SECONDS.sleep(15);
			if (driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
				System.out.println("Login Successfull");// home button exists

			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("pt1:_UISmmLink::icon")).click();// click on Navigator
									//Waiting
			TimeUnit.SECONDS.sleep(10);
				//PIM
				driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
				System.out.println("Open Product Information Management");
				
				//Waiting
					TimeUnit.SECONDS.sleep(30);
					
		  //Click on Tasks
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemRegionalArea::icon']")).click();
	            System.out.println("Open Tasks");     
			
				//Waiting
					TimeUnit.SECONDS.sleep(20);	
					
			//Click on Manage items
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl2']")).click();		
			System.out.println("Open Manage Items");
			
			//Waiting
			TimeUnit.SECONDS.sleep(10);	
			
			//Click on saved search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::saveSearch::content']")).click();
			System.out.println("Open saved search");
			
			//select Saved Search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::saveSearch::content']")).sendKeys(prop.getProperty("SavedSearch"));
			System.out.println("Select Saved Search "+ prop.getProperty("SavedSearch"));
			
			//Select 
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:ol1']/label")).click();
			
			
			//Waiting
					TimeUnit.SECONDS.sleep(10);	
			
			//Select Advanced Search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::_afrDscl']")).click();		
			System.out.println("Open Advanced Search");
			
			//Waiting
			TimeUnit.SECONDS.sleep(10);
			
			//Select Primary Unit of Measure
			
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp:value30::content']")).clear();
	        System.out.println("Clear Attribute");
			
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp:value30::content']")).sendKeys(prop.getProperty("PrimaryMeasure"));
			System.out.println("Enter Primary Measure attribute "+ prop.getProperty("PrimaryMeasure"));
			
			//Waiting
					TimeUnit.SECONDS.sleep(5);
							
			//Clear Item field
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp:value00::content']")).clear();		
			System.out.println("Clear Item field");
			
			//Waiting
			TimeUnit.SECONDS.sleep(5);
			
			//Input item as 1
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp:value00::content']")).sendKeys(prop.getProperty("Item_DF"));
			System.out.println("Enter item "+ prop.getProperty("Item_DF"));
			
			//Waiting
					TimeUnit.SECONDS.sleep(5);
					
			//Click on search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::search']")).click();
			System.out.println("Click search");
			
			//Waiting
			TimeUnit.SECONDS.sleep(10);
			
			//Display Search Result
			String Result=driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:rstab:_ATp:table1:13:itmNoLnkForSearch']")).getText();
			
			//Waiting
					TimeUnit.SECONDS.sleep(10);
					
			//output
			System.out.println("Search Result is " + Result);
			
			//Waiting
			TimeUnit.SECONDS.sleep(20);
			
			//Home
			driver.findElement(By.id("_FOpt1:_UIShome::icon")).click();
			
			//Waiting
			TimeUnit.SECONDS.sleep(10);
			
	        //Begin signout
	        driver.findElement(By.xpath(".//*[@id='pt1:_UIScmil1u::icon']")).click();

	        //Waiting
	        TimeUnit.SECONDS.sleep(10);
	        
	        //Click on signout
	        driver.findElement(By.xpath(".//*[@id='pt1:_UISlg1']")).click();        
	        System.out.println("Click on sign out");

	        //Waiting
	        TimeUnit.SECONDS.sleep(15);

	        //Click Confirm
	        driver.findElement(By.xpath(".//*[@id='Confirm']")).click();        
	        System.out.println("Signed out");
	        System.out.println("Display Formats TestCase is Successful");
	        Reporter.log("Display Formats TestCase is Successful");
			driver.close();
			}
		    catch (Exception e1) {
			
			System.out.println("Display Formats testcase failed");
			
			e1.printStackTrace();
	}
	    }
	    
	
	    
		//////@Test(priority = 6)
	    public void SavedSearch()
	    {
	    	try
			{
			
				
				Date date = new Date();
				long time = date.getTime();
				Timestamp ts = new Timestamp(time);
				//System.out.println("Current time stamp: "+ ts);
				
				WebDriver driver=new FirefoxDriver();

				ReadFile();
				TimeUnit.SECONDS.sleep(15);
				driver.get(prop.getProperty("url"));
				driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
				driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
				driver.findElement(By.id("btnActive")).click();
				TimeUnit.SECONDS.sleep(15);
				if (driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
					System.out.println("Login Successfull");// home button exists

				TimeUnit.SECONDS.sleep(10);
				driver.findElement(By.id("pt1:_UISmmLink::icon")).click();// click on Navigator
										//Waiting
				TimeUnit.SECONDS.sleep(10);
		  //PIM
				driver.findElement(By.id(prop.getProperty("pim"))).click();
				System.out.println("Open Product Information Management");
				
				//Waiting
					TimeUnit.SECONDS.sleep(30);
					
		  //Click on Tasks
			driver.findElement(By.id(prop.getProperty("taskbar"))).click();
	        System.out.println("Open Tasks");
			
				//Waiting
					TimeUnit.SECONDS.sleep(20);	
					
			//Click on Manage items
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl2']")).click();		
			System.out.println("Open Manage Items");
			
			//Waiting
			TimeUnit.SECONDS.sleep(20);	
		
			//Advanced Search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::_afrDscl']")).click();
	        
			
			//Waiting
					TimeUnit.SECONDS.sleep(10);
			
			//Clear item field
					
					driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp:value00::content']")).clear();
					System.out.println("Clear Item Field"); 
					
					//Waiting
					TimeUnit.SECONDS.sleep(10);		
					
			//Click on Item
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp:value00::content']")).sendKeys(prop.getProperty("ItemName"));
		    System.out.println("Enter Item Name "+ prop.getProperty("ItemName"));
			
			//Waiting
					TimeUnit.SECONDS.sleep(10);	
			
			//Click Search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::search']")).click();		
			System.out.println("Search");
			
			//Waiting
			TimeUnit.SECONDS.sleep(20);	
			
			//Click on Advanced Search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::_afrDscl']")).click();
			
			//Waiting
					TimeUnit.SECONDS.sleep(10);	
			
			//Click save
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::save']")).click();
			System.out.println("Save the search");
			
			//Waiting
			TimeUnit.SECONDS.sleep(20);	
			
			//Clear name
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::SSDlg_name::content']")).clear();
			
			//Waiting
					TimeUnit.SECONDS.sleep(10);	
			
			//Enter new saved search
		    driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::SSDlg_name::content']")).sendKeys(prop.getProperty("NewSavedSearch") + ts);	
			
			//Waiting
			TimeUnit.SECONDS.sleep(10);	
			
	        //Click ok
	        driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::SSDlg::ok']")).click();
	        System.out.println("Saved Search Created");
	        
	        //Waiting
	      		TimeUnit.SECONDS.sleep(20);	
	      		
			//Open Advanced Search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::_afrDscl']")).click();
			
			 //Waiting
			TimeUnit.SECONDS.sleep(10);	
			
			//Click search
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:0:efqrp::search']")).click();
			
			//Waiting
					TimeUnit.SECONDS.sleep(20);
					


					//Home
					driver.findElement(By.id("_FOpt1:_UIShome::icon")).click();
					
					//Waiting
					TimeUnit.SECONDS.sleep(10);
					
			        //Begin signout
			        driver.findElement(By.xpath(".//*[@id='pt1:_UIScmil1u::icon']")).click();

			        //Waiting
			        TimeUnit.SECONDS.sleep(10);
			        
			        //Click on signout
			        driver.findElement(By.xpath(".//*[@id='pt1:_UISlg1']")).click();        
			        System.out.println("Click on sign out");

			        //Waiting
			        TimeUnit.SECONDS.sleep(15);

			        //Click Confirm
			        driver.findElement(By.xpath(".//*[@id='Confirm']")).click();        
			        System.out.println("Signed out");
			        System.out.println("Saved Searches TestCase is Successful");
			        Reporter.log("Saved Searches TestCase is Successful");
					driver.close();
			
			}
			
			catch (Exception e1) {
				
				System.out.println("Saved Searches testcase failed");
				
				e1.printStackTrace();
		}
	}
	 
		 
		 
		//////@Test(priority = 7)
		 public void Create_AG_SgrOw_Attr() {
														
					try{
						WebDriver driver = new FirefoxDriver();

						ReadFile();
						TimeUnit.SECONDS.sleep(15);
						
						
						
						String AG_NAME = prop.getProperty("EnterDisplayName");
						String AG_DESC =prop.getProperty("EnterDescription");
						DateFormat dateformat = new SimpleDateFormat("yyMMddhhmmss");
						Date date = new Date();
						String ConvDate = dateformat.format(date).toString();
						String AGname1 = AG_NAME.concat(ConvDate);
						String AGdesc1 = AG_DESC.concat(ConvDate); 
					    
						
						driver.get(prop.getProperty("url"));
						driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
						driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
						driver.findElement(By.id("btnActive")).click();
						TimeUnit.SECONDS.sleep(15);
						if (driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
							System.out.println("Login Successfull");// home button exists

						TimeUnit.SECONDS.sleep(10);
						
						
						//Navigate to Product Management
						driver.findElement(By.id("pt1:_UIScmil1u::icon")).click();
						TimeUnit.SECONDS.sleep(20);
						 //selecting setup and maintenance
						 driver.findElement(By.linkText("Setup and Maintenance...")).click();
						 TimeUnit.SECONDS.sleep(10);
						 System.out.println("Navigated to Setup and Maintenance");
						
						
						/*driver.findElement(By.xpath(".//*[@id='pt1:_UIScmi4']")).click();
						TimeUnit.SECONDS.sleep(20);
*/						driver.findElement(By.xpath(".//*[@id='pt1:r1:0:r0:0:r1:0:AP1:soc2::drop']")).click();
						TimeUnit.SECONDS.sleep(20);
						
						//Product Management
						driver.findElement(By.xpath(".//*[@id='pt1:r1:0:r0:0:r1:0:AP1:soc2::pop']/li[14]")).click();
						TimeUnit.SECONDS.sleep(10);
						System.out.println("Product Management");
						
						//Search Manage Item Attribute Groups and Attributes
						driver.findElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content")).sendKeys(prop.getProperty("Search_ManageAG"));
						TimeUnit.SECONDS.sleep(10);
						driver.findElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon")).click();
						TimeUnit.SECONDS.sleep(10);
						driver.findElement(By.linkText("Manage Item Attribute Groups and Attributes")).click();
						TimeUnit.SECONDS.sleep(20);
						System.out.println("Manage Item Attribute Groups and Attributes");
						
						//Create Attribute Group
						driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:0:pt1:AP1:ectxSRAT:_ATp:create::icon")).click();
						System.out.println("Creating Attribute Group..");
						
						TimeUnit.SECONDS.sleep(20);
						//Enter Display Name
						driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:1:pt1:AP1:it4::content")).sendKeys(AGname1);
						TimeUnit.SECONDS.sleep(10);
						//Enter Description
						driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:1:pt1:AP1:it2::content")).sendKeys(AGdesc1);
						TimeUnit.SECONDS.sleep(10);
						
						//Enter Behavior as Single Row
						Select Behavior = new Select(driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:1:pt1:AP1:soc1::content")));
						Behavior.selectByVisibleText("Single Row");
						TimeUnit.SECONDS.sleep(10);
						
						//Create Context usage
						driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:1:pt1:AP1:AT2:_ATp:create::icon']")).click();
						TimeUnit.SECONDS.sleep(10);
						
						Select Item = new Select(driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:1:pt1:AP1:AT2:_ATp:ATt2:0:soc5::content")));
						
						Item.selectByVisibleText("Item");
						TimeUnit.SECONDS.sleep(10);
						
			            Select Style = new Select(driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:1:pt1:AP1:AT2:_ATp:ATt2:1:soc6::content")));
						
						Style.selectByVisibleText("Defaulted");
						
						//Click on Save
						driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:1:pt1:AP1:cusSV")).click();
						TimeUnit.SECONDS.sleep(10);
						System.out.println("Attribute Group is created");
						
						//Create Attributes
						driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:1:pt1:AP1:AT1:_ATp:create::icon")).click();
						TimeUnit.SECONDS.sleep(10);
						System.out.println("Creating Attributes..");
						
						//Enter Attribute Name
						driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:it3::content")).sendKeys(prop.getProperty("EnterAttributeName"));
						TimeUnit.SECONDS.sleep(10);
						
						//Enter Attribute Description
						driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:it5::content")).sendKeys(prop.getProperty("EnterAttributeDescription"));
						
						//Select Data Type
						Select DataType = new Select(driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:dataTypeLov::content")));
						DataType.selectByVisibleText("Character");
					    
					    //Select valueSet
						TimeUnit.SECONDS.sleep(10);
					    driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:valueSetCodeId::lovIconId")).click();
					    TimeUnit.SECONDS.sleep(10);
					    driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:valueSetCodeId::dropdownPopup::popupsearch")).click();
					    TimeUnit.SECONDS.sleep(10);
					    //Enter ValueSet Name to search
					    driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:valueSetCodeId::_afrLovInternalQueryId:value00::content")).sendKeys(prop.getProperty("EnterValueSet"));
					    TimeUnit.SECONDS.sleep(10);
					    //Click on Search
					    driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:valueSetCodeId::_afrLovInternalQueryId::search")).click();
					    
					    //Click on Value set
					    TimeUnit.SECONDS.sleep(10);
					    driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:valueSetCodeId_afrLovInternalTableId::db")).click();
					    TimeUnit.SECONDS.sleep(10);
					    
					    //Click on OK
					    driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:valueSetCodeId::lovDialogId::ok")).click();
					    TimeUnit.SECONDS.sleep(10);
					    
					    //Click on Save and close
					    Actions action = new Actions(driver);
					    action.moveToElement(driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:2:pt1:AP1:ctb1']/table/tbody/tr/td[1]/a/span"))).doubleClick().build().perform();
					    TimeUnit.SECONDS.sleep(10);
					    Actions action2 = new Actions(driver);
					    action2.moveToElement(driver.findElement(By.xpath(".//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:1:pt1:AP1:ctb1']/table/tbody/tr/td[1]/a/span"))).doubleClick().build().perform();
					    TimeUnit.SECONDS.sleep(10);
					    System.out.println("Attribute data saved and closed");
					    TimeUnit.SECONDS.sleep(10);
					   
					    //Search AttributeGroup which is created
					    driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:0:pt1:AP1:ectxQRY:value00::content")).sendKeys(AGname1);
					    System.out.println("Searching created Attribute Group.. ");
					    TimeUnit.SECONDS.sleep(10);
					    
					    //Click on Search Button
					    driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:0:pt1:AP1:ectxQRY::search")).click();
					    TimeUnit.SECONDS.sleep(10);
					    System.out.println("Searching created Attribute Group is completed.. ");
					    //Click on cancel button
					    driver.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:r1:0:pt1:AP1:APc")).click();
					    TimeUnit.SECONDS.sleep(10);
					    
					  //Home
						driver.findElement(By.id("pt1:_UIShome::icon")).click();
						TimeUnit.SECONDS.sleep(10);
			            System.out.println("Navigation to Home Page");  
			            
			            //Sign-out button
			            driver.findElement(By.id("pt1:_UIScmil1u::icon")).click();
			            TimeUnit.SECONDS.sleep(10);
			            driver.findElement(By.id("pt1:_UISlg1")).click();
			            TimeUnit.SECONDS.sleep(10);
			            
			            //Confirming Sign-off
			            driver.findElement(By.id("Confirm")).click();
			            TimeUnit.SECONDS.sleep(10);
			            System.out.println("Signing off");
			            
			            Reporter.log("Testcase for Create_AG_SgrOw_Attr Successfull..");
						driver.close();
			            
					    }
						
						catch(Exception e){
							
							System.out.println("Testcase for Create_AG_SgrOw_Attr failed");
							e.printStackTrace();
						}	
				}
				
			        
			
		// ////@Test(priority = 8)
		 public void OTBITest() {

				
					try{
						WebDriver driver = new FirefoxDriver();

						ReadFile();
						TimeUnit.SECONDS.sleep(15);
						
						driver.get(prop.getProperty("url"));
						driver.manage().window().maximize();
						driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
						driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
						driver.findElement(By.id("btnActive")).click();
						TimeUnit.SECONDS.sleep(15);
						if (driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
							System.out.println("Login Successfull");// home button exists

						TimeUnit.SECONDS.sleep(10);
					// navigate button click
					driver.findElement(By.id("pt1:_UISmmLink::icon")).click();
					System.out.println("clicked on 'navigate' ");
					TimeUnit.SECONDS.sleep(10);
					// selection of 'more'
					driver.findElement(By.xpath(".//*[@id='pt1:nv_moreLk']")).click();
					System.out.println("clicked on 'more' ");
					TimeUnit.SECONDS.sleep(20);
					// selection of reports and analytics
					//String winHandleBefore = driver.getWindowHandle();
			       
					WebElement d1 = driver.findElement(By.xpath(".//*[@id='pt1:nv_itemNode_tools_reports_and_analytics']"));
					d1.click();
					TimeUnit.SECONDS.sleep(10);
					System.out.println("clicked on 'Reports and analytics'");
					
					Reporter.log("Testcase for  OTBIReporting validation Successfull..");
					// selection of report from drop down
					Select type = new Select(driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_tools_reports_and_analytics:0:_FOTsr1:0:pt1:soc1::content")));
					type.selectByIndex(1);
					System.out.println("selection of reports from dropdown");
					// browse catalog button click
					driver.findElement(By
							.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_tools_reports_and_analytics:0:_FOTsr1:0:pt1:ap1:cil4']"))
							.click();
					System.out.println("clicked on 'browse catalog'");
					TimeUnit.SECONDS.sleep(20);
					driver.navigate().to("https://ecdy-test.fa.us2.oraclecloud.com/analytics/saw.dll?catalog");
					// opening report for test1
					driver.findElement(By.xpath(prop.getProperty("test1"))).click();
					TimeUnit.SECONDS.sleep(40);
					// switch to frame where PARTY_ID and PARTY_NUMBER are present
					driver.findElement(By.xpath(".//*[@id='idContentBody']"));
					WebElement element = driver.findElement(By.xpath(".//*[@id='idContentBody']//iframe"));
					driver.switchTo().frame(element);

					TimeUnit.SECONDS.sleep(40);

					WebElement elem = driver.findElement(By.xpath(".//*[@id='lightBoxSide']/div/iframe"));
					driver.switchTo().frame(elem);
					System.out.println("switch to frames are successfull");
					// checking whether PARTY_ID and PARTY_NUMBER are present or not,
					// first get the column values and check whether they are equal or not
					String idName = driver
							.findElement(By.xpath(".//*[@id='viewcanvas']/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div"))
							.getText();
					System.out.println("IdName : " + idName);
					String numberColumnname = driver
							.findElement(By.xpath(".//*[@id='viewcanvas']/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[2]/div"))
							.getText();
					System.out.println("NumberColumnname : " + numberColumnname);
					if (idName.equals("PARTY_ID") && numberColumnname.equals("PARTY_NUMBER")) {
						System.out.println("PartyId and PartyNumber are present");
						// if both PARTY_ID and PARTY_NUMBER are present then click sign out
						// button
						driver.switchTo().defaultContent();
						driver.findElement(By.xpath(".//*[@id='logout']/span/span")).click();
						driver.findElement(By.xpath(".//*[@id='Confirm']")).click();
					} else {

						System.out.println("PartyId and PartyNumber are not present");
					}
					System.out.println("Comparing values is done");
					System.out.println("end of testcase:OTBIReporting");

		            Reporter.log("Testcase for  OTBIReporting validation Successfull..");
		            driver.close();
				}
		 catch(InterruptedException e1){
				
				System.out.println("Testcase for  OTBIReporting validation  failed");
				e1.printStackTrace();
			}	
					
		 }	 
		 
		// ////@Test(priority = 9)
		 public void ImportMapping() {
				
				
					
					try{
						
						WebDriver driver = new FirefoxDriver();

						ReadFile();
						TimeUnit.SECONDS.sleep(15);
						
						//FileReader reader = new FileReader("C:/Users/Harshrak/Documents/REJAG/EclipseFiles/New folder/SeleniumTestProject/Config.properties");
						
						final String FILE_PATH= prop.getProperty("Import_Map_CSV_Url");
						String ItemIn = prop.getProperty("Import_Map_Name");
						DateFormat dateformat = new SimpleDateFormat("ddMMMyyhhmmss");
						Date date = new Date();
						String ConvDate = dateformat.format(date).toString();
						String ImportMapName = ItemIn.concat(ConvDate);
									
						System.out.println(ImportMapName); 
						
						
						driver.manage().window().maximize();
						driver.get(prop.getProperty("url"));
						driver.manage().window().maximize();
						driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
						driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
						driver.findElement(By.id("btnActive")).click();
						TimeUnit.SECONDS.sleep(15);
						if (driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
							System.out.println("Login Successfull");// home button exists

						TimeUnit.SECONDS.sleep(10);
						//user dropdown
						TimeUnit.SECONDS.sleep(10);
						driver.findElement(By.xpath(".//*[@id='pt1:_UISmmLink::icon']")).click();
						TimeUnit.SECONDS.sleep(20);
						//Clicking on Product Information Management
						driver.findElement(By.xpath(".//*[@id='pt1:nv_itemNode_product_management_items']")).click();
						TimeUnit.SECONDS.sleep(20);
						//Clicking on Tasks
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemRegionalArea::icon']")).click();
						TimeUnit.SECONDS.sleep(40);
						//clicking on Manage Import Maps
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl17")).click();
						TimeUnit.SECONDS.sleep(20);
						//clicking on plus button to create new Import Map
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:AT1:_ATp:create::icon']")).click();
						TimeUnit.SECONDS.sleep(10);
						//Add Import Map Name
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:it1::content")).sendKeys(ImportMapName);
						TimeUnit.SECONDS.sleep(10);
						//Add Description for Import Map
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:it2::content")).sendKeys(prop.getProperty("Import_Map_Description"));
						TimeUnit.SECONDS.sleep(10);
						//select from dropdown of Item Class
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:itemClassNameId::lovIconId']")).click();
						TimeUnit.SECONDS.sleep(10);
						//clicking on dropdown search
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:itemClassNameId::dropdownPopup::popupsearch']")).click();
						TimeUnit.SECONDS.sleep(10);
						//Clearing the present content in Item Class
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:itemClassNameId::_afrLovInternalQueryId:value00::content")).clear();
						TimeUnit.SECONDS.sleep(10);
						//Item Class search
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:itemClassNameId::_afrLovInternalQueryId:value00::content")).sendKeys(prop.getProperty("Item_Class_Search"));
						TimeUnit.SECONDS.sleep(10);
						//Click on Search Button
						//driver.findElement(By.cssSelector("button[id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:pt1:AP1:itemClassNameId::_afrLovInternalQueryId::search'][class='xgt p_AFTextOnly']")).click();
						//#_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:pt1:AP1:itemClassNameId::_afrLovInternalQueryId::search
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:itemClassNameId::_afrLovInternalQueryId::search']")).click();
						TimeUnit.SECONDS.sleep(15);
						//Selecting the Item Class
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:itemClassNameId_afrLovInternalTableId::db']/table/tbody/tr[1]/td[1]")).click();
						TimeUnit.SECONDS.sleep(10);
						//clicking on OK button
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:itemClassNameId::lovDialogId::ok']")).click();
						TimeUnit.SECONDS.sleep(30);
						//Browse for  .CSV file from local machine
						WebElement uploadElement =driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:if1::content']"));
						TimeUnit.SECONDS.sleep(30);
						//
						//WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
						
						uploadElement.sendKeys(FILE_PATH);
						TimeUnit.SECONDS.sleep(40);
						/*code for going through PDH expand menu
						//expand the attribute Column
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2:0::di']")).click();
						TimeUnit.SECONDS.sleep(15);
						// expand Main under Item
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2:9::di']")).click();
						TimeUnit.SECONDS.sleep(10);
						//click on Item
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2::db']/table[3]/tbody/tr[5]/td[2]/div/table/tbody/tr/td[1]/div")).click();
						TimeUnit.SECONDS.sleep(10);*/
						
					//selecting the Item Name from CSV
						WebElement from_Item_Name = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:AT1:_ATp:ATt1::db']/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"));
						//expand the attribute Column
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2:0::di']")).click();
						TimeUnit.SECONDS.sleep(15);
						// expand Main under Item
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2:9::di']")).click();
						TimeUnit.SECONDS.sleep(10);
						//click on Item
						WebElement to_Item_name=driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2::db']/table[3]/tbody/tr[5]/td[2]/div/table/tbody/tr/td[1]/div"));
						TimeUnit.SECONDS.sleep(10);
						
						Actions act=new Actions(driver);
						
						act.dragAndDrop(from_Item_Name, to_Item_name).build().perform();	
						TimeUnit.SECONDS.sleep(10);
						//for Item Description
						WebElement from_Item_description= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:AT1:_ATp:ATt1::db']/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[1]"));
						WebElement to_Item_description= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2::db']/table/tbody/tr[9]/td[2]/div/table/tbody/tr/td[1]/div"));
						
						act.dragAndDrop(from_Item_description, to_Item_description).build().perform();
						TimeUnit.SECONDS.sleep(10);
						
						//for UOM
						
						WebElement from_uom= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:AT1:_ATp:ATt1::db']/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[1]"));
						
						WebElement to_primary_uom= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2::db']/table[1]/tbody/tr[21]/td[2]/div/table/tbody/tr/td[1]/div"));
						
						act.moveToElement(to_primary_uom);
						//WebElement to_primary_uom= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2::db']/table[1]/tbody/tr[21]/td[2]/div/table/tbody/tr/td[1]/div"));
						
						act.dragAndDrop(from_uom, to_primary_uom).build().perform();
						TimeUnit.SECONDS.sleep(10);
						
						/*//code for entering the items to be mapped in PDH.
						WebElement from_Item_Name = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:AT1:_ATp:ATt1::db']/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"));
						
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:fit1::content']")).sendKeys(prop.getProperty("Item_Name"));
						TimeUnit.SECONDS.sleep(10);
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:fit1::content']")).sendKeys(Keys.ENTER);
						TimeUnit.SECONDS.sleep(20);
						WebElement to_Item_Name =driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2::db']/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"));
						Actions act=new Actions(driver);
						act.dragAndDrop(from_Item_Name, to_Item_Name).build().perform();	
						
					
						
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:fit1::content']")).clear();
						TimeUnit.SECONDS.sleep(20);
					//for Item Description
						WebElement from_Item_description= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:AT1:_ATp:ATt1::db']/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[1]"));
						                                                            
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:fit1::content']")).sendKeys(prop.getProperty("Item_Description"));
						TimeUnit.SECONDS.sleep(10);
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:fit1::content']")).sendKeys(Keys.ENTER);
						TimeUnit.SECONDS.sleep(20);
						
						WebElement to_Item_Description =driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2::db']/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"));
						
						Actions ac1=new Actions(driver);
						ac1.dragAndDrop(from_Item_description, to_Item_Description).build().perform();	
						
						
						
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:fit1::content']")).clear();
						TimeUnit.SECONDS.sleep(10);
						//for UOM
						WebElement from_uom= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:AT1:_ATp:ATt1::db']/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[1]"));
						
						
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:fit1::content']")).sendKeys(prop.getProperty("Unit_of_Measure"));
						TimeUnit.SECONDS.sleep(10);
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:fit1::content']")).sendKeys(Keys.ENTER);
						TimeUnit.SECONDS.sleep(20);
						WebElement to_primary_uom= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ATT2:_ATTp:ATTt2::db']/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"));
						Actions ac2=new Actions(driver);
						ac2.dragAndDrop(from_uom, to_primary_uom).build().perform();	
						
						TimeUnit.SECONDS.sleep(10);
						
						*/
						
						
						
						System.out.println("mapped all three attributes succesfully\n");
						//save dropdown
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ctb2::popEl']")).click();
						TimeUnit.SECONDS.sleep(10);
						//save and close
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:AP1:ctb3']/td[2]")).click();
						TimeUnit.SECONDS.sleep(10);
						//done button
						driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/div[1]/div/div/div/div[4]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div/div[6]/div/div/div[2]/div/div[1]/div[3]/table/tbody/tr/td[1]/div/div/div[1]/div/div[2]/div/table/tbody/tr/td/div/div[2]/div/div/div/div/div/div[1]/table/tbody/tr/td[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/div/div/div[1]/div/div[1]/div[3]/div/div[1]/div[1]/table")).click();
						
						WebElement homeicon = driver.findElement(By.xpath(prop.getProperty("homeicon_import_map")));
						homeicon.click();
						TimeUnit.SECONDS.sleep(20);
						System.out.println("Redirecting To HomePage");

						WebElement logout = driver.findElement(By.id(prop.getProperty("userdropdown")));
						logout.click();
						System.out.println("Settings and Actions dropdown...");
						TimeUnit.SECONDS.sleep(10);
						
						driver.findElement(By.linkText("Sign Out")).click();
						TimeUnit.SECONDS.sleep(10);
						System.out.println("Located Sign Out");
						
						driver.findElement(By.id("Confirm")).click();
						TimeUnit.SECONDS.sleep(10);
						System.out.println("Sign Out Complete");
						System.out.println("Item Import Mapping testcase successful...");
						Reporter.log("Item Import Mapping testcase successful...");
						driver.close();
						//driver.findElement(By.xpath("")).click();
						//driver.findElement(By.xpath("")).click();
						//driver.findElement(By.xpath("")).click();
						
						
					}
					catch(InterruptedException e1){
						
						System.out.println("Item Import Mapping testcase failed");
						e1.printStackTrace();
					}
					
				}	 
		 
		 
		
		 
}
