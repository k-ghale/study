import java.util.ArrayList;
import java.util.Collections;


public class thirteen {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(32);
    numbers.add(21);
    numbers.add(54);
    numbers.add(87);
    numbers.add(13);
    numbers.add(20);
    numbers.add(10);

    for(Integer i : numbers){
      System.out.println(i);
    }
    
    //sort
    Collections.sort(numbers);

    System.out.println(numbers);
  }
}
