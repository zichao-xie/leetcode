import java.util.ArrayList;
import java.util.List;

/**
 * @author ZichaoXie
 * @date 2021/8/5 下午4:35
 * @Description: 802. 找到最终的安全状态
 * @Times: 1
 */
public class eventualSafeNodes {
    /**
     * @author  ZichaoXie
     * @date  2021/8/5 下午4:58
     * @description: 图的题,首先遍历每一个节点，然后遍历其下游节点。
     * 节点第一次访问被标记为0
     * 在栈中的节点为1
     * 安全节点为2.
     */

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int [] color =new int [n];
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            if (bfs(graph,color,i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean bfs(int [][] graph,int [] color,int x){
        if (color[x]>0){
            return color[x]==2;
        }
        color[x]=1;
        for (int y:graph[x]){
            if (!bfs(graph,color,y)){
                return false;
            }
        }
        color[x]=2;
        return true;
    }
}
