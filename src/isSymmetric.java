

/**
 * 　　* @Description:101. 对称二叉树
 * 　　* @author ZichaoXie
 * 　　* @date 2021/4/14 23:10
 *
 */
public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return dg(root.left,root.right);
    }

    public boolean dg(TreeNode p,TreeNode q){
        if (p==null&&q==null){
            return true;
        }
        if (p==null || q == null){
            return false;
        }
        return p.val==q.val&&dg(p.left,q.right)&&dg(q.left,p.right);
    }
}
