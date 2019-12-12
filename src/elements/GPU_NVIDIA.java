package elements;

import strategy.AllumerGPUNvidia;

public class GPU_NVIDIA extends GPU{

	public GPU_NVIDIA(String nomCG) {
		super(nomCG);
		allumer= new AllumerGPUNvidia();
	}


}
