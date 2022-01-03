package modele;

public class O_Piece extends Piece {
	
	//constructeur
	public O_Piece (int i,int j,int orientation) {
		super(i,j,orientation);
		this.type=1;
		typeOOrientation(orientation);
	}

	
	public void typeOOrientation(int orientation) {
		if(orientation==0) {
			haut=true;
			bas=false;
			droite=false;
			gauche=false;
			unicode="╹h";
			linksImage=getClass().getResource("/images/Piece10.png");
		}
		else if (orientation==1) {
			droite=true;
			bas=false;
			haut=false;
			gauche=false;
			unicode="d╺";
			linksImage=getClass().getResource("/images/Piece11.png");
		}
		else if (orientation==2) {
			bas=true;
			droite=false;
			haut=false;
			gauche=false;
			unicode="╻b";
			linksImage=getClass().getResource("/images/Piece12.png");
		}
		else {
			gauche=true;
			droite=false;
			bas=false;
			haut=false;
			unicode="╸g";
			linksImage=getClass().getResource("/images/Piece13.png");
		}
	}
	
	
	@Override
	public void rotation() {
		super.rotation();
		this.setOrientation((orientation+1)%4);
	}
	
	@Override
	public void setOrientation(int orientation) {
		super.setOrientation(orientation);
		typeOOrientation(orientation);
		}
}
