

public class ten {
  public void fullThrottle(){
    System.out.println("the car is going as fast as it can");
  }
  public void speed(int x){
    System.out.println("the car is going at :"+x+" miles per hour");
  }
  public static void main(String[] args) {
    ten t1 = new ten();

    t1.fullThrottle();
    t1.speed(200);
  }
}
