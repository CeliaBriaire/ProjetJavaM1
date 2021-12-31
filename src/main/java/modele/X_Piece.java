package modele;

public class X_Piece extends Piece {
	
	//constructeur
	public X_Piece(int i,int j,int orientation) {
		super(i,j,orientation);
		this.type=5;
		if(orientation==0) {
			haut=true; 
			gauche= true; 
			droite=true; 
			bas=true;
			unicode="┼";
			linksImage=getClass().getResource("/images/Piece40.png");
		}
	}
	
	@Override
	public void rotation() {
		super.rotation();
	}
}
