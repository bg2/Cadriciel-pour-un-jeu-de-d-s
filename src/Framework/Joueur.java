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

public class Joueur implements Comparable<Joueur> {

	private String nom;
	private int score;

	public Joueur(String nom){

		this.nom = nom;
		score = 0;
	}

	@Override
	public int compareTo(Joueur joueur) {

		int compare;

		if(score == joueur.getScore())
			compare = 0;
		else if(score < joueur.getScore())
			compare = -1;
		else
			compare = 1;

		return compare;
	}

	public int getScore() {
		return score;
	}
}
