import java.util.ArrayList;
public class Recursion{
  public static double sqrt(double n, double tolerance){
    return sqrter(n, tolerance, 1);
  }
  public static double sqrter(double n, double tolerance, double guess){
   if (Math.abs(((guess * guess - n) / n)) * 100 <= tolerance){
     return guess;
   }
    if (n == 0){
      return 0;
    }
    return sqrter(n, (n/guess + guess) / 2, tolerance);
  }
  public static int fib(int n){
   if(n == 0){
     return 0;
   }
    return 
  }
  
  public static void main(String[] args){
    System.out.println(sqrt(36.0, .0000001));
    System.out.println(sqrt(25.0, .0000001));
    System.out.println(sqrt(100.0, .0000001));
  }
}
