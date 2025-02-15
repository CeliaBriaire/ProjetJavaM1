package generateur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

import GUI.Grid;
import modele.Orientation;
import modele.PieceType;
import modele.Piece;
import vue.FrmLoop;

public class Generator {
	private Grid grid;
	
	//private static Grid filledGrid;

	/**
	 * @param output
	 *            file name
	 * @throws IOException
	 *             - if an I/O error occurs.
	 * @return a File that contains a grid filled with pieces (a level)
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	/*public static void generateLevel(String fileName, Grid inputGrid) {
      
		// To be implemented
	}*/
	
	/*public static int[] copyGrid(Grid filledGrid, Grid inputGrid, int i, int j) {
		Piece p;
		int hmax = inputGrid.getHeighteight();
		int wmax = inputGrid.getWidthidth();

		if (inputGrid.getHeighteight() != filledGrid.getHeighteight())
			hmax = filledGrid.getHeighteight() + i; // we must adjust hmax to have the height of the original grid
		if (inputGrid.getWidthidth() != filledGrid.getWidthidth())
			wmax = filledGrid.getWidthidth() + j;

		int tmpi = 0;// temporary variable to stock the last index
		int tmpj = 0;

		// DEBUG System.out.println("copyGrid : i =" + i + " & j = " + j);
		// DEBUG System.out.println("hmax = " + hmax + " - wmax = " + wmax);
		for (int x = i; x < hmax; x++) {
			for (int y = j; y < wmax; y++) {
				// DEBUG System.out.println("x = " + x + " - y = " + y);
				p = filledGrid.getPiece(x - i, y - j);
				// DEBUG System.out.println("x = " + x + " - y = " +
				// y);System.out.println(p);
				inputGrid.setPiece(x, y, new Piece(x, y, p.getType(), p.getOrientation()));
				// DEBUG System.out.println("x = " + x + " - y = " +
				// y);System.out.println(inputGrid.getPiece(x, y));
				tmpj = y;
			}
			tmpi = x;
		}
		//DEBUGSystem.out.println("tmpi =" + tmpi + " & tmpj = " + tmpj);
		return new int[] { tmpi, tmpj };
	}*/
	
	
	
	public Generator(Grid grid) {
		this.grid=grid;
	}
	
	//Getter
	public Grid getGame() {
		return this.grid;
	}

	//Setter
	
	//Methodes
	public Piece[] hautGauche() { //ensemble des pieces possibles pour le coin en haut � gauche
		Piece hautGauche[] = { new Piece(0, 0, PieceType.VOID, Orientation.NORTH),new Piece(0, 0, PieceType.LTYPE, Orientation.EAST), new Piece(0, 0, PieceType.ONECONN, Orientation.EAST), new Piece(0, 0, PieceType.ONECONN, Orientation.SOUTH) };
		return hautGauche;
	}
	
	public Piece[] hautDroit(int i, int j) {
		Piece hautDroit[]= { new Piece(i, j, PieceType.VOID,  Orientation.NORTH), new Piece(i,j, PieceType.LTYPE,Orientation.SOUTH), new Piece(i,j, PieceType.ONECONN,Orientation.WEST), new Piece(i,j, PieceType.ONECONN,Orientation.SOUTH)};
		return hautDroit;
	}
	
	public Piece[] basGauche(int i,int j) {
		Piece basGauche[]= { new Piece(i,j, PieceType.VOID, Orientation.NORTH), new Piece(i,j, PieceType.LTYPE,Orientation.NORTH), new Piece(i,j, PieceType.ONECONN,Orientation.NORTH), new Piece(i,j, PieceType.ONECONN,Orientation.EAST)};
		return basGauche;
	}
	
	public Piece[] basDroit(int i, int j) {
		Piece basDroit[]= { new Piece(i,j, PieceType.VOID, Orientation.NORTH), new Piece(i,j, PieceType.LTYPE,Orientation.WEST), new Piece(i,j, PieceType.ONECONN,Orientation.NORTH), new Piece(i,j, PieceType.ONECONN,Orientation.WEST)};
		return basDroit;
	}
	
	public Piece[] haut(int i, int j) {
		Piece haut[]= { new Piece(i,j, PieceType.VOID, Orientation.NORTH), new Piece(i,j,PieceType.BAR,Orientation.EAST), new Piece(i,j, PieceType.LTYPE,Orientation.EAST), new Piece(i,j, PieceType.LTYPE,Orientation.SOUTH), new Piece(i,j, PieceType.ONECONN,Orientation.EAST), new Piece(i,j, PieceType.ONECONN,Orientation.WEST), new Piece(i,j, PieceType.ONECONN,Orientation.SOUTH), new Piece(i,j, PieceType.TTYPE,Orientation.SOUTH)};
		return haut;
	}
	
