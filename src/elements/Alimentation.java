package elements;

import strategy.AllumerAli;
import strategy.IAllumer;

public class Alimentation {
	
	private static Alimentation al;
    public String puissance;
    public static final String puissanceDefault="65W";

 
    public IAllumer allumer;

    private Alimentation(String puissance) {
    	this.puissance=puissance;
    	allumer=new AllumerAli();
    }
    static{
    	al=new Alimentation(puissanceDefault);
    }
    public static Alimentation getAlimentation(){
    

    	return al;
    }
    
}