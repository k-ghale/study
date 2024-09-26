
public class nine {
  static void myStaticMethod(){
    System.out.println("Hello World by static method");
  }
  //Public Method
  public void publicMethod() {
    System.out.println("Hello World from public method"); 
  }

  public static void main(String[] args) {
    //calling static method without creating object
    myStaticMethod();

    //public method
    nine n1 = new nine();
    n1.publicMethod();
  }
}
