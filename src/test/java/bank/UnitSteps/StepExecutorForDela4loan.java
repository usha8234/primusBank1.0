package bank.UnitSteps;

import java.util.Hashtable;

import bank.methods.SeleniumOperations;

public class StepExecutorForDela4loan {

	public static void main(String[] args) {
		Object[] input =new Object[2];
		input[0]="Chrome";
		input[1]= "C:\\Users\\devis\\OneDrive\\Desktop\\Automation Support Systems\\Chromedriver.exe";
        Hashtable<String,Object>one =  SeleniumOperations.browserLaunch(input);

        Object[]input2=new Object[1];
        input2[0]="https://www.deal4loans.com/";
        Hashtable<String,Object>two=SeleniumOperations.url(input2);

       Object[]input3=new Object[1];
       input3[0]="(//*[text()='Home Loan'])[1]";
       Hashtable<String,Object>three=SeleniumOperations.click(input3);


        Object[] input4 = new Object[1];
        input4[0]="//*[@class=\"hgreenicons1\"]";
        Hashtable<String,Object>four =SeleniumOperations.click(input4);


        Object[] input5 = new Object[2];
        input5[0]="//*[@id=\"Loan_Amount\"]";
        input5[1]="10000";
        Hashtable<String,Object>five =SeleniumOperations.sendkeys(input5);


//select
       /* Object[] input6 = new Object[2];
        input6[0]=
        input6[1]="Salaried";
        Hashtable<String,Object>six=SeleniumOperations.dropDown(input6);



        Object[] input7= new Object[2];
        input7[0]=//*[@id="Net_Salary"]
        input7[1]="100000";
        Hashtable<String,Object>seven =SeleniumOperations.sendkeys(input7);*/



















	}
	
	
	

}
