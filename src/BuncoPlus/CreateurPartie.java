package BuncoPlus;

import Framework.*;

/**
 * Created by Alexandre on 2017-03-06.
 */
public class CreateurPartie extends AbstractCreateurPartie{

    @Override
    public CollectionDes initDes(int nbDes, int nbFaces) {

        CollectionDes des = new CollectionDes();

        for(int i = 0; i < nbDes; i++){
            De de = new De(nbFaces);
            des.add(de);
        }

        return des;
    }

    @Override
    public CollectionJoueurs initJoueurs(int nbJoueurs) {

        CollectionJoueurs joueurs = new CollectionJoueurs();

        for(int i = 0; i < nbJoueurs; i++) {
            Joueur joueur = new Joueur("hello");
            joueurs.add(joueur);
        }

        return joueurs;
    }
}
