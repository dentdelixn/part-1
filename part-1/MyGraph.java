import java.util.*;

 


public class MyGraph<Vertex> {
    private final boolean undirected;
    private Map<Vertex, List<Vertex>> map = new HashMap<>();

    public MyGraph() {
        this.undirected = true;
    }

    public MyGraph(boolean undirected) {
        this.undirected = undirected;
    }

    public void addVertex(Vertex v) {
        map.put(v, new LinkedList<>());
    }

    public void addEdge(Vertex source, Vertex dest) { 
        if (!hasVertex(source))
            addVertex(source);

        if (!hasVertex(dest))
            addVertex(dest);

        if (hasEdge(source, dest)
                || source.equals(dest))
            return; // reject parallels & self-loops

        map.get(source).add(dest);

        if (undirected)
            map.get(dest).add(source);
    }

    public int getVerticesCount() {
    	return map.size();
    }

    public int getEdgesCount() {
    	int sum = 0;
    	 for(Vertex v: map.keySet()) {
    		 sum += map.get(v).size();
    	 }
    	 if(undirected) sum /= 2;
    	return sum;
    }

    public boolean hasVertex(Vertex v) {
    	 
    	return map.containsKey(v);
    }

    public boolean hasEdge(Vertex source, Vertex dest) {
    	  if(!hasVertex(source) || !hasVertex(dest)) {
    		  return false;
    	  }
 
    	return this.map.get(source).contains(dest);
    }

    public Iterable<Vertex> adj() {

    	return map.keySet();
    }
}

