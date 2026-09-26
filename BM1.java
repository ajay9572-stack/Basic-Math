import java.util.Scanner;
//prime no. or not

public class BM1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
          if(n<=1){
            return false;
          }
          int c = 2;     // c means start, starting prime no.
          while(c*c <= n){
            if(n%c == 0){
                return  false;
            }
            c++;            //increase the prime no. 2 3 5....
          }
          return true;

    }
}