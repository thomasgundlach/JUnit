import static org.junit.Assert.assertTrue;

import java.lang.Exception;
public class Board {
	
	 char[][] field;
	
	public Board() {
		field = new char[3][3];
	}
	
	public void setMark(String mark, int x, int y) throws InvalidPositionException {
		if(x >= 0 && x < 3 && y >= 0 && y < 3) {
			//if(Character.isWhitespace(field[y][x])) {
				field[y][x] = mark.toUpperCase().charAt(0);
			/*} else {
				showSign(x, y);
			/*/
		} else {
			throw new InvalidPositionException("Exception: x/y out of Bounds!");
		}
	}
	
	public void showSign(int x, int y) {
		System.out.println("\"" + field[y][x] + "\"");
	}
	
	public boolean hasWinner() {
		boolean rowA = field[0][0] == 'O' && field[0][1] == 'O' && field[0][2] == 'O' || field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == 'X';
		boolean rowB = field[1][0] == 'O' && field[1][1] == 'O' && field[1][2] == 'O' || field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X';
		boolean rowC = field[2][0] == 'O' && field[2][1] == 'O' && field[2][2] == 'O' || field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X';

		boolean columnA = field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == 'O' || field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X';
		boolean columnB = field[0][1] == 'O' && field[1][1] == 'O' && field[2][1] == 'O' || field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X';
		boolean columnC = field[0][2] == 'O' && field[1][2] == 'O' && field[2][2] == 'O' || field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X';

		boolean diagonalA = field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == 'O' || field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X';
		boolean diagonalB = field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == 'O' || field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == 'X';

		// return rowA || rowB || rowC || columnA || columnB || columnC || diagonalA || diagonalB;
		// showSign();
		return (field[0][0] == 'O');
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		
		board.setMark("O", 0, 0);
		board.setMark("O", 1, 1);
		board.setMark("O", 2, 2);
		if(board.hasWinner()) {
			System.out.println("Winner");
		} else
			System.out.println("No Winner");
	}
}
