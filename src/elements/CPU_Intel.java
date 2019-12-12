package elements;

import strategy.AllumerCPUIntel;

public class CPU_Intel extends Processeur{

	public CPU_Intel(String nomCPU) {
		super(nomCPU);
		allumer=new AllumerCPUIntel();
	}

	

}
