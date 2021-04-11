

/**
 * 　　* @Description:226. 翻转二叉树
 * 　　* @author ZichaoXie
 * 　　* @date 2021/4/11 23:37
 *
 */
public class invertTree {
    public TreeNode invertTree(TreeNode root) {
        dg(root);
        return root;

    }
    public void dg(TreeNode root){
        if (root == null){
            return;
        }
        if(root.left!=null || root.right!=null){
            TreeNode tmp=root.left;
            root.left=root.right;
            root.right=tmp;
        }
        dg(root.left);
        dg(root.right);
    }
}
