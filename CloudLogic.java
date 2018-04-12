//package test;

import java.io.File;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

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

//import org.openqa.selenium.support.ui.Select;
//Test_18,  Test_269  ,  Test_381  // 

public class CloudLogic {
	Properties prop = new Properties();
	WebDriver driver = new FirefoxDriver();
	static Date date = new Date();
	
	String item_numberG = "Org_testcase2";  //Org_testcase2,Org_testcase3
	
	public void ReadFile(){
		  File file = new File("D:/SeleniumTest/Selie/configs/Configuration.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
				
			}
	}
	
	
	public void loginToPHCloud() throws Exception
	{
		try
		{
			ReadFile();
	TimeUnit.SECONDS.sleep(15);
	driver.get(prop.getProperty("url"));
	driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.id("btnActive")).click();
	TimeUnit.SECONDS.sleep(15);
	if(driver.findElements(By.xpath(".//*[@id='pt1:_UISt1::oc']/table/tbody/tr/td[3]")).size() != 0)
		System.out.println("Login Successfull");//home button exists
	
  } catch (Exception e) {
		e.printStackTrace();
	}
  
	
	
}
	
	public void ProdInfoMgmt() throws Exception{
		try
		{
			TimeUnit.SECONDS.sleep(30);
			driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
			TimeUnit.SECONDS.sleep(10);
			
			if(driver.findElements(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon']")).size() != 0)
				System.out.println("PIM is Subscribed");//Search button exists

			WebElement home1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));//.//*[@id='pt1:_UIShome::icon']
			home1.click();
			
		}
		catch(Exception e)
		{
			System.out.println("PIM failed");
			e.printStackTrace();
		}
	}
	
	
	public void Logout() throws Exception{
		try
		{
			TimeUnit.SECONDS.sleep(30);
			WebElement SignOut=driver.findElement(By.xpath(".//*[@id='pt1:_UIScmil1u::icon']"));
			SignOut.click();
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIScmil1u']/span")).click();//click on signout button
			TimeUnit.SECONDS.sleep(15);
			driver.findElement(By.id("Confirm")).click();//click on confirm
			TimeUnit.SECONDS.sleep(15);
			if(driver.findElements(By.xpath(".//*[@id='btnActive']")).size() != 0)
				System.out.println("Logout Successfull");//SignIn button exists
			
		}
		catch(Exception e)
		{
			System.out.println("Logout Failed");
			e.printStackTrace();
		}
	}
	
	public void ItemMgmt() throws Exception{
		try
		{
			
			TimeUnit.SECONDS.sleep(30);
			driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
			TimeUnit.SECONDS.sleep(10);
			WebElement taskBar = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemRegionalArea::icon"));
			taskBar.click();
			TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl1")).size() != 0)
			System.out.println("Create Item exists");
		TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl2")).size() != 0)
			System.out.println("Manage Item exists");
		TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl3")).size() != 0)
			System.out.println("Browse Item exists");
		TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl4")).size() != 0)
			System.out.println("Create Pack exists");
		TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl5")).size() != 0)
			System.out.println("Create Item Structure exists");
		TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl6")).size() != 0)
			System.out.println("Manage Catalogs exists");
		TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl7")).size() != 0)
			System.out.println("Manage Trading Partner Items Exists");
		TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl8")).size() != 0)
			System.out.println("Manage Item Relationships");
		TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl9")).size() != 0)
			System.out.println("Manage Trading Partners exists");
		TimeUnit.SECONDS.sleep(10);
		if(driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl10")).size() != 0)
			System.out.println("Manage Delete Groups exists");
		TimeUnit.SECONDS.sleep(10);
		 WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
			home.click();
		
		
	}
		catch(Exception e)
		{
			System.out.println("testcase failed");
			e.printStackTrace();
		}

	}
	
		
	public void OrgAssgnmnt(){
try
{
	TimeUnit.SECONDS.sleep(30);
	

			driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_grp_groupNode_product_management")).click();//click on Product Management
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_wrk_itemNode_product_management_items")).click();
			
			
			//for finding the search   ICON and Hitting the search Icon
			TimeUnit.SECONDS.sleep(30);
			WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
			search.click();
						
						TimeUnit.SECONDS.sleep(20);
						
						// giving the item name 
						
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(item_numberG);//enter search text
					
						TimeUnit.SECONDS.sleep(20);
						
						// Searching  the item name and hit
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
						
						System.out.println("Able to search the item ");
					       System.out.println("Test case for search Item is Successfull");	

		
					    
			

					       
		    ///Item Associations update test case started////


					       TimeUnit.SECONDS.sleep(20);
							
							//FOr finding the Associations Tab Locator.
										WebElement AssociationsTabFind = driver.findElement(By.linkText("Associations"));//Associations
										AssociationsTabFind.click();
										AssociationsTabFind.click();
										TimeUnit.SECONDS.sleep(30);
										
										
										TimeUnit.SECONDS.sleep(20);
										
										//Select and add icon
										WebElement add = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:r2:1:AT1:_ATp:orgbtnmen::icon']"));
										add.click();
										add.click();
										TimeUnit.SECONDS.sleep(50);
										
										
										 
										
										
										//TimeUnit.SECONDS.sleep(20);
										WebElement searchIcn = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:r2:1:AT1:qryId1::search_icon']"));

										searchIcn.click();
										
										
										TimeUnit.SECONDS.sleep(30);
										
										WebElement option =  driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:r2:1:AT1:table2::db']/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"));
										option.click();
									
										TimeUnit.SECONDS.sleep(20);

										
										//apply button click
										WebElement apply = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:r2:1:AT1:applyButton']"));
                                        apply.click();
										TimeUnit.SECONDS.sleep(20);
										
										//ok button click
										WebElement done = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:r2:1:AT1:donebtn']"));
										done.click();
										TimeUnit.SECONDS.sleep(20);
										
										
										// Finding the Save Locator id and hitting the save button.
										driver.findElement(By.linkText("Save")).click();
										System.out.println("Updated Org Assignment attribute");
										
										TimeUnit.SECONDS.sleep(30);
										
										
										//Home Icon
										//TimeUnit.SECONDS.sleep(10);
										  WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
											home.click();
										
			///Item Association update test case Completed////	
										
			}catch(Exception e){
				System.out.println("TestCase OrgAssmnt Failed");
				e.printStackTrace();
			}
		}
	//OrgAssmnt Ends//
	
	
	 public void SingleRow()
     {
		 try{
			 System.out.println("SinglerOW execution starts");
			 TimeUnit.SECONDS.sleep(30);
		//	 WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
			//	home.click();
				//TimeUnit.SECONDS.sleep(10);
		 driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_grp_groupNode_product_management")).click();//click on Product Management
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_wrk_itemNode_product_management_items")).click();
			TimeUnit.SECONDS.sleep(10);
			
			//for finding the search   ICON and Hitting the search Icon
			TimeUnit.SECONDS.sleep(30);
			WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
			search.click();
						
						TimeUnit.SECONDS.sleep(10);
						
						// giving the item name 
						ReadFile();
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(prop.getProperty("singleRowItem"));//enter search text
					
						TimeUnit.SECONDS.sleep(10);
						
						// Searching  the item name and hit
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
						
						System.out.println("Able to search the item ");
					       System.out.println("Test case for search Item is Successfull");	

		

			

					       
		    ///Item specification update test case started////


					       TimeUnit.SECONDS.sleep(10);
							
							//FOr finding the Specification Tab Locator.
										WebElement SpecificationTabFind = driver.findElement(By.linkText("Specifications"));//specification
										SpecificationTabFind.click();
										TimeUnit.SECONDS.sleep(30);
										
										
									
										//For single row attribute
										WebElement single = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:r1:0:dynam1:0:PGLNK2"));
										single.click();
										TimeUnit.SECONDS.sleep(30);
										
										
										
										TimeUnit.SECONDS.sleep(40);
										WebElement Tfcode = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:tfCode"));
										Tfcode.clear();
										
										Tfcode.sendKeys(prop.getProperty("singleRowValue"));
										TimeUnit.SECONDS.sleep(40);
										
										// Finding the Save Locator id and hitting the save button.
										driver.findElement(By.linkText("Save")).click();
										System.out.println("Updated Single row attribute");
										
										TimeUnit.SECONDS.sleep(30);
										
										
										//Home Icon
										TimeUnit.SECONDS.sleep(10);
										driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']")).click();
										
			///Item Specification update test case Completed////	
			
				
			}catch(Exception e){
				System.out.println("testcase failed");
				e.printStackTrace();			}
		}
	//SingleRow execution Ends//

//Catalog Update//
	 
	 public void CatalogUpdate() {

			
				// TODO Auto-generated method stub
				
				try {
					ReadFile();
					
					
					
					TimeUnit.SECONDS.sleep(10);
					//click to Search icon
					driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_grp_groupNode_product_management")).click();//click on Product Management
					TimeUnit.SECONDS.sleep(20);
					driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_wrk_itemNode_product_management_items")).click();
					TimeUnit.SECONDS.sleep(20);
					
					//for finding the search   ICON and Hitting the search Icon
					TimeUnit.SECONDS.sleep(30);
					WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
					search.click();
								
								TimeUnit.SECONDS.sleep(20);
					
								
				////Category creation Test case Started				
								
						//Catalog drop down selection
								Select obj = new Select(driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:select")));
								List<WebElement> options = obj.getOptions();
								obj.selectByVisibleText("Catalog");
								TimeUnit.SECONDS.sleep(20);
					
						//Search for the catalog name
								WebElement CatName = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:1:qryId1:value00::content"));
								ReadFile();
								CatName.sendKeys(prop.getProperty("CatNameValue"));
								TimeUnit.SECONDS.sleep(20);
								System.out.println("Able to search  Catalog ");
								
								WebElement SearchCat = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:1:qryId1::search"));
								SearchCat.click();
								TimeUnit.SECONDS.sleep(20);
								
								
							//Catalog search
								WebElement SelectCatName = driver.findElement(By.linkText("Test Catalog"));
								SelectCatName.click();
								TimeUnit.SECONDS.sleep(20);
								
								/*WebElement select1 = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:ap1:r2:0:lv1:0:li1"));
								select1.click();
								TimeUnit.SECONDS.sleep(20);*/
						
								//Add category creation
								TimeUnit.SECONDS.sleep(10);
								WebElement Create =  driver.findElement(By.xpath("//html/body/div[2]/form/div[1]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div/div[6]/div/div/div[2]/div/div[1]/div[3]/table/tbody/tr/td[1]/div/div/div[1]/div/div[2]/div/table/tbody/tr/td/div/div[3]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr/td[2]/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[2]/div/div[1]/div/div[2]/div/span/div/div[1]/div/table/tbody/tr/td[1]/div/div[3]/span/div[2]/div[1]/div[1]/table/tbody/tr/td[1]/div/a/img"));
								Create.click();
							    TimeUnit.SECONDS.sleep(30);
								
							    //Category name with date format
							    String catIn = "CATG-";
							    DateFormat dateformat = new SimpleDateFormat("ddMMMyyhhmmss");
								Date date = new Date();
								String form = dateformat.format(date);
								String catIn2 = form.toString();
								String CatgName = catIn+catIn2;
								System.out.println(CatgName);
								
		                         
								
								
							
							////Category creation 	
								WebElement CatStore = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:ap1:r2:0:catc1:0:it1"));
								CatStore.sendKeys(CatgName);
								 TimeUnit.SECONDS.sleep(30);
								 
								 
								 WebElement Desc = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:ap1:r2:0:catc1:0:it2"));
								 Desc.sendKeys(CatgName);
								 TimeUnit.SECONDS.sleep(30);
								 
								 
								driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:ap1:r2:0:saveACBtn1")).click();
								
								 TimeUnit.SECONDS.sleep(40);

							    
								//Click to Save
								 driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:ap1:commandButton3")).click();
								 System.out.println("Category creation Test case passed");
								 TimeUnit.SECONDS.sleep(10);
								 
						////Category creation Test case Started
									
								 
						//Home Icon
									TimeUnit.SECONDS.sleep(10);
									driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']")).click();
									
								
				}catch (Exception e) {
					System.out.println("testcase failed");
					e.printStackTrace();			}

		}
		

//Advanced Search Execution Starts here//
	 public void AdvncSearch()
	 {
		 try
		 {
			 TimeUnit.SECONDS.sleep(30);
			
				
			 ReadFile();
			//click to navigator icon
				driver.findElement(By.id(prop.getProperty("navigator"))).click();  
				TimeUnit.SECONDS.sleep(20); 
				driver.findElement(By.id(prop.getProperty("pim"))).click();
				TimeUnit.SECONDS.sleep(20);
				
		
		driver.findElement(By.id(prop.getProperty("searchIcn"))).click();
		TimeUnit.SECONDS.sleep(20);
		
		TimeUnit.SECONDS.sleep(30);
		driver.findElement(By.id(prop.getProperty("advanced"))).click();
		TimeUnit.SECONDS.sleep(20);
		
		driver.findElement(By.id(prop.getProperty("itemclass"))).click();
		TimeUnit.SECONDS.sleep(30);
		
		driver.findElement(By.id(prop.getProperty("search"))).click();
		TimeUnit.SECONDS.sleep(30);
		
		driver.findElement(By.id(prop.getProperty("Itemcls"))).sendKeys(prop.getProperty("text"));
		TimeUnit.SECONDS.sleep(10);
		
		
		TimeUnit.SECONDS.sleep(30);
		//Search for Item class
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:itemClassNameId::_afrLovInternalQueryId::search']")).click();
		
		TimeUnit.SECONDS.sleep(40);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:itemClassNameId_afrLovInternalTableId::db']/table/tbody/tr[1]/td[1]")).click();
		TimeUnit.SECONDS.sleep(20);
		
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:itemClassNameId::lovDialogId::ok']")).click();
		TimeUnit.SECONDS.sleep(30);
		
		driver.findElement(By.id(prop.getProperty("itemFeild"))).sendKeys(prop.getProperty("itemname"));
		TimeUnit.SECONDS.sleep(30);
		
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:1:efqrp::search']")).click();
		TimeUnit.SECONDS.sleep(30);
		
		WebElement status = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:1:rstab:_ATp:table1:0:effcpApprovalStatus::content']"));
		String getStatus = status.getText();
		System.out.println(getStatus);
		System.out.println("Test case for advanced search item is successful");
		TimeUnit.SECONDS.sleep(30);
		

		//Home Icon
		TimeUnit.SECONDS.sleep(10);
		 WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
			home.click();
		
	}catch (Exception e) {
		System.out.println("testcase failed");
		e.printStackTrace();
	}
	}

    //
	//MultiRow excection start here//
     public void MultiRow()
     {
            try
            {
                
                   ReadFile();
                   driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Product Management
                         TimeUnit.SECONDS.sleep(10);
                          driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
                         TimeUnit.SECONDS.sleep(10);
                   //for finding the search   ICON and Hitting the search Icon
                         TimeUnit.SECONDS.sleep(30);
                         WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
                         search.click();
                                              
                                              TimeUnit.SECONDS.sleep(10);
                                              
                                              // giving the item name 
                                              
                                              driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(prop.getProperty("multiRowItem"));//enter search text
                                       
                                              TimeUnit.SECONDS.sleep(10);
                                              
                                              // Searching  the item name and hit
                                              driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
                                              
                                              System.out.println("Able to search the item ");
                                              System.out.println("Test case for search Item is Successfull");       
                                         
                       ///Item specification update test case started////


                                              TimeUnit.SECONDS.sleep(20);
                                                     
                                                     //FOr finding the Specification Tab Locator.
                                                                         WebElement SpecificationTabFind = driver.findElement(By.linkText("Specifications"));//specification
                                                                          SpecificationTabFind.click();
                                                                          TimeUnit.SECONDS.sleep(20);
                                                                         
                                                                         
                                                                         //For Multi row attribute update
                                                                         
                                                                         
                                                                         
                                                                         WebElement mutli = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:r1:0:dynam1:0:PGLNK1"));
                                                                         mutli.click();
                                                                          TimeUnit.SECONDS.sleep(20);
                                                                         
                                                                         WebElement add = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:AT1:_ATp:create::icon"));
                                                                          add.click();
                                                                          TimeUnit.SECONDS.sleep(20);
                                                                         
                                                                         
                                                                         WebElement Mfcode1 = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:AT1:_ATp:ATt1:1:tfMrCode::content"));
                                                                     //    Mfcode1.click();
                                                                         // Mfcode1.sendKeys(prop.getProperty("multiFeild1"));
                                                                         
                                                                         Mfcode1.sendKeys("Value30");
                                                                         TimeUnit.SECONDS.sleep(40);
                                                                         
                                                                         
                                                                         WebElement Mfcode2 = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:AT1:_ATp:ATt1:1:tfMrCode1::content"));
                                                                     //    Mfcode2.click();
                                                                      //    Mfcode2.sendKeys(prop.getProperty("multiFeild2"));
                                                                        
                                                                         Mfcode2.sendKeys("Value40");
                                                                         TimeUnit.SECONDS.sleep(40);
                                                                         
                                                                          driver.findElement(By.linkText("Save")).click();
                                                                          TimeUnit.SECONDS.sleep(30);
                                                                         
                                                                          System.out.println("Updated multi row attribute");
                                                                         
                                                                         
                                                                         
                                                                          TimeUnit.SECONDS.sleep(30);
                                                                         
                                                                         
                                                                        //Home Icon
                                  										TimeUnit.SECONDS.sleep(10);
                                  									  WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
                                  									home.click();
                                                                          TimeUnit.SECONDS.sleep(20);
                         ///Item Specification update test case Completed////   
                         
                                
                       
                   }catch (Exception e) {
                         e.printStackTrace();
                         System.out.println("testcase failed");
                         
                   }
                   }
   
     public void  Audit() {

     			
     				try {
     					
     					
     				//Audit Report Test case started
     					ReadFile();
     					//click to navigator icon
     					driver.findElement(By.id(prop.getProperty("navigator"))).click();  
     					TimeUnit.SECONDS.sleep(20);
     					
     					//click on Audit Report
     					driver.findElement(By.id("pt1:nv_itemNode_tools_audit_reports")).click();
     					TimeUnit.SECONDS.sleep(20);
     					
     					//Select Date drop down option to After
     					Select datedrpdwn = new Select(driver.findElement(By.name("pt1:USma:0:MAnt1:0:qryId1:operator0")));
     					datedrpdwn.selectByVisibleText("After");
     					TimeUnit.SECONDS.sleep(20);
     					
     					
     					//Code to Fetch date 30 days prior
     					SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/YY");
     					Date dt1 = new Date();
     					Calendar cal = Calendar.getInstance();
     					cal.add(Calendar.DATE, -30);
     					Date d=cal.getTime();
     					String date=format1.format(d).toString();
     					System.out.println(date);
     					
     					
     					//Select  30 days prior date from date picker
     					driver.findElement(By.id("pt1:USma:0:MAnt1:0:qryId1:value00::content")).sendKeys(date);
     					TimeUnit.SECONDS.sleep(20);
     					
     		           //Select Product Type dropdown
     					Select product = new Select(driver.findElement(By.name("pt1:USma:0:MAnt1:0:qryId1:value20")));
     					product.selectByVisibleText("Product Management");
     					TimeUnit.SECONDS.sleep(20);
     					
     			        //Select Business Object module	
     				    Select BOM = new Select(driver.findElement(By.name("pt1:USma:0:MAnt1:0:qryId1:value40")));
     					BOM.selectByVisibleText("Item");
     					TimeUnit.SECONDS.sleep(20);
     					
     					//Hit Search button
     					driver.findElement(By.xpath(".//*[@id='pt1:USma:0:MAnt1:0:qryId1::search']")).click();
     					TimeUnit.SECONDS.sleep(20);
     					
     					String verify = driver.findElement(By.xpath(".//*[@id='pt1:USma:0:MAnt1:0:AT1:_ATp:ATt1::db']/table/tbody/tr[1]/td[4]")).getText(); 
     					TimeUnit.SECONDS.sleep(20);
     					
     					System.out.println(verify);
     					System.out.println("Able to locate Business object Type");
     					System.out.println("Test Case for Audit Report Passed");
     					
     					
     					//Home Icon
     					TimeUnit.SECONDS.sleep(10);
     					driver.findElement(By.xpath(".//*[@id='pt1:_UIShome::icon']")).click();
     					
     					
     					
     					
     				}catch (Exception e) {
     					e.printStackTrace();
     			}

     		}
     		 
   //Update Item image execution starts here//
	 
   
     public void  BusinessRuleCheck() {

 		
 		try {
 			
 			ReadFile();
 			
 			
 			//click to navigator icon
 			driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_grp_groupNode_product_management")).click();//click on Product Management
 			TimeUnit.SECONDS.sleep(20);
 			driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_wrk_itemNode_product_management_items")).click();
 			TimeUnit.SECONDS.sleep(20);
 			
 			//for finding the search   ICON and Hitting the search Icon
 			TimeUnit.SECONDS.sleep(30);
 			WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
 			search.click();
 						
 						TimeUnit.SECONDS.sleep(10);
 						
 						// giving the item name 
 						
 						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(prop.getProperty("BnRuleItem"));//enter search text
 					
 						TimeUnit.SECONDS.sleep(10);
 						
 						// Searching  the item name and hit
 						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
 						
 						System.out.println("Able to search the item ");
 					       System.out.println("Test case for search Item is Successfull");	

 					       
 						    ///Item specification update test case started////


 									       TimeUnit.SECONDS.sleep(20);
 											
 											//FOr finding the Specification Tab Locator.
 														WebElement SpecificationTabFind = driver.findElement(By.linkText("Specifications"));//specification
 														SpecificationTabFind.click();
 														TimeUnit.SECONDS.sleep(30);
 														
 														
 													
 														//For single row attribute
 														WebElement single = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:r1:0:dynam1:0:PGLNK2"));
 														single.click();
 														TimeUnit.SECONDS.sleep(30);
 														TimeUnit.SECONDS.sleep(40);
 														WebElement Tfcode = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:tfCode"));
 														Tfcode.clear();
 														
 														Tfcode.sendKeys(prop.getProperty("BnValue"));
 														TimeUnit.SECONDS.sleep(40);
 														
 														// Finding the Save Locator id and hitting the save button.
 														driver.findElement(By.linkText("Save")).click();
 														TimeUnit.SECONDS.sleep(40);
 														
 														//To hit Ok button
 														driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:d4::ok")).click();
 														TimeUnit.SECONDS.sleep(40);
 														
 														WebElement Value = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:tfCode::content"));
 														String verify = Value.getAttribute("value");
 														System.out.println("current Tfvalue = "+verify);
 														
 														TimeUnit.SECONDS.sleep(10);
 														System.out.println("Test case passed");
 			                                       
 														
 			

 			 //Home Icon
 			TimeUnit.SECONDS.sleep(10);
 			driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']")).click();
 			
 		}catch (Exception e) {
 			e.printStackTrace();
 		}
 		
 	
 } 


	//item create execution starts here//
	 
	public void ItemCreate(){
		try
		{
			TimeUnit.SECONDS.sleep(10);
			String orgname = "000";//put this in propr
			String itemclass = "Clothing";
			DateFormat dateformat = new SimpleDateFormat("ddMMyyhhmmss");
			Date date = new Date();
			String form = dateformat.format(date);
			String itemnumber = "Test_";
			item_numberG = itemnumber;
			String itemnumber2 = form.toString();
			
			
			
			//WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
			//home.click();
			///Product Management
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
	
			
			////Taskbar
			TimeUnit.SECONDS.sleep(30);
			WebElement taskbar1 = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemRegionalArea::icon"));
			taskbar1.click();
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl1")).click();
			System.out.println("Taskbar Accessed");
			
			//Organization Selection
			TimeUnit.SECONDS.sleep(15);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::lovIconId")).click();
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::dropdownPopup::popupsearch")).click();
			TimeUnit.SECONDS.sleep(20);
			WebElement orgidtext = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::_afrLovInternalQueryId:value00::content"));
			orgidtext.click();
			TimeUnit.SECONDS.sleep(20);
			orgidtext.sendKeys(orgname);
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::_afrLovInternalQueryId::search")).click();
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]")).click();
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::lovDialogId::ok")).click();
			System.out.println("Organization Name Selected");
			TimeUnit.SECONDS.sleep(20);
			
			//ItemClass Selection
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::lovIconId")).click();
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::dropdownPopup::popupsearch")).click();
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::_afrLovInternalQueryId:value00::content")).sendKeys(itemclass);
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::_afrLovInternalQueryId::search")).click();
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]")).click();
			TimeUnit.SECONDS.sleep(15);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::lovDialogId::ok")).click();
			System.out.println("Item Class Selected");
			TimeUnit.SECONDS.sleep(25);
			
			///Ok button
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:commandButton3")).click();
			TimeUnit.SECONDS.sleep(20);
			///Warning
			//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:cb2")).click();
			
			/////Create Item Page
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r10:0:inputText1::content")).sendKeys(itemnumber+itemnumber2);
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r10:0:inputText2::content")).sendKeys(itemnumber+itemnumber2);
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:csave::popEl']")).click();
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:cclose']/td[2]")).click();
			TimeUnit.SECONDS.sleep(20);
			System.out.println("Item Created Successfully");
			 WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
				home.click();
			
		
		}
		catch(Exception e){
			System.out.println("testcase failed");
			e.printStackTrace();
		}

	}


	

	

	public void searchItem() throws Exception {
		///Item search test case started////
		try {
			
			
			  // For finding the navigator Icon and hitting the navigator
			
			TimeUnit.SECONDS.sleep(30);
			driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
			TimeUnit.SECONDS.sleep(10);
			
			//for finding the search   ICON and Hitting the search Icon
			TimeUnit.SECONDS.sleep(30);
			WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
			search.click();
						
						TimeUnit.SECONDS.sleep(10);
						
						// giving the item name 
						ReadFile();
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(prop.getProperty("Item"));//enter search text
					
						TimeUnit.SECONDS.sleep(10);
						
						// Searching  the item name and hit
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
						
						System.out.println("Able to search the item ");
					       System.out.println("Test case for search Item is Successfull");	
					       WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
						home.click();
							
							 

			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("testcase failed");
				e.printStackTrace();
				} 
			
		} 

	
			
	public void updateItem() throws Exception {
		
		
		try {
			
			//searchItem();
			
			
			TimeUnit.SECONDS.sleep(30);
			driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
			TimeUnit.SECONDS.sleep(200);
			
			//for finding the search   ICON and Hitting the search Icon
			TimeUnit.SECONDS.sleep(30);
			WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
			search.click();
						
						TimeUnit.SECONDS.sleep(10);
						
						// giving the item name 
						ReadFile();
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(prop.getProperty("Item"));//enter search text
					
						TimeUnit.SECONDS.sleep(10);
						
						// Searching  the item name and hit
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
						
						System.out.println("Able to search the item ");
			
			TimeUnit.SECONDS.sleep(20);
			 System.out.println("Specification method for spec");
				//FOr finding the Specification Tab Locator.
							WebElement SpecificationTabFind = driver.findElement(By.linkText("Specifications"));//specification
							SpecificationTabFind.click();
							TimeUnit.SECONDS.sleep(20);
							
							// Find the standard lot size locator and give the value for it.
							WebElement standardLotSizeValue = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:0:ItemCos:0:inputText1::content"));//enter locator text value.
							standardLotSizeValue.clear(); // Clear the standard lot size  value
							standardLotSizeValue.sendKeys("111"); //Enter the Value for standard lot size
							
							TimeUnit.SECONDS.sleep(30);
							
							// Finding the Save Locator id and hitting the save button.
							driver.findElement(By.linkText("Save")).click();
							System.out.println("Update Item is Successfull");
							System.out.println("Test case for Update Item is Successfull");
							TimeUnit.SECONDS.sleep(20);
							 WebElement home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
								home.click();
							TimeUnit.SECONDS.sleep(20);
							//System.out.println("testcase failed");

} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("testcase failed");
	e.printStackTrace();
	
}


} 

	
public void Catalogs() throws Exception{

	try{
		
		
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
		TimeUnit.SECONDS.sleep(10);
		
		TimeUnit.SECONDS.sleep(30);
		WebElement taskBar = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemRegionalArea::icon"));
		taskBar.click();
		System.out.println("taskbar rendered");
		TimeUnit.SECONDS.sleep(10);
	

		WebElement manageCatalog = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl6"));
		manageCatalog.click();
		TimeUnit.SECONDS.sleep(10);
		
		WebElement create = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ls1:ctblv1::icon']"));
		create.click();
		System.out.println("Create successful");
		TimeUnit.SECONDS.sleep(10);
		Date date = new Date();
		
		 String str = date.toString();
		    System.out.println(str);
		    String result = str.replaceAll("[\\s\\:]","");
		    
		    String index = result.substring(0,14);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ls1:catalogSearchQueryResultId:Catal1:1:it2::content")).sendKeys(index);
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ls1:catalogSearchQueryResultId:Catal1:1:it1::content")).sendKeys("Today");
		TimeUnit.SECONDS.sleep(10);
		
		WebElement save = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ls1:catalogSearchQueryResultId:saveandopen']/table/tbody/tr/td[1]/a/span"));
		save.click();
		TimeUnit.SECONDS.sleep(10);
		WebElement close = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:ap1:commandButton1']"));
		close.click();
		TimeUnit.SECONDS.sleep(10);
	
				
				//if(driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ctb2']/a")).size() != 0)
					if(driver.findElements(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ctb2']/a")).size() != 0)
						System.out.println("done button exists");
					TimeUnit.SECONDS.sleep(10);
					WebElement done = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ctb2']/a"));
					
					done.click();//click on done
					TimeUnit.SECONDS.sleep(10);

	//	done.click();//click on done
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Catalog Creation Testcase Successfull");						
		WebElement home1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));//.//*[@id='pt1:_UIShome::icon']
		home1.click();//redirecting to home page
		TimeUnit.SECONDS.sleep(5);
		
		///Catalog Creation Completed////	
		
		}catch(Exception e){
			System.out.println("testcase failed");
			e.printStackTrace();

		}
	
		
	}


	

	   	

		
		
		
		
		
	
