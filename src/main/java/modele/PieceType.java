package modele;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 
 * Type of the piece enum
 * 
 */
public enum PieceType {
	BAR(2),
	VOID(0),
	LTYPE(6),
	ONECONN(1),
	TTYPE(3),
	FOURCONN(4);// Each Type has a number of connectors and a specific value
	
	private int nbr;
	
	
	private PieceType(int nbr) {
		this.setNbr(nbr);
	}

	public int getNbr() {
		return nbr;
	}
	
	/*public Orientation getOrientation(Orientation orientation) { //Que doit elle faire?
		return orientation;
	}*/
	
	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	static PieceType getTypefromValue(int typeValue) { //normalement bonne
		for (PieceType tmp : PieceType.values()) {
			if(typeValue==tmp.getNbr()) {
				return tmp;
			}
		}
		return null;
	}
	 
	
	LinkedList<Orientation> setConnectorsList(Orientation orientation) { //normalement bon
		LinkedList<Orientation> list=new LinkedList<Orientation>();
		if(this.nbr==0) {
		}
		else if(this.nbr==1){
			list.add(orientation);
		
		}
		else if(this.nbr==2){
			if(orientation==Orientation.NORTH) {
				list.add(Orientation.NORTH);
				list.add(Orientation.SOUTH);
			}
			if(orientation==Orientation.EAST) {
				list.add(Orientation.EAST);
				list.add(Orientation.WEST);
			}
		}
		else if(this.nbr==3){
			if(orientation==Orientation.NORTH) {
				list.add(Orientation.NORTH);
				list.add(Orientation.EAST);
				list.add(Orientation.WEST);
			}
			if(orientation==Orientation.EAST) {
				list.add(Orientation.NORTH);
				list.add(Orientation.SOUTH);
				list.add(Orientation.EAST);
			}
			if(orientation==Orientation.SOUTH) {
				list.add(Orientation.EAST);
				list.add(Orientation.SOUTH);
				list.add(Orientation.WEST);
			}
			if(orientation==Orientation.WEST) {
				list.add(Orientation.NORTH);
				list.add(Orientation.SOUTH);
				list.add(Orientation.WEST);
			}
		}
		else if(this.nbr==4){
			list.add(Orientation.NORTH);
			list.add(Orientation.SOUTH);
			list.add(Orientation.WEST);
			list.add(Orientation.EAST);
		}
		else {
			if(orientation==Orientation.NORTH) {
				list.add(Orientation.NORTH);
				list.add(Orientation.EAST);
			}
			if(orientation==Orientation.EAST) {
				list.add(Orientation.SOUTH);
				list.add(Orientation.EAST);
			}
			if(orientation==Orientation.SOUTH) {
				list.add(Orientation.SOUTH);
				list.add(Orientation.WEST);
			}
			if(orientation==Orientation.WEST) {
				list.add(Orientation.NORTH);
				list.add(Orientation.WEST);
			}
		}
		return list;
	}


	ArrayList<Orientation> getListOfPossibleOri() {  //normalement bonne
		ArrayList<Orientation> list= new ArrayList<Orientation>();
		if(this.nbr==0) {
			list.add(Orientation.NORTH);
		}
		else if(this.nbr==1){
			list.add(Orientation.NORTH);
			list.add(Orientation.SOUTH);
			list.add(Orientation.EAST);
			list.add(Orientation.WEST);
		}
		else if(this.nbr==2){
			list.add(Orientation.NORTH);
			list.add(Orientation.EAST);
		}
		else if(this.nbr==3){
			list.add(Orientation.NORTH);
			list.add(Orientation.SOUTH);
			list.add(Orientation.EAST);
			list.add(Orientation.WEST);
		}
		else if(this.nbr==4){
			list.add(Orientation.NORTH);
		}
		else {
			list.add(Orientation.NORTH);
			list.add(Orientation.SOUTH);
			list.add(Orientation.EAST);
			list.add(Orientation.WEST);
		}
		return list;
	}

}
