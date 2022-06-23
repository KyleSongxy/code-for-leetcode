public class SolutionQ21 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null && list2==null){
            return null;
        }
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        ListNode result;
        ListNode first;
        ListNode listcur1 = list1;
        ListNode listcur2 = list2;
        if (listcur1.val<=listcur2.val){
            result = new ListNode(listcur1.val);
            listcur1 = listcur1.next;
        }
        else {
            result = new ListNode(listcur2.val);
            listcur2 = listcur2.next;
        }
        first = result;

        if (listcur1 == null){
            result.next = listcur2;
            return first;
        }
        if (listcur2 == null){
            result.next = listcur1;
            return first;
        }

        do {
            if (listcur1.val<=listcur2.val){
                result.next = new ListNode(listcur1.val);
                result = result.next;
                listcur1 = listcur1.next;
            }
            else {
                result.next = new ListNode(listcur2.val);
                result = result.next;
                listcur2 = listcur2.next;
            }
        }while (listcur1!=null && listcur2!=null);

        if (listcur1 == null){
            result.next = listcur2;
        }
        if (listcur2 == null){
            result.next = listcur1;
        }
        return first;
    }

    public static void main(String[] args) {
        ListNode li1 = new ListNode(1);
        li1.next = new ListNode(2);
        li1.next.next = new ListNode(4);
        ListNode li2 = new ListNode(1);
        li2.next = new ListNode(3);
        li2.next.next = new ListNode(4);
        SolutionQ21 solutionQ21 = new SolutionQ21();
        solutionQ21.mergeTwoLists(li1,li2);
    }
}
