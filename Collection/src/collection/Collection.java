/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<Integer>();
    set1.add(1);
    set1.add(2);
    set1.add(3);

    TreeSet<Integer> set2 = new TreeSet<Integer>();
    set2.add(3);
    set2.add(8);
    set2.add(409);
    set2.add(50);
    set2.add(1);
    set2.add(2);
    set2.add(73);
    set2.add(80);
    set2.add(800);
    set2.add(180);
    set2.add(280);
    set2.add(830);
    set2.add(380);
    set2.add(809);
    set2.add(680);
    
    
      //1.last gets the highest number in a treeset
      System.out.println("THE HIGHEST NUMBER IS " + set2.last());
      //2. first gets the lowest number in a treeset
      System.out.println("THE LOWEST NUMBER IS " + set2.first());
      //3. higher gets the number immediately higher than the integer entered in a treeset
      System.out.println("THE LARGEST NUMBER CLOSEST TO 9 IS " + set2.higher(9));      
      //4. lower gets the number immediately lower than the integer entered in a treeset
      System.out.println("THE SMALLEST NUMBER CLOSES TO 9 IS " +set2.lower(9));
      //5. floor returns the largest number less than or equal to that thing
      System.out.println(set2.floor(109));
      //6. ceiling returns the smallest number less than or equal to that thing
      System.out.println(set2.ceiling(100));
      //7. pollfirst removes the lowest number 
      System.out.println("THE LOWEST NUMBER WHICH IS REMOVED IS "+set2.pollFirst());
      //8. pollLAst removes the highest number 
      System.out.println("THE HIGHEST NUMBER WHICH IS REMOVED IS "+set2.pollLast());
      //9. contains checks whether an object are is in the set
      System.out.println("IS 9 PRESENT IN THE SET? "+set2.contains(9));
//10. this gives a subset between a range of numbers between a Treeset. It includes the first entry but excludes the last one
      System.out.println("THE SUBSET BETWEEN 2 AND 50 IS \n"+set2.subSet(3, 409));
      //11. remove is well, to remove an element in a set . it returns boolean
      System.out.println(set2.remove(730));
      //2. descending set arranges the set in descending order
      System.out.println("THE DESCENDING ORDER OF THE SET"+set2.descendingSet());
      //3. tailset returns a set from the number and above
      System.out.println(set2.tailSet(9));
      //14. headset returns a set from the number and below
      System.out.println(set2.headSet(9));
      //15. CLEAR clears the set. It cant be used in th System.out.println
      set2.clear();
      
      
    Set<Character> set3 = new LinkedHashSet<>();
    set3.add('i');
    //THE D WILL CAUSE UP A STORM
    set3.add('e');
    set3.add('o');
    
    
    // Intersection of two sets;;
    Set<Integer> intersection = new HashSet<Integer>(set1);
    intersection.retainAll(set2);
    System.out.println("Intersection of two sets: " + intersection);

    // Union of two sets
    Set<Integer> union = new HashSet<Integer>(set1);
    union.addAll(set2);
    System.out.println("Union of two sets: " + union);
  }
}