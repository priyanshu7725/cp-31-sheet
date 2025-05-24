import java.util.Scanner;

public class LineTrip{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n+2];

            arr[0] = 0;
            for ( int i = 1; i < n+1; i++) {
                arr[i] = sc.nextInt();
            }
            arr[n+1] = x;
            int s = arr.length;
            int maxDist = Integer.MIN_VALUE;

            for ( int i = 1; i < s; i++) {

                if ( i == s-1) {
                    maxDist = Math.max(maxDist,2*(arr[i]-arr[i-1]));
                }
                else {
                    maxDist = Math.max(maxDist, arr[i]-arr[i-1]);
                }     
            }
            
            System.out.println(maxDist);
        }
        sc.close();
    }
}