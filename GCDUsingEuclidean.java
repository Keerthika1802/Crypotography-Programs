package labCycle;

import java.util.Scanner; 
public class GCDUsingEuclidean 
{ 
   public static int gcd(int a, int b)  
  { 
       int r1 = a; 
       int r2 = b; 
       int q, r; 
       while (r2 > 0)  
       { 
           q = r1 / r2;   
           r = r1 - q * r2;   
           r1 = r2; 
           r2 = r; 
       } 
       return r1; // GCD is stored in r1 
   } 
   public static void main(String[] args)  
   { 
       Scanner scanner = new Scanner(System.in); 
       System.out.print("Enter first number: "); 
       int num1 = scanner.nextInt(); 
       System.out.print("Enter second number: "); 
       int num2 = scanner.nextInt(); 
       int result = gcd(num1, num2); 
       System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result); 
       scanner.close(); 
   } 
} 

