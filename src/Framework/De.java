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

public class De implements Comparable<De>{

	private int[] face;
	private Object nbFace;
	private int positionActif = 0;

	/**
	 * Constructeur
	 * 
	 * @param FacesDe[]
	 *            Les faces du de
	 */
	public De(int[] face) {
		
		this.face = face;
		
		this.nbFace = face.length;
		
		positionActif = 0;
	}

	@Override
	public int compareTo(De o) {
		// TODO Auto-generated method stub
		return 0;
	}

}




