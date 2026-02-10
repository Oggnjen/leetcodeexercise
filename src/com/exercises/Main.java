package com.exercises;

import com.exercises.helperclasses.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(0, null);
        ListNode listNode2 = new ListNode(1, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(3, listNode3);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        System.out.println(reverseLinkedList.reverseList(listNode4).val);
    }


}
