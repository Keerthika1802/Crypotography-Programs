package labCycle;
import java.util.Scanner; 
public class MultiplicativeInverse 
 { 
 public static int findMultiplicativeInverse(int b, int n) 
 { 
        int r1 = n, r2 = b; 
        int t1 = 0, t2 = 1; 
        int q, r, t; 
        while (r2 > 0)  
         { 
            q = r1 / r2;   
            r = r1 - q * r2;   
            r1 = r2; 
            r2 = r; 
            t = t1 - q * t2; 
            t1 = t2; 
            t2 = t; 
        } 
        if (r1 != 1)  
        { 
            System.out.println("Multiplicative inverse does not exist."); 
            return -1; 
        } 
        if (t1 < 0)  
       { 
            t1 += n; 
        } 
        return t1;  
    } 
    public static void main(String[] args)  
   { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter value for b: "); 
        int b = scanner.nextInt(); 
        System.out.print("Enter value for n (modulus): "); 
        int n = scanner.nextInt(); 
        int inverse = findMultiplicativeInverse(b, n); 
        if (inverse != -1)  
       { 
            System.out.println("Multiplicative Inverse of " + b + " modulo " + n + " is: " + 
inverse); 
        } 
        scanner.close(); 
    }
 }
