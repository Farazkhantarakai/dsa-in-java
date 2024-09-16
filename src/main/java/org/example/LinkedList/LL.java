package org.example.LinkedList;

public class LL  {
public  BuildNode head;

//the benefit of taking tail variable is that
  //with this we can insert an element in the last with constant time
  //what if we donot take this variable then we will have to use the same
  // temp and will insert it  in the last which we will take o2 time to insert
  //element in the last

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



//inserting element at the end of the node
public void insertLast(int data) {
  //i am still confused what this means
  if(tail==null){
    insertFirst(data);
    return ;
  }
BuildNode buildNode=new BuildNode(data);
tail.next=buildNode;
tail=buildNode;
size++;
}


//inserting element at a particular index
  //what if the index is zero then insert at the first
  //and if the index size is equal linkedlist size then we will have
  // to insert at the end of the linked list

public  void  insertAtIndex(int value,int index){

if(index == 0){
  insertFirst(value);
}
if(index == size)
{
  insertLast(value);
}

BuildNode temp=head;


for(int i=1;i<index;i++){
  temp=temp.next;
}

BuildNode newNode=new BuildNode(value,temp.next);
temp.next=newNode;

size++;

}




}


