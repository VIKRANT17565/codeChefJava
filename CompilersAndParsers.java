import java.util.Scanner;

public class CompilersAndParsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            String s = sc.next();
            int count = 0;
            int i = 0;
            int len = 0;
            while (i < s.length()) {
                if (s.charAt(i) == '<') {
                    count++;
                }
                else{
                    count--;
                }

                if (count == 0) {
                    len = i+1;
                }
                if (count < 0) {
                    break;
                }
                System.out.println(count+" "+len);
                
                i++;
            }

            System.out.println(len);

        }
        sc.close();
    }
}
