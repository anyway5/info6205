package Assignments.assignment8;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if(findCircle(i,visited,graph)) return false;
        }
        return true;
    }

    private boolean findCircle(int node,int[] visited,List<List<Integer>> graph) {
        if(visited[node] == 1) return true;
        if(visited[node] == 2) return false;
        visited[node] = 1;
        for (Integer pre : graph.get(node)) {
            if(findCircle(pre,visited,graph)) return true;
        }
        visited[node] = 2;
        return false;
    }

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0},{0,1}};
        Q2 q2 = new Q2();
        boolean b = q2.canFinish(numCourses,prerequisites);
        System.out.println(b);
    }
}
