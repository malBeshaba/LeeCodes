package com.lee.Palindromelist;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {return true;}
        return isPalindromeList(listToArray(head));
    }

    public ArrayList listToArray(ListNode head) {
        ListNode root = head;
        ArrayList arrayList = new ArrayList();
        while (root != null) {
            arrayList.add(root.val);
            if (root.next != null) {root = root.next;}
            else break;
        }
        return arrayList;
    }
    public boolean isPalindromeList(ArrayList list) {
        for (int i = 0, j = list.size() - 1; j - i >= 1; i ++, j --) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
        }
        return true;
    }
}
