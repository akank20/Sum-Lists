class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum=new ListNode(0);
        ListNode p1,p2,curr;
        curr=sum;
        p1=l1;
        p2=l2;
        int carry=0,value;
        while(p1!=null || p2!=null){
            value=carry;
            if(p1!=null){
                value=value+p1.val;
                p1=p1.next;
            }
            if(p2!=null){
                value=value+p2.val;
                p2=p2.next;
            }
            carry=value/10;
            curr.next=new ListNode(value%10);
            curr=curr.next;
        }
        if(carry>0)
            curr.next=new ListNode(carry);
        return sum.next;
    }
}
