/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author ester
 */
public class Teste {
    private String nome;

    Teste(String marcelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void Teste (String no){
        this.nome = no;
    }
    
    public String getNome(){
    return nome;
}
    
    public void setNome (String no){
        this.nome = no;
    }
    
    public void apresentar (){
        System.out.println("Nome do teste: " + this.getNome());
    }
}
