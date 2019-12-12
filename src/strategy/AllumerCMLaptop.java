package strategy;

import elements.CarteMere;
import elements.CarteMereLaptop;

public class AllumerCMLaptop implements IAllumer{

	public void allumer() {
		CarteMere cm=new CarteMereLaptop(); 
		 System.out.println("Carte Mère d'ordinateur portable: Je m'allume!");
		 cm.BootUp();
	}

}
