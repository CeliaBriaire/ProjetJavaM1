package modele;

public enum Orientation {
	NORTH(0),  //==0
	EAST(1),   //==1
	SOUTH(2),   //==2
	WEST(3);   //==3
	
	private int nbr;
	
	private Orientation(int nbr) {
		this.setNbr(nbr);
	}

	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	static Orientation getOrifromValue(int orientationValue) {
		for (Orientation tmp : Orientation.values()) {
			if(orientationValue==tmp.getNbr()) {
				return tmp;
			}
		}
		return null;
	}

	Orientation turn90() {
		if(this.getNbr()==Orientation.NORTH.nbr) {
			return Orientation.EAST;
		}
		else if(this.getNbr()==Orientation.EAST.nbr) {
			return Orientation.SOUTH;
		}
		else if(this.getNbr()==Orientation.SOUTH.nbr) {
			return Orientation.WEST;
		}
		else {
			return Orientation.NORTH;
		}
	}
	
}
