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

	
	private static final int MIN_FACE = 1; 
	
	//Atributs de la classe de
	private int[] face;
	private int nbFacesDe;
	private int faceActuelle;

	/**
	 * Constructeur
	 * 
	 * @param FacesDe[] Les faces du de
	 * 
	 */
	public De() {
		faceActuelle =0; 
		
	}

	/**
	 * Methode chargée de comparer les des
	 * 
	 * @param De
	 *            le de que nous desirons comparer
	 * @return int
	 */
	public int compareTo(De de) {
		
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	
	/**
	 * Methode chargee de trouver quelle face sera choisie
	 */
	public void rouler(){
		Random rnd = new Random();
		
		int aleatoire = 1 + rnd.nextInt(nbFacesDe - 1) ;
		
		faceActuelle = aleatoire;
		
	}
	
	/**
	 * Getter de faceActuelle
	 * 
	 * @return faceActuelle La face du de qui est active
	 */
	public int getFaceActuelle() {
		
		return faceActuelle;
	}

}




