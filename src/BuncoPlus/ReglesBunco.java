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
import Framework.De;
import Framework.IStrategie;
import Framework.IterateurDes;
import Framework.Joueur;


public class ReglesBunco implements IStrategie {

	private  static int MAX_JOUEURS = 3;
	
	//Variables de la classe ReglesBunco
	private Joueur joueur1 ; 
	private Joueur joueur2 ;
	private  int comparaison; 
	private De[] des; 

	public  CollectionJoueurs calculerLeVainqueur(CollectionJoueurs joueurs) {

		//Boucle pour parcourrir la collection joueur du debut vers la fin
		for( int i=0;  i < MAX_JOUEURS; i++){
			
			joueur1 = joueurs.getJoueurs(i);
			joueur2 = joueurs.getJoueurs(i+1);
			
			comparaison = joueur1.compareTo(joueur2);
			
			//Condition lorsque les joueurs vont interchanger de place
			if(comparaison == -1)
				joueurs.swap(joueur1,joueur2);
		}
		
		//Boucle pour parcourrir la collection joueur de la fin vers le debut
		for( int i = MAX_JOUEURS;  i > 0; i--){

			joueur1 = joueurs.getJoueurs(i);
			joueur2 = joueurs.getJoueurs(i-1);
			
			comparaison = joueur1.compareTo(joueur2);
			
			//Condition lorsque les joueurs vont interchanger de place
			if(comparaison == 1)
				joueurs.swap(joueur2,joueur1);
		}
		
		System.out.println("sup");

		return joueurs;
       
    }

    @Override
    public void calculerScoreTour(int tour) {
    	int score=0;
    	boolean changer = true; 
    	
		
		IterateurDes<De>  iterateurDe = new IterateurDes<De>(des);
		
		while(iterateurDe.hasNext()){
			De de = (De)iterateurDe.next();
			de.rouler(); 
			if(de.getFace()==tour){
				score=score+1;
			}
		}
			
			if(score==3){
				score=21;
			}
			else if(score==0){
				iterateurDe = new IterateurDes<De>(des);
			
				De de1 = (De)iterateurDe.next();
				De de2 = (De)iterateurDe.next();
				De de3 = (De)iterateurDe.next();
				if((de1.compareTo(de2)==0)&&(de2.compareTo(de3)==0)){
					score=5;
				}
			}
			
			joueur1.incrementerScore(score);
			
			if(score==21 || score==0){
				changer = false; 
			}
			
			changer= true; 
			
    }

}
