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
	I(2),
	EMPTY(0),
	L(6),
	O(1),
	T(3),
	X(4);// Each Type has a number of connectors and a specific value
	
	private int nbr;
	
	private PieceType(int nbr) {
		this.setNbr(nbr);
	}

	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	Object getTypefromValue(int typeValue) {
		for (PieceType tmp : PieceType.values()) {
			if(typeValue==tmp.getNbr()) {
				return tmp;
			}
		}
		return null;
	}

}
