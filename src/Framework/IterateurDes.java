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
Date dern. modif. 2017-03-06
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-06 Version initiale (Alexandre Trépanier)

*******************************************************************************/
package Framework;

public class IterateurDes<De> implements Iterateur {

    private De[] des;
    private int position;

    /**
     * Constructeur
     *
     * @param des La collection de dés à itérer
     */
    public IterateurDes(De[] des){

        this.des = des;
        position = 0;
    }

    @Override
    public Object next() {
        return des[position++];
    }

    @Override
    public boolean hasNext() {

        if(position >= des.length || des[position] == null)
            return false;

        return true;
    }
}
