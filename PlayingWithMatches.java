import java.util.Scanner;

public class PlayingWithMatches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String c = Integer.toString(a+b);
            int numMatch = 0;

            for (int j = 0; j < c.length(); j++) {
                char ch = c.charAt(j);
                if(ch == '0'){  
                    numMatch += 6;
                }
                if(ch == '1'){
                    numMatch += 2;
                }
                if(ch == '2'){
                    numMatch += 5;
                }
                if(ch == '3'){
                    numMatch += 5;
                }
                if(ch == '4'){
                    numMatch += 4;
                }
                if(ch == '5'){
                    numMatch += 5;
                }
                if(ch == '6'){
                    numMatch += 6;
                }
                if(ch == '7'){
                    numMatch += 3;
                }
                if(ch == '8'){
                    numMatch += 7;
                }
                if(ch == '9'){
                    numMatch += 6;
                }
            }
            System.out.println(numMatch);
            
        }
        sc.close();
    }
}
