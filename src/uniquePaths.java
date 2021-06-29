/**
 * 　　* @Description:62. 不同路径
 * 　　* @author ZichaoXie
 * 　　* @date 2021/6/22 15:21
 *
 */
public class uniquePaths {

    public static int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        dp[0][0] = 0;
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for (int j=0;j<m;j++){
            dp[j][0]=1;
        }
        for(int  i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
}
