//�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
import java.util.ArrayList;
import java.util.*;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
          Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(root==null)
            return arrayList;
        queue.offer(root);
       while (!queue.isEmpty()){
           TreeNode node=queue.poll();
           if(node==null)
               continue;
           else
               arrayList.add(node.val);
           queue.offer(node.left);
           queue.offer(node.right);
       }
        return arrayList;
    }
}