
public class Personne {
	
	String nom;
	String prenom;
	int age;
	String adresse;
	int codePostal;
	String ville;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		return "Nom=" + nom + ", Prenom=" + prenom + ", Age=" + age + ", Adresse=" + adresse + ", CodePostal="
				+ codePostal + ", Ville=" + ville;
	}

	
	
}
