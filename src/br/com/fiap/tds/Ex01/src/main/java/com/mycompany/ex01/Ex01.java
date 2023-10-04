/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex01;

import java.util.Scanner;

/**
 *
 * @author ester
 */
public class Ex01 {

    public static void main(String[] args) {
        int i = 0; 
        int soma = 0;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Digite um número: ");
            int numero = teclado.nextInt();
            soma += numero;
            i++;
            System.out.println("A soma é " + soma);
            
        } while (i < 20);
    }
}
