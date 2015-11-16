import GraphStuff.Edge;
import GraphStuff.Node;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Arreola on 11/12/2015.
 */
public class DijkstraAdapter {

    private Dijkstra dijkstra;

    public DijkstraAdapter() {
        dijkstra = new Dijkstra();
    }

    public LinkedList<Node> getPath(String source, String target) {
        Node sourceNode = searchNode(source);
        Node targetNode = searchNode(target);
        dijkstra.execute(sourceNode);

        return dijkstra.getPath(targetNode);
    }

    public void setEdges(ArrayList<Edge> edged) {
        dijkstra.setEdges(edged);
    }

    public Node searchNode(String nodeName) {
        ArrayList<Edge> edges = dijkstra.getEdges();
        for(Edge target: edges) {
            if(target.getOrigen().getName().equals(nodeName))
                return target.getOrigen();
            if(target.getDestino().getName().equals(nodeName))
                return target.getDestino();
        }

        return null;
    }
}