	public Piece[] gauche(int i,int j) {
		Piece gauche[]= { new Piece(i,j, PieceType.VOID, Orientation.NORTH), new Piece(i,j,PieceType.BAR,Orientation.NORTH), new Piece(i,j, PieceType.LTYPE,Orientation.NORTH), new Piece(i,j, PieceType.LTYPE,Orientation.EAST), new Piece(i,j, PieceType.ONECONN,Orientation.EAST), new Piece(i,j, PieceType.ONECONN,Orientation.NORTH), new Piece(i,j, PieceType.ONECONN,Orientation.SOUTH), new Piece(i,j, PieceType.TTYPE,Orientation.EAST)};
		return gauche;
	}
	
	public Piece[] droite(int i, int j) {
		Piece droite[]= { new Piece(i,j, PieceType.VOID, Orientation.NORTH), new Piece(i,j,PieceType.BAR,Orientation.NORTH), new Piece(i,j, PieceType.LTYPE,Orientation.SOUTH), new Piece(i,j, PieceType.LTYPE,Orientation.WEST), new Piece(i,j, PieceType.ONECONN,Orientation.WEST), new Piece(i,j, PieceType.ONECONN,Orientation.NORTH), new Piece(i,j, PieceType.ONECONN,Orientation.SOUTH), new Piece(i,j, PieceType.TTYPE,Orientation.WEST)};
		return droite;
	}
	
	public Piece[] bas(int i,int j){
		Piece bas[]={ new Piece(i,j, PieceType.VOID, Orientation.NORTH), new Piece(i,j,PieceType.BAR,Orientation.EAST), new Piece(i,j, PieceType.LTYPE,Orientation.NORTH), new Piece(i,j, PieceType.LTYPE,Orientation.WEST), new Piece(i,j, PieceType.ONECONN,Orientation.EAST), new Piece(i,j, PieceType.ONECONN,Orientation.WEST), new Piece(i,j, PieceType.ONECONN,Orientation.WEST), new Piece(i,j, PieceType.TTYPE,Orientation.NORTH)};
		return bas;
	}
	
	public Piece[] milieu(int i, int j) {
		Piece milieu[]= {  new Piece(i,j, PieceType.VOID, Orientation.NORTH), new Piece(i,j, PieceType.BAR,Orientation.NORTH), new Piece(i,j, PieceType.BAR,Orientation.EAST), new Piece(i,j, PieceType.LTYPE,Orientation.NORTH), new Piece(i,j, PieceType.LTYPE,Orientation.EAST), new Piece(i,j, PieceType.LTYPE,Orientation.SOUTH), new Piece(i,j, PieceType.LTYPE,Orientation.WEST), new Piece(i,j, PieceType.ONECONN,Orientation.EAST), new Piece(i,j, PieceType.ONECONN,Orientation.WEST), new Piece(i,j, PieceType.ONECONN,Orientation.NORTH), new Piece(i,j, PieceType.ONECONN,Orientation.SOUTH), new Piece(i,j, PieceType.TTYPE,Orientation.NORTH),new Piece(i,j, PieceType.TTYPE,Orientation.EAST),new Piece(i,j, PieceType.TTYPE,Orientation.SOUTH),new Piece(i,j, PieceType.TTYPE,Orientation.WEST), new Piece(i,j, PieceType.FOURCONN,Orientation.NORTH)};
		return milieu;
	}
	
