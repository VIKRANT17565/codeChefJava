import java.util.Scanner;

public class VedantAndHisHiddenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();

            if (a%2 != 0) {
                if (n%2 != 0) {
                    System.out.println("Odd");
                }
                else{
                    System.out.println("Even");
                }
            }else{
                if(n%2 == 0){
                    System.out.println("Impossible");
                }
                else if (n%2 != 0 && n != 1){
                    System.out.println("Impossible");
                }
                else if (n == 1){
                    System.out.println("Even");
                }
            }
            
        }
        sc.close(); 
        
    }
}
