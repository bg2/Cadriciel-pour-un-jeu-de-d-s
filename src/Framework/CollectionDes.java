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
     */
    public CollectionDes(){

        des = new De[0];
    }

    /**
     * Constructeur avec tableau déjà créé
     *
     * @param des Tableau des dés à initier en collection.
     */
    public CollectionDes(De[] des){
        this.des = des;
    }

    public IterateurDes<De> createIterateur(){
        return new IterateurDes<De>(des);
    }

    /**
     * Ajoute un élément à la fin de la collection
     *
     * @param de Le nouveau dé à ajouter
     */
    public void add(De de){

        De[] newDes = new De[des.length+1];

        for(int i = 0; i < des.length; i++)
            newDes[i] = des[i];

        newDes[newDes.length-1] = de;

        des = newDes;
    }

    /**
     * Enlève le dernier élément de la collection
     */
    public void remove(){

        De[] newDes = new De[des.length - 1];

        for(int i = 0; i < des.length - 1; i++)
            newDes[i] = des[i];

        des = newDes;
    }

    public De[] getDes(){
        return des;
    }
}
