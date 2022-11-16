/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class zadanie_1 {

    public static void main(String[] args) {
        int n;
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n: ");
        n = sc.nextInt();
        
        switch(n)  {
            case 0: 
                text = "Null";
                break;
            case 1: 
                text = "Один";
                break;
            case 2: 
                text = "Два";
                break;
            case 3: 
                text = "Три";
                break;
            case 4: 
                text = "Четыре";
                break;
            case 5: 
                text = "Пять";
                break;
            case 6: 
                text = "Шесть";
                break;
            case 7: 
                text = "Семь";
                break;
            case 8: 
                text = "Восемь";
                break;
            case 9: 
                text = "Девять";
                break;
            default:
                text = "Введите цифру от 0 до 9";
        }
        
        System.out.println(text);
    }
    
}
