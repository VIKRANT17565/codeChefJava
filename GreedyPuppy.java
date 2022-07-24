import java.util.Scanner;

public class GreedyPuppy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int left=0;
          
            for(int j=1;j<=k;j++){
                if(n%j>left){
                    left=n%j;
                }
            }
             
             
            System.out.println(left);
        }
        sc.close();
    }
}