////Categories Creation


public void catCreate()  {
	try{
		
		ReadFile();
		TimeUnit.SECONDS.sleep(30);
		driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
		TimeUnit.SECONDS.sleep(20);
		WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
		search.click();
					
					TimeUnit.SECONDS.sleep(20);
					
					// giving the item name 
					
					driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(prop.getProperty("singleRowItem"));//enter search text
				
					TimeUnit.SECONDS.sleep(20);
					
					// Searching  the item name and hit
					driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
					TimeUnit.SECONDS.sleep(30);
					System.out.println("Able to search the item ");
				       System.out.println("Test case for search Item is Successfull");	 

				       TimeUnit.SECONDS.sleep(30);
		WebElement cat = driver.findElement(By.linkText("Categories"));
		cat.click();							
		
		
		TimeUnit.SECONDS.sleep(20);
		WebElement addRw = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:create::icon"));//add row
		addRw.click();	
		
		TimeUnit.SECONDS.sleep(30);
		WebElement catlov = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:2:Catalog::lovIconId']"));
		catlov.click();
		
		TimeUnit.SECONDS.sleep(30);
		WebElement option = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:2:Catalog::dropdownPopup::dropDownContent::db']/table/tbody/tr[4]/td"));//to select value
		option.click();
		TimeUnit.SECONDS.sleep(30);
		
		WebElement catlov2 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:2:Category::lovIconId']"));
		catlov2.click();
		TimeUnit.SECONDS.sleep(30);
		WebElement option1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:2:Category::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td[1]"));
		option1.click();
		TimeUnit.SECONDS.sleep(30);
		
		driver.findElement(By.linkText("Save")).click();
		System.out.println("Update Categories is Successfull");
		System.out.println("Test case for Update categories is Successfull");
		
		//Home Icon
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']")).click();
		
	}catch(Exception e){
		System.out.println("testcase failed");
		e.printStackTrace();

	}
	
}
	



