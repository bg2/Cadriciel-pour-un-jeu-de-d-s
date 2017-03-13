/*******************************************************************************
 Cours:   LOG121
 Session: H2017
 Groupe:  02
 Projet: Laboratoire #3
 Étudiant(e)s:  Vanessa Baquero
                Nam Vu Khanh
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
 * Interface pour le patron stratégie des règles de jeu
 */
public interface IStrategie {

    /**
     * Méthode pour calculer le vainqueur de la partie
     * @param jeu Le jeu de la partie en cours
     * @return Collection des joueurs triée
     */
    CollectionJoueurs calculerLeVainqueur(Jeu jeu);

    /**
     * Méthode pour calculer le score du joueur actuel
     * @param jeu Le jeu de la partie en cours
     * @return Si la main est passée au joueur suivant
     */
    boolean calculerScoreTour(Jeu jeu);
}