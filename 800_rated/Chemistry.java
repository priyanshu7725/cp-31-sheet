import java.util.Scanner;

public class Chemistry{
    public static int count(String str, char ch) {
        int num = 0;
        for ( char curr : str.toCharArray()) {
            if ( curr == ch) {
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            int odd = 0;
            for (int f : freq) {
                if (f % 2 != 0) {
                    odd++;
                }
            }

            int remLen = n - k;
            int maxOdd = 0;
            if (remLen % 2 != 0) {
                maxOdd = 1;
            }
            
            int minDel = Math.max(0, odd - maxOdd);
            int remDel = k - minDel;

            if ( remLen%2 != 0 && odd == 0) {
                System.out.println("YES");
            }
            else if (remDel >= 0 && remDel % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}