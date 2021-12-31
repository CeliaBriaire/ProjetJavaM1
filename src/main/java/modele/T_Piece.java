package modele;

public class T_Piece extends Piece{
	
	//Constructeur
	public T_Piece(int i,int j,int orientation) {
		super(i,j,orientation);
		this.type=3;
		typeTOrientation(orientation);
	}
	
	
	//Methodes
	public void typeTOrientation(int orientation) {
		if(orientation==0) {
			this.type=3;
			haut=true; 
			gauche=true; 
			droite=true;
			bas=false;
			unicode="┴";
			linksImage=getClass().getResource("/images/Piece30.png");
		}
		else if (orientation==1) {
			haut=true; 
			bas=true; 
			droite=true;
			gauche=false;
			unicode="├";
			linksImage=getClass().getResource("/images/Piece31.png");
		}
		else if (orientation==2) {
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
		this.setOrientation((orientation+1)%4);
	}
	
	@Override
	public void setOrientation(int orientation) {
		typeTOrientation(orientation);}
	}
}
