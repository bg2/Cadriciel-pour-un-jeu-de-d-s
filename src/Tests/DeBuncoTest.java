package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Framework.De;

public class DeBuncoTest {
	
	private final static int NB_FACES = 6;
	private De de1;
	private De de2;
	

	@Before
	public void initialiser() {
		de1 = new De(6);
		de2 = new De(6);
	}

	@Test
	public void ConstructeurTest() {
		
		De de = new De(NB_FACES);
		assertTrue(de.getFace() == de1.getFace());
		
	}
	@Test
	public void deSuperieurTest() {
		de1.setFace(6);
		de2.setFace(5);
		assertTrue(de1.getFace() > de2.getFace());
	}

	@Test
	public void deInferieurTest() {
		de1.setFace(1);
		de2.setFace(4);
		assertTrue(de1.getFace() < de2.getFace());
	}

	@Test
	public void deEquivalentTest() {
		de1.setFace(4);
		de2.setFace(4);
		assertTrue(de1.getFace() == de2.getFace());
	}
}