package com.example;

import java.util.LinkedList;

//        0
//      / | \
//    1   2  3
//        |
//        4

//o/p : 0 1 2 3 4
public class BFS {
    
    public static void main(String[] args) {
        int[][] graph = {{1,2,3},
                         {},
                         {4},
                         {},
                         {}};
        performBFS(graph,0);
    
    }
    private static void performBFS(int[][] graph, int startingNode) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] isVisted = new boolean[graph.length];

        // Push starting node in queue
        queue.add(startingNode);

        //loop till all nodes in queue are processed

        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            // check if the node is visited
            if(!isVisted[currentNode]){
                //Mark the current node as visited 
                isVisted[currentNode]=true;
                //read the node 
                System.out.print(currentNode+" ");
                // add the children of current node in queue
                for (int neighbor : graph[currentNode]) {
                    queue.add(neighbor);
                }
            }
        }

        
    }
}
