package strategy;

import elements.CarteMere;
import elements.CarteMereDesktop;

public class AllumerCMDesktop implements IAllumer{

	public void allumer() {
		CarteMere cm=new CarteMereDesktop(); 
		 System.out.println("Carte M�re d'ordinateur de bureau: Je m'allume!");
		 cm.BootUp();
	}

}
