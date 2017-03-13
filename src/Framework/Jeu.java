/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s: Vanessa Baquero
			  Nam Vu
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: Jeu.java
Date créé: 2017-02-27
Date dern. modif. 
********************************************************************************
Historique des modifications
********************************************************************************
2017-02-27 Version initiale (Vanesssa Baquero)

*******************************************************************************/  

package Framework;

/**
 * Classe de jeu contenant les différents éléments d'une partie (collections, règles)
 */
public class Jeu{

	//Attributs qui seront utilis�s dans la classe 
	protected int nbTours;
	protected int tour;
	protected IStrategie regles;
	protected CollectionDes des;
	protected CollectionJoueurs joueurs;
	protected Joueur joueur;

	/**
	 * Constructeur
	 *
	 * @param des Collection de dés
	 * @param joueurs Collection de joueurs
	 * @param regles Règles du jeu
	 */
	public Jeu(CollectionDes des, CollectionJoueurs joueurs, IStrategie regles){

		this.des = des;
		this.joueurs = joueurs;
		this.regles = regles;
		tour = 1;
	}

	/**
	 * Appel l'algorithme pour trier les joueurs selon leur score des règles du patron stratégie
	 */
	public void calculerLeVainqueur() {
		joueurs = regles.calculerLeVainqueur(this);
	}

	/**
	 * Appel de l'algorithme pour calculer le score du joueur actuel des règles du patron stratégie
	 * @return Si la main doit être passée au joueur suivant
	 */
	public boolean calculerScoreTour() {
		return regles.calculerScoreTour(this);
	}

	public void setDes(CollectionDes des){
		this.des = des;
	}
	
	public void setJoueurs(CollectionJoueurs joueurs){
		this.joueurs = joueurs;
	}

	public void setNbTours(int nbTours){
		this.nbTours = nbTours;
	}

	public void setJoueur(Joueur joueur){
		this.joueur = joueur;
	}
	
	public void setTour(int valeur){
		this.tour = valeur;
	}

	public CollectionDes getDes(){
		return des;
	}

	public CollectionJoueurs getJoueurs(){
		return joueurs;
	}

	public Joueur getJoueur(){
		return joueur;
	}

	public int getTour(){
		return tour;
	}
}
