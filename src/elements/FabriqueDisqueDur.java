package elements;

import java.util.ArrayList;

public class FabriqueDisqueDur {
	
	public ArrayList<DisqueDur> creerDisqueDur(ArrayList<String> typeDD, CableSata cable){
		
		ArrayList<DisqueDur> disDur=new ArrayList<DisqueDur>();
		
		DisqueDur dd=null;
		
		for (String tdd : typeDD) {
			
			if (tdd.equals("HDD")){
				dd=new HDD("1TO", cable);
				
			}
			else if (tdd.equals("SSD")){
				dd=new SSD("120GO", cable);
				
			}
			disDur.add(dd);	
		}
		
		return disDur;
		
	}

}
