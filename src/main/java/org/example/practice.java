package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class practice {
    public static void main(String[] args) {
//     Test test=new Test();
//test.setName("Farazkhan");
//        System.out.println(test.toString());
//
        // both of these are used to
//        StringBuffer buffer=new StringBuffer();
//        buffer.append("Hello World");
//        buffer.append("123");
//        System.out.println(buffer);


//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_MONTH,5);
//        System.out.println(calendar.getTime());

//        Calendar calendar=Calendar.getInstance();
//        calendar.setTime(new Date());
//       System.out.println(calendar.get(Calendar.YEAR));

        //this will get the time and all other stuffs
         Calendar cal=Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);

    }
}


//==  this is used for comparing the references in the memory
// equals  this is used to compare the content of two objects


class Test{
    String name;
    //default constructor
    Test(){
    }
    Test(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName(){
        return this.name;
}




}