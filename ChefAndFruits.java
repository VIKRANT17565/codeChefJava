import java.util.Scanner;

public class ChefAndFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();       //apple
            int m = sc.nextInt();       //orange
            int k = sc.nextInt();       //coin

            while(k != 0){
                if (n < m) {
                    n++;
                    k--;                    
                }
                else if (n > m){
                    m++;
                    k--;                    
                }
                else{
                    break;
                }
            }

            if (n < m) {
                System.out.println(m-n);
            }else{
                System.out.println(n-m);
            }



        }
        sc.close();
    }    
}
