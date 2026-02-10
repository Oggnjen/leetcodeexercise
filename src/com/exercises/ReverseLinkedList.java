package com.exercises;

import com.exercises.helperclasses.ListNode;

public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode currentNew = current;
		boolean first = true;
		while (true) {
			if (first) {
				currentNew = new ListNode(current.val, null);
				first = false;
			} else {
				currentNew = new ListNode(current.val, currentNew);
			}
			current = current.next;
			if (current.next == null) {
				currentNew = new ListNode(current.val, currentNew);
				break;
			}
		}

		return currentNew;
	}

}
