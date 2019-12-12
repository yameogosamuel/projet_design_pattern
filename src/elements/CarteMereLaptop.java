package elements;

import java.util.ArrayList;

import strategy.AllumerCMLaptop;

public class CarteMereLaptop extends CarteMere{

	public CarteMereLaptop(String nomCM, Processeur cpu, ArrayList<RAM> rams, GPU gpu) {
		super(nomCM, cpu, rams, gpu);
		 allumer=new AllumerCMLaptop();
	
	}
	
	public CarteMereLaptop() {
		
	}


}
