/*******************************************************************************
 Cours:   LOG121
 Session: H2017
 Groupe:  02
 Projet: Laboratoire #3
 Étudiant(e)s:   Vanessa Baquero
                 Nam Vu
                 Alexandre Trepanier

 Professeur : Francis Cardinal
 Nom du fichier: BuncoPlus.java
 Date créé: 2017-03-12
 Date dern. modif.
 ********************************************************************************
 Historique des modifications
 ********************************************************************************
 2017-03-12 Version initiale (Alexandre Trépanier)

 *******************************************************************************/

package BuncoPlus;

import Framework.*;

/**
 * Created by Alexandre on 2017-03-12.
 * Classe d'un jeu de Bunco
 */
public class BuncoPlus extends Jeu{

    /**
     * Constructeur de la classe BuncoPlus
     * @param des La collection de dés
     * @param joueurs La collection de joueurs
     * @param regles Les règles du jeu
     */
    public BuncoPlus(CollectionDes des, CollectionJoueurs joueurs, IStrategie regles) {

        super(des, joueurs, regles);
        nbTours = 6;
    }

    /**
     * Méthode qui fait dérouler une partie
     */
    public void jouer(){

        Iterateur iterateur;
        boolean prochain;

        while(tour <= nbTours){

            iterateur = joueurs.createIterateur();

            System.out.println("\nTour: " + tour);

            do{

                joueur = (Joueur) iterateur.next();

                System.out.println("*****************");
                System.out.println(joueur.getNom());

                do {

                    roulerDes();
                    afficherDes();
                    prochain = calculerScoreTour();

                } while(!prochain);

                System.out.println("Score cumulé: " + joueur.getScore());
                System.out.println("*****************");
                System.out.println();

            }while(iterateur.hasNext());

            tour++;
        }

        calculerLeVainqueur();
        afficherJoueurs();
    }

    /**
     * Roule tout les dés de la collection de dés
     */
    public void roulerDes(){

        Iterateur iterateur = des.createIterateur();

        while(iterateur.hasNext()){

            De de = (De)iterateur.next();
            de.rouler();
        }
    }

    /**
     * Affiche le résultat actuel des dés
     */
    public void afficherDes(){

        Iterateur iterateur = des.createIterateur();

        while(iterateur.hasNext()){

            De de = (De)iterateur.next();
            System.out.print(de.getFace() + " ");
        }

        System.out.println();
    }

    /**
     * Affiche le nom et les scores de tout les joueurs
     */
    public void afficherJoueurs(){

        Iterateur iterateur = joueurs.createIterateur();

        while(iterateur.hasNext()){

            Joueur joueur = (Joueur) iterateur.next();
            System.out.println(joueur.getNom() + ": " + joueur.getScore());
        }
    }
}
