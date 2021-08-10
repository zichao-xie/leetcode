import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 　　* @Description: 847. 访问所有节点的最短路径
 * 　　* @author ZichaoXie
 * 　　* @date 2021/8/6 17:55
 *    * @times 1
 */
public class shortestPathLength {
    /**
    　　* @Description: 状态压缩，BFS广度优先搜索。
    　　* @author ZichaoXie
    　　* @date 2021/8/6 18:15
    　　*/
    public int shortestPathLength(int[][] graph) {
        int INF = Integer.MAX_VALUE;
        int n = graph.length;
        int mask = 1<<n;

        int [][]dist = new int[mask][n];

        for (int i=0;i<mask;i++){
            Arrays.fill(dist[i],INF);
        }

        Deque<int []> d = new ArrayDeque<>();
        for (int i=0;i<n;i++){
            dist[1<<i][i] = 0;
            d.add(new int[]{1<<i,i});
        }

        while (!d.isEmpty()){
            int [] poll = d.poll();
            int state = poll[0];
            int u = poll[1];
            int step = dist[state][u];
            if (state==mask-1){
                return step;
            }
            for (int i : graph[u]){
                if (dist[state | (1<<i)][i]==INF){
                    dist[state | (1<<i)][i] = step+1;
                    d.add(new int[]{state | (1<<i),i});
                }
            }
        }
        return 0;
    }
}
