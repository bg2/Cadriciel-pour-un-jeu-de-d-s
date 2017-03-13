package Tests;

import static org.junit.Assert.assertTrue;

import Framework.*;
import org.junit.Before;
import org.junit.Test;

import BuncoPlus.CreateurPartie;

public class StrategieBuncoTest {

	private final int MAX_DES = 3;
	private final int NB_FACES_DES = 6;
	private final int NB_JOUEURS = 4;
	private De de1;
	private De de2;
	private De de3;
	private Joueur joueur1;
	private Joueur joueur2;
	private Joueur joueur3;
	private String nomJoueur1 = "Joueur1";
	private String nomJoueur2 = "Joueur2";
	private String nomJoueur3 = "Joueur3";

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
		joueur3 = new Joueur(nomJoueur3);
	}

	@Test
	public void calculerLeVainqueurTest() {

		joueur1.setScore(21);
		joueur2.setScore(5);
		joueur3.setScore(25);
		collectionJoueurs.add(joueur1);
		collectionJoueurs.add(joueur2);
		collectionJoueurs.add(joueur3);

		jeu.setJoueurs(collectionJoueurs);

		jeu.calculerLeVainqueur();

		collectionJoueurs = jeu.getJoueurs();

		Iterateur iterateur = collectionJoueurs.createIterateur();
		Joueur joueur = (Joueur)iterateur.next();

		assertTrue(joueur.equals(joueur3));
	}

	@Test
	public void calculerScoreTourBuncoTest() {
		de1.setFace(1);
		de2.setFace(1);
		de3.setFace(1);
		collectionDes.add(de1);
		collectionDes.add(de2);
		collectionDes.add(de3);

		jeu.setDes(collectionDes);

		collectionJoueurs.add(joueur1);
		collectionJoueurs.add(joueur2);

		jeu.setJoueurs(collectionJoueurs);

		jeu.setNbTours(1);

		jeu.setJoueur(joueur1);

		jeu.calculerScoreTour();

		collectionJoueurs = jeu.getJoueurs();

		Iterateur iterateur = collectionJoueurs.createIterateur();
		Joueur joueur = (Joueur)iterateur.next();

		assertTrue(joueur.getScore() == 21);

	}

	public void passeLaMainTest() {

	}

}
