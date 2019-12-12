package elements;

import strategy.AllumerDDR2;

public class DDR2 extends RAM{

	public DDR2(String frequence) {
		super(frequence);
		allumer=new AllumerDDR2();
	}

	

}
