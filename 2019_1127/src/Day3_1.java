/**����һ�������������β��ͷ��˳�򷵻�һ��ArrayList��  **/
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> array=new ArrayList<>() ;
        if(listNode==null)
            return array;       
        ArrayList<Integer> array1=new ArrayList<>() ;
    	while(listNode!=null)
    	 {
    		array.add(listNode.val);
    		listNode=listNode.next;
    	 }
        int a=array.size()-1;
        while(a>=0) {
    		array1.add(array.get(a));
            a--;
    	}
   
    	  return array1;
    }
}