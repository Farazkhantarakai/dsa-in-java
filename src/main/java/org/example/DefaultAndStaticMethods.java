package org.example;

//in a functional interface we gonna have only on abstract method
//and can have many default and static methods
// default methods are having body with implementation


//Be remember lambdas can be only useed with
//functional interfaces not with any other things

@FunctionalInterface
public interface DefaultAndStaticMethods {

void meaning();


default void methodWithName(){
    System.out.println("hello world");
}


}





//## Default and Static Methods in Java Interfaces
//
//Before Java 8, interfaces were quite rigid. They could only define method signatures, and implementing
// classes had to provide concrete implementations for all of them. This limitation was addressed with
// the introduction of default and static methods.
//
//### Default Methods
//
//* **What are they?** Default methods are methods that have a body within the interface itself.
//        * **Purpose:** They provide a default implementation for a method, which implementing classes
//        can either use or override.
//* **Benefits:**
//        * **Backward compatibility:** Adding default methods to an existing interface doesn't break classes
//        that already implement it.
//        * **Code reusability:** Shared functionality can be provided through default methods.
//
//**Example:**
//
//        ```java
//interface Drawable {
//    void draw(); // Abstract method
//
//    default void drawWithColor() {
//        System.out.println("Drawing with default color");
//    }
//}
//```
//
//In this example, `draw()` is an abstract method that implementing classes must provide. However, `drawWithColor()`
// is a default method with a default implementation. Implementing classes can use this default behavior
// or override it if needed.
//
//### Static Methods
//
//* **What are they?** Static methods are methods that belong to the interface itself, not to instances of classes
// implementing the interface.
//        * **Purpose:** They provide utility methods that are related to the interface but don't require an instance
//        of a class.
//        * **Benefits:**
//        * **Helper methods:** They can be used as helper functions for the interface.
//        * **No need for instance:** They can be called directly on the interface name.
//
//        **Example:**
//
//        ```java
//interface Drawable {
//    void draw();
//
//    static void printDrawingInstructions() {
//        System.out.println("Follow these steps to draw...");
//    }
//}
//```
//
//In this example, `printDrawingInstructions()` is a static method. It can be called directly
// using `Drawable.printDrawingInstructions()`.
//
//        **Key Differences:**
//
//        | Feature | Default Methods | Static Methods |
//        |---|---|---|
//        | Belong to | Instance of implementing class | Interface itself |
//        | Can be overridden | Yes | No |
//        | Called using | Object reference | Interface name |
//        | Purpose | Provide default implementation, backward compatibility | Utility methods, helper functions |
//
//        **In summary:**
//
//        * Default methods offer flexibility by providing optional implementations.
//        * Static methods offer utility functions associated with the interface.
//
//Both features enhance the capabilities of interfaces in Java.
//
//**Would you like to see a practical example of using default and static methods?**

