import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GeraeteTest {
	private GeraeteListe geraete;
	Geraet geraet1 = new Geraet("Nexus 7");
	Geraet geraet2 = new Geraet("iPad");
	Geraet geraet3 = new Geraet("Nexus 7");
	
	@Before
	public void initialize() {
		geraete = new GeraeteListe();
	}

	@Test
	public void einGeraeteHinzufuegen() {
		// fail("Not yet implemented");
		geraete.hinzufuegen(geraet1);
		int anzahlGeraete = geraete.getAnzahlGeraete();
		assertEquals(1, anzahlGeraete);
	}
	
	@Test
	public void leerListe() {
		assertEquals(0, geraete.getAnzahlGeraete());
	}
	
	@Test (expected = NoSuchGeraetException.class)
	public void nichtExistierendesGeraetEntfernen() {
		geraete.hinzufuegen(geraet1);
		geraete.hinzufuegen(geraet2);
		geraete.entfernen(geraet3);
		assertEquals(2, geraete.getAnzahlGeraete());
	}

}
