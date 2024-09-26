
//Recursion to all 10 numbers 
public class seven {
  public static void main(String[] args) {
    int result = sum(5,10);
    System.out.println("Result is :"+result);
  }
  public static int sum(int start, int end) {
    if(end > start){
      return end + sum(start,end-1);
    }
    else{
      return end;
    }
  }
}
