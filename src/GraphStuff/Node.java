package GraphStuff;

/**
 * Created by Arreola on 10/20/2015.
 */
public class Node {

    private int id;
    public String name;

    public Node(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() { return this.id;}
    public String getName() { return this.name;}
}
