package generateur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

import modele.Empty_Piece;
import modele.Game;
import modele.I_Piece;
import modele.L_Piece;
import modele.O_Piece;
import modele.Orientation;
import modele.Piece;
import modele.T_Piece;
import modele.X_Piece;
import vue.FrmLoop;

public class Generator {
	private Game game;
	
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
		int hmax = inputGrid.getHeight();
		int wmax = inputGrid.getWidth();

		if (inputGrid.getHeight() != filledGrid.getHeight())
			hmax = filledGrid.getHeight() + i; // we must adjust hmax to have the height of the original grid
		if (inputGrid.getWidth() != filledGrid.getWidth())
			wmax = filledGrid.getWidth() + j;

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
	
	
	
	public Generator(Game game) {
		this.game=game;
	}
	
	//Getter
	public Game getGame() {
		return this.game;
	}

	//Setter
	
	//Methodes
	public Piece[] hautGauche() { //ensemble des pieces possibles pour le coin en haut à gauche
		Piece hautGauche[] = { new Empty_Piece(0, 0, Orientation.NORTH),new L_Piece(0, 0, Orientation.EAST), new O_Piece(0, 0, Orientation.EAST), new O_Piece(0, 0, Orientation.SOUTH) };
		return hautGauche;
	}
	
	public Piece[] hautDroit(int i, int j) {
		Piece hautDroit[]= { new Empty_Piece(i, j, Orientation.NORTH), new L_Piece(i,j,Orientation.SOUTH), new O_Piece(i,j,Orientation.WEST), new O_Piece(i,j,Orientation.SOUTH)};
		return hautDroit;
	}
	
	public Piece[] basGauche(int i,int j) {
		Piece basGauche[]= { new Empty_Piece(i,j,Orientation.NORTH), new L_Piece(i,j,Orientation.NORTH), new O_Piece(i,j,Orientation.NORTH), new O_Piece(i,j,Orientation.EAST)};
		return basGauche;
	}
	
	public Piece[] basDroit(int i, int j) {
		Piece basDroit[]= { new Empty_Piece(i,j,Orientation.NORTH), new L_Piece(i,j,Orientation.WEST), new O_Piece(i,j,Orientation.NORTH), new O_Piece(i,j,Orientation.WEST)};
		return basDroit;
	}
	
	public Piece[] haut(int i, int j) {
		Piece haut[]= { new Empty_Piece(i,j,Orientation.NORTH), new I_Piece(i,j,Orientation.EAST), new L_Piece(i,j,Orientation.EAST), new L_Piece(i,j,Orientation.SOUTH), new O_Piece(i,j,Orientation.EAST), new O_Piece(i,j,Orientation.WEST), new O_Piece(i,j,Orientation.SOUTH), new T_Piece(i,j,Orientation.SOUTH)};
		return haut;
	}
	
	public Piece[] gauche(int i,int j) {
		Piece gauche[]= { new Empty_Piece(i,j,Orientation.NORTH), new I_Piece(i,j,Orientation.NORTH), new L_Piece(i,j,Orientation.NORTH), new L_Piece(i,j,Orientation.EAST), new O_Piece(i,j,Orientation.EAST), new O_Piece(i,j,Orientation.NORTH), new O_Piece(i,j,Orientation.SOUTH), new T_Piece(i,j,Orientation.EAST)};
		return gauche;
	}
	
	public Piece[] droite(int i, int j) {
		Piece droite[]= { new Empty_Piece(i,j,Orientation.NORTH), new I_Piece(i,j,Orientation.NORTH), new L_Piece(i,j,Orientation.SOUTH), new L_Piece(i,j,Orientation.WEST), new O_Piece(i,j,Orientation.WEST), new O_Piece(i,j,Orientation.NORTH), new O_Piece(i,j,Orientation.SOUTH), new T_Piece(i,j,Orientation.WEST)};
		return droite;
	}
	
	public Piece[] bas(int i,int j){
		Piece bas[]={ new Empty_Piece(i,j,Orientation.NORTH), new I_Piece(i,j,Orientation.EAST), new L_Piece(i,j,Orientation.NORTH), new L_Piece(i,j,Orientation.WEST), new O_Piece(i,j,Orientation.EAST), new O_Piece(i,j,Orientation.WEST), new O_Piece(i,j,Orientation.WEST), new T_Piece(i,j,Orientation.NORTH)};
		return bas;
	}
	
	public Piece[] milieu(int i, int j) {
		Piece milieu[]= {  new Empty_Piece(i,j,Orientation.NORTH), new I_Piece(i,j,Orientation.NORTH), new I_Piece(i,j,Orientation.EAST), new L_Piece(i,j,Orientation.NORTH), new L_Piece(i,j,Orientation.EAST), new L_Piece(i,j,Orientation.SOUTH), new L_Piece(i,j,Orientation.WEST), new O_Piece(i,j,Orientation.EAST), new O_Piece(i,j,Orientation.WEST), new O_Piece(i,j,Orientation.NORTH), new O_Piece(i,j,Orientation.SOUTH), new T_Piece(i,j,Orientation.NORTH),new T_Piece(i,j,Orientation.EAST),new T_Piece(i,j,Orientation.SOUTH),new T_Piece(i,j,Orientation.WEST), new X_Piece(i,j,Orientation.NORTH)};
		return milieu;
	}
	
