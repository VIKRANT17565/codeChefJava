import java.util.Scanner;

public class PeacefulParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int pa = sc.nextInt();
            int pb = sc.nextInt();
            int pc = sc.nextInt();
            int ac = pa+pc;
            int b = pb;
            if (ac > b) {
                System.out.println(ac);
            }else{
                System.out.println(b);
            }
        }
        sc.close();
    }
}
