package org.example;

import org.example.LinkedList.LL;


import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

LL l1=new LL();

l1.insertFirst(3);
        l1.insertFirst(4);
        l1.insertFirst(6);
        l1.insertFirst(8);
        l1.insertFirst(9);
        //this will inserted at the end of the node
        l1.insertLast(30);
        l1.insertAtIndex(100,3);
        l1.display();

    }

}