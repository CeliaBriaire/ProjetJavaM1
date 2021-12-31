package modele;

public class L_Piece extends Piece {
	
	//Constructeur
	public L_Piece (int i,int j,int orientation) {
		super(i,j,orientation);
		this.type=5;
		typeLOrientation(orientation);
	}
	
	
	//Methodes 
	public void typeLOrientation(int orientation) {
		if(orientation==0) {
			this.haut=true;
			this.droite=true;
			bas=false;
			gauche=false;
			this.unicode="╰";
			this.linksImage=getClass().getResource("/images/Piece50.png");
		}
		else if (orientation==1) {
			this.bas=true; 
			this.droite=true;
			gauche=false;
			haut=false;
			this.unicode="╭";
			this.linksImage=getClass().getResource("/images/Piece51.png");
		}
		else if (orientation==2) {
			this.gauche=true; 
			this.bas=true;
			droite=false;
			haut=false;
			this.unicode="╮";
			this.linksImage=getClass().getResource("/images/Piece52.png");
		}
		else {
			this.haut=true;
			this.gauche=true;
			this.unicode="╯";
			this.linksImage=getClass().getResource("/images/Piece53.png");
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
		typeLOrientation(orientation);
	}
}
