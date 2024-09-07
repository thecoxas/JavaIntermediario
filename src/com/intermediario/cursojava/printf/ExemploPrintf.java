/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.printf;

/**
 *
 * @author Welton
 */
public class ExemploPrintf {

    public static void main(String[] args) {
        System.out.printf("Hello %s", "World");
        System.out.println("");
        System.out.printf("Hello %S", "world");
        System.out.println("");
        System.out.printf("char %c", 'c');
        System.out.println("");
        System.out.printf("char %C\n", 'c');
        //System.out.println("");
        System.out.printf("%s\n", "Hello world");

        int valor = 123456789;
        System.out.printf("%d\n", valor);

        double pontoFlutuante = 12.34566;
        System.out.printf("%f", pontoFlutuante);
        System.out.println();

        String helloWorld = "Hello, World";
        System.out.printf("%20s", helloWorld);
        System.out.println();
        System.out.printf("%-20s", helloWorld);
        System.out.println();
        System.out.printf("%+d", valor);
        System.out.println();
        System.out.printf("%015d", valor);
        System.out.println();
        System.out.printf("%,d", valor); // Pt-br é o " . " muito util para separar os números pelos milhares
        System.out.println();

        int valor2 = -987654321;
        System.out.printf("% d", valor2);
        System.out.println();
        System.out.printf("% d", valor);
        System.out.println();
        System.out.printf("%.3f", pontoFlutuante); // muito útil para formatação de numeros com pontos flutuantes
        System.out.println();
        System.out.printf("R$%10.2f", pontoFlutuante);
        System.out.println();

        testeMaisCompleto();

    }

    static void testeMaisCompleto() {
        double precos[] = {1000, 123.45, 7548.456, 10, 987654};

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
        }
    }
}
