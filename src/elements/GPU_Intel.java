package elements;

import strategy.AllumerGPUIntel;

public class GPU_Intel extends GPU{

	public GPU_Intel(String nomCG) {
		super(nomCG);
		allumer= new AllumerGPUIntel();
	}

}