///ChangeItem


public void PDHCreateItemChangeOrder() {

	
	try{
		 ReadFile();
		String orgname = "000";
		String itemclass = "Clothing";
		DateFormat dateformat = new SimpleDateFormat("ddMMyyhhmmss");
		Date date = new Date();
		String form = dateformat.format(date);
		String chname = "Ch_Test-";
		String itemnumber = "Test_";
		String itemnumber2 = form.toString();
	
		
		///Product Management
		driver.findElement(By.id(prop.getProperty("navigator"))).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id(prop.getProperty("pim"))).click();
		TimeUnit.SECONDS.sleep(10);
		
		////Taskbar
		TimeUnit.SECONDS.sleep(30);
		WebElement taskbar1 = driver.findElement(By.id(prop.getProperty("taskbar")));
		taskbar1.click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id(prop.getProperty("createitem"))).click();
		System.out.println("Taskbar Accessed");
		
		//Organization Selection
		TimeUnit.SECONDS.sleep(15);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::lovIconId")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::dropdownPopup::popupsearch")).click();
		TimeUnit.SECONDS.sleep(10);
		WebElement orgidtext = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::_afrLovInternalQueryId:value00::content"));
		orgidtext.click();
		orgidtext.sendKeys(orgname);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::_afrLovInternalQueryId::search")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]")).click();
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::lovDialogId::ok")).click();
		System.out.println("Organization Name Selected");
		TimeUnit.SECONDS.sleep(10);
		
		//ItemClass Selection
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::lovIconId")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::dropdownPopup::popupsearch")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::_afrLovInternalQueryId:value00::content")).sendKeys(itemclass);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::_afrLovInternalQueryId::search")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]")).click();
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::lovDialogId::ok")).click();
		System.out.println("Item Class Selected");
		TimeUnit.SECONDS.sleep(10);
		
		///Ok button
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:commandButton3")).click();
		TimeUnit.SECONDS.sleep(20);
		///Warning
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:cb2")).click();
		
		/////Create Item Page
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r10:0:inputText1::content")).sendKeys(itemnumber+itemnumber2);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r10:0:inputText2::content")).sendKeys(itemnumber+itemnumber2);
		driver.findElement(By.linkText("Save")).click();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Item Created");
		
		///////Update
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r10:0:inputText2::content")).sendKeys("Update");
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r8:0:r1:0:udaTextAttr::content']")).sendKeys("Update");
		
		///Save to ChangeOrder
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:csavebtn::popEl")).click();
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:savetoco']/td[2]")).click();
		TimeUnit.SECONDS.sleep(10);
		
		///Select Change Order
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:nextbtn']/a")).click();
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:r1:0:it5::content")).sendKeys(chname+itemnumber2);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:r1:0:it6::content")).sendKeys(chname+itemnumber2);
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:createchange2::popEl']")).click();
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:cb2']/td[2]")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:appPanel:ctb11")).click();
		System.out.println("Change Order Created");
		
		TimeUnit.SECONDS.sleep(10);
		driver.navigate().refresh();
		driver.findElement(By.xpath(prop.getProperty("notificationicon"))).click();
		//TimeUnit.SECONDS.sleep(10);
		//driver.findElement(By.id("_FOpt1:_UISatr:0:lView1:0:gl2")).click();
		System.out.println("Change Order ID : Reflected in the notification");
		
		////Log OUT
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(prop.getProperty("logoutarrow"))).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id(prop.getProperty("signout"))).click();
		TimeUnit.SECONDS.sleep(15);
		System.out.println("Logged OUT of first instance");
		
		/////Login SELENIUM_USER
		driver.findElement(By.xpath(prop.getProperty("confirm"))).click();
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.id("userid")).sendKeys("USER_SELENIUM");
		driver.findElement(By.id("password")).sendKeys("selenium123");
		driver.findElement(By.id("btnActive")).click();
		TimeUnit.SECONDS.sleep(20);
		System.out.println("Logged into of second instance");
		
		///
		driver.findElement(By.xpath(prop.getProperty("homeicon"))).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(prop.getProperty("notificationicon"))).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(".//*[@id='pt1:_UISatr:0:lView1:0:itCa:0:clCa']")).click();
		System.out.println("Approved the Change Order");
		
		////Logout of selenium user
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(prop.getProperty("logoutarrow"))).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(prop.getProperty("signout"))).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(prop.getProperty("confirm"))).click();
		System.out.println("Logged OUT of Selenium User");
		
		////Re-Login to First instance
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("btnActive")).click();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Logged in of first Instance");
		
		/////Notification
		//driver.navigate().refresh();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(prop.getProperty("notificationicon"))).click();
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.xpath(".//*[@id='pt1:_UISatr:0:lView1:1:gl2']")).click();
		
		
	}
	catch(Exception e){
		e.printStackTrace();
	}


}




