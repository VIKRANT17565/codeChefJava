import java.util.Scanner;

public class TooManyItems {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int noOfBag = 0;
            if (n%10 == 0) {
                noOfBag = n/10;
            }
            else{
                noOfBag = n/10 +1;
            }

            System.out.println(noOfBag);
        }
        sc.close();
    }
}
