/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
�tudiant(e)s: Vanessa Baquero
			  Nam Vu Khanh
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: (Framework) package-info.java
Date cr��: 2017-03-06
Date dern. modif. 2017-03-06
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-06  Version initiale (Alexandre)

*******************************************************************************/  
package Framework;

import BuncoPlus.Createur;

/**
 * Created by Alexandre on 2017-03-06.
 * Classe pour le patron template d'une mise en place de jeu
 */
abstract public class AbstractCreateurPartie {

    protected Createur createur = new Createur();

    /**
     * Méthode template de création de partie
     *
     * @param nbDes Le nombre de dés
     * @param nbFaces Le nombre de faces des dés
     * @param nbJoueurs Le nombre de joueurs
     * @return Le jeu de la partie
     */
    public Jeu creerPartie(int nbDes, int nbFaces, int nbJoueurs){

        CollectionDes des = initDes(nbDes, nbFaces);
        CollectionJoueurs joueurs = initJoueurs(nbJoueurs);
        IStrategie regles = initRegles();
        Jeu jeu = initJeu(des, joueurs, regles);

        return jeu;
    }

    /**
     * Méthode abstraite de création de dés
     *
     * @param nbDes Le nombre de dés
     * @param nbFaces Le nombre de faces sur les dés
     * @return La collection de dés
     */
    abstract public CollectionDes initDes(int nbDes, int nbFaces);

    /**
     * Méthode abstraite de création de joueurs
     *
     * @param nbJoueurs Le nombre de joueurs
     * @return La collection de joueurs
     */
    abstract public CollectionJoueurs initJoueurs(int nbJoueurs);

    /**
     * Méthode abstraite de création de règles
     * @return Les règles du jeu
     */
    abstract public IStrategie initRegles();



    /**
     * Méthode qui créé le jeu avec les CollectionDes et CollectionJoueurs
     *
     * @param des La collection de dés du jeu
     * @param joueurs La collection de joueurs du jeu
     * @param regles Les règles du jeu
     * @return Le jeu de la partie
     */
    abstract public Jeu initJeu(CollectionDes des, CollectionJoueurs joueurs, IStrategie regles);
}
