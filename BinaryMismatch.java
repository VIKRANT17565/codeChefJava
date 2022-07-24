import java.util.Scanner;

public class BinaryMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            String s = sc.next();
            if (n%2 != 0) {
                System.out.println("NO");
            }
            else{
                // System.out.println("YES");
                int c0 = 0;
                int c1 = 0;
                // int l  = 0;
                // int r  = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '0') {
                        c0++;
                    }
                    else{
                        c1++;
                    }
                }
                int more = c0 > c1 ? 0 : 1;
                int diff = (int)Math.abs(c0-c1) /2;
                if (diff == 0) {
                    System.out.println("YES");
                    System.out.println(1+" "+(s.length()));
                }else{
                    String sub = "";
                    for (int i = 0; i < diff; i++) {
                        if (more == 0) {
                            sub += "0";
                        }
                        else{
                            sub += "1";
                        }
                    }
                    if (s.contains(sub)) {
                        System.out.println("YES");
                        for (int i = 0; i < n-diff; i++) {
                            if (sub.contains(s.substring(i, i+diff))){
                                System.out.println((i+1)+" "+(i+diff));
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("NO");
                    }
                }

            }
        }
        sc.close();
    }
}
