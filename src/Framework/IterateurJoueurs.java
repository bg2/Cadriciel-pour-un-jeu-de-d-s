/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s:   Vanessa Baquero
                 Nam Vu
                 Alexandre Trepanier

Professeur : Francis Cardinal
Nom du fichier: IterateurJoueurs.java
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
 * Itérateur pour la collection de joueurs
 */
public class IterateurJoueurs implements Iterateur {

    private Joueur[] joueurs;
    private int position;

    /**
     * Constructeur
     *
     * @param joueurs Collection des joueurs à itérer
     */
    public IterateurJoueurs(Joueur[] joueurs){

        this.joueurs = joueurs;
        position = 0;
    }

    @Override
    public Object next() {
        return joueurs[position++];
    }

    @Override
    public boolean hasNext() {

        if(position >= joueurs.length || joueurs[position] == null)
            return false;

        return true;
    }
}