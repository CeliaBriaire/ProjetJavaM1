package modele;

public class Empty_Piece extends Piece {
	
	//contructeur
	public Empty_Piece(int i,int j,Orientation orientation) {
		super(i,j,orientation);
		this.type=0;
		this.haut=false; 
		this.gauche= false; 
		this.droite=false; 
		this.bas=false;
		this.unicode=" ";
		this.linksImage=getClass().getResource("/images/Piece00.png");
	}
	
	@Override
	public void rotation() {
		super.rotation();
	}
	
	
}