////Rohini



public void CreateItemStructure(){
	try
	{
		ReadFile();
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
		TimeUnit.SECONDS.sleep(15);
WebElement taskBar = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemRegionalArea::icon']"));
taskBar.click();
TimeUnit.SECONDS.sleep(20);
System.out.println("taskbar rendered");

WebElement createitem = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl5']"));
createitem.click();
TimeUnit.SECONDS.sleep(15);
System.out.println("execution end");


WebElement button = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:dynam1:0:organizationCodeId::lovIconId']"));
button.click();
TimeUnit.SECONDS.sleep(20); // drop down list got clicked

WebElement option1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:dynam1:0:organizationCodeId::dropdownPopup::dropDownContent::db']/table/tbody/tr[1]/td[1]"));
option1.click();
TimeUnit.SECONDS.sleep(20);//  selected org

WebElement search = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:dynam1:0:itemId:searchIcoId::icon']"));
search.click();
TimeUnit.SECONDS.sleep(20); // searching the item name 



driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:dynam1:0:itemId:Popup1:0:Advan1:0:efqrp:value00::content")).sendKeys(prop.getProperty("itmname")); 
TimeUnit.SECONDS.sleep(20);
WebElement search1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:dynam1:0:itemId:Popup1:0:Advan1:0:efqrp::search']"));
search1.click();
TimeUnit.SECONDS.sleep(20); // searches the item name 


WebElement select = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:dynam1:0:itemId:Popup1:0:Advan1:0:rstab:_ATp:table1::db']/table/tbody/tr[1]/td[3]"));
select.click();
TimeUnit.SECONDS.sleep(20); // select the result

WebElement ok = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:dynam1:0:itemId:cb1']"));
ok.click();
TimeUnit.SECONDS.sleep(20);

WebElement OkButton = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:dynam1:0:cb1']"));
OkButton.click();
TimeUnit.SECONDS.sleep(25);

WebElement Button1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sStruc:0:selectOneChoice1::content']"));
Button1.click();
TimeUnit.SECONDS.sleep(20);


WebElement alternate = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sStruc:0:selectOneChoice1::content']/option[2]"));
alternate.click(); 
TimeUnit.SECONDS.sleep(20);


driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sStruc:0:inputText9::content")).sendKeys(prop.getProperty("Description"));

WebElement OkButton1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sStruc:0:saveACBtn2']"));
OkButton1.click();
TimeUnit.SECONDS.sleep(25);




WebElement save = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:csavebtn']/table/tbody/tr/td[1]/a/span"));
save.click();
TimeUnit.SECONDS.sleep(20);

if(driver.findElements(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:ptpgl6']/tbody/tr/td[3]/span")).size() != 0)

	System.out.println("saved successfully");
else 
	System.out.println("save failed");

WebElement ClickAlternate = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sStruc:0:AT2:_ATp:table2:1:cl1']"));
ClickAlternate.click();
TimeUnit.SECONDS.sleep(30);

WebElement AddComponent = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:AP1:ATT1:_ATTp:ctb1::icon']"));
 AddComponent.click();
TimeUnit.SECONDS.sleep(20);

driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:AP1:ATT1:Advan1:0:Advan1:0:efqrp:value00::content']")).sendKeys(prop.getProperty("Component"));


WebElement Searchitem = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:AP1:ATT1:Advan1:0:Advan1:0:efqrp::search']"));
Searchitem.click();
TimeUnit.SECONDS.sleep(20);


WebElement Selectitem = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:AP1:ATT1:Advan1:0:Advan1:0:rstab:_ATp:table1::db']/table/tbody/tr/td[3]"));
Selectitem.click();
TimeUnit.SECONDS.sleep(20);


WebElement Ok = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:AP1:ATT1:doneAdd']"));
Ok.click();
TimeUnit.SECONDS.sleep(20);



WebElement Done = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:AP1:cb1']/a"));
Done.click();
TimeUnit.SECONDS.sleep(25);







WebElement close = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:csavebtn::popEl']"));
close.click();
TimeUnit.SECONDS.sleep(20);

WebElement CloseAndSave = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:saveandClose']/td[2]"));
CloseAndSave.click();
TimeUnit.SECONDS.sleep(20);


WebElement Home = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
Home.click();
TimeUnit.SECONDS.sleep(20);

//WebElement yes = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAyes']"));
//yes.click(); 
//TimeUnit.SECONDS.sleep(20);

WebElement yes = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAyes"));
yes.click(); 
TimeUnit.SECONDS.sleep(20);
System.out.println("Create Item testcase successfull");

}
	catch(Exception e){
		e.printStackTrace();
	}
}



public void CrossRef()
{
	try
	{

		ReadFile();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
		TimeUnit.SECONDS.sleep(15);
		WebElement ItemSearch= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon']"));
		ItemSearch.click();
		TimeUnit.SECONDS.sleep(10);
		
		WebElement itemSelect = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content']"));
		itemSelect.click();
		TimeUnit.SECONDS.sleep(10);
		
		
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content']")).sendKeys(prop.getProperty("itmname"));
		TimeUnit.SECONDS.sleep(10);
	   
	WebElement searchclick= driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon"));
		searchclick.click();
		TimeUnit.SECONDS.sleep(10);
		
		WebElement Relationship = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:srel::disAcr']"));
		Relationship.click();
		TimeUnit.SECONDS.sleep(10);
		
		WebElement crossreferrence = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:np1:cni4']"));
		crossreferrence.click();
		TimeUnit.SECONDS.sleep(10);
		
		WebElement add1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sXrefs:1:ItemXrefResultsApp:_ATp:create::icon']"));
		add1.click();
		TimeUnit.SECONDS.sleep(10);
		
		WebElement type = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sXrefs:1:ItemXrefResultsApp:selectOneChoice1::content']"));
		type.click();
		TimeUnit.SECONDS.sleep(10);
		
		WebElement supply = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sXrefs:1:ItemXrefResultsApp:selectOneChoice1::content']/option[2]"));
		supply.click();
		TimeUnit.SECONDS.sleep(20);
		
		
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sXrefs:1:ItemXrefResultsApp:inputText4::content']")).sendKeys(prop.getProperty("value"));
		TimeUnit.SECONDS.sleep(15);
		

		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sXrefs:1:ItemXrefResultsApp:inputText5::content']")).sendKeys(prop.getProperty("Description1"));
		TimeUnit.SECONDS.sleep(15);
		
		WebElement okaybutton = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sXrefs:1:ItemXrefResultsApp:saveACBtn1']/a/span"));
		okaybutton.click();
		TimeUnit.SECONDS.sleep(10);
		
		WebElement save2 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:csavebtn']/table/tbody/tr/td[1]/a/span"));
	    save2.click();
		TimeUnit.SECONDS.sleep(15);
		
		if(driver.findElements(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:ptpgl6']/tbody/tr/td[3]/span")).size() != 0)
        
			System.out.println("saved successfully");
		else 
			System.out.println("save failed");
		
		
		 WebElement close2 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:csavebtn::popEl']"));
		    close2.click();
			TimeUnit.SECONDS.sleep(15);
		    
		    WebElement CloseAndSave2= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:saveandClose']/td[2]"));
		    CloseAndSave2.click();
			TimeUnit.SECONDS.sleep(15);
		    
		    
		    WebElement Home2 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
		   Home2.click();
			TimeUnit.SECONDS.sleep(20);
			
			System.out.println("Cross Reference test case successfull");
		    
	//	   WebElement yes2 = driver.findElement(By.xpath(".//*[@id='_FOpt1:MAyes']"));
		//   yes2.click(); 
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
}


public void RelatedData()
{
	try
	{

		ReadFile();
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.id("pt1:_UISmmLink::icon")).click();//click on Navigator
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
		TimeUnit.SECONDS.sleep(25);
        WebElement SearchItem = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon']"));
SearchItem.click();
TimeUnit.SECONDS.sleep(20);

WebElement selectitems = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content']"));
selectitems.click();
TimeUnit.SECONDS.sleep(20);

driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content']")).sendKeys(prop.getProperty("itmname"));
TimeUnit.SECONDS.sleep(20);

WebElement clicksearch= driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon"));
clicksearch.click();
TimeUnit.SECONDS.sleep(20);


WebElement Relationship = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:srel::disAcr']"));
Relationship.click();
TimeUnit.SECONDS.sleep(20);


WebElement add = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:_ATp:create::icon']"));
add.click();
TimeUnit.SECONDS.sleep(20);


WebElement searchitems2 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:ip2:searchIcoId::icon']"));
searchitems2.click();
TimeUnit.SECONDS.sleep(20);

driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:ip2:Popup1:0:Advan1:0:efqrp:value00::content']")).sendKeys(prop.getProperty("itemname1"));



WebElement searchitems3 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:ip2:Popup1:0:Advan1:0:efqrp::search']"));
searchitems3.click();
TimeUnit.SECONDS.sleep(20);




WebElement selectitems2 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:ip2:Popup1:0:Advan1:0:rstab:_ATp:table1::db']/table/tbody/tr/td[3]"));
selectitems2.click();
TimeUnit.SECONDS.sleep(20);


WebElement clickokay = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:ip2:cb1']"));
clickokay.click();
TimeUnit.SECONDS.sleep(20);

WebElement clicktype = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:ceTyp2::content']"));
clicktype.click();
TimeUnit.SECONDS.sleep(20);

WebElement option2 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:ceTyp2::content']/option[2]"));
option2.click();
TimeUnit.SECONDS.sleep(20);

driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:inputText6::content']")).sendKeys(prop.getProperty("description1"));

WebElement okay1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sRelFl:1:RelatedItemResults:saveACBtn1']/a/span"));
okay1.click();
TimeUnit.SECONDS.sleep(20);


WebElement save1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:csavebtn']/table/tbody/tr/td[1]/a/span"));
save1.click();
TimeUnit.SECONDS.sleep(25);

if(driver.findElements(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:ptpgl6']/tbody/tr/td[3]/span")).size() != 0)

	System.out.println("saved successfully");
else 
	System.out.println("save failed");


 WebElement close1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:csavebtn::popEl']"));
    close1.click();
	TimeUnit.SECONDS.sleep(25);
    
    WebElement CloseAndSave1= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:saveandClose']/td[2]"));
    CloseAndSave1.click();
	TimeUnit.SECONDS.sleep(25);
    
    
    WebElement Home1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']"));
   Home1.click();
	TimeUnit.SECONDS.sleep(20);
    
 //  WebElement yes1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:MAyes']"));
  // yes1.click(); 
	System.out.println("Related Data testcase Successfull");
	
	}
   
	catch(Exception e){
		e.printStackTrace();
	}
} 
   
	public void itemDataPublishing(){
		try{
			ReadFile();
			DateFormat dateformat = new SimpleDateFormat("MM/dd/yy");
			Date date = new Date();
			String today = dateformat.format(date);
			Calendar c = Calendar.getInstance();
			c.add(c.DATE, -10);
			Date lastday = c.getTime();
			String last=dateformat.format(lastday);
			
			///Product Management
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id(prop.getProperty("navigator"))).click();
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id(prop.getProperty("pim"))).click();
			TimeUnit.SECONDS.sleep(10);
			
			///Taskbar
			TimeUnit.SECONDS.sleep(30);
			WebElement taskbar3 = driver.findElement(By.id(prop.getProperty("taskbar")));
			taskbar3.click();
			TimeUnit.SECONDS.sleep(10);
			System.out.println("Taskbar Accessed");
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl17")).click();
			
			///Manage Spoke System
			TimeUnit.SECONDS.sleep(20);
			//driver.findElement(By.linkText("Product Information Management Data Hub")).click();
			WebElement pimdh = driver.findElement(By.linkText("Product Information Management Data Hub"));
			JavascriptExecutor exe = (JavascriptExecutor)driver;
			exe.executeScript("arguments[0].click();", pimdh);
			System.out.println("Product Information Management Data Hub");
			
			///Publish Dropdown
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.linkText("Publish")).click();
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:pt1:bpan:cmi1']/td[2]")).click();
			
			//Publish Now
			TimeUnit.SECONDS.sleep(20);
			System.out.println("last 10 days::"+last);
			WebElement datefield = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:pt1:bpan:r3:0:id1::content"));
			datefield.clear();
			datefield.sendKeys(last);
			TimeUnit.SECONDS.sleep(10);
			WebElement folderloc = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:pt1:bpan:r3:0:it6::content"));
			folderloc.click();
			folderloc.sendKeys("/Contribution Folders/PIM/Inbound/");
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:pt1:bpan:r3:0:FAsc1")).click();
			System.out.println("Submitted Successfully, Please wait for 60seconds");
			
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:1:pt1:bpan:r3:0:confirmationOk']")).click();
			
			///////WebCenter Content Page
			TimeUnit.SECONDS.sleep(60);
			driver.navigate().to("https://ecdy-test.fs.us2.oraclecloud.com/cs/idcplg");
			TimeUnit.SECONDS.sleep(20);
			System.out.println("WebCenter Page Accessed");
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath(".//*[@id='ygtvlabelel24']/div")).click();
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath(".//*[@id='ygtvt26']/a")).click();
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath(".//*[@id='ygtvt42']/a")).click();
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath(".//*[@id='ygtvlabelel44']")).click();
			TimeUnit.SECONDS.sleep(10);
			System.out.println("Publised Data is Updated");
			//Refresh Page
			driver.findElement(By.xpath(".//*[@id='headerTable']/tbody/tr[1]/td/table/tbody/tr/td[3]/table/tbody/tr/td[8]/a")).click();
			TimeUnit.SECONDS.sleep(20);
			//Home icon
			driver.findElement(By.xpath(prop.getProperty("homeicon"))).click();
			TimeUnit.SECONDS.sleep(20);
		
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void itemBatchScript(){
		try{
			ReadFile();
			DateFormat dateformat = new SimpleDateFormat("ddMMyyhhmmss");
			Date date = new Date();
			String form = dateformat.format(date);
			String batchname2 = form.toString();
			String batchname = "TestBatch_";
		
		///Product Management
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.id(prop.getProperty("navigator"))).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id(prop.getProperty("pim"))).click();
		TimeUnit.SECONDS.sleep(10);
		
		///Taskbar
		TimeUnit.SECONDS.sleep(30);
		WebElement taskbar = driver.findElement(By.id(prop.getProperty("taskbar")));
		taskbar.click();
		System.out.println("Taskbar Accessed");
		TimeUnit.SECONDS.sleep(10);
		
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl15")).click();
		TimeUnit.SECONDS.sleep(20);//Item Batches
		
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:r1:0:SearchResultsTable:_ATp:create::icon")).click();
		TimeUnit.SECONDS.sleep(15);///Plus icon
		
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:it2::content")).sendKeys(batchname+batchname2);
		TimeUnit.SECONDS.sleep(15);///Batch Name
		
		///Save and close dropdown
		WebElement sc = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:ctb1::popEl']"));
		sc.click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:m2']/td[4]/div")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:cmi2']/td[2]")).click();

		///Upload File Popup
		/////Import Map Selection
		TimeUnit.SECONDS.sleep(10);
		WebElement lovicon = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r4:0:mapNameId::lovIconId']"));
		lovicon.click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r4:0:mapNameId::dropdownPopup::popupsearch']")).click();
		TimeUnit.SECONDS.sleep(10);
		WebElement iccsearch = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r4:0:mapNameId::_afrLovInternalQueryId:value00::content"));
		iccsearch.sendKeys("TestItemMap");
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r4:0:mapNameId::_afrLovInternalQueryId::search")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r4:0:mapNameId_afrLovInternalTableId::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r4:0:mapNameId::lovDialogId::ok")).click();
		TimeUnit.SECONDS.sleep(10);///Ok Button
		
		///Browse Button
		WebElement browse = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:r4:0:if1::content']"));
		browse.sendKeys("C:"+File.separator+"Users"+File.separator+"harshithap"+File.separator+"Desktop"+File.separator+"ItemMapsTemp.txt");
		TimeUnit.SECONDS.sleep(30);
		System.out.println("File Selected from the Drive");
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:uploadFileCB")).click();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("File Upload Complete");
		
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:d10::ok")).click();
		TimeUnit.SECONDS.sleep(20);
		
		//Home icon
		driver.findElement(By.xpath(prop.getProperty("homeicon"))).click();
		TimeUnit.SECONDS.sleep(20);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void updateItemImage(){
	try{
		ReadFile();
		String updateitemnumber = "Test-ItemMap04";
		
		///Product Management
		TimeUnit.SECONDS.sleep(20);
		driver.findElement(By.id(prop.getProperty("navigator"))).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id(prop.getProperty("pim"))).click();
		TimeUnit.SECONDS.sleep(20);
		
		///Search bar
		TimeUnit.SECONDS.sleep(30);
		WebElement searchbar = driver.findElement(By.xpath(prop.getProperty("searchbar")));
		searchbar.click();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Searchbar Accessed");
		
		
		WebElement searchtext = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content"));
		searchtext.click();
		searchtext.sendKeys(updateitemnumber);
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();
		TimeUnit.SECONDS.sleep(15);
		System.out.println("Item Searched");
		
		
		///Manage Attachments
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:r10:0:a1:clLAdds::icon")).click();
		TimeUnit.SECONDS.sleep(20);
		/*WebElement type = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:r10:0:a1:popApplicationsTable:_ATp:popAttachmentTable:0:popDatatypeCodeChoiceListIDNew::content']"));
		Select dropdowntype = new Select(type);
		dropdowntype.selectByValue("File");*/
		
		//TimeUnit.SECONDS.sleep(10);
		WebElement browsefile = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:r10:0:a1:popApplicationsTable:_ATp:popAttachmentTable:0:ifPopup::content']"));
		browsefile.sendKeys("C:"+File.separator+"Users"+File.separator+"harshithap"+File.separator+"Desktop"+File.separator+"image123.jpg");
		TimeUnit.SECONDS.sleep(30);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:r10:0:a1:dc_cb1")).click();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Image Updated Successfully");
		
		//Save and Close
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:csavebtn::popEl']")).click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:saveandClose']/td[2]")).click();
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Item Updated and Saved Successfully!!");
		
		//Home icon
		driver.findElement(By.xpath(prop.getProperty("homeicon"))).click();
		TimeUnit.SECONDS.sleep(20);
	}
	catch(Exception e){
		e.printStackTrace();
	}
}






	public void NIR() throws InterruptedException {
		
	
			driver.findElement(By.id("pt1:_UISmmLink::icon")).click();
			
			 TimeUnit.SECONDS.sleep(15);
	       driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
	       TimeUnit.SECONDS.sleep(30);
	       
	       WebElement taskBar = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemRegionalArea::icon']"));
			taskBar.click();
			TimeUnit.SECONDS.sleep(20);
			System.out.println("taskbar rendered");
			
			  WebElement Createitem = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl1']"));
				Createitem.click();
				TimeUnit.SECONDS.sleep(15);
				
				 WebElement Org = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::lovIconId']"));
					Org.click();
					TimeUnit.SECONDS.sleep(15);	
					
					    WebElement Option1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::dropdownPopup::dropDownContent::db']/table/tbody/tr[1]/td[1]"));
						Option1.click();
						TimeUnit.SECONDS.sleep(15);			
					
				//		driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:nitxt::content']")).sendKeys("1");
					//	TimeUnit.SECONDS.sleep(5);
	       
			
						WebElement button = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::lovIconId']"));
						button.click();
						TimeUnit.SECONDS.sleep(20);	
						

						WebElement foodservice = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::dropdownPopup::dropDownContent::db']/table/tbody/tr[3]/td[1]"));
						foodservice.click();
						TimeUnit.SECONDS.sleep(20);	
						
						WebElement Ok = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:commandButton3']"));
						Ok.click();
						TimeUnit.SECONDS.sleep(50);
					
						
						
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r10:0:inputText2::content']")).sendKeys("NIR_FoodServices");
						TimeUnit.SECONDS.sleep(15);  // description
						
					//	driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r10:0:pfl2")).sendKeys("NIR_FoodServices");
					//	TimeUnit.SECONDS.sleep(15);  // description
						
						WebElement Specification= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:sspec::disAcr']"));
						Specification.click();
						TimeUnit.SECONDS.sleep(15);
						
						
						WebElement Sourcingpage= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:sspecf:1:r1:0:dynam1:0:PGLNK4']"));
						Sourcingpage.click();
						TimeUnit.SECONDS.sleep(15);
						
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:supplierNumber::content']")).sendKeys("1");
						TimeUnit.SECONDS.sleep(15); //  supplier number
						

						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:categoryName::content']")).sendKeys("NIR_foodservices");
						TimeUnit.SECONDS.sleep(15); // category name
						
						
	       
						WebElement Save= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:csave']/table/tbody/tr/td[1]/a/span"));
						Save.click();
						TimeUnit.SECONDS.sleep(15);
						
						WebElement Submit= driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:customSubmit']/a/span"));
						Submit.click();
						TimeUnit.SECONDS.sleep(20);
						
						WebElement next=driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:nextbtn']/a/span"));
						next.click();
						TimeUnit.SECONDS.sleep(20);
						
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:r1:0:it5::content']")).sendKeys("NIR_ITEM1009");
						TimeUnit.SECONDS.sleep(20);
						
						
						driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:r1:0:it6::content']")).sendKeys("NIR_FoodServices");
						TimeUnit.SECONDS.sleep(20);
						
						WebElement button1=driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:createchange2::popEl']"));
						button1.click();
						TimeUnit.SECONDS.sleep(20);
						
						
						
						
						WebElement SaveAndEdit=driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:SelCh:0:cb2']/td[2]"));
						SaveAndEdit.click();
						TimeUnit.SECONDS.sleep(20);
						
						
						WebElement Submit1=driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt4:0:appPanel:ctb11']"));
						Submit1.click();
						TimeUnit.SECONDS.sleep(20);
						
						
				
						
						
						System.out.println("submited succesfully");
						
						TimeUnit.SECONDS.sleep(300);
						
						WebElement User=driver.findElement(By.id("_FOpt1:_UIScmil1u::icon"));
						User.click();
						TimeUnit.SECONDS.sleep(20);
						System.out.println("clicked");
						
						WebElement signout=driver.findElement(By.xpath(".//*[@id='_FOpt1:_UISlg1']"));
						signout.click();
						TimeUnit.SECONDS.sleep(15);
						
						WebElement logoutconfirm=driver.findElement(By.xpath(".//*[@id='Confirm']"));
						logoutconfirm.click();
						TimeUnit.SECONDS.sleep(20);
						
						
					//	driver.navigate().to("https://ecdy-test.prc.us2.oraclecloud.com/procurement/faces/FndOverview");
						
	       
						driver.findElement(By.id("userid")).sendKeys("USER_SELENIUM");
						driver.findElement(By.id("password")).clear();
						driver.findElement(By.id("password")).sendKeys("selenium123");
						driver.findElement(By.id("btnActive")).click();
						  TimeUnit.SECONDS.sleep(10);
						  
						  System.out.println(" other user login successful ");
						
						  WebElement notificationBELL=driver.findElement(By.xpath(".//*[@id='pt1:_UISatr:0:cil1::icon']"));
						  notificationBELL.click();
							TimeUnit.SECONDS.sleep(20);
							
							
							
							
							System.out.println("notification bell clicked ");
							
							 WebElement approve=driver.findElement(By.xpath(".//*[@id='pt1:_UISatr:0:lView1:0:itCa:0:clCa']"));
							  approve.click();
								TimeUnit.SECONDS.sleep(10);
								
								
								System.out.println("approved");
						
								
								WebElement User1=driver.findElement(By.xpath(".//*[@id='pt1:_UIScmil1u::icon']"));
								User1.click();
								TimeUnit.SECONDS.sleep(15);
								
								WebElement signout1=driver.findElement(By.xpath(".//*[@id='pt1:_UISlg1']"));
								signout1.click();
								TimeUnit.SECONDS.sleep(15);
								
								WebElement logoutconfirm1=driver.findElement(By.xpath(".//*[@id='Confirm']"));
								logoutconfirm1.click();
								TimeUnit.SECONDS.sleep(20);
								System.out.println("logout from user1");
								
								
								driver.findElement(By.id("userid")).sendKeys("Lakshaman.parihar");
								driver.findElement(By.id("password")).clear();
								driver.findElement(By.id("password")).sendKeys("Honey1comb");
								driver.findElement(By.id("btnActive")).click();
								  TimeUnit.SECONDS.sleep(15);
								  
								  WebElement BELL=driver.findElement(By.xpath(".//*[@id='pt1:_UISatr:0:cil1::icon']"));
									BELL.click();
									TimeUnit.SECONDS.sleep(10);
									
									System.out.println("Completed");
								  
								  
									
									WebElement User2=driver.findElement(By.xpath(".//*[@id='pt1:_UIScmil1u::icon']"));
									User2.click();
									TimeUnit.SECONDS.sleep(20);
									
									WebElement signout2=driver.findElement(By.xpath(".//*[@id='pt1:_UISlg1']"));
									signout2.click();
									TimeUnit.SECONDS.sleep(20);
									
									WebElement logoutconfirm2=driver.findElement(By.xpath(".//*[@id='Confirm']"));
										
									logoutconfirm2.click();
									TimeUnit.SECONDS.sleep(20);
						
						

		}
	}



	




