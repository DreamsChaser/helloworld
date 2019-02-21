package cn.arithmetic.两数相加2;

/**
 * @author sirius
 * @since 2018/12/7
 */
public class TwoNumAdd {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = 1, j = 1;
        int result1 = 0;
        int result2 = 0;
        do {
            result1 = result1 + i * l1.val;
            i = i*10;
            l1 = l1.next;
        }while (l1 != null);
        do {
            result2 = result2 + i * l2.val;
            j = j*10;
            l2 = l2.next;
        }while (l2 != null);
        int result = result1 + result2;
        ListNode listNode = new ListNode(result%10);
        while ((result = result/10) > 0) {
            ListNode node = new ListNode(0);
            listNode.next = node;

        }
        return listNode;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
    }

}

class ListNode{

    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
