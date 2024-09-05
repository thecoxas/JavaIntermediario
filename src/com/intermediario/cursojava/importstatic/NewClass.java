/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.importstatic;

// import static java.lang.Math.*; Todos os métodos da classe
import static java.lang.Math.pow; // apenas o método pow
import static java.lang.Math.sqrt; // apenas o método sqrt

/**
 *
 * @author Welton
 */
public class NewClass {

    public static void main(String[] args) {
        double a, b, c;
        a = 2;
        b = 3;
        c = 4;

        //System.out.println(Math.pow(a, b));
        //System.out.println(Math.sqrt(c));
        System.out.println(pow(a, b));
        System.out.println(sqrt(c));

        /* Static import
        import static permite que você importe métodos e variáveis estáticas de uma classe.
        Ele elimina a necessidade de referenciar a classe para usar seus membros estáticos.
        Embora útil, é importante usar com cuidado para manter a legibilidade do código.
         */
    }
}
