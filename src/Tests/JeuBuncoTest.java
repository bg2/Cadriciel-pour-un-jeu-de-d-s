package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import BuncoPlus.CreateurPartie;
import Framework.*;

public class JeuBuncoTest {

	private final int MAX_DES = 3;
	private final int NB_FACES_DES = 6;
	private final int NB_JOUEURS = 4;
	private De de1;
	private De de2;
	private De de3;
	private Joueur joueur1;
	private Joueur joueur2;
	private String nomJoueur1 = "Joueur1";
	private String nomJoueur2 = "Joueur2";

	private CollectionDes collectionDes;
	private CollectionJoueurs collectionJoueurs;
	private Jeu jeu;

	@Before
	public void initialiser() {

		AbstractCreateurPartie createurPartie = new CreateurPartie();
		jeu = createurPartie.creerPartie(MAX_DES, NB_FACES_DES, NB_JOUEURS);

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
		jeu.setDes(collectionDes);
		assertTrue(jeu.getDes().equals(collectionDes));
	}

	@Test
	public void getJoueursTest() {

		collectionJoueurs.add(joueur1);
		collectionJoueurs.add(joueur2);
		jeu.setJoueurs(collectionJoueurs);
		assertTrue(jeu.getJoueurs().equals(collectionJoueurs));
	}

	@Test
	public void getTourTest() {
		int nbTour = 1;
		jeu.setNbTours(nbTour);

		assertTrue(jeu.getTour() == nbTour);
	}

}