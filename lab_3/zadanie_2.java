package lab_3;

import java.util.Scanner;


public class zadanie_2 {
    public static void main(String[] args){
        int r = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            r = r*i;
        }
       
        System.out.println(r);
    }
    
}
