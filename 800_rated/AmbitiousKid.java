import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        boolean isZero = false;

        for ( int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            if ( ele == 0) {
                isZero = true;
            }
            if (!isZero) {
                min = Math.min(Math.abs(ele), min);
            }
        }

        if (isZero) {
            System.out.println(0);
        }
        else {
            System.out.println(min);
        }
        sc.close();
    }
}