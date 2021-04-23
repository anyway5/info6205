package Assignments.assignment8;

public class Q1 {
    public int[] getShortestPaths(int[][] adjMatrix) {
        int[] result = new int[adjMatrix.length];
        boolean[] used = new boolean[adjMatrix.length];
        used[0] = true;
        for(int i = 1;i < adjMatrix.length;i++) {
            result[i] = adjMatrix[0][i];
            used[i] = false;
        }

        for(int i = 1;i < adjMatrix.length;i++) {
            int min = Integer.MAX_VALUE;
            int k = 0;
            for(int j = 1;j < adjMatrix.length;j++) {
                if(!used[j] && result[j] != -1 && min > result[j]) {
                    min = result[j];
                    k = j;
                }
            }
            used[k] = true;
            for(int j = 1;j < adjMatrix.length;j++) {
                if(!used[j]) {
                    if(adjMatrix[k][j] != -1 && (result[j] > min + adjMatrix[k][j] || result[j] == -1))
                        result[j] = min + adjMatrix[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int[][] adjMatrix = {{0,6,3,-1,-1,-1},
                {6,0,2,5,-1,-1},
                {3,2,0,3,4,-1},
                {-1,5,3,0,2,3},
                {-1,-1,4,2,0,5},
                {-1,-1,-1,3,5,0}};
        int[] result = q1.getShortestPaths(adjMatrix);
        for(int i = 0;i < result.length;i++)
            System.out.print(result[i]+" ");
    }
}
