/*******************************************************************************
 Cours:   LOG121
 Session: H2017
 Groupe:  02
 Projet: Laboratoire #3
 Étudiant(e)s:  Vanessa Baquero
                Nam Vu
                Alexandre Trepanier

 Professeur : Francis Cardinal
 Nom du fichier: BuncoPlus.java
 Date créé: 2017-03-06
 Date dern. modif.
 ********************************************************************************
 Historique des modifications
 ********************************************************************************
 2017-03-06 Version initiale (Alexandre Trépanier)

 *******************************************************************************/

package BuncoPlus;


import Framework.De;

/**
 * Created by Alexandre Trépanier on 2017-03-06.
 */
public class BuncoPlus {

    public static void main(String[] args) {

        BuncoPlus bunco = new BuncoPlus();

    }

    public BuncoPlus(){
        De de = new De(6);

        while(de.getFace() != 6){
            de.rouler();
            System.out.println(de.getFace());
        }
    }
}
