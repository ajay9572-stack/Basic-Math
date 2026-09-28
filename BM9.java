import java.util.Scanner;
//lcm of two no.

public class BM9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = Math.abs(a * b) / gcd;
        System.out.println("LCM: " + lcm);
    }
}