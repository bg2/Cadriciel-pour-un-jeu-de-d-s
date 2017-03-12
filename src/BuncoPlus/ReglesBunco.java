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
Date dern. modif. 2017-03-06
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-06 Version initiale (Alexandre)

*******************************************************************************/
package BuncoPlus;

import Framework.CollectionJoueurs;
import Framework.IStrategie;
import Framework.Joueur;


public class ReglesBunco implements IStrategie {

	private  static int MAX_JOUEURS =3; 
	
	//Variables de la classe ReglesBunco
	private Joueur joueur1 ; 
	private Joueur joueur2 ;
	private  int comparaison;

	public  CollectionJoueurs calculerLeVainqueur(CollectionJoueurs joueurs) {

		for( int i=0;  i < MAX_JOUEURS; i++){
			
			joueur1 = joueurs.getJoueurs(i);
			joueur2 = joueurs.getJoueurs(i+1);
			
			comparaison = joueur1.compareTo(joueur2);
			
			if(comparaison == -1)
				joueurs.swap(joueur1,joueur2);
		}
		
		for( int i = MAX_JOUEURS;  i > 0; i--){
					
			joueur1 = joueurs.getJoueurs(i);
			joueur2 = joueurs.getJoueurs(i-1);
			
			comparaison = joueur1.compareTo(joueur2);
			
			if(comparaison == 1)
				joueurs.swap(joueur2,joueur1);
		}
		
		System.out.println("sup");

		return joueurs;
       
    }

    @Override
    public void calculerScoreTour() {

    }
}
