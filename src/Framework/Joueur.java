/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s: Vanessa Baquero
			  Nam Vu
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: Joueur.java
Date créé: 2017-02-27
Date dern. modif. 
********************************************************************************
Historique des modifications
********************************************************************************
2017-02-27 Version initiale (Vanesssa Baquero)

*******************************************************************************/
package Framework;

/**
 * Classe Joueur
 */
public class Joueur implements Comparable<Joueur> {

	private String nom;
	private int score;

	/**
	 * Constructeur
	 *
	 * @param nom Nom du joueur
	 */
	public Joueur(String nom) {

		setNom(nom);
		score = 0;
	}

	/**
	 * Méthode comparant les scores de deux joueurs
	 *
	 * @param joueur Le joueur que nous désirons comparer
	 * @return compare Le résultat de la comparaison (0 si les scores sont
	 *         égaux, -1 si le score actuel est plus petit que celui donné et
	 *         1 s'il est plus grand)
	 */
	@Override
	public int compareTo(Joueur joueur) {

		int compare;

		if (score == joueur.getScore())
			compare = 0;
		else if (score < joueur.getScore())
			compare = -1;
		else
			compare = 1;

		return compare;
	}

	public void setScore(int valeur) {
		score = valeur;
	}

	/**
	 * Methode pour augmenter le score du joueur 
	 * @param valeur Le score que nous voulons ajouter a celui du joueur. 
	 */
	public void incrementerScore(int valeur) {
		this.score += valeur;
	}
	
	public void setNom(String nom){
		this.nom = nom;	
	}

	public String getNom() {
		return nom;
	}

	public int getScore() {
		return score;
	}
}
