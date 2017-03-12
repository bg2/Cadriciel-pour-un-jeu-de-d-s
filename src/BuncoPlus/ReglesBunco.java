/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s: Vanessa Baquero
			  Nam Vu
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: (BuncoPlus) package-info.java
Date créé: 2017-03-06
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
	
	private BuncoPlus buncoPlus; 
	private CollectionJoueurs collectionJoueurs; 
	
	public  CollectionJoueurs calculerLeVainqueur(Joueur joueur) {
	
		
		for( int i=0;  i < MAX_JOUEURS; i++){
			
			joueur1 = collectionJoueurs.getJoueurs(i); 
			joueur2 = collectionJoueurs.getJoueurs(i+1);
			
			comparaison = joueur1.compareTo(joueur2);
			
			if(comparaison == -1){
				
			}
			
		}
		
		
		
		System.out.println("sup");
		return null; 
       
    }

    @Override
    public void calculerScoreTour() {

    }
}
