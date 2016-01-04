import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Graphe {
	
	private List<Noeud> listNoeud;
	private List<Noeud> file = new LinkedList<Noeud>();;
	
	public Graphe(List<Noeud> listNoeud){
		this.listNoeud = listNoeud;
	}

	public void affichage(){
		Iterator<Noeud> it = file.iterator();
		while(it.hasNext()){
			Noeud itActuel = it.next();
			//System.out.println(itActuel.getVal()+", FilsDroite ==> "+ (((itActuel.getFilsDroite())!=null)?itActuel.getFilsDroite().getVal():"null")+" , FilsGauche ==> "+(((itActuel.getFilsGauche())!=null)?itActuel.getFilsGauche().getVal():"null"));
			System.out.println(itActuel.getVal());
		}
	}
	
	public void parcoursLargeur(Noeud s){
		s.setVisite(true);
		file.add(s);
		int i = 0;
		while(i < file.size()){
			System.out.println("while(i <= file.size())");
			Noeud n = file.get(i);
			if((n.getFilsDroite() != null) && (n.getFilsDroite().isVisite() == false)){
				n.getFilsDroite().setVisite(true);
				file.add(n.getFilsDroite());
			}
			
			if((n.getFilsGauche() != null) && (n.getFilsGauche().isVisite() == false)){
				n.getFilsGauche().setVisite(true);
				file.add(n.getFilsGauche());
			}
			i = i+1;
		}
		System.out.println(file.size());
		affichage();
	}
	
}
