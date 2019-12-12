package attente;


import elements.CableSata;
import elements.DisqueDur;
import elements.HDD;
import elements.Ordinateur;
import elements.SSD;

public class AjouterDD{
	
	public void ajouterDisqueDur(Ordinateur ordi, String typeDD) {
		
		if(typeDD.equals("HDD")){
			DisqueDur dd=new HDD("120Go", new CableSata());
			ordi.getDds().add(dd);
		}else if(typeDD.equals("SSD")){
			DisqueDur dd=new SSD("1To", new CableSata());
			ordi.getDds().add(dd);
		}
		
		ordi.allumerOrdi();
		
	}
	

}
