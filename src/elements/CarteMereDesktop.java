package elements;

import java.util.ArrayList;

import strategy.AllumerCMDesktop;

public class CarteMereDesktop extends CarteMere{
	
	
	public CarteMereDesktop() {
		
	}

	public CarteMereDesktop(String nomCM, Processeur cpu, ArrayList<RAM> rams, GPU gpu) {
		super(nomCM, cpu, rams, gpu);
		 allumer=new AllumerCMDesktop();
	}


}
