import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class KontoTest {
	private Konto konto;

	@Before
	public void initialize() {
		konto = new Konto(100);
	}
	
	@Test
	public void richtigesGuthabenTest() {
		assertEquals(100, konto.getGuthaben());
	}
	
	@Test
	public void guthabenNachMehrmalsEinzahlenTest() {
		konto.einzahlen(100);
		konto.einzahlen(120);
		konto.einzahlen(90);
		konto.einzahlen(55);
		konto.einzahlen(105);
		assertEquals(570, konto.getGuthaben());
	}
	
	@Test
	public void guthabenNachAuszahlungTest() {
		try {
			konto.auszahlen(30);
			assertEquals(70, konto.getGuthaben());
		} catch(Exception error) {
			// assertTrue(false);
			
		}
	}
	
	@Test
	public void KontoAusgeglichenTest() throws Exception {
		konto.einzahlen(400);
		konto.einzahlen(100);
		konto.einzahlen(55);
		konto.auszahlen(655);
		assertEquals(0, konto.getGuthaben());
	}
	
	@Test (expected = Exception.class)
	public void KontoUeberziehungsText() throws Exception {
			konto.auszahlen(150);
	}

}
