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
import Framework.Joueur;


public class ReglesBunco implements IStrategie {

	private  static int MAX_JOUEURS =3; 
	
	//Variables de la classe ReglesBunco
	private Joueur joueur1 ; 
	private Joueur joueur2 ;
	private  int comparaison; 
	
	
	private CollectionJoueurs collectionJoueurs; 
	
	public  CollectionJoueurs calculerLeVainqueur(CollectionJoueurs joueurs) {
	
		//Boucle pour parcourrir la collection joueur du debut vers la fin 
		for( int i=0;  i < MAX_JOUEURS; i++){
			
			joueur1 = collectionJoueurs.getJoueurs(i); 
			joueur2 = collectionJoueurs.getJoueurs(i+1);
			
			comparaison = joueur1.compareTo(joueur2);
			
			//Condition lorsque les joueurs vont interchanger de place
			if(comparaison == -1){
				
				collectionJoueurs.swap(joueur1,joueur2);
				
			}
			
		}
		
		//Boucle pour parcourrir la collection joueur de la fin vers le debut 
		for( int j = MAX_JOUEURS;  j > 0; j--){
					
			joueur1 = collectionJoueurs.getJoueurs(j); 
			joueur2 = collectionJoueurs.getJoueurs(j-1);
			
			comparaison = joueur1.compareTo(joueur2);
			
			//Condition lorsque les joueurs vont interchanger de place
			if(comparaison == 1){
				
				collectionJoueurs.swap(joueur2,joueur1);
				
			}
			
		}
		
		System.out.println("sup");
		return collectionJoueurs; 
       
    }

    @Override
    public void calculerScoreTour() {

    }
}
