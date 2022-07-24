import java.util.Scanner;

public class AreaORPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        int area = l*b;
        int peri = 2*(l+b);

        if (area < peri) {
            System.out.println("Peri\n"+peri);
            
        }
        else if(area > peri){
            System.out.println("Area\n"+area);
        }
        else{
            System.out.println("Eq\n"+area);
        }


        sc.close();
    }
}
