package elements;

import strategy.AllumerHDD;

public class HDD extends DisqueDur{
	 
		public HDD(String capacite, CableSata SATA) {
			super(capacite, SATA);
			allumer=new AllumerHDD();
		}

		
}
