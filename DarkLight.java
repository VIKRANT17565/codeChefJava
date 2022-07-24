import java.util.Scanner;

public class DarkLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(k == 0){
                if (n%4 == 0) {
                    System.out.println("Off");
                }
                else{
                    System.out.println("On");
                }
            }
            else{
                if (n%4 == 0) {
                    System.out.println("On");
                }
                else{
                    System.out.println("Ambiguous");
                }
            }
        }
        sc.close();
    }
}
