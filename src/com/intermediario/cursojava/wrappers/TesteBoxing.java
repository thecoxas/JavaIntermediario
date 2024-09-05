/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.wrappers;

/**
 *
 * @author Welton
 */
public class TesteBoxing {

    public static void main(String[] args) {

        // Autoboxing
        Short num7 = 1;  // new Short((short) 1);
        Byte num8 = 10;  // new Byte((byte) 10);
        Integer num9 = 100;  // new Integer(100);
        Long num10 = 1000L;  // new Long(1000L);
        Float num11 = 4.5f;  // new Float(4.5f);
        Double num12 = 4.55;  // new Double(4.55);
        Boolean working = false;  // new Boolean(false);
        Character w = 'W';  // new Character('w');

        // Auto un-boxing
        int num13 = num9;  // é o mesmo que num9.intValue();
        
        // autoboxing em expressões
        num9++;
        System.out.println(num9);
        
        /* auto unboxing num9(passa a ser primitivo) => autoboxing num13/num9 => num14(depois do resultado
        da divisão ele volta a ser um objeto)*/
        Integer num14 = num13/num9;
        
        // Mau uso
        Double a,b,c;
        a = 10.0;
        b = 20.0;
        c = 30.0;
        
        Double media = (a+b+c)/3;
        System.out.println(media);
        // se for fazer expressoes melhor usar as classes primitivas mesmo
        
    }
}
