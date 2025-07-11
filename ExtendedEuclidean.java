package labCycle;
import java.util.Scanner; 
public class ExtendedEuclidean 
{ 
    public static int extendedGCD(int a, int b, int[] coefficients) 
    { 
       int r1 = a, r2 = b; 
       int s1 = 1, s2 = 0, t1 = 0, t2 = 1; 
       int q, r, s, t; 
       while (r2 > 0) 
     { 
           q = r1 / r2;   
           r = r1 - q * r2;   
           r1 = r2; 
           r2 = r; 
           s = s1 - q * s2; 
           s1 = s2; 
           s2 = s; 
           t = t1 - q * t2; 
           t1 = t2; 
           t2 = t; 
       } 
       coefficients[0] = s1; 
       coefficients[1] = t1; 
       return r1;  
   } 
   public static void main(String[] args)  
   { 
       Scanner scanner = new Scanner(System.in); 
       System.out.print("Enter value for a: "); 
       int a = scanner.nextInt(); 
       System.out.print("Enter value for b: "); 
       int b = scanner.nextInt(); 
       int[] coefficients = new int[2]; // To store s and t 
       int gcd = extendedGCD(a, b, coefficients); 
       System.out.println("GCD(" + a + ", " + b + ") = " + gcd); 
       System.out.println("Values of s and t:"); 
       System.out.println("s = " + coefficients[0]); 
       System.out.println("t = " + coefficients[1]); 
       scanner.close(); 
   } 
} 
