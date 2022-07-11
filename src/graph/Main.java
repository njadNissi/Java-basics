package graph;

public class Main {

    public static void main(String[] args) {
	
	Country Angola = new Country("Angola");
	Country DRC = new Country("DRC");
	Country China = new Country("China");
	Country USA = new Country("USA");
	Country France = new Country("France");
	Country Canada = new Country("Canada");
	
	CountryGraph cg = new CountryGraph();
	cg.addIndirectedEdge(Angola, DRC);
	cg.addIndirectedEdge(Angola, USA);
	cg.addIndirectedEdge(USA, DRC);
	cg.addIndirectedEdge(DRC, China);
	cg.addIndirectedEdge(USA, France);
	cg.addIndirectedEdge(China, France);
	cg.addIndirectedEdge(China, Canada);
	cg.addIndirectedEdge(France, Canada);
	
//	cg.traverse();
//	System.out.println("BFS: " + cg.breadthFirstTraversal(Canada));
	System.out.println("DFS: " + cg.depthFirstTraversal(Canada));
    }
    
}
