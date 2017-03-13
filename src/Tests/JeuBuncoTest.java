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
2017-03-12 JavaDoc (Nam Vu Khanh) 

*******************************************************************************/
package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import BuncoPlus.CreateurPartie;
import Framework.AbstractCreateurPartie;
import Framework.CollectionDes;
import Framework.CollectionJoueurs;
import Framework.De;
import Framework.Jeu;
import Framework.Joueur;

public class JeuBuncoTest {

	// Constantes qui seront utilisÃ©es pour le jeu
	private final int MAX_DES = 3;
	private final int NB_FACES_DES = 6;
	private final int NB_JOUEURS = 4;

	// Les attributs qui seront utilisés pour les Tests.
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

	/**
	 * Methode qui va creer un jeu, une collection de des, une collection de
	 * Joueurs, les des et les joueurs.
	 */
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

	/**
	 * Cette methode va creer un nouveau jeu et va le comparer a un
	 * prealablement cree pour Tester la creation.
	 */
	@Test
	public void constructeurTest() {
		Jeu jeu2;
		AbstractCreateurPartie createurPartie = new CreateurPartie();
		jeu2 = createurPartie.creerPartie(MAX_DES, NB_FACES_DES, NB_JOUEURS);
		assertTrue(jeu2.getTour() == jeu.getTour());
	}

	/**
	 * Cette methode verifie si on recoit bien la collection de des et la
	 * comparer avec la collection envoyee.
	 */
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

	/**
	 * Cette methode verifie si on recoit bien la collection de joueurs et la
	 * comparer avec la collection envoyee.
	 */
	@Test
	public void getJoueursTest() {

		collectionJoueurs.add(joueur1);
		collectionJoueurs.add(joueur2);
		jeu.setJoueurs(collectionJoueurs);
		assertTrue(jeu.getJoueurs().equals(collectionJoueurs));
	}

	/**
	 * Cette methode verifie si on recoit bien le nombre de tour de la classe et
	 * la compararer avec la valeur envoyee.
	 */
	@Test
	public void getTourTest() {
		int nbTour = 1;
		jeu.setNbTours(nbTour);

		assertTrue(jeu.getTour() == nbTour);
	}

	/**
	 * Cette methode verifie si on recoit bien le joueur de la classe et la
	 * comparer avec la variable envoyee.
	 */
	@Test
	public void getJoueurTest() {
		jeu.setJoueur(joueur1);
		assertTrue(jeu.getJoueur().equals(joueur1));
	}

}