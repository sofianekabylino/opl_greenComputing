
public class Noeud {

	private String val;
	private Noeud filsGauche;
	private Noeud filsDroite;
	
	public Noeud getFilsGauche() {
		return filsGauche;
	}
	public void setFilsGauche(Noeud filsGauche) {
		this.filsGauche = filsGauche;
	}
	public Noeud getFilsDroite() {
		return filsDroite;
	}
	public void setFilsDroite(Noeud filsDroite) {
		this.filsDroite = filsDroite;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	
	public String getValNoeud(Noeud n){
		if(n != null) return n.getVal();
		return "";
	}
	
}
