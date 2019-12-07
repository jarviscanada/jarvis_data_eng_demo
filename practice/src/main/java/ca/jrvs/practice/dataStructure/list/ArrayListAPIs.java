package ca.jrvs.practice.dataStructure.list;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a demo and code is not up-to-date
 * Please see the detailed instruction in the Notion Board
 */
public class ArrayListAPIs {

  public static void main(String[] args) {
    //List vs ArrayList
    //You don't have to specify type in <>
    //ArrayList is dynamic length, so no size is required
    List<String> animals = new ArrayList<>();
    //add element
    animals.add("Lion");
    animals.add("Tiger");
    animals.add(2, "Cat");
  }
}
