import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BoardTest {
	
	private Board board;

	@Before
	public void initialize() {
		board = new Board();
	}
	
	@Test
	public void emptyBoardWinner() {
		assertTrue(!board.hasWinner());
	}
	
	@Test
	public void validMarkNoWinner() {
		board.setMark("O", 2, 1);
		assertTrue(!board.hasWinner());
	}
	
	@Test
	public void validMarkWinner() {
		board.setMark("O", 0, 0);
		board.setMark("O", 1, 1);
		board.setMark("O", 2, 2);
		assertTrue(board.hasWinner());
	}
	
	@Test (expected = InvalidPositionException.class)
	public void invalidMark() {
		board.setMark("K", 9, 1);
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	

}