	public void generateInitBoard() {
		Piece[][] board=grid.getAllPieces();
		Random rand = new Random();
		for (int i=0; i<grid.getHeight(); i++) {
			for (int j=0; j<grid.getWidth(); j++) {
				if(i==0 && j==0) { //coin haut Gauche
					board[i][j]=hautGauche()[rand.nextInt(hautGauche().length)];
				}
				else if(i==0 && j<grid.getWidth()-1) { //haut
					if(board[i][j-1].hasRightConnector()){ //si contact du cote droit
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : haut(i,j)) {
							if(p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { //si pas de contact du cote droit
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : haut(i,j)) {
							if(!p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));	
					}
				}
				else if (i==0 && j==grid.getWidth()-1) { // coin haut droit
					if(board[i][j-1].hasRightConnector()){ //si contact du cote droit
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : hautDroit(i,j)) {
							if(p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { //si pas de contact du cote droit
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : hautDroit(i,j)) {
							if(!p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i<grid.getWidth()-1 && j==0) { // cote gauche
					if(board[i-1][j].hasBottomConnector()) { //si contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : gauche(i,j)) {
							if(p.hasTopConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { //si pas de contact vers le bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : gauche(i,j)) {
							if(!p.hasTopConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i<grid.getHeight()-1 && j==grid.getWidth()-1) {  //cote droit
					if(board[i][j-1].hasRightConnector() && board[i-1][j].hasBottomConnector()) { //si contact a droite et en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : droite(i,j)) {
							if(p.hasLeftConnector() && p.hasTopConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (board[i][j-1].hasRightConnector() && !board[i-1][j].hasBottomConnector()) { //si contact a droite 
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : droite(i,j)) {
							if(p.hasLeftConnector() && !p.hasTopConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (!board[i][j-1].hasRightConnector() && board[i-1][j].hasBottomConnector()) { //si contact en bas 
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : droite(i,j)) {
							if(!p.hasLeftConnector() && p.hasTopConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : droite(i,j)) {
							if(!p.hasLeftConnector() && !p.hasTopConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i==grid.getHeight()-1 && j==0) { //coin bas gauche
					if(board[i-1][j].hasBottomConnector()) { //si contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basGauche(i,j)) {
							if(p.hasTopConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { // si pas de contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basGauche(i,j)) {
							if(!p.hasTopConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i==grid.getHeight()-1 && j<grid.getWidth()-1) { //bas
					if(board[i][j-1].hasRightConnector() && board[i-1][j].hasBottomConnector()) { //si contact en bas et a droite
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : bas(i,j)) {
							if(p.hasTopConnector() && p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (board[i][j-1].hasRightConnector() && !board[i-1][j].hasBottomConnector()) { //si contact a droite
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : bas(i,j)) {
							if(!p.hasTopConnector() && p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (!board[i][j-1].hasRightConnector() && board[i-1][j].hasBottomConnector()) { //si contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : bas(i,j)) {
							if(p.hasTopConnector() && !p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { 
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : bas(i,j)) {
							if(!p.hasLeftConnector() && !p.hasTopConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i==grid.getHeight()-1 && j==grid.getWidth()-1) { //coin bas droit
					if (board[i][j-1].hasRightConnector() && board[i-1][j].hasBottomConnector()) { // si contact a droite et en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basDroit(i,j)) {
							if(p.hasTopConnector() && p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (board[i][j-1].hasRightConnector() && !board[i-1][j].hasBottomConnector()) { //si contact a droite
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for(Piece p : basDroit(i,j)) {
							if(!p.hasTopConnector() && p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (!board[i][j-1].hasRightConnector() && board[i-1][j].hasBottomConnector()) { // si contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basDroit(i,j)) {
							if(p.hasTopConnector() && !p.hasLeftConnector()){ 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { 
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basDroit(i,j)) {
							if(!p.hasLeftConnector() && !p.hasTopConnector()){ 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else { //milieu
					if (board[i][j-1].hasRightConnector() && board[i-1][j].hasBottomConnector()) {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : milieu(i,j)) {
							if(p.hasTopConnector() && p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (board[i][j-1].hasRightConnector() && !board[i-1][j].hasBottomConnector()) {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : milieu(i,j)) {
							if(!p.hasTopConnector() && p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (!board[i][j-1].hasRightConnector() && board[i-1][j].hasBottomConnector()) {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : milieu(i,j)) {
							if(p.hasTopConnector() && !p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : milieu(i,j)) {
							if(!p.hasTopConnector() && !p.hasLeftConnector()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
			}
		}
	}

	
	/*public void generateInitBoard(int nbcc) { //en cours de reflexion
		Piece[][] board=grid.getBoard();
		Random rand = new Random();
	}*/
	
	public void generateLevel() {
		this.generateInitBoard();
		this.mixed(this.grid);
	}

	private void mixed(Grid grid) {
		for (Piece[] pBoard : grid.getAllPieces()) {
			for (Piece p : pBoard) {
				for (int i=0; i<new Random().nextInt(3); i++)
					p.turn();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		//Piece[][] board = new Piece[3][3];
		Grid grid=new Grid(4,4);
		Generator generator=new Generator(grid);
		generator.generateLevel();
		FrmLoop frame = new FrmLoop(grid);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
}
