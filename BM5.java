import java.util.Scanner;
// code for square root of any value

public class BM5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no.: ");
        int n = sc.nextInt();
        int p = 3;              // p = precision, p = 3 means we want to calculate up to 3 decimal places

        System.out.println("square root is: "+sqrt(n, p));
        System.out.print("square root up to three decimal: ");
         System.out.printf("%.3f",sqrt(n, p));
        
    }
    static double sqrt(int n, int p){
        int s =0;
        int e = n;

        double root = 0.0;          // Variable to store the square root
        while (s<=e) {
            int mid = s+(e-s)/2;

            if(mid*mid == n){
                return mid;
            }
            if(mid*mid> n){
                e = mid-1;
            }else{
                s = mid +1;
            }
        }
        double increament = 0.1;      // Start finding the decimal part, First increment is 0.1
        for(int i= 0;i<p;i++){
            while (root*root <=n) {         // Keep increasing root until root² becomes greater than n
                root += increament;
            }
            root -= increament;         // We went slightly beyond the answer,so subtract the increment once
            increament /= 10;        // Make increment 10 times smaller, 0.1 → 0.01 → 0.001
        }
        return root;
    }
}
