package org.example.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Practice {
    public static void main(String[] args) {

       List<String> name=List.of("Farazkhan","hasan","ali","ifra","iqra");

//       List<String> modifiebleNames=new ArrayList<>(name);
//       Collections.sort(modifiebleNames,(a,b) -> a.compareTo(b));
//        name.sort((a, b) -> a.compareTo(b));

//        this is another way to sort elements
//       List<String> sortedArray= name.stream().sorted().collect(Collectors.toList());
List<String> reverseOrder=name.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(reverseOrder);


    }


}
