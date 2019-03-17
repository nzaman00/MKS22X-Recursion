import java.util.ArrayList;
public class recursion{
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
    return fibHelper(n, 1, 0, 1);
  }
  public static int fibHelper(int n, int i, int prev, int partial) {
    if (n == i) {
      return partial;
    }
    return fibHelp(n, i + 1, partial, prev + partial);
  }
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> L = new ArrayList<Integer>();
    summinator(n, 0, L);
    return L;
  }
  public static void summinator(int n, int partial, ArrayList<Integer> L){
    if (n == 0) {
      L.add(partial);
     } else {
      summinator(n - 1, n + partial, L);
      summinator(n - 1, partial, L);
    }
  }
  public static void main(String[] args){
    System.out.println(sqrt(36.0, .0000001));
    System.out.println(sqrt(25.0, .0000001));
    System.out.println(sqrt(100.0, .0000001));
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(2));
    System.out.println(fib(3));
    System.out.println(fib(10));
    System.out.println(makeAllSums(2));
    System.out.println(makeAllSums(3));
    System.out.println(makeAllSums(8));
  }
}
