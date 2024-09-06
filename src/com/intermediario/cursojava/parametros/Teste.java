/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.parametros;

import com.intermediario.cursojava.enum01.Pessoa;

/**
 *
 * @author Welton
 */
public class Teste {
    
    public static void substituirObjeto(Pessoa p) {
        p = new Pessoa();  // Tentativa de alterar a referência
        p.setNome("Carlos");  // Isso não afetará o objeto original
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ana");
        substituirObjeto(pessoa);
        System.out.println(pessoa.getNome());  // Ainda será "Ana"
    }
}


