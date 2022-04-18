package com.blz;

public class Main {

	public static void main(String[] args) {
	    Subject subject = new Subject();
		AboutPage aboutPage = new AboutPage();
        BillingPage billPage = new BillingPage();
        LoginPage loginPage = new LoginPage();
        RegistrationPage registrationPage = new RegistrationPage();
        DashBoardPage dashBoardPage = new DashBoardPage();
        
        subject.register(aboutPage);
        subject.register(registrationPage);
        subject.register(loginPage);
        subject.register(billPage);
        subject.register(dashBoardPage);
        
        subject.update("data");
	    System.out.println();
	    
        subject.UnRegister(dashBoardPage);
	    subject.UnRegister(registrationPage);
	    
	    subject.update("New data");
	
	}

}
