package Problems;

/**
 * This question is asked in Amazon, Microsoft, Qualcomm Interview. <br>
 *
 * <p>Given a singly linked list of N nodes. The task is to find the middle of the linked list. For
 * example, if the linked list is 1-> 2->3->4->5, then the middle node of the list is 3. If there
 * are two middle nodes(in case, when N is even), print the second middle element.
 *
 * <p>For example, if the linked list given is 1->2->3->4->5->6, then the middle node of the list is
 * 4.
 *
 * <p>Expected Time Complexity: O(N). Expected Auxiliary Space: O(1).
 *
 * <p>Constraints: 1 <= N <= 5000
 *
 * <p>https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?page=1&difficulty[]=0&sortBy=submissions
 */

public class FindMiddleElementInLinkedList {

    private Node head;

    // Node of a linked list
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /**
     * Inserts a new Node at front of the list.
     *
     * @param newData new data value to insert.
     */
    public void push(int newData) {
        /* 1 & 2: Allocate the Node &
        Put in the data*/
        Node newNode = new Node(newData);

        /* 3. Make next of new Node as head */
        newNode.next = head;

        /* 4. Move the head to point to new Node */
        head = newNode;
    }

    /**
     * Get the middle element of the linked list. Implement this using two pointers (slow pointer,
     * fast pointer) concept.
     *
     * @param head Head of the linked list.
     * @return value of the middle node.
     */
    int getMiddle(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        assert slowPointer != null;
        return slowPointer.data;
    }
}


