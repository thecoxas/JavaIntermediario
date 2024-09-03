/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.enum00;

/**
 *
 * @author Welton
 */
public class Formulario {

    enum Genero {
        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor) {
            this.valor = valor;
        }
    }

    private String nome;
    private Genero genero;
}
