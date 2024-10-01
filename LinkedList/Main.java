public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        final ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        final ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        final ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        System.out.println(mergedList1);

        final ListNode list3 = new ListNode();
        final ListNode list4 = new ListNode();
        final ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        System.out.println(mergedList2);

        final ListNode list5 = new ListNode();
        final ListNode list6 = new ListNode(0);
        final ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        System.out.println(mergedList3);
    }
}
