import java.util.Arrays;

public class Main {		
	
	static String message;
	

	public static void main(String[] args) {
		
		/*
			2. Saisir un nombre n nombre de dragon.
			3. Dans une boucle de longueur n, saisir les dragons avec leurs caractéristiques.
			4. Puis faire un affichage de chaque dragon.
			5. Et répondre à la question qui est le plus grand dragon.
			
			String nom;
			char sexe;
			int taille;
			int nbEcaille;
			boolean crache;
			String comportement;
	
		 */
		
		Dragon[] dragons;
		
		message = "Saisissez le nombre de dragon :";
		System.out.println(message);
		
		int nbDragons = Clavier.lireInt();
		
		dragons = new Dragon[nbDragons];
		
		for ( int i = 0; i < nbDragons ; i++) {
			
			System.out.println("Dragon " + (i+1));
			Dragon dragon = new Dragon();
			
			// nom
			message = "Saisissez le nom :";
			System.out.println(message);
			String scNom = Clavier.lireString();
			dragon.setNom(scNom);
			
			// sexe
			message = "Saisissez le sexe (f ou m) :";
			System.out.println(message);
			char scSexe = Clavier.lireChar();
			dragon.setSexe(scSexe);
			
			// taille
			message = "Saisissez la taille (int) :";
			System.out.println(message);
			int scTaille = Clavier.lireInt();
			dragon.setTaille(scTaille);
			
			// nbEcaille
			message = "Saisissez le nombre d'ecaille (int) :";
			System.out.println(message);
			int scNbEcaille = Clavier.lireInt();
			dragon.setNbEcaille(scNbEcaille);
			
			// crache
			message = "Saisissez si il crache ou non (boolean => true or false) :";
			System.out.println(message);
			String scCracheString = Clavier.lireString();
			boolean scCracheBoolean = false;
			if (scCracheString == "true") {
				scCracheBoolean = true;
			}
			else {
				scCracheBoolean = false;
			}
			dragon.setCrache(scCracheBoolean);
			
			// comportement
			message = "Saisissez le comportement :";
			System.out.println(message);
			String scComportement = Clavier.lireString();
			dragon.setComportement(scComportement);
			
			dragons[i] = dragon;
		}
		
		for ( int j = 0 ; j < nbDragons ; j++ ) {
			
			System.out.println(dragons[j].toString());
		
		}
		
		afficherMenu(nbDragons, dragons);

	}
	
	public static void afficherDragons(int nbDragons, Dragon[] dragons) {
		
		for ( int i = 0 ; i < nbDragons-1 ; i++ ) {
			System.out.println(dragons[i].toString());
		}
	}
	
	
	public static void afficherDragonPlusAgee(int nbDragons, Dragon[] dragons) {
		
		int[] tableauTaille = new int[nbDragons];
		
		for ( int i = 0 ; i < nbDragons ; i++ ) {
			tableauTaille[i] = dragons[i].getTaille();
		}
		Arrays.sort(tableauTaille);
		System.out.println(""+ tableauTaille[nbDragons-1]);
	}
	
	public static void afficherMenu(int repertoryLenght, Dragon[] dragons) {
		
		System.out.println("\nMENU");
		System.out.println("(1) Afficher les dragons");
		System.out.println("(2) Afficher le dragon le plus agé");
		int scChoix = Clavier.lireInt();
		
		switch (scChoix) {
		case 1:
			afficherDragons(repertoryLenght, dragons);
			afficherMenu(repertoryLenght, dragons);
			break;
		case 2:
			afficherDragonPlusAgee(repertoryLenght, dragons);
			afficherMenu(repertoryLenght, dragons);
			break;
		default:
			afficherMenu(repertoryLenght, dragons);
			break;
		}
	}

}
