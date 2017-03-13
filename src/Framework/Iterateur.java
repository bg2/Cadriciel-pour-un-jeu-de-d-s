/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s:  Vanessa Baquero
                Nam Vu Khanh
                Alexandre Trepanier

Professeur : Francis Cardinal
Nom du fichier: Iterateur.java
Date créé: 2017-03-06
Date dern. modif.
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-06 Version initiale (Alexandre Trépanier)

*******************************************************************************/
package Framework;

import java.util.Iterator;

/**
 * Created by Alexandre Trépanier on 2017-03-06.
 * Interface Itérateur pour les collections du jeu de dés
 */
public interface Iterateur extends Iterator {

    /**
     * Méthode qui retourne l'élément suivant de la collection
     *
     * @return L'élément suivant de la collection
     */
    @Override
    Object next();

    /**
     * Méthode qui vérifie s'il y a un élément suivant dans la collection
     * @return Vrai s'il y a un suivant, faux sinon.
     */
    @Override
    boolean hasNext();
}
