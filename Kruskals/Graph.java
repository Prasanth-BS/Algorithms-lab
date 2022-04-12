package DAAPrograms.Kruskals;

import java.util.Arrays;

public class Graph {
    
    Vertice[] v;
    Edge[] e;

    Graph(Vertice[] vertices, Edge[] edges) {
        this.v = vertices;
        this.e = edges;
    }

    @Override
    public String toString() {
        String cache;
        cache = "The vertices are: " + Arrays.toString(v) +"\n";
        cache += "The Edges are: \n";
        for(Edge edge: e) {
            cache += edge + "\n";
        }
         
        return cache;
    }
}

class Vertice {
    int name;
    static boolean isVisited = false;
    
    Vertice(int name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + this.name;
    }
}

class Edge {
    Vertice uComp;
    Vertice vComp;
    int weight;
    
    Edge(Vertice uComp, Vertice vComp, int weight) {
        this.uComp = uComp;
        this.vComp = vComp;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.uComp + " --" +this.weight+ "--> " + this.vComp;
    }
}
