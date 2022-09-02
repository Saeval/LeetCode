public class E2_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var size1 = getSizeOf(l1);
        var size2 = getSizeOf(l2);

        if (size1 != size2) {
            if (size1 > size2) l2 = padRight(l2, size1, size2);
            else l1 = padRight(l1, size2, size1);
        }

        ListNode result = null;

        var current1 = l1;
        var current2 = l2;
        int tmp = 0;
        boolean carry = false;

        while(current1 != null && current2 != null) {
            var digit1 = current1.val;
            var digit2 = current2.val;

            tmp = digit1 + digit2;
            if (carry) tmp++;

            if (tmp <= 9) {
                result = appendNewValue(result, tmp);
                carry = false;
            }
            else {
                result = appendNewValue(result, tmp - 10);
                carry = true;
            }

            current1 = current1.next;
            current2 = current2.next;
        }

        if (carry)
            result = appendNewValue(result, 1);

        return result;
    }

    private ListNode appendNewValue(ListNode node, int value) {
        if (node == null) return new ListNode(value);
        else {
            node.next = appendNewValue(node.next, value);
            return node;
        }
    }

    private int getSizeOf(ListNode node) {
        var i = 0;
        while (node != null) {
            node = node.next;
            i++;
        }

        return i;
    }

    private ListNode padRight(ListNode node, int newSize, int currentSize) {
        if (currentSize == newSize) return node;

        node = appendNewValue(node, 0);
        return padRight(node, newSize, currentSize+1);
    }

    /************************************/

//    private ListNode padLeft(ListNode node, int newSize, int currentSize) {
//        if (currentSize == newSize) return node;
//
//        var newNode = new ListNode(0, node);
//        return padLeft(newNode, newSize, currentSize+1);
//    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() { }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

