package elements;

import java.util.ArrayList;


public class Usine {
	
	private Alimentation alimentation;
	//private List<CableSata> cablesatas;
	private CableSata cable1;
	private FabriqueCarteMere fabriqueCarteMere;
	private FabriqueCPU fabriqueCPU;
	private FabriqueDisqueDur fabriqueDisqueDur;
	private FabriqueGPU fabriqueGPU;
	private FabriqueOrdinateur fabriqueOrdinateur;
	private FabriqueRAM fabriqueRAM;
	
	public Usine() {
		super();
		this.alimentation=Alimentation.getAlimentation();
		//this.cablesatas = cablesatas;
		this.cable1=new CableSata();
		this.fabriqueCarteMere = new FabriqueCarteMere();
		this.fabriqueCPU = new FabriqueCPU();
		this.fabriqueDisqueDur = new FabriqueDisqueDur();
		this.fabriqueGPU = new FabriqueGPU();
		this.fabriqueOrdinateur = new FabriqueOrdinateur();
		this.fabriqueRAM = new FabriqueRAM();
	}
	
	public Ordinateur monterOrdinateur(String typeGPU, String typeCPU, ArrayList<String> typeRam, ArrayList<String> typeDD, String typeCM, String typeOrdi){
		Ordinateur ordi=null;
		Processeur cpu=fabriqueCPU.creerCPU(typeCPU);
		GPU gpu =fabriqueGPU.creerGPU(typeGPU);
		ArrayList<RAM> rams =fabriqueRAM.creerRAM(typeRam);
		ArrayList<DisqueDur> dds= fabriqueDisqueDur.creerDisqueDur(typeDD, cable1);
		CarteMere cm= fabriqueCarteMere.creerCarteMere(typeCM, cpu, rams, gpu);
	
		ordi=fabriqueOrdinateur.creerOrdinateur(typeOrdi, gpu, alimentation, cpu, rams, dds, cm);	
		
		return ordi;
		
	}
	

}
