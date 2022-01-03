package modele;

public enum Orientation {
	NORTH(0),  //==0
	SOUTH(1),   //==1
	EAST(2),   //==2
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

	Object getOrifromValue(int orientationValue) {
		for (Orientation tmp : Orientation.values()) {
			if(orientationValue==tmp.getNbr()) {
				return tmp;
			}
		}
		return null;
	}
}
