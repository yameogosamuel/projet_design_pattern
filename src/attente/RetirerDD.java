package attente;


import elements.CableSata;
import elements.DisqueDur;
import elements.HDD;
import elements.Ordinateur;

public class RetirerDD{
	

	public void retirerDD(Ordinateur ordi, String typeDD) {
		
		if(typeDD.equals("HDD")){
			if
			DisqueDur dd=new HDD("120Go", new CableSata());
			ordi.getDds().remove(dd);
		}else if(typeDD.equals("SSD")){
			DisqueDur dd=new HDD("1To", new CableSata());
			ordi.getDds().remove(dd);
		}
		ordi.allumerOrdi();
	}

}
