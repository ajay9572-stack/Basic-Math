import java.util.Scanner;
//find tottal primr no. till given no.

public class BM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] prime = new boolean[n+1];

         for (int i = 2; i <= n; i++) {               // Initially consider all numbers from 2 to n as prime
            prime[i] = true;
        }

        totalPrime(n, prime);
    }
    static void totalPrime(int n, boolean[] primes){
        for (int i = 2; i*i <=n; i++) {

            if(primes[i]){                       // If i is prime
                for(int j = i*2; j<=n;j+=i){      // Mark all multiples of i as not prime
                    primes[j] = false;
                }
            }
        }
        for(int i = 2; i<=n;i++){             // Print all numbers which are still true or prime
            if(primes[i]){
                System.out.print(i +" ");
            }
        }
    }
}
