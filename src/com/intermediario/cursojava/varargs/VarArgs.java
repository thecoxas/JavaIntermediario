/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.varargs;

/**
 *
 * @author Welton
 */
public class VarArgs {

    public static void main(String[] args) {
        System.out.println(somar(3, 5));
        System.out.println(somar(10, 20, 30));

        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(somar(vetor));

        // usando o varargs
        System.out.println(somar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

    static int somar(int x, int y) {
        return x + y;
    }

    static int somar(int x, int y, int z) {
        return x + y + z;
    }

    static int somar(int[] vetor) {
        int total = 0;
        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }
        return total;
    }

    // Usando o varargs
    static int somar(int x, int y, Integer... numeros) {
        int total = x + y;
        for(Integer num : numeros){
            total += num;
        }
        return total;
    }
    /*
    Apenas um varargs por método: Um método pode ter apenas um parâmetro varargs.
    O parâmetro varargs deve ser o último: Se o método tiver mais parâmetros, o varargs deve ser o último na lista.
     */

}
