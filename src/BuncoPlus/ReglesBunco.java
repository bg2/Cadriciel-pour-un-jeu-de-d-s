/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s: Vanessa Baquero
			  Nam Vu
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: (BuncoPlus) package-info.java
Date créé: 2017-03-06
Date dern. modif. 2017-03-06
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-06 Version initiale (Alexandre)

*******************************************************************************/
package BuncoPlus;

import Framework.IStrategie;

public class ReglesBunco implements IStrategie {

	@Override
    public void calculerLeVainqueur() {
        System.out.println("sup");
    }

    @Override
    public void calculerScoreTour() {

    }
}
