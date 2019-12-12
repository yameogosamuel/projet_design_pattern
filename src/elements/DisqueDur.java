package elements;

import strategy.IAllumer;

public abstract class DisqueDur {
	
	private String capacite;
    private CableSata SATA;
    protected IAllumer allumer;
    
    public DisqueDur(String capacite, CableSata SATA) {
        this.capacite = capacite;
        this.SATA = SATA;
    }

    public String getCapacite(){
        return this.capacite;
    }

    public CableSata getSATA(){
        return this.SATA;
    }

	public IAllumer getAllumer() {
		return allumer;
	}

    
}
