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
	
	/*public void getOrientation(Orientation orientation) {
		if (this.nbr==0) {
			
		}
		
		
	}*/

}
