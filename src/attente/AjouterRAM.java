package attente;


import elements.CableSata;
import elements.DisqueDur;
import elements.HDD;
import elements.Ordinateur;
import elements.SSD;

public class AjouterRAM{
	
	public void ajouterDisqueDur(Ordinateur ordi, String typeRAM) {
		
		if(typeRAM.equals("DDR2")){
			DisqueDur dd=new HDD("120Go", new CableSata());
			ordi.getDds().add(dd);
		}else if(typeRAM.equals("SSD")){
			DisqueDur dd=new SSD("1To", new CableSata());
			ordi.getDds().add(dd);
			ordi.allumerOrdi();
		}
		
	}
	

}
