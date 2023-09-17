package java8_concepts;

import java.util.*;
import java.util.stream.Collectors;
  
public class Main {
  
    public static void main(String[] args)
    {
  
        // Create ArrayList of Integers
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
            
  
        // add elements to ArrayList
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(1);
        Numbers.add(4);
        Numbers.add(2);
  
        List<Integer> UniqueNumbers
            = Numbers.stream().distinct().collect(
                Collectors.toList());
  
        System.out.println("Unique Values of ArrayList");
  
        // iterate through List
        for (int i = 0; i < UniqueNumbers.size(); ++i) {
            System.out.println(UniqueNumbers.get(i));
        }
    }
}