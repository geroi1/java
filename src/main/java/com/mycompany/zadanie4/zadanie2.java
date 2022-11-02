/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zadanie4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class zadanie2 {
    public static void main(String[] args) {
        double n;
        double result = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n = ");
        n = sc.nextInt();
        for (int i = 1; i<=n;i++) {
            if ((i % 2) == 0) {
                result -= Math.pov(i,-1);
            } else {
                result += Math.pov(i,-1);
            }
            System.out.println(result);
        }
    }
    
}
