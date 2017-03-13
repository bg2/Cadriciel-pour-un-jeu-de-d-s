/*******************************************************************************
Cours:   LOG121
Session: H2017
Groupe:  02
Projet: Laboratoire #3
Étudiant(e)s: Vanessa Baquero
			  Nam Vu Khanh
			  Alexandre Trepanier             
              
Professeur : Francis Cardinal 
Nom du fichier: (Framework) package-info.java
Date créé: 2017-03-11
Date dern. modif. 2017-03-11
********************************************************************************
Historique des modifications
********************************************************************************
2017-03-11 Version initiale (Nam Vu Khanh)
2017-03-12 Version finale (Nam Vu Khanh)
2017-03-12 JavaDoc (Vanessa) 

*******************************************************************************/
package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Framework.De;
import Framework.Joueur;

public class JoueurBuncoTest {
	// Attributs qui seront utilisés pour les tests
	private Joueur joueur1;
	private Joueur joueur2;
	private String nom1 = "joueur1";
	private String nom2 = "joueur2";

	/**
	 * Methode qui va creer deux joueurs pour les tests de la classe.
	 */
	@Before
	public void initialiser() {
		joueur1 = new Joueur(nom1);
		joueur2 = new Joueur(nom2);
	}

	/**
	 * Cette methode va creer un nouveau joueur et va le comparer a un
	 * prealablement cree pour Tester la creation.
	 */
	@Test
	public void constructeurTest() {

		Joueur joueur = new Joueur("joueur1");
		assertTrue(joueur.getNom() == joueur1.getNom());

	}
	/**
	 * Methode qui obtient les noms des joueurs et verifient ce soint le bons.
	 */
	@Test
	public void getNomJoueurTest() {
		String nom = "george";
		joueur1.setNom(nom);
		assertEquals(joueur1.getNom(), nom);
	}

	/**
	 * Methode qui obtient les score des joueurs et verifient ce soint le bons.
	 */
	@Test
	public void getScoreJoueurTest() {
		int score1 = 21;
		int score2 = 5;
		joueur1.incrementerScore(score1);
		joueur2.incrementerScore(score2);
		assertTrue(joueur1.getScore() == score1);
	}

	/**
	 * Methode qui compare le score de deux joueurs, verifie qu'un est superieur
	 * a l'autre.
	 */
	@Test
	public void comparerScoreSuperieurTest() {
		joueur1.incrementerScore(34);
		joueur2.incrementerScore(21);
		assertTrue(joueur1.compareTo(joueur2) == 1);
	}

	/**
	 * Methode qui compare le score de deux joueurs, verifie qu'un est inferieur
	 * a l'autre.
	 */
	@Test
	public void comparerScoreInferieurTest() {
		joueur1.incrementerScore(2);
		joueur2.incrementerScore(6);
		assertTrue(joueur1.compareTo(joueur2) == -1);
	}

	/**
	 * Methode qui compare le score des deux joueurs, qu'ils soient égaux.
	 */
	@Test
	public void comparerScoreEquivalentTest() {
		joueur1.incrementerScore(3);
		joueur2.incrementerScore(3);
		assertTrue(joueur1.compareTo(joueur2) == 0);
	}
}