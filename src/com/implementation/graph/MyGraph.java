package com.implementation.graph;

import java.util.*;

public class MyGraph {
    int noOfNodes;
    Map<Integer, List<Integer>> vortex;
    List<Integer> adjacentList;

    public MyGraph() {
        this.noOfNodes = 0;
        this.vortex = new HashMap<>();
        this.adjacentList = null;
    }

    public void addVortex(Integer node) {
        adjacentList = new ArrayList<>();
        vortex.put(node, adjacentList);
        noOfNodes++;
    }

    //Undirected Unweighted Graph
    public void addEdge(Integer sourceNode, Integer destinationNode) {
        vortex.get(sourceNode).add(destinationNode);
        vortex.get(destinationNode).add(sourceNode);
    }

    public void printGraph() {
        vortex.forEach((node,adjacentNodes) -> System.out.println("Node: "+node+" -> "+ adjacentNodes));
    }

    public static void main(String[] args) {
        MyGraph graph = new MyGraph();
        graph.addVortex(4);
        graph.addVortex(5);
        graph.addVortex(6);
        graph.addVortex(0);
        graph.addVortex(1);
        graph.addVortex(2);
        graph.addVortex(3);

        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(6, 5);

        graph.printGraph();
    }
}
