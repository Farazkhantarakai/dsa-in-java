package org.example.Java8;

import java.util.function.Supplier;

public class SupplierPractice {


    public static void main(String[] args) {


//        Consumer consumes a values and supplier will supply a value will give a values

        Supplier<Integer>  supplier=() -> 1;

        System.out.println(supplier.get());

    }

}
