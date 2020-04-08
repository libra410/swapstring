package com.example.swapstring.services;

import com.example.swapstring.models.Node;

public class LinkedListService {
    Node head;
    public void pairWiseSwap(){

        Node temp = head;
        while (temp != null && temp.next != null){
            /*Swap the data*/
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

     /* Utility functions */
    /* Inserts a new Node at front of the list. */
    public void push(int new_data){
        /* 1 & 2: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    public String printList() 
    { 
        String result = "";
        Node temp = head; 
        while (temp != null) { 
            result = temp.data + "->" + result;
            temp = temp.next; 
        } 
        return result;
    } 

}