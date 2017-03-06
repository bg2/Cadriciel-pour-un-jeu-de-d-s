/*******************************************************************************
 Cours:   LOG121
 Session: H2017
 Groupe:  02
 Projet: Laboratoire #3
 Étudiant(e)s:  Vanessa Baquero
                Nam Vu
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
 */
public interface Iterateur extends Iterator {

    @Override
    Object next();

    @Override
    boolean hasNext();
}
