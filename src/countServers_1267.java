import java.util.HashMap;
import java.util.Map;

/**
 * @author ZichaoXie
 * @date 2021/7/13 下午4:17
 * @Description:这里有一幅服务器分布图，服务器的位置标识在 m * n 的整数矩阵网格 grid 中，1 表示单元格上有服务器，0 表示没有。
 *
 * 如果两台服务器位于同一行或者同一列，我们就认为它们之间可以进行通信。
 *
 * 请你统计并返回能够与至少一台其他服务器进行通信的服务器的数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-servers-that-communicate
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class countServers_1267 {
    public static int countServers(int[][] grid) {
        Map<Integer,Integer> mapX = new HashMap();
        Map<Integer,Integer> mapY = new HashMap();
        for (int i=0;i< grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]==1){
                    if (mapX.containsKey(i))
                        mapX.put(i,mapX.get(i)+1);
                    else
                        mapX.put(i,1);
                    if (mapY.containsKey(j))
                        mapY.put(j,mapY.get(j)+1);
                    else
                        mapY.put(j,1);
                }
            }
        }
        int num = 0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]==1){
                    if (mapX.containsKey(i)&&mapX.get(i)!=1){
                        num++;
                        continue;
                    }
                    if (mapY.containsKey(j)&&mapY.get(j)!=1){
                        num++;
                    }
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(countServers(new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0}}));
    }
}
