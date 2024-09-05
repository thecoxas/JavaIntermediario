/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.escopovariaveis;

/**
 *
 * @author Welton
 */
public class EscopoVariaveis {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calcularValor(int valor) {
        valor = valor + 10;
        //this.valor = valor;
        return valor;
    }

    public int teste() {
        int valor = 5;
        if (true) {
            valor--;
        }
        this.valor = valor; // Referencial ao valor global/ atributo da classe
        return valor;
    }

    public void maisUmTeste() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //i++; Não visivel fora das chaves erro de compilação
        int j;
        for (j = 0; j < 10; j++) {
            System.out.println(j);
        }
        System.out.println(j); // tem o valor de 10; posso usar pois foi declarado antes do for
    }

    public void outroTeste() {
        boolean flag = true;
        if (flag) {
            int umaVariavel = 10;
            umaVariavel++;
            System.out.println(umaVariavel);
        }
        //System.out.println(umaVariavel);
    }

    public void eBoraDeTeste(int num) {
        int total = 0;
        try {
            int outroNum = 0;
            total = num / outroNum;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            total++;
            //outroNum++; Erro de compilação
            // e.printStackTrace();  Erro de compilação

        }
        num++;
        System.out.println(total);
        //outroNum++; Erro de compilação
        //e.printStackTrace();  Erro de compilação
    }
}
