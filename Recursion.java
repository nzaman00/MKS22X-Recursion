import java.util.ArrayList;
public class Recursion{
  public static double sqrt(double n, double tolerance){
    return sqrter(n, tolerance, 1);
  }
  public static double sqrter(double n, double tolerance, double guess){
   if (Math.abs(((guess * guess - n) / n)) * 100 <= tolerance) 
  }
}
