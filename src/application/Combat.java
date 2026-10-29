package application;
import threads.Boxeur;
public class Combat {

	public static void main(String[] args) {
		
		String msg;
		// Creation des deux objets Boxeur
		Boxeur b1 = new Boxeur("Sallah Eddine");
		Boxeur b2 = new Boxeur("Chadi");
		
		//définie les adversaires
		b1.setAdvers(b2);
		b2.setAdvers(b1);
		
		//lancer combat
		b1.start();
		b2.start();
		
		
		System.out.println("=========Résultat Combat==============");
		System.out.println(b1.getNom()+ "a pour energie:"+b1.getEnergie());
		System.out.println(b2.getNom()+ "a pour energie:"+b2.getEnergie());
		
		
		if(b1.getEnergie()>	b2.getEnergie())
		
		{
			msg = b1.getNom()+"est Gagnant !!!!";
		}
		else if(b1.getEnergie()< b2.getEnergie()) 
		{msg = b2.getNom()+"est Gagnant !!!!";}
		else 
			msg = "EGALITE!!!";
		System.out.println(msg);
	}

}
