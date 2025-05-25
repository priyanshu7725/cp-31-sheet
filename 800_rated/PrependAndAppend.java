import java.util.Scanner;

public class PrependAndAppend{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while ( t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int len = n;

            for ( int i = 0; i < n/2; i++) {
                int first = str.charAt(i) - '0';
                int last = str.charAt(n-i-1) - '0';
                
                if ( first + last == 1) {
                    len-=2;
                } 
                else {
                    break;
                }
            }

            System.out.println(len);
        }
        sc.close();
    }
}