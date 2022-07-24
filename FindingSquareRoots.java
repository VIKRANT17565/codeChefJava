import java.util.Scanner;
import java.lang.Math;

public class FindingSquareRoots{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int root;
            root = (int) Math.sqrt(n);
            System.out.println(root);
        }
        sc.close();
    }    
}