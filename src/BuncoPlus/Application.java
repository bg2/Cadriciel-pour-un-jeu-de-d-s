/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s:  Vanessa Baquero
               Nam Vu Khanh
               Alexandre Trepanier

Professeur : Francis Cardinal
Nom du fichier: Application.java
Date créé: 2017-03-06
Date dern. modif.
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-06 Version initiale (Alexandre Trépanier)

*******************************************************************************/

package BuncoPlus;


import Framework.*;

/**
 * Classe principale de l'application
 */
public class Application {

	//Constantes qui seront utilisées dans la classe BuncoPlus
    private final int MAX_DES = 3;
    private final int NB_FACES_DES = 6;
    private final int NB_JOUEURS = 4;
    
	private Jeu bunco;
	private ReglesBunco regles; 

    /**
     * Main qui fera commencer le jeu BuncoPlus.
     * 
     * @param args argument du main
     */
    public static void main(String[] args) {

        Application application = new Application();
    }

    /**
     * Constructeur de l'application.
     * Initie un jeu et le joue.
     */
    public Application(){

        AbstractCreateurPartie createurPartie = new CreateurPartie();

        bunco = createurPartie.creerPartie(MAX_DES, NB_FACES_DES, NB_JOUEURS);

        ((BuncoPlus)bunco).jouer();
    }
}
