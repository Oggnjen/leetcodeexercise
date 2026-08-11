package com.exercises;

import com.exercises.helperclasses.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ListNode listNode7 = new ListNode(7, null);
        ListNode listNode6 = new ListNode(6, listNode7);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        ReorderLinkedList reorderLinkedList = new ReorderLinkedList();
        reorderLinkedList.reorderList(listNode1);
    }


}
