package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import BuncoPlus.CreateurPartie;
import BuncoPlus.ReglesBunco;
import Framework.AbstractCreateurPartie;
import Framework.CollectionDes;
import Framework.CollectionJoueurs;
import Framework.De;
import Framework.Iterateur;
import Framework.Jeu;
import Framework.Joueur;

public class StrategieBuncoTest {

	//Attributs necessaires pour les tests
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

	private ReglesBunco reglesBunco;

	private Jeu jeu;

	/**
	 * Methode qui initialise les test pour tester StrategieBunco. 
	 */
	@Before
	public void initialiser() {
		AbstractCreateurPartie createurPartie = new CreateurPartie();
		jeu = createurPartie.creerPartie(MAX_DES, NB_FACES_DES, NB_JOUEURS);
		collectionDes = new CollectionDes();
		collectionJoueurs = new CollectionJoueurs();
		reglesBunco = new ReglesBunco();
		de1 = new De(NB_FACES_DES);
		de2 = new De(NB_FACES_DES);
		de3 = new De(NB_FACES_DES);
		joueur1 = new Joueur(nomJoueur1);
		joueur2 = new Joueur(nomJoueur2);
		joueur3 = new Joueur(nomJoueur3);
	}

	/**
	 * Methode qui verifie que le vainqueur est bien identifé.
	 */
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
		Joueur joueur = (Joueur) iterateur.next();

		assertTrue(joueur.equals(joueur3));
	}

	/**
	 * Methode qui calcule le score de la main lorsqu'il y a Bunco. 
	 */
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

		jeu.setNbTours(6);

		jeu.setTour(1);

		jeu.setJoueur(joueur1);

		jeu.calculerScoreTour();

		collectionJoueurs = jeu.getJoueurs();

		Iterateur iterateur = collectionJoueurs.createIterateur();
		Joueur joueur = (Joueur) iterateur.next();

		assertTrue(joueur.getScore() == 21);

	}

	/**
	 * Methode qui calcule le score lorsque le tour est 0. 
	 */
	@Test
	public void calculerScoreTour0PointTest() {
		de1.setFace(1);
		de2.setFace(3);
		de3.setFace(4);
		collectionDes.add(de1);
		collectionDes.add(de2);
		collectionDes.add(de3);

		jeu.setDes(collectionDes);

		collectionJoueurs.add(joueur1);
		collectionJoueurs.add(joueur2);

		jeu.setJoueurs(collectionJoueurs);

		jeu.setNbTours(6);

		jeu.setTour(2);

		jeu.setJoueur(joueur1);

		jeu.calculerScoreTour();

		collectionJoueurs = jeu.getJoueurs();

		Iterateur iterateur = collectionJoueurs.createIterateur();
		Joueur joueur = (Joueur) iterateur.next();

		assertTrue(joueur.getScore() == 0);

	}

	/**
	 * Methode qui calcule le score lorsque le tour est 5. 
	 */
	@Test
	public void calculerScoreTour5PointTest() {
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

		jeu.setNbTours(6);

		jeu.setTour(2);

		jeu.setJoueur(joueur1);

		jeu.calculerScoreTour();

		collectionJoueurs = jeu.getJoueurs();

		Iterateur iterateur = collectionJoueurs.createIterateur();
		Joueur joueur = (Joueur) iterateur.next();

		assertTrue(joueur.getScore() == 5);

	}

	/**
	 * Methode qui calcule que le score de la main (ou tour) soit bien calculé. 
	 * Pour les coditions données dans l'ennoncé. 
	 */
	@Test
	public void calculerScoreTourDesPointsTest() {
		de1.setFace(2);
		de2.setFace(2);
		de3.setFace(4);
		collectionDes.add(de1);
		collectionDes.add(de2);
		collectionDes.add(de3);

		jeu.setDes(collectionDes);

		collectionJoueurs.add(joueur1);
		collectionJoueurs.add(joueur2);

		jeu.setJoueurs(collectionJoueurs);

		jeu.setNbTours(6);

		jeu.setTour(2);

		jeu.setJoueur(joueur1);

		jeu.calculerScoreTour();

		collectionJoueurs = jeu.getJoueurs();

		Iterateur iterateur = collectionJoueurs.createIterateur();
		Joueur joueur = (Joueur) iterateur.next();

		assertTrue(joueur.getScore() == 2);

	}

	/**
	 * Methode chargee de tester que le joeur passe la main au sivant lorsque
	 * defini. 
	 */
	@Test
	public void passeLaMainTest() {
		de1.setFace(1);
		de2.setFace(4);
		de3.setFace(3);

		jeu.setTour(2);
		jeu.setNbTours(6);

		collectionDes.add(de1);
		collectionDes.add(de2);
		collectionDes.add(de3);

		jeu.setDes(collectionDes);

		collectionJoueurs.add(joueur1);
		collectionJoueurs.add(joueur2);

		jeu.setJoueurs(collectionJoueurs);
		jeu.setJoueur(joueur1);

		collectionJoueurs = jeu.getJoueurs();

		Iterateur iterateur = collectionJoueurs.createIterateur();
		Joueur joueur = (Joueur) iterateur.next();

		assertTrue(jeu.calculerScoreTour() == true);
	}

}
