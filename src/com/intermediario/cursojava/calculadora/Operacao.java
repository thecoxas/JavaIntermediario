/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.intermediario.cursojava.calculadora;

/**
 *
 * @author Welton
 */
public enum Operacao {
    SOMAR("+") {
        @Override
        public double fazerOperacao(double x, double y) {
           return x + y;
        }
    },SUBTRAIR("-") {
        @Override
        public double fazerOperacao(double x, double y) {
            return x - y;
        }
    },MULTIPLICAR("*") {
        @Override
        public double fazerOperacao(double x, double y) {
            return x * y;
        }
    },DIVIDIR("/") {
        @Override
        public double fazerOperacao(double x, double y) {
            return x / y;
        }
    };
    
    private String simbolo;

    private Operacao(String simbolo) {
        this.simbolo = simbolo;
    }
    public abstract double fazerOperacao(double x, double y);
    
    public String toString(){
        return this.simbolo;
    }
    
}
