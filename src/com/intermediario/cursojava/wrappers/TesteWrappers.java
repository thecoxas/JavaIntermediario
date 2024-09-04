/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.wrappers;

/**
 *
 * @author Welton
 */
public class TesteWrappers {

    public static void main(String[] args) {
        // tipos primitivos
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000L;
        float num5 = 4.5f;
        double num6 = 4.55;
        boolean studying = true;
        char c = 'c';

        //  Classes Wrapper Correspondentes
        Short num7 = new Short((short) 1);
        Byte num8 = new Byte((byte) 10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(1000L);
        Float num11 = new Float(4.5f);
        Double num12 = new Double(4.55);
        Boolean working = new Boolean(false);
        Character w = new Character('w');

        // Criando Wrappers a partir de Strings
        Integer num13 = new Integer("100");
        System.out.println(num13);

        Double num14 = new Double("3.55"); // PT-br é " , "
        System.out.println(num14);

        //  Métodos de Conversão
        System.out.println(num7.byteValue()); // num7.byteValue() converte o valor de num7 (que é um Short) para byte.
        System.out.println(num9.floatValue()); // num9.floatValue() converte o valor de num9 (que é um Integer) para float.

        // Convertendo Wrappers em Outros Wrappers ou Primitivos
        Long num15 = num13.longValue();
        /* Aqui, num13.longValue() converte o Integer num13 para um valor long, 
        e num15 é um objeto Long que encapsula esse valor.*/
        System.out.println(num15);

        // Métodos parse e valueOf
        int num16 = Integer.parseInt("1000");
        double num17 = Double.parseDouble("3.55");
        System.out.println(num16 + " + " + num17);
        /*
        parseInt e parseDouble são métodos estáticos usados para converter strings em tipos 
        primitivos (int e double, respectivamente).
         */

        Integer num18 = Integer.valueOf(100);
        System.out.println(num18);
        /*
        valueOf é um método que retorna uma instância do Wrapper correspondente ao valor primitivo ou à string passada.
         */
        // Comparando Wrappers
        System.out.println(num9 == num18);
        // == compara as referências dos objetos. Como num9 e num18 são diferentes, o resultado é false.

        System.out.println(num9.equals(num18));
        // equals compara o valor dos objetos. Como num9 e num18 encapsulam valores diferentes (100 e 355), o resultado é false.
    }
}
