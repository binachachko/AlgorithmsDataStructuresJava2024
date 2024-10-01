class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null && !list1.isEmpty() && !list2.isEmpty()) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null || list1.isEmpty()) {
            return list2;
        }
        return list1;
    }
}