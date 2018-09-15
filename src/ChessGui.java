/* ChessGui.java */

public class ChessGui extends JPanel {
	
	public ChessGui() {
		// load and set background image

		URL urlBackgroundImg = getClass().getResource("/img/board.png");
		this.imgBackground = new ImageIcon(urlBackgroundImg).getImage();

		// Create the pieces and place them on the board
	}
	

	

	private void createAddPiece(int color, int type, int x, int y) {
		/**
		* Create a game piece
		* 
		* @param color color constant
		* @param type type constant
		* @param x x position of upper left corner
		* @param y y position of upper left corner
		*/

		Image img = this.getImageForPiece(color, type);
		Piece piece = new Piece(img, x, y);
		this.pieces.add(piece);
	}
	


}