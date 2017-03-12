/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s:  Vanessa Baquero
               Nam Vu
               Alexandre Trepanier

Professeur : Francis Cardinal
Nom du fichier: BuncoPlus.java
Date créé: 2017-03-06
Date dern. modif.
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-06 Version initiale (Alexandre Trépanier)

*******************************************************************************/

package BuncoPlus;


import Framework.*;


public class BuncoPlus {

	//Constates qui seront utilis�es dans la classe BuncoPlus
    private final int MAX_DES = 3;
    private final int NB_FACES_DES = 6;
    private final int NB_JOUEURS = 4;
    
 
    private Jeu jeu;

    public static void main(String[] args) {

        BuncoPlus bunco = new BuncoPlus();
    }

    public BuncoPlus(){

        AbstractCreateurPartie createurPartie = new CreateurPartie();

        jeu = createurPartie.creerPartie(MAX_DES, NB_FACES_DES, NB_JOUEURS);

        IterateurDes iterateur = jeu.getDes().createIterateur();

        De de;

        while(iterateur.hasNext()){

            de = (De)iterateur.next();
            de.rouler();
            System.out.println(de.getFace());
        }

        IterateurJoueurs iterateur2 = jeu.getJoueurs().createIterateur();

        Joueur joueur;

        while(iterateur2.hasNext()){
            joueur = (Joueur)iterateur2.next();
            System.out.println(joueur.getNom());
        }
    }
}
