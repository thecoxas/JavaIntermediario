/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.calculadora;

/**
 *
 * @author Welton
 */
public class Calculadora {

    public static void main(String[] args) {
        double x = 5;
        double y = 10;

        for (Operacao op : Operacao.values()) {
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(op.fazerOperacao(x, y));

        }
    }
}
