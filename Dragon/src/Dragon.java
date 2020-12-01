
public class Dragon {
	
	String nom;
	char sexe;
	int taille;
	int nbEcaille;
	boolean crache;
	String comportement;
	
	public Dragon() {}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getNbEcaille() {
		return nbEcaille;
	}
	public void setNbEcaille(int nbEcaille) {
		this.nbEcaille = nbEcaille;
	}
	public boolean isCrache() {
		return crache;
	}
	public void setCrache(boolean crache) {
		this.crache = crache;
	}
	public String getComportement() {
		return comportement;
	}
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	
	@Override
	public String toString() {
		return "Dragon [nom=" + nom + ", sexe=" + sexe + ", taille=" + taille + ", nbEcaille=" + nbEcaille + ", crache="
				+ crache + ", comportement=" + comportement + "]";
	}

	

}
