package elements;

import strategy.IAllumer;

public abstract class Processeur {
	public String nomCPU;
	protected IAllumer allumer;

    public Processeur(String nomCPU) {
        this.nomCPU = nomCPU;
    }

    
    public String getNomCPU() {
		return nomCPU;
	}


	public IAllumer getAllumer() {
		return allumer;
	}
    
    

}
