import java.util.Scanner;
// finding square by newton raphson method

public class BM6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("enter a no.: ");
        int n = sc.nextInt();
       System.out.println(NRsqrt(n)); 
    }
    static  double NRsqrt(double n){
          double x = n;
          double root;

          while (true) {
            root = 0.5*(x+(n/x));

            if(Math.abs(root -x)< 0.5){
                break;
            }
            x = root;
          }
        return  root;
    }
}
