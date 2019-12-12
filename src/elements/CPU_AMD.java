package elements;

import strategy.AllumerCPUAmd;

public class CPU_AMD extends Processeur{

	public CPU_AMD(String nomCPU) {
		super(nomCPU);
		allumer=new AllumerCPUAmd();
	}
		
}
