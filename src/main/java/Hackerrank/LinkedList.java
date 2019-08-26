//package Hackerrank;
//
//public class LinkedList {
//
//    public class SinglyLinkedListNode {
//            int data;
//            SinglyLinkedListNode next;
//
//            public SinglyLinkedListNode() {
//            }
//    }
//
//    static void printLinkedList(SinglyLinkedListNode head) {
//        while (head != null){
//            System.out.println(head.data);
//            head = head.next;
//        }
//
//
//        SinglyLinkedListNode n = new SinglyLinkedListNode(data);
//
//        if (head == null){
//            head = n;
//            return head;
//        }
//
//        SinglyLinkedListNode temp = head;
//        while (temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = new SinglyLinkedListNode(data);
//        return head;
//    }
//
//
//    SinglyLinkedListNode n = new SinglyLinkedListNode(data);
//    n.next = null;
//
//        if (llist == null){
//        llist = n;
//    } else {
//
//        n.next = llist.next;
//        llist.next = n;
//    }
//
//        return llist;
//
//
//}
//}
