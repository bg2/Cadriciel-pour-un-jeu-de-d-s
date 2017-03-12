package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Framework.Joueur;

public class JoueurBuncoTest {

	//Attributs qui seront utilisés pour les tests
	private Joueur joueur1;
	private Joueur joueur2;
	private String nom1 = "joueur1";
	private String nom2 = "joueur2";
	private int scoreJoueur1 = 21;
	private int scoreJoueur2 = 5;

	/**
	 * Methode qui va creer deux joueurs pour les tests de la classe.
	 */
	@Before
	public void initialiser() {
		joueur1 = new Joueur(nom1);
		joueur2 = new Joueur(nom2);

	}

	/**
	 * Methode qui obtient les noms des joueurs et verifient ce soint le bons. 
	 */
	@Test
	public void getNomJoueurTest() {
		assertEquals(joueur1.getNom(), nom1);
		assertEquals(joueur2.getNom(), nom2);
	}

	/**
	 * Methode qui obtient les score des joueurs et verifient ce soint le bons. 
	 */
	@Test
	public void getScoreJoueurTest() {
		joueur1.incrementerScore(scoreJoueur1);
		joueur2.incrementerScore(scoreJoueur2);
		assertTrue(joueur1.getScore() == scoreJoueur1);
		assertTrue(joueur2.getScore() == scoreJoueur2);
	}

	/**
	 * Methode qui compare le score de deux joueurs, verifie qu'un est 
	 * superieur a l'autre. 
	 */
	@Test
	public void comparerScoreSuperieurTest() {
		System.out.println("joueur1 : " + joueur1.getScore());
		System.out.println("joueur2 : " + joueur2.getScore());
		System.out.println(joueur1.compareTo(joueur2));
		assertTrue(joueur1.compareTo(joueur2) == 1);
	}

	/**
	 * Methode qui compare le score de deux joueurs, verifie qu'un est 
	 * inferieur a l'autre. 
	 */
	@Test
	public void comparerScoreInferieurTest() {
		assertTrue(joueur1.compareTo(joueur2) == -1);
	}

	/**
	 * Methode qui compare le score des deux joueurs, qu'ils soient égaux. 
	 */
	@Test
	public void comparerScoreEquivalentTest() {
		assertTrue(joueur1.compareTo(joueur2) == 0);
	}

}
