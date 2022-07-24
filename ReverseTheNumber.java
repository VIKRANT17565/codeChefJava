import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t = sc.nextInt();
		for (int i = 0; i < t; i++){
            n = sc.nextInt();
            int arr[] = new int[1000000];
            int sum = 0, tenth = 1;
            int k = 0;
            while (n != 0) {
                arr[k] = n - (n/10 * 10);
                n = n/10;
                tenth *= 10;
                k++;
            }
            arr[k+1] = -1;
            tenth /= 10;
            int j = 0;
            while (arr[j] != -1) {
                sum += arr[j]*tenth;
                tenth /= 10;
                j++;
            }
            System.out.println(sum);
        }sc.close();
    }
}
