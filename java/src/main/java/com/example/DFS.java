package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

//        0
//      / | \
//    2   3  1
//   /
//  4
//o/p : 0 2 4 3 1
public class DFS {
    public static void main(String[] args) {
        // Graph representation using adjacency list
        int[][] graph = { 
            { 2, 3, 1 }, 
            { 0 }, 
            { 0, 4 }, 
            { 0 }, 
            { 2 } 
        };

        // Perform DFS starting from node 0
        performDFS(graph, 0);
    }

    public static void performDFS(int[][] graph, int startNode) {
        Deque<Integer> stack = new ArrayDeque<>();
        boolean[] isVisited = new boolean[graph.length];
        
        // Push the starting node onto the stack
        stack.push(startNode);
        
        // Loop until the stack is empty
        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            
            // If the current node has not been visited
            if (!isVisited[currentNode]) {
                // Mark it as visited and print it
                System.out.print(currentNode + " ");
                isVisited[currentNode] = true;
                
                // Push all adjacent nodes onto the stack in reverse order
                for (int i = graph[currentNode].length - 1; i >= 0; i--) {
                    stack.push(graph[currentNode][i]);
                }
            }
        }
    }
}
