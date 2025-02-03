package TCS;

import java.util.*;

class BoardGames {
    static class Cell {
        int row, col, moves;
        public Cell(int row, int col, int moves) {
            this.row = row;
            this.col = col;
            this.moves = moves;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] grid = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int srcRow = sc.nextInt();
        int srcCol = sc.nextInt();
        int destRow = sc.nextInt();
        int destCol = sc.nextInt();

        int moveX = sc.nextInt();
        int moveY = sc.nextInt();

        int result = bfs(grid, M, N, srcRow, srcCol, destRow, destCol, moveX, moveY);
        System.out.println(result);

        sc.close();
    }

    private static int bfs(int[][] grid, int M, int N, int srcRow, int srcCol, int destRow, int destCol, int moveX, int moveY) {
        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[M][N];

        queue.add(new Cell(srcRow, srcCol, 0));
        visited[srcRow][srcCol] = true;

        int[][] directions = {
                {moveX, moveY},          // forward
                {moveY, -moveX},         // right (90 degrees clockwise)
                {-moveY, moveX},         // left (90 degrees counter-clockwise)
                {-moveX, -moveY}         // backward (180 degrees)
        };

        while (!queue.isEmpty()) {
            Cell current = queue.poll();

            // If we reach the destination cell, return the number of moves
            if (current.row == destRow && current.col == destCol) {
                return current.moves;
            }

            for (int[] dir : directions) {
                int newRow = current.row + dir[0];
                int newCol = current.col + dir[1];

                if (isValidMove(newRow, newCol, M, N, grid, visited)) {
                    queue.add(new Cell(newRow, newCol, current.moves + 1));
                    visited[newRow][newCol] = true;
                }
            }
        }

        // If we exhaust the queue without finding the destination, return -1 (unreachable)
        return -1;
    }

    private static boolean isValidMove(int row, int col, int M, int N, int[][] grid, boolean[][] visited) {
        return row >= 0 && row < M && col >= 0 && col < N && grid[row][col] == 0 && !visited[row][col];
    }
}

