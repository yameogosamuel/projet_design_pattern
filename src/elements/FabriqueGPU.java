package elements;

public class FabriqueGPU {
	
	public GPU creerGPU(String typeGPU){
		
		GPU gpu=null;
		
		if (typeGPU.equals("GPU_AMD"))
			gpu=new GPU_AMD("GTX_AMD 1080");
		else if (typeGPU.equals("GPU_Intel"))
			gpu=new GPU_Intel("GTX_Intel 1080");
		else if (typeGPU.equals("GPU_NVIDIA"))
			gpu=new GPU_NVIDIA("GTX_NVIDIA 1080");
		
		return gpu;
	}

}
