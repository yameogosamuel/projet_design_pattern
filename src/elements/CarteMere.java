package elements;

import java.util.ArrayList;

import strategy.AllumerCMDesktop;
import strategy.IAllumer;



public abstract class CarteMere {
	
	private String nomCM;
    private Boolean EtatDallumage=false;
    private Processeur CPU;
    private ArrayList<RAM> rams;
    private GPU GPU;
    private ArrayList<DisqueDur> HDDs;
    private ArrayList<CableSata> cableSatas;
    protected IAllumer allumer;
    
    public CarteMere(){
       
    }
    
    public CarteMere(String nomCM, Processeur CPU, ArrayList<RAM> rams, GPU GPU){
        this.nomCM = nomCM;
        this.CPU = CPU;
        this.rams = rams;
        this.GPU = GPU;
        this.HDDs = new ArrayList<>();
        this.cableSatas = new ArrayList<>();
       
    }

    public void BootUp(){
    	if(!EtatDallumage)
    		this.EtatDallumage = !this.EtatDallumage;
    }

    public void Shutdown(){
    	if(EtatDallumage)
           this.EtatDallumage = !this.EtatDallumage;
    	
    }

	public IAllumer getAllumer() {
		return allumer;
	}
    
    

}
