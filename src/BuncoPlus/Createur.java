/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
�tudiant(e)s: Vanessa Baquero
			  Nam Vu Khanh
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: Createur.java
Date créé: 2017-02-27
Date dern. modif. 
********************************************************************************
Historique des modifications
********************************************************************************
2017-02-27 Version initiale (Vanesssa Baquero)

*******************************************************************************/  

package BuncoPlus;

import Framework.*;

/**
 * Classe servant à créer les différents éléments d'une partie (jeu, dés, joueurs, règles)
 */
public class Createur {

	/**
	 * Création d'un jeu
	 * @param des La collection de dés
	 * @param joueurs La collection de joueurs
	 * @param regles Les règles du jeu
	 * @return Le jeu instancié
	 */
	public Jeu creerJeu(CollectionDes des, CollectionJoueurs joueurs, IStrategie regles) {

		Jeu jeu = new BuncoPlus(des, joueurs, regles);

		return jeu;
	}

	/**
	 * Createur d'un dé selon le nombre de face voulu.
	 * @param faces Le nombre de faces du de
	 * @return de Le de qui a ete cree
	 */
	public De creerDe(int faces) {

		De de = new De(faces);

		return  de;
	}

	/**
	 * Création d'un joueur
	 * @param nom Le nom du joueur
	 * @return Le joueur instancié
	 */
	public Joueur creerJoueur(String nom) {

		Joueur joueur = new Joueur(nom);

		return joueur;
	}

	/**
	 * Création des règles
	 * @return Les règles instanciées
	 */
	public IStrategie creerRegles(){

		IStrategie regles = new ReglesBunco();

		return regles;
	}
}
