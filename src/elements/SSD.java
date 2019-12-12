package elements;

import strategy.AllumerSSD;

public class SSD extends DisqueDur{

	public SSD(String capacite, CableSata SATA) {
		super(capacite, SATA);
		allumer=new AllumerSSD();
	}

	

}
