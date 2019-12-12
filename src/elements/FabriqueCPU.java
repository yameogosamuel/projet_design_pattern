package elements;

public class FabriqueCPU {
	
	public Processeur creerCPU(String typeCPU){
		
		Processeur cpu=null;
		
		if (typeCPU.equals("CPU_AMD"))
			cpu=new CPU_AMD("CPU_AMD i5-4790k");
		else if (typeCPU.equals("CPU_Intel"))
			cpu=new CPU_Intel("CPU_Intel i7-4790k");
		
		return cpu;
	}

}
