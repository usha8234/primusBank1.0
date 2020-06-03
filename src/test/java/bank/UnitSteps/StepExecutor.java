package bank.UnitSteps;

import java.util.Hashtable;

import bank.methods.SeleniumOperations;

public class StepExecutor {

	public static void main(String[] args) {
	//browserlaunch	                         
	Object[] testdata= new Object[2];
	testdata[0]="Chrome";
    testdata[1]="C:\\Users\\devis\\OneDrive\\Desktop\\Automation Support Systems\\chromedriver.exe";
    Hashtable<String,Object>one= SeleniumOperations.browserLaunch(testdata);                                //calling by classname.method name
	
	//application launch
    Object[] testdata1=new Object[1];
    testdata1[0]="http://primusbank.qedgetech.com/";
    Hashtable<String,Object> two =SeleniumOperations.url(testdata1);
	
	//user name
    
    Object[] testdata2 = new Object[2];
    testdata2 [0]="//*[@id='txtuId']";
    testdata2[1]="Admin";
	Hashtable<String,Object> three =SeleniumOperations.sendkeys(testdata2);
	
	//password
    Object[] testdata3 = new Object[2];
    testdata3[0] ="//*[@type=\"password\"]";
	testdata3 [1]="Admin";
	Hashtable<String,Object>four=SeleniumOperations.sendkeys(testdata3);
	
	
	//click on login
	
	Object[] test4 =new Object[1];
	test4[0]="//*[@id=\"login\"]";
	Hashtable<String,Object>five=SeleniumOperations.click(test4);
	
	
	//
	Object[] t5=new Object[1];
	t5[0]="//*[@src=\"images/Branches_but.jpg\"]";
	Hashtable<String,Object> six =SeleniumOperations.click(t5);
	
	
	//select country
	Object[] t6= new Object[2];
	t6[0]="//*[@name=\"lst_countryS\"]";
	t6[1]="INDIA";
	Hashtable<String,Object> seven= SeleniumOperations.dropDown(t6);
	
	//select State
	Object[] t7=new Object[2];
	t7[0]="//*[@id=\"lst_stateS\"]";
	t7[1]="MAHARASTRA";
	Hashtable<String,Object> eight =SeleniumOperations.dropDown(t7);
	
	//select city
	Object[] t8 = new Object[2];
	t8[0]="//*[@id=\"lst_cityS\"]";
	t8[1]="MUMBAI";
	Hashtable<String,Object> nine =SeleniumOperations.dropDown(t8);
	
	//click on search button
	
	Object[] t9 = new Object[1];
	t9[0]="//*[@id=\"btn_search\"]";
	Hashtable<String,Object> ten = SeleniumOperations.click(t9);
	
	
	//validation

    Object[] search = new Object[2];
    search [0]= "(//*[text()='MUMBAI'])[1]";
    search[1]="MUMBAI";
	Hashtable<String,Object> ten2 =SeleniumOperations.validation(search);
	
	
	
	}

	
	
	
	
	
}
