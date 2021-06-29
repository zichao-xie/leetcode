/**
 * 　　* @Description: 64. 最小路径和
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/22 16:22
 *
 */
public class minPathSum {
    public static int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int []f=new int[n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (j-1>=0){
                    f[j]= (i!=0 ? Math.min(f[j],f[j-1]):f[j-1]) + grid[i][j];
                }else {
                    f[j]+=grid[i][j];
                }

            }
        }
        return f[n-1];
    }

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }
}
