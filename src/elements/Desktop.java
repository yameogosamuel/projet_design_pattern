package elements;

import java.util.ArrayList;


public class Desktop extends Ordinateur{

	public Desktop(GPU gpu, Alimentation al, Processeur cpu, ArrayList<RAM> rams, ArrayList<DisqueDur> dds, CarteMere cm) {
		super(gpu, al, cpu, rams, dds, cm);
		
	}
	
	public Desktop() {
		super();
	}

	@Override
	public void allumerOrdi() {
	
		System.out.println("Je suis un ordinateur de type desktop avec une carte graphique " 
		+ gpu.getNomCG() + ", de processeur " + cpu.getNomCPU() + ", ayant " + rams.size() + (rams.size()==1?" mémoire RAM ":" mémoires RAM ") 
		+ " et avec "+ dds.size() + (dds.size()==1?" disque dur":" disques durs"));
			System.out.println("Je m'allume");
			al.allumer.allumer();
			cpu.getAllumer().allumer();
			gpu.getAllumer().allumer();
			
	        for(RAM ram : rams) ram.getAllumer().allumer();
			//ram.getAllumer().allumer();
	        //dd.allumer();
	        cm.getAllumer().allumer();
	        for(DisqueDur dd : dds) dd.getAllumer().allumer();
	       
	        System.out.println("Je suis un ordinateur de bureau");
	        
	}

}
