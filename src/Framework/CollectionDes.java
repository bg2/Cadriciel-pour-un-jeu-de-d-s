/*******************************************************************************
 Cours:   LOG121
 Session: H2017
 Groupe:  02
 Projet: Laboratoire #3
 Étudiant(e)s:  Vanessa Baquero
                Nam Vu
                Alexandre Trepanier

 Professeur : Francis Cardinal
 Nom du fichier: CollectionDes.java
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
public class CollectionDes {

    private De[] des;
    private IterateurDes iterateur;

    /**
     * Constructeur
     *
     * @param nbDes Le nombres de dés maximum
     */
    public CollectionDes(int nbDes){

        des = new De[nbDes];
    }

    public IterateurDes<De> createIterateur(){
        return new IterateurDes<De>(des);
    }

    public void add(De de){

        De[] newDes = new De[des.length+1];

        for(int i = 0; i < des.length; i++)
            newDes[i] = des[i];

        newDes[newDes.length-1] = de;

        des = newDes;
    }

    public De[] getDes(){
        return des;
    }
}
