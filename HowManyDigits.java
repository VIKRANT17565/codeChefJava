import java.util.Scanner;

public class HowManyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n/10 == 0) {
            System.out.println(1);
        }
        else if (n/100 == 0) {
            System.out.println(2);
        }
        else if (n/1000 == 0) {
            System.out.println(3);
        }
        else{
            System.out.println("More than 3 digits");
        }
        
        sc.close();
    }
}
