/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringequals;

/**
 *
 * @author ester
 */
public class StringEquals {

    public static void main(String[] args) {
        String nome = new String ("maça");
        String nome2= new String ("Maça");
        String nome3 = new String ("maça");
        
        System.out.println(nome.equals(nome2));
        System.out.println(nom.equalsIgnoreCase(nome2));
        System.out.println(nome.equals(nome3));
        
    }
}
