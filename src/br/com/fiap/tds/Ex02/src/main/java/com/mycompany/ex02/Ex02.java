/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex02;

import java.util.Scanner;

/**
 *
 * @author ester
 */
public class Ex02 {

    public static void main(String[] args) {
        int resp = 0;
        int i = 1;
            
        Scanner tabuada = new Scanner(System.in); 
        System.out.println("Quer ver a tabuada de qual número? ");
        int numero = tabuada.nextInt();
        do {
            resp = (numero*i);
            i++;
        } while (i == 12);
        System.out.println(numero + " x " + i + " = " + resp);
    }
}
