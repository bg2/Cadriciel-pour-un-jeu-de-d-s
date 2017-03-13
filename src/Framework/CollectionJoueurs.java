/*******************************************************************************
 Cours:   LOG121
 Session: H2017
 Groupe:  02
 Projet: Laboratoire #3
 Étudiant(e)s:   Vanessa Baquero
                 Nam Vu Khanh
                 Alexandre Trepanier

 Professeur : Francis Cardinal
 Nom du fichier: CollectionJoueurs.java
 Date créé: 2017-03-06
 Date dern. modif.
 ********************************************************************************
 Historique des modifications
 ********************************************************************************
 2017-03-06 Version initiale (Alexandre Trépanier)

 *******************************************************************************/
package Framework;

/**
 * Created by Alexandre Trépanier on 2017-03-06.
 * Classe de collection de joueurs
 */
public class CollectionJoueurs {

    private Joueur[] joueurs;

    /**
     * Constructeur
     */
    public CollectionJoueurs(){

        joueurs = new Joueur[0];
    }


	/**
     * Constructeur avec tableau déjà créé
     *
     * @param joueurs Tableaux de joueurs à initier en collection
     */
    public CollectionJoueurs(Joueur[] joueurs){
        this.joueurs = joueurs;
    }

    /**
     * Créé un itérateur pour circuler la collection
     * @return Itérateur de collection joueurs
     */
    public IterateurJoueurs createIterateur(){
        return new IterateurJoueurs(joueurs);
    }

    /**
     * Ajoute un élément à la fin de la collection
     *
     * @param joueur Le nouveau joueur à ajouter
     */
    public void add(Joueur joueur){

        Joueur[] newJoueurs = new Joueur[joueurs.length+1];

        for(int i = 0; i < joueurs.length; i++)
            newJoueurs[i] = joueurs[i];

        newJoueurs[newJoueurs.length-1] = joueur;

        joueurs = newJoueurs;
    }

    /**
     * Enlève le dernier élément de la collection
     */
    public void remove(){

        Joueur[] newJoueurs = new Joueur[joueurs.length - 1];

        for(int i = 0; i < joueurs.length - 1; i++)
            newJoueurs[i] = joueurs[i];

        joueurs = newJoueurs;
    }

    /**
     * Interchange de place de deux joueurs de la collection
     *
     * @param joueur1 Le  joueur 1 a changer de place
     * @param joueur2 Le  joueur 2 a changer de place
     *
     */
    public void swap(Joueur joueur1, Joueur joueur2 ){

    	for(int i = 0; i < joueurs.length; i++) {

    	    if(joueurs[i] == joueur1)
    	        joueurs[i] = joueur2;
    	    else if(joueurs[i] == joueur2)
                joueurs[i] = joueur1;
        }
    }
}
