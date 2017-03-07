package Framework;

/**
 * Created by Alexandre on 2017-03-06.
 */
abstract public class AbstractCreateurPartie {

    /**
     * Méthode template de création de partie
     *
     * @param nbDes Le nombre de dés
     * @param nbFaces Le nombre de faces des dés
     * @param nbJoueurs Le nombre de joueurs
     * @return Le jeu de la partie
     */
    public Jeu creerPartie(int nbDes, int nbFaces, int nbJoueurs){

        CollectionDes des = initDes(nbDes, nbFaces);
        CollectionJoueurs joueurs = initJoueurs(nbJoueurs);
        Jeu jeu = initierJeu(des, joueurs);

        return jeu;
    }

    /**
     * Méthode abstraite de création de dés
     *
     * @param nbDes Le nombre de dés
     * @param nbFaces Le nombre de faces sur les dés
     * @return La collection de dés
     */
    abstract public CollectionDes initDes(int nbDes, int nbFaces);

    /**
     * Méthode abstraite de création de joueurs
     *
     * @param nbJoueurs Le nombre de joueurs
     * @return La collection de joueurs
     */
    abstract public CollectionJoueurs initJoueurs(int nbJoueurs);

    /**
     * Méthode qui créé le jeu avec les CollectionDes et CollectionJoueurs
     *
     * @param des La collection de dés du jeu
     * @param joueurs La collection de joueurs du jeu
     * @return Le jeu de la partie
     */
    public Jeu initierJeu(CollectionDes des, CollectionJoueurs joueurs){

        Jeu jeu = new Jeu(des, joueurs);

        return jeu;
    }
}
