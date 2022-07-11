package graph;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class CountryGraph1 {

    private ArrayList<ArrayList<Country>> graph;
    
   public CountryGraph1() {
       this.graph = new ArrayList<ArrayList<Country>>();
   }
   
   private int getIndexOf(Country c) {
       for(int i = 0; i < graph.size(); i++) 
	   if(graph.get(i).get(0) == c)
	       return i;
       return -1;
   }
   
   public void addIndirectedEdge(Country src, Country dest) {
       
       int s = getIndexOf(src);
       
       if(s == -1) {
	   ArrayList<Country> node = new ArrayList<Country>();
	   node.add(src);
	   graph.add(node);
	   s = graph.size() - 1;
       }
       graph.get(s).add(dest);
       
       
       int d = getIndexOf(dest);
       if(d == -1) {
	   ArrayList<Country> node = new ArrayList<Country>();
	   node.add(dest);
	   graph.add(node);
	   d = graph.size() - 1;
       }
       graph.get(d).add(src);
	       
}
   
   public void addDirectedEdge(Country src, Country dest) {

       int s = getIndexOf(src);
       
       if(s == -1) {
	   ArrayList<Country> node = new ArrayList<Country>();
	   node.add(src);
	   graph.add(node);
	   s = graph.size() - 1;
       }
	       
	  graph.get(s).add(dest);/**directed graph need to add from dest -> src*/

	  int d = getIndexOf(dest);
	       
	       if(d == -1) {
		   ArrayList<Country> node = new ArrayList<Country>();
		   node.add(dest);
		   graph.add(node);
	       }
	       /**directed graph no need to add from dest -> src*/
}
   
   public int getSize() {
       return this.graph.size();
   }
   
   public String breadthFirstTraversal (Country src) {
       int s = getIndexOf(src);
       StringBuilder sb = new StringBuilder("");
       
       if(s != -1) {
	   boolean[] visited = new boolean[graph.size()];
	   
	   for (int i = s; i < graph.size(); i++) {
	       
	          for (int j = 0; j < graph.get(i).size(); j++) {
	              
	              Country c = graph.get(i).get(j);
	              int index = getIndexOf(c);
	              
	              if(visited[index] == false) {
	        	  visited[index]  = true;
	        	  sb.append(c + " - ");
	              }
	          }
	       }
       }
       
       return sb.toString();
   }
   
   public String depthFirstTraversal (Country src) {
       int s = getIndexOf(src);
       StringBuilder sb = new StringBuilder("");
       
       if(s != -1) {
	   Stack<Country> stack = new Stack<Country>();	 
	   boolean[] visited = new boolean[graph.size()];
	   
	   for (int i = 0; i < graph.size(); i++) {
		
		int index = 0;
		for(int j = 0; j < graph.get(i).size(); j++) {
		    Country c1 = graph.get(i).get(j);
		    index = getIndexOf(c1);
		    if(visited[index] == false) {
        		    stack.add(graph.get(index).get(0));
        		    visited[index] = true;
		    }
		}
	       
	   }
           while(!stack.isEmpty()) {
               sb.append(stack.pop() + " - ");
           }
       }
       
       return sb.toString();
   }
   
}
