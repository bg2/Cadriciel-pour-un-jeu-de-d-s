/*******************************************************************************
 Cours:   LOG121
 Session: H2017
 Groupe:  02
 Projet: Laboratoire #3
 Étudiant(e)s:  Vanessa Baquero
                Nam Vu
                Alexandre Trepanier

 Professeur : Francis Cardinal
 Nom du fichier: IStrategie.java
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
 */
public interface IStrategie {

    /**
     * Méthode pour calculer le vainqueur de la partie
     * @return 
     */
    CollectionJoueurs calculerLeVainqueur(CollectionJoueurs joueurs);

    /**
     * Méthode pour calculer le score du joueur actuel
     */
    void calculerScoreTour(CollectionDes des, int tour);
}