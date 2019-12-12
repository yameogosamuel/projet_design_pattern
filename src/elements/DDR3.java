package elements;

import strategy.AllumerDDR3;

public class DDR3 extends RAM{

	public DDR3(String frequence) {
		super(frequence);
		allumer= new AllumerDDR3();
	}

}
