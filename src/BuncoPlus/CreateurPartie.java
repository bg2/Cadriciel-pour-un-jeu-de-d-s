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

import Framework.*;

/**
 * Classe servant à assembler les différents éléments pour créer un jeu de Bunco
 */
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

        for(int i = 0; i < nbDes; i++){
            De de = createur.creerDe(nbFaces);
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
        String nom;

        for(int i = 0; i < nbJoueurs; i++) {

            nom = "joueur " + (i+1);

            Joueur joueur = createur.creerJoueur(nom);
            joueurs.add(joueur);
        }

        return joueurs;
    }

    /**
     * Créé les règles utilisées dans le jeu de Bunco
     *
     * @return regles Objet ayant les algorithmes de règles de Bunco
     */
    public IStrategie initRegles(){

        IStrategie regles = createur.creerRegles();

        return regles;
    }

    /**
     * Initie le jeu Bunco avec les différents éléments
     *
     * @param des La collection de dés du jeu
     * @param joueurs La collection de joueurs du jeu
     * @param regles Les règles de calcule de score
     * @return jeu Le jeu instancié
     */
    public Jeu initJeu(CollectionDes des, CollectionJoueurs joueurs, IStrategie regles) {

        Jeu jeu = (BuncoPlus)createur.creerJeu(des, joueurs, regles);

        return jeu;
    }
}
