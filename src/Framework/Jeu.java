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
	 */
	public Jeu(CollectionDes des, CollectionJoueurs joueurs, IStrategie regles){

		this.des = des;
		this.joueurs = joueurs;
		this.regles = regles;
		tour = 1;
	}
	
	public void setDes(CollectionDes des){
		this.des = des;
	}
	
	public void setJoueurs(CollectionJoueurs joueurs){
		this.joueurs = joueurs;
	}

	/**
	 * Accesseur de la collection De.
	 * @return des La collectionDes que nous voulons acceder 
	 */
	public CollectionDes getDes(){
		return des;
	}

	/**
	 * Accesseur de la collection Joueur.
	 * @return joueurs La collectionJoueurs que nous voulons acceder 
	 */
	public CollectionJoueurs getJoueurs(){
		return joueurs;
	}

	public Joueur getJoueur(){
		return joueur;
	}

	public int getTour(){
		return tour;
	}

	public void calculerLeVainqueur() {
		joueurs = regles.calculerLeVainqueur(this);
	}

	public boolean calculerScoreTour() {
		return regles.calculerScoreTour(this);
	}

	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}
	
	
}
