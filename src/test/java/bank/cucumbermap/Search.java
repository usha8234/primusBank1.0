package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {

	
		@When("^user click on Branches$")
		public void user_click_on_Branches() throws Throwable
		{
			Object[] test4 =new Object[1];
			test4[0]="(//*[@width='132'])[1]";
			SeleniumOperations.click(test4);
			
		}

		@When("^user select \"([^\"]*)\" as Country$")
		public void user_select_as_Country(String ctry) throws Throwable
		{
			Object[] t6= new Object[2];
			t6[0]="//*[@name=\"lst_countryS\"]";
			t6[1]=ctry;
			 SeleniumOperations.dropDown(t6);
			
		}

		@When("^user select \"([^\"]*)\" as State$")
		public void user_select_as_State(String st) throws Throwable 
		{
			Object[] t7=new Object[2];
			t7[0]="//*[@id=\"lst_stateS\"]";
			t7[1]=st;
			SeleniumOperations.dropDown(t7); 
		}

		@When("^user select \"([^\"]*)\" as City$")
		public void user_select_as_City(String cities) throws Throwable 
		{
			Object[] t8 = new Object[2];
			t8[0]="//*[@id=\"lst_cityS\"]";
			t8[1]=cities;
		SeleniumOperations.dropDown(t8);
			    
		}

		@When("^user click on Search button$")
		public void user_click_on_Search_button() throws Throwable 
		{

			Object[] t9 = new Object[1];
			t9[0]="//*[@name='btn_search']";
			SeleniumOperations.click(t9);
			   
		}

		@Then("^Application Shows result for \"([^\"]*)\" branches$")
		public void application_Shows_result_for_branches(String word) throws Throwable {
			 
			Object[] search = new Object[2];
		    search [0]= "(//*[text()='Watertown'])[1]";
		    search[1]=word;
			SeleniumOperations.validation(search);
			
		}



	}


