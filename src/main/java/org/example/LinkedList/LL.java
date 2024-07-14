package org.example.LinkedList;

public class LL  {
public  BuildNode head;
public BuildNode tail;
private int size;
public LL() {
  this.size=0;
}
//this method will insert a new node  at the start of the linked list
public void insertFirst(int data) {
  BuildNode buildNode=new BuildNode(data);
  buildNode.next=head;
  head=buildNode;
  if(tail == null){
    tail=head;
  }
  size+=1;
}
//to display all the nodes we have to take a new variable known as temp
  //this temp will have the same value as head which means it will point to the same value
public void display(){
  //the variable temp is not  changing a value be remember this will never ever change a value
  //the temp variable will have the same value as the head variable gonna have
  BuildNode temp=head;
  while(temp!=null){
    System.out.print(temp.val + "-> ");
    temp=temp.next;
  }
  System.out.println("End");
}

 



}


