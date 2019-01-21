import java.util.*;

class Vertex<T> {

    T content;
    Vertex(T x)
    {
        this.content = x;
    }
}

class Edge<T> {
    Vertex src;
    Vertex dest;

    Edge(Vertex x, Vertex y)
    {
        this.src = x;
        this.dest = y;
    }
}


public class Graph<T> {

    Map<T,Set<T>> adjList = new HashMap<>();

    void addEdge(Edge e)
    {
        if(adjList.get(e.src.content) == null)
        {
            Set<T> s = new HashSet<>();
            s.add((T)e.dest.content);
            adjList.put((T)e.src.content,s);
        }
        else
        {
            Set temp = adjList.get(e.src.content);
            temp.add(e.dest.content);

        }
    }

    void removeEdge(Edge e)
    {

        if(adjList.get(e.src.content) != null)
        {
            adjList.get(e.src.content).remove(e.dest.content);
        }
    }

    void printAllEdges()
    {

            for(T v : adjList.keySet())
            {
                System.out.println(v);
                adjList.get(v).forEach( s -> System.out.println(s));
                System.out.println("*****");
            }

    }

    public static void main(String args[])
    {
        Graph g = new Graph();

        g.addEdge(new Edge (new Vertex("Mad") , new Vertex("Dam")));
        g.addEdge(new Edge (new Vertex("Mad") , new Vertex("Low")));
        g.addEdge(new Edge (new Vertex("Sad") , new Vertex("Tad")));
        g.removeEdge(new Edge (new Vertex("Mad") , new Vertex("Low")));
        g.printAllEdges();


    }





}