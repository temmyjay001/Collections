/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Ajayi solomon 
 */
import java.util.*;

public class main {
  public static void main(String[] args) {
    
    //Creating an object for the HashSet i.e Instantiating
    HashSet<Integer> hSet = new HashSet<Integer>();

    //Adding the integer number to the HashSet
    hSet.add(new Integer("1"));
    hSet.add(new Integer("2"));
    hSet.add(new Integer("3"));
    
    // Iterating through the HashSet
     Iterator itr = hSet.iterator();
     while (itr.hasNext())
     System.out.println(itr.next());
     
     System.out.println();
     
     //Getting the size of the HashSet
     System.out.println("Size of the HashSet is "+hSet.size());

  }

}