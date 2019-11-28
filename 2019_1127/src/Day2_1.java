/*操作给定的二叉树，将其变换为源二叉树的镜像。   */
/*    源二叉树
             8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
   	镜像二叉树
             8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
*/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Lolution {
    public void Mirror(TreeNode root) {
        if(root==null||root.left==null && root.right==null )
            return;
        TreeNode a=null;
        a=root.right;
       root.right=root.left;
       root.left=a;
       Mirror(root.left);
       Mirror(root.right);
    }
}
public class Day2_1 {
    public static void main(String[] args) {



    }

}
