package elements;

import java.util.ArrayList;

public class FabriqueOrdinateur {
	
	public Ordinateur creerOrdinateur(String typeOrdi,GPU gpu, Alimentation al, Processeur cpu, ArrayList<RAM> rams, ArrayList<DisqueDur> dds, CarteMere cm){
		
		Ordinateur ordi=null;
		
		if (typeOrdi.equals("Laptop"))
			ordi=new Laptop(gpu, al, cpu, rams, dds, cm);
		else if (typeOrdi.equals("Desktop"))
		ordi=new Desktop(gpu, al, cpu, rams, dds, cm);
		
		return ordi;
	}

}
