/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s: Vanessa Baquero
			  Nam Vu
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: (Framework) package-info.java
Date créé: 2017-03-11
Date dern. modif. 2017-03-11
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-11 Version initiale (Vanesssa Baquero)
2017-03-12 JavaDoc (Vanessa) 

*******************************************************************************/
package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Framework.De;

public class DeBuncoTest {

	// Constante du nombre de face de chaque de
	private final static int NB_FACES = 6;

	// Les deux des qui seront utilisés pour les Tests.
	private De de1;
	private De de2;

	/**
	 * Methode qui va creer deux des pour les tests de la classe.
	 */
	@Before
	public void initialiser() {
		de1 = new De(NB_FACES);
		de2 = new De(NB_FACES);
	}

	/**
	 * Cette methode va creer un nouveau de et va le comparer a un prealablement
	 * cree pour Tester la creation.
	 */
	@Test
	public void constructeurTest() {

		De de = new De(NB_FACES);
		assertTrue(de.getFace() == de1.getFace());

	}

	/**
	 * Cette methode test que les deux des soient differents.
	 */
	@Test
	public void deSuperieurTest() {
		de1.setFace(6);
		de2.setFace(3);
		assertTrue(de1.getFace() > de2.getFace());
	}

	/**
	 * Cette methode test que les deux des soient differents.
	 */
	@Test
	public void deInferieurTest() {
		de1.setFace(1);
		de2.setFace(3);
		assertTrue(de1.getFace() < de2.getFace());
	}

	/**
	 * Cette methode test que les deux des soient egaux.
	 */
	@Test
	public void deEquivalentTest() {
		de1.setFace(4);
		de2.setFace(4);
		assertTrue(de1.getFace() == de2.getFace());
	}
}