import java.util.ArrayList;
import java.util.Scanner;


import elements.Ordinateur;
import elements.Usine;

public class Main {
    public static void main(String[] args) {
    	/*
    	Alimentation  al=Alimentation.getAlimentation();
    	System.out.println(al.puissance);
    	al.puissance="700W";
    	System.out.println(al.puissance);*/
    
    	
     Scanner clavier=new Scanner(System.in);
     String choix, typeOrdi, typeCM;
     int n;
     String typeGPU=" ";
     String typeCPU=" ";
     String typedd=" ";
     ArrayList<String> mchoix=new ArrayList<String>();
     ArrayList<String> mchoix1=new ArrayList<String>();
     ArrayList<String> typeDD=new ArrayList<String>();
     ArrayList<String> typeRAM=new ArrayList<String>();
    
  do{
     
	do{
     System.out.println("Veuillez choisir l'ordinateur que vous voulez créer:");
     System.out.println("Tapez A: pour Desktop    B: pour Laptop");
     choix=clavier.nextLine();}
    while(!(choix.equals("A") || choix.equals("B")));
	
	if(choix.equals("A")) typeOrdi=typeCM="Desktop";
	else typeOrdi=typeCM="Laptop";
	
	
	do{
	     System.out.println("Veuillez choisir la carte graphique que vous voulez pour votre ordinateur:");
	     System.out.println("Tapez A: pour AMD    B: pour INTEL     C: pour NVIDIA");
	     choix=clavier.nextLine();}
	 while(!(choix.equals("A") || choix.equals("B") || choix.equals("C")));
		
		if(choix.equals("A")) typeGPU="GPU_AMD";
		else if(choix.equals("B")) typeGPU="GPU_Intel";
		else if(choix.equals("C")) typeGPU="GPU_NVIDIA";
		
	do{
		     System.out.println("Veuillez choisir le processeur que vous voulez pour votre ordinateur:");
		     System.out.println("Tapez A: pour AMD    B: pour INTEL" );
		     choix=clavier.nextLine();}
	 while(!(choix.equals("A") || choix.equals("B")));
			
			if(choix.equals("A")) typeCPU="CPU_AMD";
			else if(choix.equals("B")) typeCPU="CPU_Intel";
			
			
			
	System.out.println("Combien de mémoires RAM vous voulez insérer dans votre ordinateur? ");
	 n=clavier.nextInt();
	 
	 for(int i=1; i<=n; i++){ 
		do{ System.out.println("Veuillez choisir la mémoire RAM " + i + " que vous voulez pour votre ordinateur:");
	     System.out.println("Tapez A: pour DDR2    B: pour DDR3" );
	     choix=clavier.nextLine();
	    }while(!(choix.equals("A") || choix.equals("B")));
	     mchoix.add(choix);
     }

	for (String c : mchoix) {
		if(c.equals("A")) typeRAM.add("DDR2");
		else if(c.equals("B")) typeRAM.add("DDR3");
	}	
	
			
	 System.out.println("Combien de disques durs vous voulez insérer dans votre ordinateur? ");
	 n=clavier.nextInt();
	 
	 for(int i=1; i<=n; i++){
		do{ System.out.println("Veuillez choisir le disque dur numéro " + i + " que vous voulez pour votre ordinateur:");
	     System.out.println("Tapez A: pour HDD    B: pour SSD" );
	     choix=clavier.nextLine();
	    }while(!(choix.equals("A") || choix.equals("B")));
		
	     mchoix1.add(choix);
     }
	
	 for (String c : mchoix1) {
			if(c.equals("A")) typeDD.add("HDD");
			else if(c.equals("B")) typeDD.add("SSD");
	 }
	 
     Usine usine=new Usine();
     Ordinateur ordinateur=usine.monterOrdinateur(typeGPU, typeCPU, typeRAM, typeDD, typeCM, typeOrdi);
   
     ordinateur.allumerOrdi();
     
     do{System.out.println("Voulez vous ajouter un autre disque dur? (O/N)");
     choix=clavier.nextLine();
     }while(!(choix.equals("O")));
     
    
     if(choix.equals("O")){
    	 do{ System.out.println("Veuillez choisir le disque dur que vous voulez ajouter à votre ordinateur:");
	     System.out.println("Tapez A: pour HDD    B: pour SSD" );
	     choix=clavier.nextLine();
	    }while(!(choix.equals("A") || choix.equals("B")));
    	 
    	if(choix.equals("A")) typedd="HDD";
 		else if(choix.equals("B")) typedd="SSD";
     }
    
   
	 ordinateur.getAjouterDD().ajouterDisqueDur(ordinateur, typedd);
	 
	 do{System.out.println("Voulez vous supprimer un disque dur? (O/N)");
     choix=clavier.nextLine();
     }while(!(choix.equals("O")));
     
    
     if(choix.equals("O")){
    	 do{ System.out.println("Veuillez choisir le disque dur que vous voulez supprimer à votre ordinateur:");
	     System.out.println("Tapez A: pour HDD    B: pour SSD" );
	     choix=clavier.nextLine();
	    }while(!(choix.equals("A") || choix.equals("B")));
    	 
    	if(choix.equals("A")) typedd="HDD";
 		else if(choix.equals("B")) typedd="SSD";
     }
    
     ordinateur.getRetirerDD().retirerDD(ordinateur, typedd);
	 
     System.out.println("Voulez vous continuer(O/N): ");
     
     choix=clavier.nextLine();}
  while(choix.equals("O"));
     
     clavier.close();

    }
}
