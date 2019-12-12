package elements;

import strategy.IAllumer;

public abstract class GPU {
	
	 public String nomCG;
	 protected IAllumer allumer;
	 
	 public GPU(String nomCG) {
	        this.nomCG = nomCG;
	    }
	 
	 
	 public String getNomCG() {
		return nomCG;
	 }


	public IAllumer getAllumer() {
		return allumer;
	}
	 
	 
}
