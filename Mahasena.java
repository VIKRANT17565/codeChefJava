import java.util.Scanner;

public class Mahasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int oddCounter = 0, evenCounter = 0;
		for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                evenCounter++;
            }
            else{
                oddCounter++;
            }
        }

        if (evenCounter > oddCounter) {
            System.out.println("READY FOR BATTLE");
        }
        else{
            System.out.println("NOT READY");
        }
        
        sc.close();
    }
}
