package Tests;

import BuncoPlus.Application;
import BuncoPlus.ReglesBunco;
import Framework.CollectionDes;
import Framework.CollectionJoueurs;
import Framework.De;
import Framework.Joueur;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StrategieBuncoTest {
	
	private final int NB_FACES_DES = 6;
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
	private Application bunco;
	
	@Before
	public void initialiser(){
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
	public void calculerLeVainqueurTest(){
		
		joueur1.setScore(21);
		joueur2.setScore(5);
		joueur3.setScore(15);
		collectionJoueurs.add(joueur1);
		collectionJoueurs.add(joueur2);
		collectionJoueurs.add(joueur3);

		bunco.getJeu().setJoueurs(collectionJoueurs);

		bunco.getJeu().calculerLeVainqueur();

		assertTrue(bunco.getJeu().getJoueurs().getJoueurs(0).equals(joueur1));
	}

	@Test
	public void calculerScoreTourBuncoTest() {
		de1.setFace(1);
		de2.setFace(1);
		de3.setFace(1);
		collectionDes.add(de1);
		collectionDes.add(de2);
		collectionDes.add(de3);
		
		bunco.getJeu().setDes(collectionDes);

		collectionJoueurs.add(joueur1);

		bunco.getJeu().setJoueurs(collectionJoueurs);

		bunco.getJeu().setNbTours(1);

		bunco.getJeu().calculerScoreTour();

		assertTrue(bunco.getJeu().getJoueurs().getJoueurs(0).getScore() == 21);

	
	}
	
	public void passeLaMainTest(){
		
	}

}
