import java.util.PriorityQueue;

/**
 * 　　* @Description: 313. 超级丑数
 * 　　* @author ZichaoXie
 * 　　* @date 2021/8/9 17:35
 * 　　* @times 1
 */
public class nthSuperUglyNumber {
//    public static int nthSuperUglyNumber(int n, int[] primes) {
//        Set<Long> set = new HashSet<>();
//        PriorityQueue<Long> q = new PriorityQueue<>();
//        q.add(1L);
//        set.add(1L);
//        while (n-->0){
//            long x = q.poll();
//            if (n==0) {
////                System.out.println(q.size());
//                return (int)x;
//            }
//            for (int k:primes){
//                if (!set.contains(k*x)){
//                    set.add(k*x);
//                    q.add(k*x);
//                }
//            }
//        }
//        return 1;
//    }

    public int nthSuperUglyNumber2(int n, int[] primes) {
        int m = primes.length;
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for (int i = 0; i < m; i++) {
            q.add(new int[]{primes[i], i, 0});
        }
        int[] ans = new int[n];
        ans[0] = 1;
        for (int j = 1; j < n; ) {
            int[] poll = q.poll();
            int val = poll[0], i = poll[1], idx = poll[2];
            if (val != ans[j - 1]) ans[j++] = val;
            q.add(new int[]{ans[idx + 1] * primes[i], i, idx + 1});
        }
        return ans[n - 1];
    }

    public static int nthSuperUglyNumber(int n, int[] primes){
        int len = primes.length;
        PriorityQueue<int[]> queue =  new PriorityQueue<>((a,b)->a[0]-b[0]);
        for (int i=0;i<len;i++){
            queue.add(new int[]{primes[i],i,0});
        }
        int [] ans = new int[n];
        ans[0]=1;
        for (int i = 1;i<n;){
            int [] poll = queue.poll();
            int val = poll[0], in = poll[1], idx = poll[2];
            if (val!=ans[i-1]) ans[i++] = val;
            queue.add(new int[]{primes[in]*ans[++idx],in,idx});
        }
        return ans[n-1];
    }

    public static void main(String[] args) {
        System.out.println(nthSuperUglyNumber(15,new int[]{3,5,7,11,19,23,29,41,43,47}));
//        System.out.println(1L);
    }
}
