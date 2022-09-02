import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E2_AddTwoNumbersTest {

    E2_AddTwoNumbers sum = new E2_AddTwoNumbers();

    @Test
    void example1() {
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.

        var l1 = new E2_AddTwoNumbers.ListNode(2,
                    new E2_AddTwoNumbers.ListNode(4,
                        new E2_AddTwoNumbers.ListNode(3)
                    )
                );
        var l2 = new E2_AddTwoNumbers.ListNode(5,
                    new E2_AddTwoNumbers.ListNode(6,
                        new E2_AddTwoNumbers.ListNode(4)
                    )
                );

        var result = sum.addTwoNumbers(l1, l2);

        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertEquals(null, result.next.next.next);
    }

    @Test
    void example2() {
//        Input: l1 = [0], l2 = [0]
//        Output: [0]

        var l1 = new E2_AddTwoNumbers.ListNode(0);
        var l2 = new E2_AddTwoNumbers.ListNode(0);

        var result = sum.addTwoNumbers(l1, l2);

        assertEquals(0, result.val);
        assertEquals(null, result.next);
    }

    @Test
    void example3() {
//        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        Output: [8,9,9,9,0,0,0,1]

        var l1 = new E2_AddTwoNumbers.ListNode(9,
                    new E2_AddTwoNumbers.ListNode(9,
                        new E2_AddTwoNumbers.ListNode(9,
                            new E2_AddTwoNumbers.ListNode(9,
                                new E2_AddTwoNumbers.ListNode(9,
                                    new E2_AddTwoNumbers.ListNode(9,
                                        new E2_AddTwoNumbers.ListNode(9)
                                    )
                                )
                            )
                        )
                    )
                );

        var l2 = new E2_AddTwoNumbers.ListNode(9,
                    new E2_AddTwoNumbers.ListNode(9,
                        new E2_AddTwoNumbers.ListNode(9,
                            new E2_AddTwoNumbers.ListNode(9)
                        )
                    )
                );

        var result = sum.addTwoNumbers(l1, l2);

        assertEquals(8, result.val);
        assertEquals(9, result.next.val);
        assertEquals(9, result.next.next.val);
        assertEquals(9, result.next.next.next.val);
        assertEquals(0, result.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.next.val);
        assertEquals(1, result.next.next.next.next.next.next.next.val);
    }

}
