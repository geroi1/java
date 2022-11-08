package lab_3;

import java.util.Scanner;


public class zadanie_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a, b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Summa: " + (a+b));
        System.out.println("Raznost: " + (a-b));
        System.out.println("Mult: " + (a*b));             
        
    }
    
}