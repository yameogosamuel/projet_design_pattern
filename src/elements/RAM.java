package elements;

import strategy.IAllumer;

public abstract class RAM {
	private String frequence;
	protected IAllumer allumer;

    public RAM(String frequence) {
        this.frequence = frequence;
    }

    public String getFrequence(){
        return this.frequence;
    }

	public IAllumer getAllumer() {
		return allumer;
	}
    
    
}
