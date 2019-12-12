package elements;

import java.util.ArrayList;

public class FabriqueRAM {
	
	public ArrayList<RAM> creerRAM(ArrayList<String> typeRam){
		
		ArrayList<RAM> rams=new ArrayList<RAM>();
		
		RAM ram=null;
		
		for (String tram : typeRam) {
					
			if(tram.equals("DDR2"))
				ram=new DDR2("500MHz");
			else if (tram.equals("DDR3"))
				ram=new DDR3("1000MHz");
			

		rams.add(ram);	}
	
		return rams;
	}

}
