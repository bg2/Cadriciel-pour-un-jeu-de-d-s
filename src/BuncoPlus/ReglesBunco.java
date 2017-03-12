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

	//Variables de la classe ReglesBunco
	
	private  int maxJoueurs; 
	private Joueur joueur1 ; 
	private Joueur joueur2 ;
	private  int comparaison; 
	
	public static CollectionJoueurs calculerLeVainqueur() {
		
		maxJoueurs = 3; 
		
		for( int i=0;  i < maxJoueurs; i++){
			
			joueur1 = CollectionJoueurs.getJoueurs(i); 
			joueur2 = CollectionJoueurs.getJoueurs(i+1);
			
			comparaison = joueur1.compareTo(joueur2);
			
			if(comparaison == -1){
				
			}
			
		}
		
		
		
		
		return null; 
        System.out.println("sup");
    }

    @Override
    public void calculerScoreTour() {

    }
}
