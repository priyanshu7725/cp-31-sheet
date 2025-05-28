import java.util.Scanner;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            @SuppressWarnings("unused")
            int n = sc.nextInt();
            @SuppressWarnings("unused")
            int m = sc.nextInt();
            String x = sc.next();
            String s= sc.next();
            StringBuilder sb = new StringBuilder(x);
            int count = 0;
            while (!sb.toString().contains(s)) {
                sb.append(sb);
                count++;

                if ( sb.length() > 100 ) {
                    count = -1;
                    break;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
