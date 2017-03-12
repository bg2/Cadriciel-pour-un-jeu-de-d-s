/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
�tudiant(e)s: Vanessa Baquero
			  Nam Vu
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: Createur.java
Date cr��: 2017-02-27
Date dern. modif. 
********************************************************************************
Historique des modifications
********************************************************************************
2017-02-27 Version initiale (Vanesssa Baquero)

*******************************************************************************/  

package Framework;

public class Createur {

	/**
	 * Constucteur du jeu.
	 * @return null
	 */
	public Jeu creerJeu() {
		return null;

	}

	/**
	 * Createur d'un de selon le nombre de face voulu.
	 * @param faces Le nombre de faces du de
	 * @return de Le de qui a ete cree
	 */
	public De creerDe(int faces) {

		De de = new De(faces);

		return  de;
	}

	public Joueur creerJoueur(String nom) {

		Joueur joueur = new Joueur(nom);

		return joueur;
	}
}
