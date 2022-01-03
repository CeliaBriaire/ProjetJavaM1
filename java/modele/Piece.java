package modele;

import java.net.URL;

public class Piece {
	private int posX; //coordonnée i de la piece
	private int posY; //coordonnée j de la piece
	private Orientation orientation; //orientation de la piece
	protected boolean haut;
	protected boolean bas;
	protected boolean droite;
	protected boolean gauche;
	protected  String unicode;
	protected URL linksImage;
	protected int type;
	//private PieceType type;
	//private Orientation orientation;
	//private LinkedList<Orientation> connectors;
	//private ArrayList<Orientation> possibleOrientations;

	//private boolean isFixed;
	
	/*
	 * public Piece(int posY, int posX) {
		this.posX = posX;
		this.posY = posY;
		this.type = PieceType.VOID;
		this.orientation = type.getOrientation(Orientation.NORTH);
		this.connectors = type.setConnectorsList(Orientation.NORTH);
		this.isFixed = false; // Is there any orientation for the piece
		this.possibleOrientations = type.getListOfPossibleOri();
	}

	public Piece(int posY, int posX, PieceType type, Orientation orientation) {
		this.posX = posX;
		this.posY = posY;
		this.type = type;
		this.orientation = type.getOrientation(orientation);
		this.connectors = type.setConnectorsList(orientation);
		this.isFixed = false;
		this.possibleOrientations = type.getListOfPossibleOri();
	}

	public Piece(int posY, int posX, int typeValue, int orientationValue) {
		this.posX = posX;
		this.posY = posY;
		this.type = PieceType.getTypefromValue(typeValue);
		this.orientation = type.getOrientation(Orientation.getOrifromValue(orientationValue));
		this.connectors = type.setConnectorsList(Orientation.getOrifromValue(orientationValue));
		this.isFixed = false;
		this.possibleOrientations = type.getListOfPossibleOri();
	}

	public void setPossibleOrientations(ArrayList<Orientation> possibleOrientations) {
		this.possibleOrientations = possibleOrientations;
	}

	public ArrayList<Orientation> getPossibleOrientations() {
		return this.possibleOrientations;
	}

	public LinkedList<Orientation> getInvPossibleOrientation() {
		LinkedList<Orientation> invPossibleOrientations = new LinkedList<>();
		for (Orientation ori : this.getPossibleOrientations()) {
			invPossibleOrientations.addFirst(ori);
		}
		return invPossibleOrientations;
	}

	public void deleteFromPossibleOrientation(Orientation ori) {
		if (this.possibleOrientations.contains(ori)) {
			this.possibleOrientations.remove(ori);
		}
	}

	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}

	public boolean isFixed() {
		return isFixed;
	}


	public PieceType getType() {
		return type;
	}

	public void setType(PieceType type) {
		this.type = type;
	}

	public void setOrientation(int orientationValue) {
		this.orientation = type.getOrientation(Orientation.getOrifromValue(orientationValue));
		this.connectors = type.setConnectorsList(this.orientation);
	}


	public LinkedList<Orientation> getConnectors() {
		return connectors;
	}

	public boolean hasTopConnector() {
		for (Orientation ori : this.getConnectors()) {
			if (ori == Orientation.NORTH) {
				return true;
			}
		}
		return false;
	}

	public boolean hasRightConnector() {
		for (Orientation ori : this.getConnectors()) {
			if (ori == Orientation.EAST) {
				return true;
			}
		}
		return false;
	}

	public boolean hasBottomConnector() {
		for (Orientation ori : this.getConnectors()) {
			if (ori == Orientation.SOUTH) {
				return true;
			}
		}
		return false;
	}

	public boolean hasLeftConnector() {
		for (Orientation ori : this.getConnectors()) {
			if (ori == Orientation.WEST) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Turn the piece 90° on the right and redefine the connectors's position
	 
	public void turn() {
		this.orientation = type.getOrientation(orientation.turn90());
		this.connectors = type.setConnectorsList(orientation);
	}

	@Override
	public String toString() {
		String s = "[" + this.getPosY() + ", " + this.getPosX() + "] " + this.getType() + " ";
		for (Orientation ori : this.getConnectors()) {
			s += " " + ori.toString();
		}
		s += " Orientation / " + this.getOrientation();
		return s;
	}
	 */
	
	
	
	//constructeur
	public Piece(int i, int j, Orientation orientation) {
		this.posX=i;
		this.posY=j;
		this.orientation=orientation;
	}

	//Getter
	public int getPosX() {
		return this.posX;
	}

	public int getPosY() {
		return this.posY;
	}
	
	public String getUnicode() {
		return this.unicode;
	}


	public Orientation getOrientation() {
		return this.orientation;
	}
	
	public void setOrientation( int orientationValue) {
		this.orientation=(Orientation) orientation.getOrifromValue(orientationValue);
	}
	
	public boolean isHaut() {
		return this.haut;
	}

	public boolean isBas() {
		return this.bas;
	}

	public boolean isDroite() {
		return this.droite;
	}

	public boolean isGauche() {
		return this.gauche;
	}
	
	public URL getLinksImage() {
		return this.linksImage;
	}

	//Setter
	public void setIPosX(int i) {
		this.posX=i;
	}

	public void setPosY(int j) {
		this.posY=j;
	}

	/*public void setOrientation(int orientationValue) {
		this.orientation = type.getOrientation(Orientation.getOrifromValue(orientationValue));
		//this.connectors = type.setConnectorsList(this.orientation);
	}*/
	
	
	
	//Methodes
	public void rotation(){ //tourne la piece de 90° dans le sens des aiguilles
		boolean tmp=this.haut;
		this.haut=this.gauche;
		this.gauche=this.bas;
		this.bas=this.droite;
		this.droite=tmp;
	}
	
	
	
}
