/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import  java.util.Scanner;
 
public class zadanie_4 {  
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для возведения в квадрат:");
        a = input.nextInt();
        System.out.println("Результат: " + (long)(Math.pow(a,2)));
    }
    
}
