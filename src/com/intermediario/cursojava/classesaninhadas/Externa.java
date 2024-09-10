/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.classesaninhadas;

/**
 *
 * @author Welton
 */
public class Externa {
    private String texto = "Texto externo";
    
    public class Interna{
        private String texto = "Texto interno";
        
        public void imprimeTexto(){
            System.out.println(texto);
            
            // consegue ver membros da classe externa
            System.out.println(Externa.this.texto);
        }
    }
    public static void main(String[] args) {
        Externa externa = new Externa();
        Interna interna = externa.new Interna();
        interna.imprimeTexto();
    }
}
