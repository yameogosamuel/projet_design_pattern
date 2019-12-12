package elements;

import java.util.ArrayList;

import attente.AjouterDD;
import attente.RetirerDD;


public abstract class Ordinateur {
	
	 public GPU gpu;
	 public Alimentation al;
	 public Processeur cpu;
	 public RAM ram;
	 public ArrayList<RAM> rams;
	 public ArrayList<DisqueDur> dds;
	 public DisqueDur dd;
	 public CarteMere cm;
	 public AjouterDD ajouterDD;
	 public RetirerDD retirerDD;
	 
	 public Ordinateur() {
			super();	
		}
	 
	 public Ordinateur(GPU gpu, Alimentation al, Processeur cpu, ArrayList<RAM> rams, ArrayList<DisqueDur> dds, CarteMere cm) {
		super();
		this.gpu = gpu;
		this.al = al;
		this.cpu = cpu;
		this.rams = rams;
		this.dds = dds;
		this.cm = cm;
		ajouterDD=new AjouterDD();
		retirerDD=new RetirerDD();
	}

	 public ArrayList<RAM> getRams() {
		return rams;
	}

	public void setRams(ArrayList<RAM> rams) {
		this.rams = rams;
	}

	public RetirerDD getRetirerDD() {
		return retirerDD;
	}

	public void setRetirerDD(RetirerDD retirerDD) {
		this.retirerDD = retirerDD;
	}

	public void setDd(DisqueDur dd) {
			this.dd = dd;
		}
	 
	 
	 public ArrayList<DisqueDur> getDds() {
		return dds;
	}

	public void setGpu(GPU gpu) {
		this.gpu = gpu;
	}

	public void setAl(Alimentation al) {
		this.al = al;
	}

	public void setCpu(Processeur cpu) {
		this.cpu = cpu;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public void setDds(ArrayList<DisqueDur> dds) {
		this.dds = dds;
	}

	public void setCm(CarteMere cm) {
		this.cm = cm;
	}

	public void setAjouterDD(AjouterDD ajouterDD) {
		this.ajouterDD = ajouterDD;
	}

	
	public AjouterDD getAjouterDD() {
		return ajouterDD;
	}

	public GPU getGpu() {
		return gpu;
	}

	public Alimentation getAl() {
		return al;
	}

	public Processeur getCpu() {
		return cpu;
	}

	public RAM getRam() {
		return ram;
	}

	public ArrayList<DisqueDur> getDd() {
		return dds;
	}

	public CarteMere getCm() {
		return cm;
	}
	
	
	public abstract void allumerOrdi();
 
	 public void eteindreOrdi(){
		 System.out.println("Je m'eteint");
	 }

}
