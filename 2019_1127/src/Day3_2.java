/* 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。   */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Dolution {
    public ListNode Merge(ListNode list1,ListNode list2) {
         
        if(list1==null )
           return list2;
        if(list2==null )
            return list1;
        if (list1==null &&list2==null)
            return null; 
       ListNode  x=new ListNode(-1);
       ListNode p1=x;
    while (list1!=null && list2!=null) {
        if (list1.val <= list2.val)
        {
            p1.next=list1;
            list1 = list1.next;
        } 
        else 
        {
            p1.next=list2;
            list2=list2.next;
        }
          p1=p1.next;
    }
         while(list1!=null)
        {
             p1.next= list1;
            list1=list1.next;
            p1=p1.next;
        }
        while(list2!=null)
        {
             p1.next= list2;
            list2=list2.next;
            p1=p1.next;
        }
          return x.next;
    }
}