package modele;

public class I_Piece extends Piece{
	
	//constructeur
	public I_Piece (int i,int j,Orientation orientation) {
		super(i,j,orientation);
		this.type=PieceType.I;
		typeIOrientation(orientation);
	}
	
	public void typeIOrientation(Orientation orientation) {
		if(orientation.getNbr()==0) {
			haut=true; 
			bas= true;
			gauche=false;
			droite=false;
			unicode="│";
			linksImage=getClass().getResource("/images/Piece20.png");
		}
		else {
			gauche=true; 
			droite=true;
			haut=false;
			bas=false;
			unicode="─";
			linksImage=getClass().getResource("/images/Piece21.png");
		}
	}
	
	@Override
	public void rotation() {
		super.rotation();
		this.setOrientation((this.getOrientation().getNbr()+1)%2);
	}
	
	@Override
	public void setOrientation(int orientationValue) {
		super.setOrientation(orientationValue);
		typeIOrientation((Orientation) getOrientation().getOrifromValue(orientationValue));
	}
}
