package elements;

import strategy.AllumerGPUAmd;

public class GPU_AMD extends GPU{

	public GPU_AMD(String nomCG) {
		super(nomCG);
		allumer= new AllumerGPUAmd();
	}

	

}
