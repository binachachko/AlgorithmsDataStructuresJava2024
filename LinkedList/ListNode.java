public class ListNode {
    int val;
    ListNode next;

    private boolean isEmpty = true;
    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.isEmpty = false;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
        this.isEmpty = false;
    }


    @Override
    public String toString() {
        if (this.isEmpty) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            current = current.next;
            if (current != null) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}