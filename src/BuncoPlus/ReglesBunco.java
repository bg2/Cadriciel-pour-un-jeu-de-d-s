/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
�tudiant(e)s: Vanessa Baquero
			  Nam Vu
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: (BuncoPlus) package-info.java
Date cr��: 2017-03-06
Date dern. modif. 2017-03-11
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-06 Version initiale (Alexandre)
2017-03-11 CalculVainqueur (vanessa)
*******************************************************************************/
package BuncoPlus;

import Framework.CollectionJoueurs;
import Framework.IStrategie;
import Framework.Iterateur;
import Framework.Joueur;


public class ReglesBunco implements IStrategie{

	private  static int MAX_JOUEURS = 3;
	
	//Variables de la classe ReglesBunco
	private Joueur joueur1 ; 
	private Joueur joueur2 ;
	private  int comparaison; 

	public  CollectionJoueurs calculerLeVainqueur(CollectionJoueurs joueurs) {

		boolean check;

		Joueur joueur;
		Joueur joueur2;
		Iterateur iterateur;
		Iterateur iterateur2;

		do{

			check = true;
			iterateur = joueurs.createIterateur();
			iterateur2 = joueurs.createIterateur();

			iterateur2.next();

			do{

				joueur = (Joueur)iterateur.next();
				joueur2 = (Joueur)iterateur2.next();

				if(joueur.compareTo(joueur2) == -1) {
					joueurs.swap(joueur, joueur2);
					check = false;
				}

			}while(iterateur2.hasNext());

		}while(!check);

		return joueurs;
    }

	@Override
	public void calculerScoreTour() {

	}
}
