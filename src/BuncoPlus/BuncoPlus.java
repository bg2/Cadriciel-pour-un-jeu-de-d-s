package BuncoPlus;

import Framework.*;

/**
 * Created by Alexandre on 2017-03-12.
 */
public class BuncoPlus extends Jeu{

    /**
     * Constructeur de la classe BuncoPlus.
     */
    public BuncoPlus(CollectionDes des, CollectionJoueurs joueurs, IStrategie regles) {

        super(des, joueurs, regles);
        nbTours = 2;

        test();
        test2();
    }

    public void jouer(){

        while(tour <= nbTours){

            do{

            }while(false);

            tour++;
        }

        calculerLeVainqueur();
    }

    public void test(){

        Iterateur iterateur = des.createIterateur();

        De de;

        while (iterateur.hasNext()) {

            de = (De) iterateur.next();
            de.rouler();
            System.out.println(de.getFace());
        }

        Iterateur iterateur2 = joueurs.createIterateur();

        Joueur joueur;

        int score = 0;
        while (iterateur2.hasNext()) {
            joueur = (Joueur) iterateur2.next();
            joueur.setScore(score++);
            System.out.println(joueur.getNom());
        }

        calculerLeVainqueur();

        System.out.println();

        iterateur2 = joueurs.createIterateur();

        while (iterateur2.hasNext()) {
            joueur = (Joueur) iterateur2.next();
            System.out.println(joueur.getNom() + " : " + joueur.getScore());
        }

    }
    
    public void test2(){
    	
    	calculerScoreTour();
    }
}
