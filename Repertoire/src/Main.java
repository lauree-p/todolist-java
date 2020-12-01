import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static String message;


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc;
		
		String scNom;
		String scPrenom;
		String scAdresse;
		String scVille;
		int scCodePostal;
		int scAge;
		
		Personne[] tableau_personne;
		
		// Demande le nombre de personne a saisir
		// Affiche le contenu du repertoire
		// Peut afficher la personne la plus agée
		
		System.out.println("Combien de personne voulez-vous ajouter dans votre répertoire ?");
		
		int repertoryLenght = Clavier.lireInt();
		
		tableau_personne = new Personne[repertoryLenght];
		
		for ( int i = 0 ; i < repertoryLenght ; i++ ) {
			
			System.out.println("Contact " + i++);
			Personne contact = new Personne();
			
			// Nom
			message = "Saisissez le nom :";
			System.out.println(message);
			scNom = Clavier.lireString();
			contact.setNom(scNom);
			
			// Prenom
			message = "Saisissez le prenom :";
			System.out.println(message);
			scPrenom = Clavier.lireString();
			contact.setPrenom(scPrenom);
			
			// Adresse
			message = "Saisissez l'adresse :";
			System.out.println(message);
			scAdresse = Clavier.lireString();
			contact.setAdresse(scAdresse);
			
			// Code postal
			message = "Saisissez le code postal :";
			System.out.println(message);
			scCodePostal = Clavier.lireInt();
			contact.setCodePostal(scCodePostal);
			
			// Ville
			message = "Saisissez la ville :";
			System.out.println(message);
			scVille = Clavier.lireString();
			contact.setVille(scVille);
			
			// Age
			message = "Saisissez l'age :";
			System.out.println(message);
			scAge = Clavier.lireInt();
			contact.setAge(scAge);
			
			tableau_personne[i] = contact;
					
		}
		
		for ( int i = 0 ; i < repertoryLenght ; i++ ) {
		
			System.out.println(tableau_personne[i].toString());
		
		}
		
		afficherMenu(repertoryLenght, tableau_personne);
		
	}
	
	public static void afficherContact(int repertoryLenght, Personne[] tableau_personne) {
		
		for ( int i = 0 ; i < repertoryLenght ; i++ ) {
			
			System.out.println(tableau_personne[i].toString());
		
		}
	}
	
	
	public static void afficherContactPlusAgee(int repertoryLenght, Personne[] tableau_personne) {
		
		int[] tableauAge = new int[repertoryLenght-1];
		
		for ( int i = 0 ; i < repertoryLenght-1 ; i++ ) {
			tableauAge[i] = tableau_personne[i].getAge();
		}
		
		Arrays.sort(tableauAge);
		System.out.println(tableau_personne[repertoryLenght-1].toString());
		
	}
	
	public static void afficherMenu(int repertoryLenght, Personne[] tableau_personne) {
		
		System.out.println("\nMENU");
		System.out.println("(1) Afficher les contacts");
		System.out.println("(2) Afficher le contact le plus agé");
		int scChoix = Clavier.lireInt();
		
		switch (scChoix) {
		case 1:
			afficherContact(repertoryLenght, tableau_personne);
			afficherMenu(repertoryLenght, tableau_personne);
			break;
		case 2:
			afficherContactPlusAgee(repertoryLenght, tableau_personne);
			afficherMenu(repertoryLenght, tableau_personne);
			break;
		default:
			afficherMenu(repertoryLenght, tableau_personne);
			break;
		}
	}
	

}
