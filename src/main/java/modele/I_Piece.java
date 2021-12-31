package modele;

public class I_Piece extends Piece{
	
	//constructeur
	public I_Piece (int i,int j,int orientation) {
		this.type=2;
		if(orientation==0) {
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
		this.setOrientation((this.orientation+1)%2);
	}
	
	@Override
	public void setOrientation(int orientation) {
		super.setOrientation(orientation);
		if(this.orientation==0) {
			haut=true; 
			bas= true;
			gauche=false;
			droite=false;
			unicode="│";
			linksImage=getClass().getResource("/images/Piece20.png");}
		else {gauche=true; 
			droite=true;
			haut=false;
			bas=false;
			unicode="─";
			linksImage=getClass().getResource("/images/Piece21.png");}
	}
}
