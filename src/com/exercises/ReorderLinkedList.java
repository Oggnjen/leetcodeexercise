package com.exercises;

import com.exercises.helperclasses.ListNode;

public class ReorderLinkedList {

	// ideja
	// proslijedi head i sljedeci
	// sljedeci sacuvaj u promjenljivu
	// ponovo pozovi funkciju
	// ako je


	// 1 , 2 , 3, 4 , 5 , 6 , 7 , 8 , 9
	// 1, 9, 2, 8, 3, 7, 4, 6, 5


	public void reorderList(ListNode head) {
//		findNext(head, head.next);
//		ListNode iter = head;
//		while (true) {
//			iter = iter.next;
//			if ()
//		}
	}

	private ListNode findNext(ListNode head, ListNode iter) {
		ListNode nodeThatCalled = iter;
		ListNode next = iter.next;
		if (next == null) {
			ListNode realNext = head.next;
			ListNode nodeToReturn = nodeThatCalled;
			nodeToReturn.next = nodeThatCalled;
			head = nodeThatCalled;
			head.next = realNext;
			return nodeToReturn;
		}

		return null;

	}
}
