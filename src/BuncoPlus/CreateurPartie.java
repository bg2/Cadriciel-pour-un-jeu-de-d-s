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

import Framework.*;


public class CreateurPartie extends AbstractCreateurPartie{

    /**
     * Methode qui intialise les des de la partie grace a une 
     * boucle qui parcourt la collection de des. 
     * 
     * @param nbDes int qui represente la longeur de la collection des
     * @param nbFaces int nombre de faces de chaque des de la collection 
     * 
     * @return des Collection de des initialisee
     */
    public CollectionDes initDes(int nbDes, int nbFaces) {

        CollectionDes des = new CollectionDes();

        //Boucle qui parcour chaque element de la collection et l'initialise
        for(int i = 0; i < nbDes; i++){
            De de = new De(nbFaces);
            des.add(de);
        }

        return des;
    }

    /**
     * Methode qui intialise les joueurs de la partie grace a une 
     * boucle qui parcourt la collection de des. 
     * 
     * @param nbJoueurs int qui represente la longeur de la collection joueurs
     * 
     * @return joueurs Collection de joueurs initialisee
     */
    public CollectionJoueurs initJoueurs(int nbJoueurs) {

        CollectionJoueurs joueurs = new CollectionJoueurs();

      //Boucle qui parcour chaque element de la collection et l'initialise
        for(int i = 0; i < nbJoueurs; i++) {
            Joueur joueur = new Joueur("hello");
            joueurs.add(joueur);
        }

        return joueurs;
    }
}
