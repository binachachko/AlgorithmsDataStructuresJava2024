public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        printList(mergedList1);

        ListNode list3 = null;
        ListNode list4 = null;
        ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        printList(mergedList2);

        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        printList(mergedList3);
    }

    public static void printList(ListNode node) {
        if (node == null) {
            System.out.println("[]");
            return;
        } else {
            System.out.print("[");

            while (node != null) {
                System.out.print(node.val);
                node = node.next;
                if (node != null) System.out.print(",");
            }
            System.out.println("]");
        }
    }
}
