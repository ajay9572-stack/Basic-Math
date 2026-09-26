import java.util.Scanner;
//find tottal no. primr no. till given no.

public class BM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. ");
        int n = sc.nextInt();
        boolean[] prime = new boolean[n+1];

         for (int i = 2; i <= n; i++) {              
            prime[i] = true;
        }

        totalPrime(n, prime);
    }
    static void totalPrime(int n, boolean[] primes){
        for (int i = 2; i*i <=n; i++) {

            if(primes[i]){                      
                for(int j = i*2; j<=n;j+=i){     
                    primes[j] = false;
                }
            }
        }
        int count =0;
        for(int i = 2; i<=n;i++){            
            if(primes[i]){
                count++;
                System.out.print(i +" ");
            }
        }
        System.out.println();
        System.out.println("total prime no.: "+count);
    }
}
