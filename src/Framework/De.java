/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s: Vanessa Baquero
			  Nam Vu
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: De.java
Date créé: 2017-02-26
Date dern. modif. 
********************************************************************************
Historique des modifications
********************************************************************************
2017-02-26 Version initiale (Vanesssa Baquero)

*******************************************************************************/  
package Framework;

import java.util.Random;

public class De implements Comparable<De>{

	//Atributs de la classe De
	private int nbFaces;
	private int face;

	/**
	 * Constructeur
	 *
	 * @param nbFaces Nombre de faces du dé
	 */
	public De(int nbFaces){

		this.nbFaces = nbFaces;
	}

	/**
	 * Méthode chargée de comparer les dés
	 * 
	 * @param de Le dé que nous desirons comparer
	 *
	 * @return compare Le résultat de la comparaison (0 si les dés sont égaux, -1 si le dé actuel est plus petit que celui donné et 1 s'il est plus grand)
	 */
	@Override
	public int compareTo(De de) {

		int compare;

		if(face == de.getFace())
			compare = 0;
		else if(face < de.getFace())
			compare = -1;
		else
			compare = 1;
		
		return compare;
	}
	
	
	/**
	 * Méthode chargée de trouver quelle face sera choisie
	 */
	public void rouler(){

		Random rnd = new Random();
		
		int aleatoire = 1 + rnd.nextInt(nbFaces) ;
		
		face = aleatoire;
	}
	
	/**
	 * Getter de face
	 * 
	 * @return face La face du dé actuelle
	 */
	public int getFace() {
		return face;
	}

}




