import java.util.Scanner;

public class SumsInTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int triangle[][] = new int[n][n];
            //int path[] = new int[n*n];
        
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < j+1; k++) {
                    triangle[j][k] = sc.nextInt();
                }
            }

            for (int j = n - 2; j > -1; j--){
                for (int k = 0; k < j+1; k++){
                    if (triangle[j+1][k] > triangle[j+1][k+1]) {
                        triangle[j][k] = triangle[j][k] + triangle[j+1][k];
                    }
                    else{
                        triangle[j][k] = triangle[j][k] + triangle[j+1][k+1];
                    }
                    
                }
            }
            System.out.println(triangle[0][0]);


        }
        sc.close();
    }
}
