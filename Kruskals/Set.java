package DAAPrograms.Kruskals;

import java.util.ArrayList;

public class Set {
    int parent;
    ArrayList<Vertice> elements = new ArrayList<>();

    Set(Vertice v) {
        this.elements.add(v);
        this.parent = v.name;
    }

    void union(Set set) {
        
        this.parent = (this.parent <= set.parent) ? (this.parent) : (set.parent);
        for(Vertice v : set.elements) {
            this.elements.add(v);
        }
    }

    int find() {
        return this.parent;
    }

}
