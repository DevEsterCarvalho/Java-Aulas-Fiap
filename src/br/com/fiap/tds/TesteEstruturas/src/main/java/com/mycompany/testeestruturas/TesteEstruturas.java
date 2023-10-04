/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testeestruturas;

/**
 *
 * @author ester
 */
public class TesteEstruturas {

    
//testando estruturas de repetição, exemplo caixa supermercado 
    
    public static void main(String[] args) {
        int qtdProdutos = 10;
        int registros = 0; 
        
        /*while (registros < qtdProdutos) {
            registros++;
            System.out.println("O produto " + registros + "foi registrado");
        }*/
        
        /*do { 
            registros++;
            System.out.println("Foi registrado o produto " + registros);
        } while (registros < qtdProdutos);*/
        
        for (int i = 0; i < qtdProdutos; i++){
            System.out.println("O caixa registrou " + i + "produtos");   
        }
    }
}
