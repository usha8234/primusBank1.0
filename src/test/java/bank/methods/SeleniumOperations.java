package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations {
	
	
       public static WebDriver driver=null;            //import WebDriver (W & D - capitals)
       
       public static Hashtable<String,Object> outputParameters = new Hashtable<String,Object>();
	
	//browserLaunch
       
       public static Hashtable<String,Object>browserLaunch(Object[] inputparameters)                               
       {      
    	   try {
    		   
       	   String browserNmae = (String) inputparameters[0];
    	   String webDriverExePath = (String) inputparameters[1];
    	   
    	   if( browserNmae.equalsIgnoreCase("chrome"))
    	   {
    		  System.setProperty("webdriver.chrome.driver","C:\\Users\\devis\\OneDrive\\Desktop\\Automation Support Systems\\chromedriver.exe");
    		   driver=new ChromeDriver();
    		   driver.manage().window().maximize();
    		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	   }
    	   
    	   
    	   else if( browserNmae.equalsIgnoreCase("Firefox"))
    	   {
    		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\devis\\OneDrive\\Desktop\\Automation Support Systems\\geckodriver.exe");
    		   driver = new FirefoxDriver();
    		   driver.manage().window().maximize();
    		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		   
    	   }
    	   
    	   outputParameters.put("STATUS", "PASS");
    	   outputParameters.put("MESSAGE", "Action:browser Launch,Input Given:" + inputparameters[0].toString());
    	   
    	   }
    	   
    	   catch(Exception e) 
    	   
          {
    		   
        	   outputParameters.put("STATUS", "FAIL");
        	   outputParameters.put("MESSAGE", "Action:browser Launch,Input Given:" + inputparameters[0].toString());
        	   
          }
    	   
  return outputParameters;
  
    	 
   }
       
     
       
       // url method
       
       public static Hashtable<String,Object>url(Object[]inputparameters)
       {
    	   try {
    	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       	   String url= (String) inputparameters[0];
    	   driver.get(url);
    	   
    	   
    	   outputParameters.put("STATUS", "PASS");
    	   outputParameters.put("MESSAGE", "Action:url,Input Given:" + inputparameters[0].toString());
    	   
    	   }
    	   catch(Exception e)
    	   {
    		   
    		   outputParameters.put("STATUS", "FAIL");
        	   outputParameters.put("MESSAGE", "Action:url,Input Given:" + inputparameters[0].toString());
        	   
    	   }
    	       	   
		return outputParameters;
    	   
    	 }
       
       
  
       //sendkeys
       
       public static Hashtable<String,Object>sendkeys(Object[]data)
       {
    	   
    	   try {
    	                   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	                   String xpath = (String) data[0];
    	                   String testData=(String) data[1];
    	WebElement values= driver.findElement(By.xpath(xpath));
    	                   values.clear();
    	                   values.sendKeys(testData);
    	                   
    	                   
    	                   outputParameters.put("STATUS", "PASS");
    	            	   outputParameters.put("MESSAGE", "Action:sendkeys,Input Given:" + data[1].toString());
    	            	   
    	   }
    	   
    	   catch(Exception e)
    	   {
    		   
    		   outputParameters.put("STATUS", "FAIL");
        	   outputParameters.put("MESSAGE", "Action:url,Input Given:" + data[1].toString());
        	   
    	   }
    	             
		return outputParameters;
       }
       
       
       
       //click
       
       public static Hashtable<String,Object>click(Object[]data)
       {
    	   try {
    		   
      	                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	                 String xpath = (String) data[0];
                         WebElement pp = driver.findElement(By.xpath(xpath));
                          pp.click();
           
                          outputParameters.put("STATUS", "PASS");
                   	   outputParameters.put("MESSAGE", "Action:click,Input Given:" + data[0].toString());
                   	   
                          
       }
       catch(Exception e) 
    	   
        {
    	   outputParameters.put("STATUS", "FAIL");
    	   outputParameters.put("MESSAGE", "Action:click,Input Given:" + data[0].toString());
    	   
       }
    	   
		return outputParameters;
    	   
    	 }
       
       
    
       
       //select- Dropdown             //select class ki import cheyali                                                      
       
       public static Hashtable<String,Object>dropDown(Object[]data)
                                                                                         
       {
    	   try {
    	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	   String xpath= (String) data[0];
    	   String chooseValue =(String) data[1];
    Select a=new Select(driver.findElement(By.xpath(xpath)));
    	   a.selectByVisibleText(chooseValue);
    	   
    	   
    	   outputParameters.put("STATUS", "PASS");
    	   outputParameters.put("MESSAGE", "Action:sendkeys,Input Given:" + data[1].toString());
    	   
    	   
    	   }
    	   catch(Exception e)
    	   {
    		   outputParameters.put("STATUS", "FAIL");
        	   outputParameters.put("MESSAGE", "Action:sendkeys,Input Given:" + data[1].toString());
        	   
    		   
    	   }
		return outputParameters;
    	   
    	   
       }
	
       //validation
       
       public static Hashtable<String,Object>validation(Object[]data)
                                                                                         
       {
    	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	   String xpath= (String) data[0];
    	   String S2 =(String) data[1];
      WebElement q=  driver.findElement(By.xpath(xpath));
     String S1= q.getText();
	
          
     try {
    	 
    if(S1.equalsIgnoreCase(S2)) 
    
    {
    	System.out.println("Teat case is passed");
    }
      
    else 
    
    {
    	System.out.println("Testcase is failed");
    	
    }
        outputParameters.put("STATUS", "PASS");
	   outputParameters.put("MESSAGE", "Action:validation,Input Given:" + data[1].toString());
	   
       }
     
     catch(Exception e)
       
     {
    	 outputParameters.put("STATUS", "FAIL");
  	   outputParameters.put("MESSAGE", "Action:validation,Input Given:" + data[1].toString());
  	   
       }
      
      
      
      
      
      
      return outputParameters;
    	   
    	   
    	   
       }
       
}   
       
       

	
	
	
	
	
	
	
	
	
	

