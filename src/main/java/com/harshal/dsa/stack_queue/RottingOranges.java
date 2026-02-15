package com.harshal.dsa.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/rotting-oranges/description/
public class RottingOranges {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{2,1,1},{0,1,1},{1,0,1}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j, 0});
                }
            }
        }
        int maxMinutes = 0;
        while (!queue.isEmpty()) {
            int[] curr = (int[]) queue.poll();
            int x = curr[0], y = curr[1], level = curr[2];

            if (x > 0 && grid[x - 1][y] == 1) {
                grid[x - 1][y] = 2;
                queue.add(new int[]{x - 1, y, level + 1});
            }
            if (x < m - 1 && grid[x + 1][y] == 1) {
                grid[x + 1][y] = 2;
                queue.add(new int[]{x + 1, y, level + 1});
            }
            if (y < n - 1 && grid[x][y + 1] == 1) {
                grid[x][y + 1] = 2;
                queue.add(new int[]{x, y + 1, level + 1});
            }
            if (y > 0 && grid[x][y - 1] == 1) {
                grid[x][y - 1] = 2;
                queue.add(new int[]{x, y - 1, level + 1});
            }
            maxMinutes = Math.max(level, maxMinutes);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) return -1;
            }
        }
        return maxMinutes;
    }

}
