package com.exercises;

import com.exercises.helperclasses.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleDetection {
	public boolean hasCycle(ListNode head) {
		Set<ListNode> nodes = new HashSet<>();
		while(head != null) {
			if (!nodes.add(head)) {
				return true;
			}
			head = head.next;
		}
		return false;
	}
}
