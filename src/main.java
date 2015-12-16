import java.util.LinkedList;
import java.util.List;

public class main {
	
	private static List<Noeud> graphe = new LinkedList<Noeud>();
	
	public static void init(){
		Noeud A = new Noeud();
		Noeud B = new Noeud();
		Noeud C = new Noeud();
		Noeud D = new Noeud();
		Noeud E = new Noeud();
		Noeud F = new Noeud();
		Noeud G = new Noeud();
		
		A.setVal("A");
		A.setFilsDroite(B);
		A.setFilsGauche(C);
		
		B.setVal("B");
		B.setFilsDroite(D);
		B.setFilsGauche(null);
		
		C.setVal("C");
		C.setFilsDroite(E);
		C.setFilsGauche(F);
		
		D.setVal("D");
		D.setFilsDroite(null);
		D.setFilsGauche(null);

		E.setVal("E");
		E.setFilsDroite(null);
		E.setFilsGauche(G);
		
		F.setVal("F");
		F.setFilsDroite(null);
		F.setFilsGauche(null);
		
		G.setVal("G");
		G.setFilsDroite(null);
		G.setFilsGauche(null);
		
		graphe.add(A);
		graphe.add(B);
		graphe.add(C);
		graphe.add(D);
		graphe.add(E);
		graphe.add(F);
		graphe.add(G);
	}
	
	public static void main (String[] args) {
		init();
		
		Graphe g = new Graphe(graphe);
		
		g.affichage();
		
	}

}
