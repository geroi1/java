package lab_3;
import java.util.Scanner;

public class zadanie1 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");
        double n = in.nextDouble();
        double r = 0;
//        for (int i = 0; i < n; i++) {
            r = (double) Math.pow (2, n);
//        }
        System.out.println(r);
    }
    
}
