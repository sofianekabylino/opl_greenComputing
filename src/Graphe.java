import java.util.Iterator;
import java.util.List;

public class Graphe {
	
	private List<Noeud> listNoeud;
	
	public Graphe(List<Noeud> listNoeud){
		this.listNoeud = listNoeud;
	}

	public void affichage(){
		Iterator<Noeud> it = listNoeud.iterator();
		while(it.hasNext()){
			Noeud itActuel = it.next();
			System.out.println(itActuel.getVal()+", FilsDroite ==> "+ (((itActuel.getFilsDroite())!=null)?itActuel.getFilsDroite().getVal():"null")+" , FilsGauche ==> "+(((itActuel.getFilsGauche())!=null)?itActuel.getFilsGauche().getVal():"null"));
			
		}
	}
	
}
