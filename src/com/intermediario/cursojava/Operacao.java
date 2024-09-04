/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.intermediario.cursojava;

/**
 *
 * @author Welton
 */
public enum Operacao {
    SOMA("+") {
        @Override
        public double realizarOperacao(double x, double y) {
            return x + y;
        }
    },SUBTRACAO("-") {
        @Override
        public double realizarOperacao(double x, double y) {
            return x - y;
        }
    },MULTIPLICACAO("*") {
        @Override
        public double realizarOperacao(double x, double y) {
            return x * y;
        }
    },DIVISAO("/") {
        @Override
        public double realizarOperacao(double x, double y) {
            return x / y;
        }
    };
    
    private String simbolo;

    private Operacao(String simbolo) {
        this.simbolo = simbolo;
    }
    public abstract double realizarOperacao(double x, double y);

    @Override
    public String toString() {
        return this.simbolo;
    }
    
    
}
