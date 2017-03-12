/*******************************************************************************
 Cours:   LOG121
 Session: H2017
 Groupe:  02
 Projet: Laboratoire #3
 Étudiant(e)s:   Vanessa Baquero
                 Nam Vu
                 Alexandre Trepanier

 Professeur : Francis Cardinal
 Nom du fichier: CollectionJoueurs.java
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
public class CollectionJoueurs {

    private Joueur[] joueurs;
    private IterateurJoueurs iterateur;

    /**
     * Constructeur
     */
    public CollectionJoueurs(){

        joueurs = new Joueur[0];
    }


	/**
     * Constructeur avec tableau déjà créé
     *
     * @param joueurs Tableaux de joueurs à initier en collection
     */
    public CollectionJoueurs(Joueur[] joueurs){
        this.joueurs = joueurs;
    }

    
    public IterateurJoueurs<Joueur> createIterateur(){
        return new IterateurJoueurs<Joueur>(joueurs);
    }

    /**
     * Ajoute un élément à la fin de la collection
     *
     * @param joueur Le nouveau joueur à ajouter
     */
    public void add(Joueur joueur){

        Joueur[] newJoueurs = new Joueur[joueurs.length+1];

        for(int i = 0; i < joueurs.length; i++)
            newJoueurs[i] = joueurs[i];

        newJoueurs[newJoueurs.length-1] = joueur;

        joueurs = newJoueurs;
    }

    /**
     * Enlève le dernier élément de la collection
     */
    public void remove(){

        Joueur[] newJoueurs = new Joueur[joueurs.length - 1];

        for(int i = 0; i < joueurs.length - 1; i++)
            newJoueurs[i] = joueurs[i];

        joueurs = newJoueurs;
    }

    /**
     * Interchange de place deux joueurs de la collection
     *
     * @param joueur1 Le  joueur 1 a changer de place
     * @param joueur2 Le  joueur 2 a changer de place
     *
     */
    public Joueur[] swap(Joueur joueur1,Joueur joueur2 ){

    	Joueur[] ordreJoueurs = new Joueur[joueurs.length+1];
    	Joueur temporaireJoueur = new Joueur("temporaire");
       
    	for(int i = 0; i < joueurs.length; i++)
    		ordreJoueurs[i] = joueurs[i];
        
    	ordreJoueurs[ordreJoueurs.length-1] = temporaireJoueur;
             	
    	temporaireJoueur = joueur1;
    	joueur1 = joueur2;
    	joueur2=temporaireJoueur;
        joueurs = ordreJoueurs;   
        
        return ordreJoueurs; 
    }
  
    /**
     * Acceseur du joueur a la position desiree de la collection 
     * @param position int qui indique la position dans la collection 
     * @return Joueurs
     */
    public  Joueur getJoueurs(int position) {
    	
		return joueurs[position];
		
	}


}
