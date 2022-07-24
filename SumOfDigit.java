import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int sum = 0, n, t = sc.nextInt();
		for (int i = 0; i < t; i++){
            n = sc.nextInt();
            int tenth = 10;
            while (n != 0) {
                sum += n - (n/tenth * 10);
                n = n/tenth;
            }
            System.out.println(sum);  
            sum = 0;          
        }
        
        sc.close();
    }
}
