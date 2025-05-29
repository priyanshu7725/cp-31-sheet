import java.util.Scanner;

public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            int n = sc.nextInt();
            int count = 0;

            String str = String.valueOf(n);
            int length = str.length();
            int f_digit = str.charAt(0) - '0';
            
            count = 9 * (length - 1);
            count += f_digit;
            
            int base = f_digit * (int) Math.pow(10, length - 1);
            if (base > n) {
                count--;
            }

            System.out.println(count);
        }
        sc.close();
    }
}
