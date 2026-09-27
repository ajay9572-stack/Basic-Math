import java.util.Scanner;
// code for perfect square root

public class BM4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 3;
        System.out.println(sqrt(n, p));
        
    }
    static double sqrt(int n, int p){
        int s =0;
        int e = n;

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
        return 0;
    }
}
