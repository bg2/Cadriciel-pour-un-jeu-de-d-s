package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Framework.Joueur;

public class JoueurBuncoTest {

	private Joueur joueur1;
	private Joueur joueur2;
	private String nom1 = "joueur1";
	private String nom2 = "joueur2";
	private int scoreJoueur1 = 21;
	private int scoreJoueur2 = 5;

	@Before
	public void initialiser() {
		joueur1 = new Joueur(nom1);
		joueur2 = new Joueur(nom2);

	}

	@Test
	public void getNomJoueurTest() {
		assertEquals(joueur1.getNom(), nom1);
		assertEquals(joueur2.getNom(), nom2);
	}

	@Test
	public void getScoreJoueurTest() {
		joueur1.incrementerScore(scoreJoueur1);
		joueur2.incrementerScore(scoreJoueur2);
		assertTrue(joueur1.getScore() == scoreJoueur1);
		assertTrue(joueur2.getScore() == scoreJoueur2);
	}

	@Test
	public void comparerScoreSuperieurTest() {
		System.out.println("joueur1 : " + joueur1.getScore());
		System.out.println("joueur2 : " + joueur2.getScore());
		System.out.println(joueur1.compareTo(joueur2));
		assertTrue(joueur1.compareTo(joueur2) == 1);
	}

	@Test
	public void comparerScoreInferieurTest() {
		assertTrue(joueur1.compareTo(joueur2) == -1);
	}

	@Test
	public void comparerScoreEquivalentTest() {
		assertTrue(joueur1.compareTo(joueur2) == 0);
	}

}
