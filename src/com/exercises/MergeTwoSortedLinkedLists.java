package com.exercises;

import com.exercises.helperclasses.ListNode;

public class MergeTwoSortedLinkedLists {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode current1 = list1;
		ListNode current2 = list2;

		ListNode headForReturn;
		if (current1 == null && current2 == null) {
			return null;
		}
		ListNode current = new ListNode();

		if (current2 == null) {
			ListNode node = new ListNode(current1.val);
			current.next = node;
			current = node;
			current1 = current1.next;
		} else if (current1 == null) {
			ListNode node = new ListNode(current2.val);
			current.next = node;
			current = node;
			current2 = current2.next;
		} else if (current1.val < current2.val) {
			ListNode node = new ListNode(current1.val);
			current.next = node;
			current = node;
			current1 = current1.next;
		} else if (current2.val < current1.val) {
			ListNode node = new ListNode(current2.val);
			current.next = node;
			current = node;
			current2 = current2.next;
		} else {
			ListNode node = new ListNode(current2.val);
			current.next = node;
			current = node;
			current2 = current2.next;
		}
		headForReturn = current;

		while(current1 != null || current2 != null) {
			if (current2 == null) {
				ListNode node = new ListNode(current1.val);
				current.next = node;
				current = node;
				current1 = current1.next;
			} else if (current1 == null) {
				ListNode node = new ListNode(current2.val);
				current.next = node;
				current = node;
				current2 = current2.next;
			} else if (current1.val < current2.val) {
				ListNode node = new ListNode(current1.val);
				current.next = node;
				current = node;
				current1 = current1.next;
			} else if (current2.val < current1.val) {
				ListNode node = new ListNode(current2.val);
				current.next = node;
				current = node;
				current2 = current2.next;
			} else {
				ListNode node = new ListNode(current2.val);
				current.next = node;
				current = node;
				current2 = current2.next;
			}
		}
		return headForReturn;
	}
}
