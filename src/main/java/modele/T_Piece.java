package modele;

public class T_Piece extends Piece{
	
	//Constructeur
	public T_Piece(int i,int j,Orientation orientation) {
		super(i,j,orientation);
		this.type=PieceType.TTYPE;
		typeTOrientation(orientation);
	}
	
	public void typeTOrientation(Orientation orientation) {
		if(orientation.getNbr()==0) {
			this.type=PieceType.TTYPE;
			haut=true; 
			gauche=true; 
			droite=true;
			bas=false;
			unicode="┴";
			linksImage=getClass().getResource("/images/Piece30.png");
		}
		else if (orientation.getNbr()==1) {
			haut=true; 
			bas=true; 
			droite=true;
			gauche=false;
			unicode="├";
			linksImage=getClass().getResource("/images/Piece31.png");
		}
		else if (orientation.getNbr()==2) {
			gauche=true; 
			bas=true; 
			droite=true;
			haut=false;
			unicode="┬";
			linksImage=getClass().getResource("/images/Piece32.png");
		}
		else {
			haut=true; 
			bas=true; 
			gauche=true;
			droite=false;
			unicode="┤";
			linksImage=getClass().getResource("/images/Piece33.png");
		}
	}
	
	@Override
	public void rotation() {
		super.rotation();
		this.setOrientation((getOrientation().getNbr()+1)%4);
	}
	
	@Override
	public void setOrientation(int orientationValue) {
		super.setOrientation(orientationValue);
		typeTOrientation((Orientation) getOrientation().getOrifromValue(orientationValue));
	}
}
