package threads;

public class Boxeur extends Thread {
	
	private String nom;
	private int energie;
	private Boxeur advers;
	
	
	
	public Boxeur(String nom)
	{
		this.nom = nom;
		this.energie = 100;
	}

	public String getNom() {
		return nom;
	}

	public int getEnergie() {
		return energie;
	}
	public void setAdvers(Boxeur advers) {
		this.advers = advers;
	}



	@Override
	public void run()
	{
		//tant que les energies >0 le combat se continu
		while(this.energie > 0 && advers.energie > 0)
		{

			
			//durée d'attent entre les coups
			try {
				
				//calcule de la vitesse de coup
				int vitesse =(int)( Math.random()*600+1);
				
				// durée d'attente entre les coups
				Thread.sleep(1000/vitesse);
				
				//calculer la force du coup
				int force = (int)(Math.random()*6+1);
				
				//vérifier si l'adversaire n'est déja KO
				if(advers.energie>0) {
					if(force > advers.energie)
						advers.energie = 0;
					else
					advers.energie = advers.energie-force;
				
					//affiche info coup
					System.out.println(this.nom + "a donne un coup à " + advers.nom + "  avec une vitesse =" + vitesse + "  et une force =  " +force+"  Energie de l'advesaire  "+ advers.nom+"  est = "+advers.energie);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
