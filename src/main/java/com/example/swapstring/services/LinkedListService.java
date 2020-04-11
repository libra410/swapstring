package com.example.swapstring.services;

import com.example.swapstring.models.Node;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class LinkedListService {
    Node head;

    public String swapString(String linklist){
        String result = "";
        byte[] decodeData = Base64.getDecoder().decode(linklist);
        String strArray = new String(decodeData, StandardCharsets.UTF_8);
        String[] arrOfStr = strArray.split("->", strArray.length());
       
        for(int i=arrOfStr.length-1; i >= 0; i--){
            push(Integer.parseInt(arrOfStr[i]));
        }
        pairWiseSwap(); 
        result = printList();
        return result;
    }

    private void pairWiseSwap(){

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
    private void push(int new_data){
        /* 1 & 2: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    private String printList() 
    { 
        String result = "";
        String encodedString="";
        Node temp = head; 
        while (temp != null) { 
            if (result == ""){
                result = String.valueOf(temp.data);
            }else{
                result += "->" + temp.data;
            }
            
            temp = temp.next; 
        } 
        if (result != ""){
            encodedString = Base64.getEncoder().encodeToString(result.getBytes());
        }
        head =null;
        return encodedString;
    } 

}