	public void generateInitBoard() {
		Piece[][] board=game.getBoard();
		Random rand = new Random();
		for (int i=0; i<game.getH(); i++) {
			for (int j=0; j<game.getW(); j++) {
				if(i==0 && j==0) { //coin haut Gauche
					board[i][j]=hautGauche()[rand.nextInt(hautGauche().length)];
				}
				else if(i==0 && j<game.getW()-1) { //haut
					if(board[i][j-1].isDroite()){ //si contact du cote droit
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : haut(i,j)) {
							if(p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { //si pas de contact du cote droit
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : haut(i,j)) {
							if(!p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));	
					}
				}
				else if (i==0 && j==game.getW()-1) { // coin haut droit
					if(board[i][j-1].isDroite()){ //si contact du cote droit
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : hautDroit(i,j)) {
							if(p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { //si pas de contact du cote droit
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : hautDroit(i,j)) {
							if(!p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i<game.getW()-1 && j==0) { // cote gauche
					if(board[i-1][j].isBas()) { //si contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : gauche(i,j)) {
							if(p.isHaut()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { //si pas de contact vers le bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : gauche(i,j)) {
							if(!p.isHaut()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i<game.getH()-1 && j==game.getW()-1) {  //cote droit
					if(board[i][j-1].isDroite() && board[i-1][j].isBas()) { //si contact a droite et en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : droite(i,j)) {
							if(p.isGauche() && p.isHaut()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (board[i][j-1].isDroite() && !board[i-1][j].isBas()) { //si contact a droite 
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : droite(i,j)) {
							if(p.isGauche() && !p.isHaut()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (!board[i][j-1].isDroite() && board[i-1][j].isBas()) { //si contact en bas 
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : droite(i,j)) {
							if(!p.isGauche() && p.isHaut()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : droite(i,j)) {
							if(!p.isGauche() && !p.isHaut()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i==game.getH()-1 && j==0) { //coin bas gauche
					if(board[i-1][j].isBas()) { //si contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basGauche(i,j)) {
							if(p.isHaut()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { // si pas de contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basGauche(i,j)) {
							if(!p.isHaut()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i==game.getH()-1 && j<game.getW()-1) { //bas
					if(board[i][j-1].isDroite() && board[i-1][j].isBas()) { //si contact en bas et a droite
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : bas(i,j)) {
							if(p.isHaut() && p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (board[i][j-1].isDroite() && !board[i-1][j].isBas()) { //si contact a droite
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : bas(i,j)) {
							if(!p.isHaut() && p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (!board[i][j-1].isDroite() && board[i-1][j].isBas()) { //si contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : bas(i,j)) {
							if(p.isHaut() && !p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { 
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : bas(i,j)) {
							if(!p.isGauche() && !p.isHaut()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else if (i==game.getH()-1 && j==game.getW()-1) { //coin bas droit
					if (board[i][j-1].isDroite() && board[i-1][j].isBas()) { // si contact a droite et en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basDroit(i,j)) {
							if(p.isHaut() && p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (board[i][j-1].isDroite() && !board[i-1][j].isBas()) { //si contact a droite
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for(Piece p : basDroit(i,j)) {
							if(!p.isHaut() && p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (!board[i][j-1].isDroite() && board[i-1][j].isBas()) { // si contact en bas
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basDroit(i,j)) {
							if(p.isHaut() && !p.isGauche()){ 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else { 
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : basDroit(i,j)) {
							if(!p.isGauche() && !p.isHaut()){ 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
				}
				else { //milieu
					if (board[i][j-1].isDroite() && board[i-1][j].isBas()) {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : milieu(i,j)) {
							if(p.isHaut() && p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (board[i][j-1].isDroite() && !board[i-1][j].isBas()) {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : milieu(i,j)) {
							if(!p.isHaut() && p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else if (!board[i][j-1].isDroite() && board[i-1][j].isBas()) {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : milieu(i,j)) {
							if(p.isHaut() && !p.isGauche()) { 
								tmp.add(p);
							}
						}
						board[i][j]=tmp.get(rand.nextInt(tmp.size()));
					}
					else {
						ArrayList<Piece> tmp= new ArrayList<Piece>();
						for( Piece p : milieu(i,j)) {
							if(!p.isHaut() && !p.isGauche()) { 
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
		Piece[][] board=game.getBoard();
		Random rand = new Random();
	}*/
	
	public void generateLevel() {
		this.generateInitBoard();
		this.mixed(this.game);
	}

	private void mixed(Game game) {
		for (Piece[] pBoard : game.getBoard()) {
			for (Piece p : pBoard) {
				for (int i=0; i<new Random().nextInt(3); i++)
					p.rotation();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		Piece[][] board = new Piece[6][6];
		Game game=new Game(6,6,board);
		Generator generator=new Generator(game);
		generator.generateLevel();
		FrmLoop frame = new FrmLoop(game);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
}
