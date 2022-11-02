/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.zadanie4;

import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) {
        int a, b, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n = ");
        n = sc.nextInt();
        if (n>2 || n<0) {
            System.out.println("Решений нет");
        } else {
        
        for (int i = 1; i < 100;
        i++) 
        {
            for (int j = 1; j < 100; j++) {
                for (int k = 1; k < 100; k++) {
                    a = (int) Math.pow(i, n);
                    b = (int) Math.pow(j, n);
                    c = (int) Math.pow(k, n);
                    if (a+b==c){
                        System.out.println(i+"^" + n + " + " + j + "^"+ n + "=" + k + "^" + n );
                       
                    }
                    
                }
            }
        }
        
    }
}
}
