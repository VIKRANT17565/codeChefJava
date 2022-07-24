import java.util.Scanner;

public class PalindromePain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            String l = "";
            String r = "";
            String s1 = "";
            String s2 = "";
            
            if (x%2 != 0 && y%2 != 0) {
                System.out.println(-1);
            }
            else{
                String odd = "";
                if (x%2 != 0) {
                    odd = "a";
                    x--;
                }
                if (y%2 != 0) {
                    odd = "b";
                    y--;
                }
                
                for (int i = 0; i < x/2; i++) {
                    l = l+"a";
                    r = "a"+r;
                }

                for (int i = 0; i < y/2; i++) {
                    l = l+"b";
                    r = "b"+r;
                }

                s1 = l+odd+r;

                s2 = r+odd+l;

                if (s1.contains(s2)) {
                    System.out.println(-1);
                }
                else{
                    System.out.println(s1);
                    System.out.println(s2);
                }


            }
            
        }
        sc.close();
    }
}
