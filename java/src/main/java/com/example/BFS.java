package com.example;

import java.util.LinkedList;

//        0
//      / | \
//    1   2  3
//        |
//        4

//o/p : 0 1 2 3 4
public class BFS {
    static LinkedList<Integer> queue = new LinkedList<>();
    static boolean[] isVisted = new boolean[5];
    public static void main(String[] args) {

        int[][] graph = {{1,2,3},
                         {},
                         {4},
                         {},
                         {}};
        performBFS(graph,0);
    
    }
    private static void performBFS(int[][] graph, int startingNode) {

        // Push starting node in queue
        queue.add(startingNode);

        //loop till all nodes in queue are processed

        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            // check if the node is visited
            if(!isVisted[currentNode]){
                //read the node 
                System.out.print(currentNode+" ");
                // add the children of current node in queue
                for (int element : graph[currentNode]) {
                    queue.add(element);
                }
            }
        }

        
    }
}
