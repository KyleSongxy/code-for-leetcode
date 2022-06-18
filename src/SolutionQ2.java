import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SolutionQ2 {
    //第一遍思路 转数字相加
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        do{
            stringBuilder1.append(l1.val);
            l1 = l1.next;
        }while (l1!=null);
        StringBuilder stringBuilder2 = new StringBuilder();
        do{
            stringBuilder2.append(l2.val);
            l2 = l2.next;
        }while (l2!=null);
        String i1 = stringBuilder1.toString();
        String i2 = stringBuilder2.toString();
        String[] i1l = i1.split("");
        String[] i2l = i2.split("");
        StringBuilder stringBuilder3 = new StringBuilder();
        StringBuilder stringBuilder4 = new StringBuilder();
        for (int i=i1l.length-1;i>=0;i--){
            stringBuilder3.append(i1l[i]);
        }
        for (int i=i2l.length-1;i>=0;i--){
            stringBuilder4.append(i2l[i]);
        }
        BigInteger big1 = new BigInteger(stringBuilder3.toString());
        BigInteger big2 = new BigInteger(stringBuilder4.toString());
        BigInteger big3 = big1.add(big2);
        String sresult = String.valueOf(big3);
        String[] strings = sresult.split("");
        ArrayList<ListNode> resultList = new ArrayList<>();
        for (int i=strings.length-1;i>=0;i--){
            resultList.add(new ListNode(Integer.parseInt(strings[i])));
        }
        for (int i=0;i<resultList.size()-1;i++){
            resultList.get(i).next = resultList.get(i+1);
        }
        return resultList.get(0);
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(9);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        ListNode listNode7 = new ListNode(9);
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;

        SolutionQ2 solutionQ2 = new SolutionQ2();
        solutionQ2.addTwoNumbers(listNode1,listNode4);
    }
}
