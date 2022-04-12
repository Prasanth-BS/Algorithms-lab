package DAAPrograms.Kruskals;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


class Main {
    public static void main(String args[]) {
        Vertice[] vertices = new Vertice[5];
        vertices[0] = new Vertice(0);
        vertices[1] = new Vertice(1);
        vertices[2] = new Vertice(2);
        vertices[3] = new Vertice(3);
        vertices[4] = new Vertice(4);
        
        Edge[] edges = new Edge[7];
        edges[0] = new Edge(vertices[0], vertices[1], 10);
        edges[6] = new Edge(vertices[1], vertices[2], 6);
        edges[2] = new Edge(vertices[2], vertices[3], 3);
        edges[3] = new Edge(vertices[3], vertices[4], 1);
        edges[4] = new Edge(vertices[4], vertices[0], 6);
        edges[5] = new Edge(vertices[0], vertices[3], 5);
        edges[1] = new Edge(vertices[1], vertices[3], 4);


        Graph g = new Graph(vertices, edges);
        System.out.println(g);

        Arrays.sort(g.e, (f, s) -> (f.weight != s.weight) ? (f.weight - s.weight) : (f.uComp.name - s.uComp.name) );

        //System.out.println(g);
        Set[] sets = new Set[g.v.length];
        for(int i = 0; i < g.v.length; i++) 
            sets[i] = new Set(g.v[i]);

        Graph minSpan;
        Edge[] minEdges = new Edge[g.v.length-1];
        //ArrayList<Edge> minEdges = new ArrayList<>();
        int j = 0;
        //for(Edge edge: g.e) {
        //int i;
        for(int i = 0; j < g.v.length-1; i++){
            //System.out.println("uComp : " + g.e[i].uComp.name + "vComp : " + edge.vComp.name);
            if(sets[g.e[i].uComp.name].find() != sets[g.e[i].vComp.name].find()) {
                sets[g.e[i].uComp.name].union(sets[g.e[i].vComp.name]);
                //minEdges.add(edge);
                //System.out.println(i);
                minEdges[j++] = g.e[i];
                
            }
        }     
        minSpan = new Graph(vertices, minEdges);
        System.out.println(minSpan);
        
    }
}