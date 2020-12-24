public class maxArea {
//    public static int maxArea(int [] height){//暴力
//        int res=0;
//        for (int i=0;i<height.length;i++){
//            for (int j=0;j<height.length;j++){
//                if (j==i)
//                    continue;
//                int tmp=(j-i)*Math.min(height[i],height[j]);
//                if (tmp>res)
//                    res=tmp;
//            }
//        }
//        return res;
//    }

    public static int maxArea(int [] height){//双指针
        int left=0;
        int right=height.length-1;
        int max=0;
        while (left<right){
            max=height[left]<height[right]?
                    Math.max(max,(right-left)*height[left++]):
                    Math.max(max,(right-left)*height[right--]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int []{1,8,6,2,5,4,8,3,7}));
    }
}
