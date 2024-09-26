
import java.util.Scanner;
import java.time.LocalDate;

public class eleven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter your name : ");
    String name = sc.nextLine();

    System.out.print("enter your age : ");
    int age = sc.nextInt();

    System.out.print("enter your birth year : ");
    int dob = sc.nextInt();

    LocalDate date = LocalDate.now();

    System.out.println("your name is : "+name);
    System.out.println("your age is : "+age);
    System.out.println("your birth year is : "+dob);
    System.out.println("todays date is : "+date);
  }
}
