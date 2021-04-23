package Assignments.assignment8;

public class Q4 {
    public int numIslands(char[][] grid) {
        if(grid.length==0||grid[0].length==0) return 0;
        int res=0;
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }
    public void dfs(char[][] grid, int x, int y){
        if(x>=0&&x<grid.length&&y>=0&&y<grid[0].length&&grid[x][y]=='1'){
            grid[x][y]='0';
            dfs(grid,x-1,y);
            dfs(grid,x+1,y);
            dfs(grid,x,y-1);
            dfs(grid,x,y+1);
        }
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}};

        Q4 q4 = new Q4();
        int i = q4.numIslands(grid);
        System.out.println(i);
    }
}
