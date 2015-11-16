import GraphStuff.Edge;
import GraphStuff.Graph;
import GraphStuff.Node;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Arreola on 11/7/2015.
 */
public class Main {

    public static void main(String [] args) {

        ArrayList<Node> nodos = new ArrayList<>();
        ArrayList<Edge> edges = new ArrayList<>();

        nodos.add(new Node(0, "A"));
        nodos.add(new Node(1, "B"));
        nodos.add(new Node(2, "C"));
        nodos.add(new Node(3, "D"));
        nodos.add(new Node(4, "E"));
        nodos.add(new Node(5, "F"));

        edges.add(new Edge(nodos.get(0), nodos.get(1), 2));
        edges.add(new Edge(nodos.get(0), nodos.get(2), 1));
        edges.add(new Edge(nodos.get(1), nodos.get(3), 1));
        edges.add(new Edge(nodos.get(2), nodos.get(3), 3));
        edges.add(new Edge(nodos.get(3), nodos.get(5), 2));
        edges.add(new Edge(nodos.get(4), nodos.get(5), 2));

        DijkstraAdapter dijkstraAdapter = new DijkstraAdapter();
        dijkstraAdapter.setEdges(edges);

        LinkedList<Node> path = dijkstraAdapter.getPath("A", "F");

        for(int i = 0; i < path.size(); i++){
            System.out.println(path.get(i).getId());
        }

    }

}
