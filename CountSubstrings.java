import java.util.Scanner;

public class CountSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long n = sc.nextInt();
            String s = sc.next();
            
            long count1 = 0;

            //variable n and count1 should have long data type

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    count1++;
                }
            }


            System.out.println((count1*(count1+1))/2);


        }
        sc.close();
    }
}
