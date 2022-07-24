import java.util.Scanner;

public class CielAndReceipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int p = sc.nextInt();
            int menu[] = {2048,1024,512,256,128,64,32,16,8,4,2,1};
            int res = 0;
            int count = 0;

            while (count < 12) {
                res += p/menu[count];
                p = p%menu[count];
                if (p == 0) {
                    break;
                }
                count++;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
