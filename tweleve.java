
import java.util.ArrayList;
import java.util.Collections;

public class tweleve {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Ford");
    cars.add("Mustang");
    cars.add("Tesla");
    cars.add("Ferrari");

    cars.add(0,"tata");

    System.out.println(cars.get(0));
    
    cars.set(0,"Toyota");

    System.out.println(cars);
    System.out.println(cars.size());

    cars.remove(0);
    System.out.println(cars);

    //looping
    for(int i = 0 ; i < cars.size() ; i++){
      System.out.println("Car "+ i + " is " + cars.get(i));
    }

    //another method to loop
    for(String i : cars){
      System.out.println(i);
    }
    
    //Sort
    Collections.sort(cars);
    System.out.println(cars);
    
    cars.clear();
    System.out.println(cars);

  } 
}
