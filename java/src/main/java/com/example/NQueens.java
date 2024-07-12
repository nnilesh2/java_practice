package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NQueens {

    // Stack entry class to keep track of board state
    static class StackEntry {
        int row;
        int[] positions; // positions[col] indicates the row of the queen in the col

        StackEntry(int row, int[] positions) {
            this.row = row;
            this.positions = positions.clone(); // Clone to avoid reference issues
        }
    }

    // Function to solve the N-Queens problem
    public static List<int[]> solveNQueens(int n) {
        List<int[]> solutions = new ArrayList<>();
        Stack<StackEntry> stack = new Stack<>();

        // Initial stack entry with an empty board
        stack.push(new StackEntry(0, new int[n]));

        while (!stack.isEmpty()) {
            StackEntry entry = stack.pop();
            int row = entry.row;
            int[] positions = entry.positions;

            if (row == n) {
                solutions.add(positions);
            } else {
                for (int col = 0; col < n; col++) {
                    if (isValid(positions, row, col)) {
                        positions[row] = col;
                        stack.push(new StackEntry(row + 1, positions));
                    }
                }
            }
        }

        return solutions;
    }

    // Function to check if the queen placement is valid
    private static boolean isValid(int[] positions, int occupiedRows, int col) {
        for (int i = 0; i < occupiedRows; i++) {
            if (positions[i] == col || 
                positions[i] - i == col - occupiedRows || 
                positions[i] + i == col + occupiedRows) {
                return false;
            }
        }
        return true;
    }

    // Utility function to print the board
    private static void printSolution(int[] positions) {
        int n = positions.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (positions[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main function to test the solution
    public static void main(String[] args) {
        int n = 4; // Change this to solve for different sizes of the board
        List<int[]> solutions = solveNQueens(n);

        System.out.println("Number of solutions: " + solutions.size());
        for (int[] solution : solutions) {
            printSolution(solution);
        }
    }
}