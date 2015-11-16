package GraphStuff;

import GraphStuff.Node;

/**
 * Created by Arreola on 10/20/2015.
 */
public class Edge {

    private Node origen;
    private Node destino;
    private double ponderacion;

    public Edge(Node origen, Node destino, double ponderacion) {
        this.origen = origen;
        this.destino = destino;
        this.ponderacion = ponderacion;
    }

    public Node getOrigen() { return this.origen;}
    public Node getDestino() { return this.destino;}
    public double getPonderacion() { return this.ponderacion;}
}
