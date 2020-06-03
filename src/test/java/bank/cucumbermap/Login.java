package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {


		
		@When("^user opens the \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
		public  void user_opens_the_browser_and_exe(String bname, String exe) throws Throwable 
		{
			
			Object[] data = new Object[2];
			data[0]=bname;
			data[1]=exe;
			SeleniumOperations.browserLaunch(data);                                //calling by classname.method name
			
	   
		}

		@When("^user provides the url \"([^\"]*)\"$")
		public void user_provides_the_url(String url) throws Throwable 
		{
		   Object[] data2 =new Object[1];
		   data2[0]=url;
		   SeleniumOperations.url(data2);
		}

		@When("^user enters username as \"([^\"]*)\"$")
		public void user_enters_username_as(String uname) throws Throwable
		{
		Object[] data3 = new Object[2];
		data3[0]="//*[@id='txtuId']";
		data3[1]=uname;
		 SeleniumOperations.sendkeys(data3);
		 
		 Hashtable<String,Object>inputop = SeleniumOperations.sendkeys(data3);
		 HTMLReportGenerator.StepDetails(inputop.get("STATUS").toString(),"user enters username as" , inputop.get("MESSAGE").toString());
		}

		
		@When("^user enters passwor as \"([^\"]*)\"$")
		public void user_enters_passwor_as(String password) throws Throwable
		{
			Object[] data3 = new Object[2];
			data3[0]="//*[@type=\"password\"]";
			data3[1]=password;
			 SeleniumOperations.sendkeys(data3); 
			 
			 
			 Hashtable<String,Object>inputop1 = SeleniumOperations.sendkeys(data3);
			 HTMLReportGenerator.StepDetails(inputop1.get("STATUS").toString(),"user enters passwor as" , inputop1.get("MESSAGE").toString());
			 
			 
			 
		}

		@When("^user click on login button$")
		public void user_click_on_login_button() throws Throwable 
		{
			Object[] test4 =new Object[1];
			test4[0]="//*[@id=\"login\"]";
			 SeleniumOperations.click(test4);
			 
			 
			 
			 Hashtable<String,Object>inputop2 = SeleniumOperations.sendkeys(test4);
			 HTMLReportGenerator.StepDetails(inputop2.get("STATUS").toString(),"ser click on login button" , inputop2.get("MESSAGE").toString());
			 
			 
			 
		}

		@Then("^user is on the \"([^\"]*)\" mainpage and get message as welcome to admin$")
		public void user_is_on_the_mainpage_and_get_message_as_welcome_to_admin(String word) throws Throwable {
		    
			Object[] search = new Object[2];
		    search [0]= "//*[text()='Admin']";
		    search[1]=word;
			SeleniumOperations.validation(search);
			
			
			 Hashtable<String,Object>inputop3 = SeleniumOperations.sendkeys(search);
			 HTMLReportGenerator.StepDetails(inputop3.get("STATUS").toString(),"ser click on login button" , inputop3.get("MESSAGE").toString());
			 
			
			
		}




		
	

}