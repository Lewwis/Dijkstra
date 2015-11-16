package GraphStuff;

import GraphStuff.Edge;

import java.util.ArrayList;

/**
 * Created by Arreola on 11/7/2015.
 */
public class Graph {

    private final ArrayList<Edge> edges;

    public Graph(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public ArrayList<Edge> getEdges() { return this.edges;}

}
