/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.escopovariaveis;

import static java.lang.System.out;
/**
 *
 * @author Welton
 */
public class Main {

    public static void main(String[] args) {
        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);
        out.println(escopo.getValor());
        out.println(escopo.calcularValor(20));
        out.println(escopo.getValor());
        out.println(escopo.teste());
        out.println(escopo.getValor());
        out.println();
    }
}
