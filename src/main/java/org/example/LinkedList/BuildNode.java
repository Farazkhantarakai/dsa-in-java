package org.example.LinkedList;


//this final means that no class can extend it
// a generic is nothing else than passing any kind of  data to it
  public  class BuildNode{

    // this will be data of our node
   public int  val;

    // this is the reference to our next node
   public BuildNode next;


    public BuildNode(int val){
        this.val=val;
    }


    BuildNode(int   val,BuildNode next){
        this.val=val;
        this.next=next;
    }


}