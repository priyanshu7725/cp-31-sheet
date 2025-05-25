import java.util.Scanner;
import java.util.HashSet;

public class DoremysPaint3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            HashSet <Integer> seen = new HashSet<>();
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for ( int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                seen.add(arr[i]);
            }

            if ( seen.size() > 2) {
                System.out.println("NO");
                continue;
            }
            else if (seen.size() == 1) {
                System.out.println("YES");
                continue;
            }
            int num1 = 0;

            num1 = arr[0];

            int count1 = 0;
            int count2 = 0;

            for ( int num: arr) {
                if ( num1 == num) {
                    count1++;
                }
                else {
                    count2++;
                }
            }

            if ( count1 == count2 || count1+1 == count2 || count1 == count2+1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}