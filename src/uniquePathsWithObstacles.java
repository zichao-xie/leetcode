/**
 * 　　* @Description:
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/22 15:49
 *
 */
public class uniquePathsWithObstacles {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int m=obstacleGrid.length;
//        int n=obstacleGrid[0].length;
//        int [][]dp = new int [m][n];
//        for (int i=0;i<m;i++){
//            if (obstacleGrid[i][0]==1){
//                dp[i][0]=0;
//                break;
//            }else{
//                dp[i][0]=1;
//            }
//
//        }
//        for (int i=0;i<n;i++){
//            if (obstacleGrid[0][i]==1){
//                dp[0][i]=0;
//                break;
//            }else {
//                dp[0][i]=1;
//            }
//        }
//        for (int i=1;i<m;i++){
//            for (int j=1;j<n;j++){
//                if (obstacleGrid[i][j]==0){
//                    dp[i][j] = (obstacleGrid[i-1][j]==1 ? 0:dp[i-1][j]) + (obstacleGrid[i][j-1]==1 ? 0:dp[i][j-1]);
//                }
//            }
//        }
//        return dp[m-1][n-1];
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int []f=new int[n];
        f[0] = obstacleGrid[0][0]==0 ? 1:0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (obstacleGrid[i][j]==1){
                    f[j]=0;
                    continue;
                }
                if (j-1>=0){
                    f[j]+=f[j-1];
                }
            }
        }
        return f[n-1];
    }

    public static void main(String[] args) {

        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }

}
