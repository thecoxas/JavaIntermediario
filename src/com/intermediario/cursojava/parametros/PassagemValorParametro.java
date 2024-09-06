/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.parametros;

/**
 *
 * @author Welton
 */
public class PassagemValorParametro {
    public static void main(String[] args) {
        Contato contato = new Contato("Welton", "991902611", "thecoxas@gmail.com");
        int valor = 10;
        
        System.out.println("#################Valores Originais");
        System.out.println(valor);
        System.out.println(contato);
        
        System.out.println("#################Exemplo 1");
        testePassagemValorReferencia(valor, contato);
        
        System.out.println(contato);
        System.out.println(valor);
        
        System.out.println("#################Exemplo 2");
        testePassagemValorReferencia2(valor, contato);
        
        System.out.println(contato);
        System.out.println(valor);
        
    }
    private static void testePassagemValorReferencia(int valor, Contato contato){
        int novoValor = 10;
        valor = novoValor;
        
        contato = new Contato("Lucinéia", "99991234", "lucineia@gmail.com");
    }
    private static void testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;
        
        contato.setNome("contato" + novoValor);
        
    }
}
