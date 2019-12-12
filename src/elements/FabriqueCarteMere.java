package elements;

import java.util.ArrayList;

public class FabriqueCarteMere {
	
	public CarteMere creerCarteMere(String typeCM, Processeur cpu, ArrayList<RAM> rams, GPU gpu){
		
		CarteMere cm=null;
		
		String nomCM=" ";
		
		if (typeCM.equals("Laptop"))
			cm=new CarteMereLaptop(nomCM, cpu, rams, gpu);
		else if (typeCM.equals("Desktop"))
		cm=new CarteMereDesktop(nomCM, cpu, rams, gpu);
		
		return cm;
	}

}
