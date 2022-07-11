package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class CountryGraph {

    private ArrayList<Node> graph;
    
   public CountryGraph() {
       this.graph = new ArrayList<Node>();
   }
   
   private Node get(Country c) {
       for(Node node : graph)
	   if(node.label == c) 
	       return node;
       return null;
   }
   
   public void traverse() {
       for(Node node : graph) {
	   System.out.print(node.label+"\n\t->");
	   for(Node neighbor : node.neighbors) {
	       System.out.print(neighbor.label + " | ");
	   }
	   System.out.println();
       }
   }
   
   public void addIndirectedEdge(Country src, Country dest) {
       
      Node s = get(src);
      Node d = get(dest);
      /**create non-existing nodes*/
      if(s == null) {
	  s = new Node(src);
	  graph.add(s);
      }
	  
      if(d == null) {
	  d = new Node(dest);
	  graph.add(d);
      }
      /**add directed edge on nodes*/
      s.neighbors.add(d);
      d.neighbors.add(s);
}
   
   public void addDirectedEdge(Country src, Country dest) {
       Node s = get(src);
       Node d = get(dest);
       
       /**create non-existing nodes*/
       if(s == null) {
 	  s = new Node(src);
 	  graph.add(s);
       }
 	  
       if(d == null) {
 	  d = new Node(dest);
 	  graph.add(d);
       }

       /**add a directed edge*/
       s.neighbors.add(d);
       
}
   
   public int getSize() {
       return this.graph.size();
   }
   
   public String breadthFirstTraversal (Country src) {
       StringBuilder sb = new StringBuilder("");
       
       LinkedList<Node> queue = new LinkedList<CountryGraph.Node>();
       /**add first root node*/
       queue.offer(get(src));
       while(!queue.isEmpty()) {
	  /**poll a node and visit it*/
	  Node current = queue.poll();
	  current.visit();
	  sb.append(current.label + " - ");
	  
	  for(Node neighbor : current.neighbors) {
	      if(!neighbor.visited) {
    	         neighbor.visit();
    	         queue.add(neighbor);
	      }
	  }
       }
       
       return sb.toString() + "|";
   }
   
   
   private void dfs(Node node, StringBuilder sb) {
       /**visit the node and display*/
       node.visit();
       sb.append(node.label + " - ");
       
       if(node.neighbors.isEmpty())
	   return;
       for(Node neighbor : node.neighbors)
	      if(!neighbor.visited)
 	         dfs(neighbor, sb);
   }
   
   public String depthFirstTraversal (Country src) {
       
      StringBuilder sb = new StringBuilder("");
//      Stack<Node> stack = new Stack<Node>();
      
//      stack.push(get(src));
     dfs(get(src), sb);
      
    return sb.toString();
   }
   
   class Node {
       Country label;
       private boolean visited;
       ArrayList<Node> neighbors;
       
       Node (Country label){
	   this.label = label;
	   neighbors = new ArrayList<CountryGraph.Node>();
	   visited = false;
       }
       private void visit() {
            this.visited = true;
        }
   }
   
}
