package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import BuncoPlus.Application;
import Framework.CollectionDes;
import Framework.CollectionJoueurs;
import Framework.De;
import Framework.Joueur;

public class JeuBuncoTest {
	private final int NB_FACES_DES = 6;
	private De de1;
	private De de2;
	private De de3;
	private Joueur joueur1;
	private Joueur joueur2;
	private String nomJoueur1 = "Joueur1";
	private String nomJoueur2 = "Joueur2";
	private int scoreJoueur1 = 21;
	private int scoreJoueur2 = 5;
	private CollectionDes collectionDes;
	private CollectionJoueurs collectionJoueurs;
	private Application bunco;

	@Before
	public void initialiser() {
		bunco = new Application();
		collectionDes = new CollectionDes();
		collectionJoueurs = new CollectionJoueurs();
		de1 = new De(NB_FACES_DES);
		de2 = new De(NB_FACES_DES);
		de3 = new De(NB_FACES_DES);
		joueur1 = new Joueur(nomJoueur1);
		joueur2 = new Joueur(nomJoueur2);
	}

	@Test
	public void getDesTest() {
		de1.setFace(5);
		de2.setFace(1);
		de3.setFace(6);
		collectionDes.add(de1);
		collectionDes.add(de2);
		collectionDes.add(de3);
		bunco.getJeu().setDes(collectionDes);
		assertTrue(bunco.getJeu().getDes().equals(collectionDes));
	}

	@Test
	public void getJoueursTest() {
		collectionJoueurs.add(joueur1);
		bunco.getJeu().setJoueurs(collectionJoueurs);
		assertTrue(bunco.getJeu().getJoueurs().equals(collectionJoueurs));
	}

	@Test
	public void calculerLeVainqueurTest() {
		joueur1.setScore(scoreJoueur1);
		joueur2.setScore(scoreJoueur2);
		collectionJoueurs.add(joueur1);
		collectionJoueurs.add(joueur2);

	}
}