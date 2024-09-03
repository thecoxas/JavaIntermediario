/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intermediario.cursojava.enum00;

/**
 *
 * @author Welton
 */
public class Main {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.SEGUNDA;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
    }
}
